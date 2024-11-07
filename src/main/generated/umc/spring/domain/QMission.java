package umc.spring.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMission is a Querydsl query type for Mission
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMission extends EntityPathBase<Mission> {

    private static final long serialVersionUID = -453449888L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMission mission = new QMission("mission");

    public final NumberPath<Integer> code = createNumber("code", Integer.class);

    public final StringPath content = createString("content");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final BooleanPath isSuccess = createBoolean("isSuccess");

    public final QMember member;

    public final QRegion region;

    public final QRestaurant restaurant;

    public final EnumPath<umc.spring.domain.enums.Status> status = createEnum("status", umc.spring.domain.enums.Status.class);

    public QMission(String variable) {
        this(Mission.class, forVariable(variable), INITS);
    }

    public QMission(Path<? extends Mission> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMission(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMission(PathMetadata metadata, PathInits inits) {
        this(Mission.class, metadata, inits);
    }

    public QMission(Class<? extends Mission> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new QMember(forProperty("member")) : null;
        this.region = inits.isInitialized("region") ? new QRegion(forProperty("region")) : null;
        this.restaurant = inits.isInitialized("restaurant") ? new QRestaurant(forProperty("restaurant"), inits.get("restaurant")) : null;
    }

}

