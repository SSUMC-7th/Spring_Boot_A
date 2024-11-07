package project.ssumc7thspringboota.domain.mission;

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

    private static final long serialVersionUID = 28531745L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMission mission = new QMission("mission");

    public final project.ssumc7thspringboota.domain.QBaseEntity _super = new project.ssumc7thspringboota.domain.QBaseEntity(this);

    //inherited
    public final BooleanPath activated = _super.activated;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createDateTime = _super.createDateTime;

    public final StringPath description = createString("description");

    public final NumberPath<Long> missionId = createNumber("missionId", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDateTime = _super.modifiedDateTime;

    public final NumberPath<Integer> rewardPoints = createNumber("rewardPoints", Integer.class);

    public final project.ssumc7thspringboota.domain.store.QStore store;

    public final SetPath<project.ssumc7thspringboota.domain.mapping.usermission.UserMission, project.ssumc7thspringboota.domain.mapping.usermission.QUserMission> userMissions = this.<project.ssumc7thspringboota.domain.mapping.usermission.UserMission, project.ssumc7thspringboota.domain.mapping.usermission.QUserMission>createSet("userMissions", project.ssumc7thspringboota.domain.mapping.usermission.UserMission.class, project.ssumc7thspringboota.domain.mapping.usermission.QUserMission.class, PathInits.DIRECT2);

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
        this.store = inits.isInitialized("store") ? new project.ssumc7thspringboota.domain.store.QStore(forProperty("store")) : null;
    }

}

