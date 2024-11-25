package umc.spring.domain.mapping;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * Quser_mission is a Querydsl query type for user_mission
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class Quser_mission extends EntityPathBase<user_mission> {

    private static final long serialVersionUID = -123475772L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final Quser_mission user_mission = new Quser_mission("user_mission");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final Qmission mission;

    public final EnumPath<umc.spring.domain.enums.MissionCheck> missioncheck = createEnum("missioncheck", umc.spring.domain.enums.MissionCheck.class);

    public final umc.spring.domain.Quser user;

    public Quser_mission(String variable) {
        this(user_mission.class, forVariable(variable), INITS);
    }

    public Quser_mission(Path<? extends user_mission> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public Quser_mission(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public Quser_mission(PathMetadata metadata, PathInits inits) {
        this(user_mission.class, metadata, inits);
    }

    public Quser_mission(Class<? extends user_mission> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.mission = inits.isInitialized("mission") ? new Qmission(forProperty("mission"), inits.get("mission")) : null;
        this.user = inits.isInitialized("user") ? new umc.spring.domain.Quser(forProperty("user")) : null;
    }

}

