package umc.spring.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * Qrestaurant is a Querydsl query type for restaurant
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class Qrestaurant extends EntityPathBase<restaurant> {

    private static final long serialVersionUID = -430421815L;

    public static final Qrestaurant restaurant = new Qrestaurant("restaurant");

    public final StringPath address = createString("address");

    public final StringPath category = createString("category");

    public final TimePath<java.time.LocalTime> close = createTime("close", java.time.LocalTime.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final ListPath<umc.spring.domain.mapping.mission, umc.spring.domain.mapping.Qmission> missionList = this.<umc.spring.domain.mapping.mission, umc.spring.domain.mapping.Qmission>createList("missionList", umc.spring.domain.mapping.mission.class, umc.spring.domain.mapping.Qmission.class, PathInits.DIRECT2);

    public final StringPath name = createString("name");

    public final TimePath<java.time.LocalTime> open = createTime("open", java.time.LocalTime.class);

    public final NumberPath<Long> rating = createNumber("rating", Long.class);

    public final ListPath<umc.spring.domain.mapping.user_review, umc.spring.domain.mapping.Quser_review> user_reviewList = this.<umc.spring.domain.mapping.user_review, umc.spring.domain.mapping.Quser_review>createList("user_reviewList", umc.spring.domain.mapping.user_review.class, umc.spring.domain.mapping.Quser_review.class, PathInits.DIRECT2);

    public Qrestaurant(String variable) {
        super(restaurant.class, forVariable(variable));
    }

    public Qrestaurant(Path<? extends restaurant> path) {
        super(path.getType(), path.getMetadata());
    }

    public Qrestaurant(PathMetadata metadata) {
        super(restaurant.class, metadata);
    }

}

