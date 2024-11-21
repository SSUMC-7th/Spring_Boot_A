package umc.study.service.storeService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import umc.study.apiPayload.code.status.ErrorStatus;
import umc.study.apiPayload.exception.handler.MemberHandler;
import umc.study.apiPayload.exception.handler.StoreHandler;
import umc.study.converter.MemberConverter;
import umc.study.converter.MemberMissionConverter;
import umc.study.converter.MissionConverter;
import umc.study.domain.Member;
import umc.study.domain.Mission;
import umc.study.domain.Store;
import umc.study.domain.mapping.MemberMission;
import umc.study.repository.memberRepository.MemberRepository;
import umc.study.repository.missionRepository.MissionRepository;
import umc.study.repository.storeRepository.StoreRepository;
import umc.study.web.dto.MissionRequestDTO;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class StoreQueryServiceImpl implements StoreQueryService {

    private final StoreRepository storeRepository;
    private final MissionRepository missionRepository;
    private final MemberRepository memberRepository;

    @Override
    public Optional<Store> findStore(Long id) {
        return storeRepository.findById(id);
    }

    @Override
    public List<Store> findStoresByNameAndScore(String name, Float score) {
        List<Store> filteredStores = storeRepository.dynamicQueryWithBooleanBuilder(name, score);
        filteredStores.forEach(store -> System.out.println("Store : " + store));
        return filteredStores;
    }

    @Override
    @Transactional
    public Mission addMission(MissionRequestDTO.MissionDTO request) {
        Store store = storeRepository.findById(request.getStoreId())
                .orElseThrow(() -> new StoreHandler(ErrorStatus.STORE_NOT_FOUND));
        Mission newMission = MissionConverter.toMission(request,store);
        List<Member> memberList = request.getMemberMissions().stream()
                .map( member -> { return memberRepository.findById(member).orElseThrow(() -> new MemberHandler(ErrorStatus.MEMBER_NOT_FOUND));})
                .collect(Collectors.toList());

        List<MemberMission> memberMissions = MemberMissionConverter.toMemberMission(memberList);
        memberMissions.forEach( memberMission -> {memberMission.setMission(newMission);});
        return missionRepository.save(newMission);
    }
}
