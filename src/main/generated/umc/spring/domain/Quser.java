package umc.spring.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * Quser is a Querydsl query type for user
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class Quser extends EntityPathBase<user> {

    private static final long serialVersionUID = -1347091881L;

    public static final Quser user = new Quser("user");

    public final StringPath address = createString("address");

    public final DatePath<java.time.LocalDate> birth = createDate("birth", java.time.LocalDate.class);

    public final StringPath email = createString("email");

    public final EnumPath<umc.spring.domain.enums.Gender> gender = createEnum("gender", umc.spring.domain.enums.Gender.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> mission_count = createNumber("mission_count", Long.class);

    public final StringPath name = createString("name");

    public final StringPath password = createString("password");

    public final StringPath phone_num = createString("phone_num");

    public final NumberPath<Long> point = createNumber("point", Long.class);

    public final EnumPath<umc.spring.domain.enums.Role> role = createEnum("role", umc.spring.domain.enums.Role.class);

    public final ListPath<umc.spring.domain.mapping.user_favorite, umc.spring.domain.mapping.Quser_favorite> user_favoriteList = this.<umc.spring.domain.mapping.user_favorite, umc.spring.domain.mapping.Quser_favorite>createList("user_favoriteList", umc.spring.domain.mapping.user_favorite.class, umc.spring.domain.mapping.Quser_favorite.class, PathInits.DIRECT2);

    public final ListPath<umc.spring.domain.mapping.user_mission, umc.spring.domain.mapping.Quser_mission> user_missionList = this.<umc.spring.domain.mapping.user_mission, umc.spring.domain.mapping.Quser_mission>createList("user_missionList", umc.spring.domain.mapping.user_mission.class, umc.spring.domain.mapping.Quser_mission.class, PathInits.DIRECT2);

    public final ListPath<umc.spring.domain.mapping.user_review, umc.spring.domain.mapping.Quser_review> user_reviewList = this.<umc.spring.domain.mapping.user_review, umc.spring.domain.mapping.Quser_review>createList("user_reviewList", umc.spring.domain.mapping.user_review.class, umc.spring.domain.mapping.Quser_review.class, PathInits.DIRECT2);

    public Quser(String variable) {
        super(user.class, forVariable(variable));
    }

    public Quser(Path<? extends user> path) {
        super(path.getType(), path.getMetadata());
    }

    public Quser(PathMetadata metadata) {
        super(user.class, metadata);
    }

}

