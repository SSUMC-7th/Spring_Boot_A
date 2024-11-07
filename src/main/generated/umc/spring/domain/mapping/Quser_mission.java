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

    public final EnumPath<umc.spring.domain.enums.MissionCheck> mission_check = createEnum("mission_check", umc.spring.domain.enums.MissionCheck.class);

    public final Qmission mission_id;

    public final umc.spring.domain.Quser user_id;

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
        this.mission_id = inits.isInitialized("mission_id") ? new Qmission(forProperty("mission_id"), inits.get("mission_id")) : null;
        this.user_id = inits.isInitialized("user_id") ? new umc.spring.domain.Quser(forProperty("user_id")) : null;
    }

}

