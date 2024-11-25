package umc.spring.domain.mapping;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * Quser_favorite is a Querydsl query type for user_favorite
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class Quser_favorite extends EntityPathBase<user_favorite> {

    private static final long serialVersionUID = -1570158236L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final Quser_favorite user_favorite = new Quser_favorite("user_favorite");

    public final StringPath category = createString("category");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final umc.spring.domain.Quser user;

    public Quser_favorite(String variable) {
        this(user_favorite.class, forVariable(variable), INITS);
    }

    public Quser_favorite(Path<? extends user_favorite> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public Quser_favorite(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public Quser_favorite(PathMetadata metadata, PathInits inits) {
        this(user_favorite.class, metadata, inits);
    }

    public Quser_favorite(Class<? extends user_favorite> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.user = inits.isInitialized("user") ? new umc.spring.domain.Quser(forProperty("user")) : null;
    }

}

