package umc.spring.domain.mapping;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * Qmission is a Querydsl query type for mission
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class Qmission extends EntityPathBase<mission> {

    private static final long serialVersionUID = -122120608L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final Qmission mission = new Qmission("mission");

    public final StringPath content = createString("content");

    public final DatePath<java.time.LocalDate> deadline = createDate("deadline", java.time.LocalDate.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final umc.spring.domain.Qrestaurant restaurant_id;

    public final NumberPath<Long> reward = createNumber("reward", Long.class);

    public final ListPath<user_mission, Quser_mission> user_reviewList = this.<user_mission, Quser_mission>createList("user_reviewList", user_mission.class, Quser_mission.class, PathInits.DIRECT2);

    public Qmission(String variable) {
        this(mission.class, forVariable(variable), INITS);
    }

    public Qmission(Path<? extends mission> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public Qmission(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public Qmission(PathMetadata metadata, PathInits inits) {
        this(mission.class, metadata, inits);
    }

    public Qmission(Class<? extends mission> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.restaurant_id = inits.isInitialized("restaurant_id") ? new umc.spring.domain.Qrestaurant(forProperty("restaurant_id")) : null;
    }

}

