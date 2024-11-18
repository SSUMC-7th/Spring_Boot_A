package project.ssumc7thspringboota.api.store.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.util.Set;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import project.ssumc7thspringboota.application.store.request.StoreCreateServiceRequest;

@Getter
@NoArgsConstructor
public class StoreCreateRequest {

  @NotBlank(message = "가게 이름을 입력해주세요.")
  private String name;

  @NotNull(message = "평점을 입력해주세요.")
  private Double overallRating;

  @NotBlank(message = "위치를 입력해주세요.")
  private String location;

  @NotBlank(message = "전화번호를 입력해주세요.")
  private String phoneNumber;

  @NotBlank(message = "영업시간을 입력해주세요.")
  private String businessHours;

  private Set<Long> storeFoodTypeIds;

  @Builder
  private StoreCreateRequest(String name, Double overallRating, String location, String phoneNumber,
      String businessHours, Set<Long> storeFoodTypeIds) {
    this.name = name;
    this.overallRating = overallRating;
    this.location = location;
    this.phoneNumber = phoneNumber;
    this.businessHours = businessHours;
    this.storeFoodTypeIds = storeFoodTypeIds;
  }

  public StoreCreateServiceRequest toServiceRequest() {
    return StoreCreateServiceRequest.builder()
                                    .name(name)
                                    .overallRating(overallRating)
                                    .location(location)
                                    .phoneNumber(phoneNumber)
                                    .businessHours(businessHours)
                                    .storeFoodTypeIds(storeFoodTypeIds)
                                    .build();
  }
}
