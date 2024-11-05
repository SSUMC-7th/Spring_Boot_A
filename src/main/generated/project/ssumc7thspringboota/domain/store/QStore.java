package project.ssumc7thspringboota.domain.store;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QStore is a Querydsl query type for Store
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QStore extends EntityPathBase<Store> {

    private static final long serialVersionUID = -570547701L;

    public static final QStore store = new QStore("store");

    public final project.ssumc7thspringboota.domain.QBaseEntity _super = new project.ssumc7thspringboota.domain.QBaseEntity(this);

    //inherited
    public final BooleanPath activated = _super.activated;

    public final StringPath businessHours = createString("businessHours");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createDateTime = _super.createDateTime;

    public final StringPath location = createString("location");

    public final SetPath<project.ssumc7thspringboota.domain.mission.Mission, project.ssumc7thspringboota.domain.mission.QMission> missions = this.<project.ssumc7thspringboota.domain.mission.Mission, project.ssumc7thspringboota.domain.mission.QMission>createSet("missions", project.ssumc7thspringboota.domain.mission.Mission.class, project.ssumc7thspringboota.domain.mission.QMission.class, PathInits.DIRECT2);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDateTime = _super.modifiedDateTime;

    public final StringPath name = createString("name");

    public final NumberPath<Double> overallRating = createNumber("overallRating", Double.class);

    public final StringPath phoneNumber = createString("phoneNumber");

    public final SetPath<project.ssumc7thspringboota.domain.review.Review, project.ssumc7thspringboota.domain.review.QReview> reviews = this.<project.ssumc7thspringboota.domain.review.Review, project.ssumc7thspringboota.domain.review.QReview>createSet("reviews", project.ssumc7thspringboota.domain.review.Review.class, project.ssumc7thspringboota.domain.review.QReview.class, PathInits.DIRECT2);

    public final SetPath<project.ssumc7thspringboota.domain.mapping.storefoodtype.StoreFoodType, project.ssumc7thspringboota.domain.mapping.storefoodtype.QStoreFoodType> storeFoodTypes = this.<project.ssumc7thspringboota.domain.mapping.storefoodtype.StoreFoodType, project.ssumc7thspringboota.domain.mapping.storefoodtype.QStoreFoodType>createSet("storeFoodTypes", project.ssumc7thspringboota.domain.mapping.storefoodtype.StoreFoodType.class, project.ssumc7thspringboota.domain.mapping.storefoodtype.QStoreFoodType.class, PathInits.DIRECT2);

    public final NumberPath<Long> storeId = createNumber("storeId", Long.class);

    public QStore(String variable) {
        super(Store.class, forVariable(variable));
    }

    public QStore(Path<? extends Store> path) {
        super(path.getType(), path.getMetadata());
    }

    public QStore(PathMetadata metadata) {
        super(Store.class, metadata);
    }

}

