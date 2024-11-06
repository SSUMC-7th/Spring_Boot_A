package umc.spring.domain.mapping;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * Quser_review is a Querydsl query type for user_review
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class Quser_review extends EntityPathBase<user_review> {

    private static final long serialVersionUID = -972830432L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final Quser_review user_review = new Quser_review("user_review");

    public final StringPath content = createString("content");

    public final DateTimePath<java.time.LocalDateTime> date = createDateTime("date", java.time.LocalDateTime.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> rating = createNumber("rating", Long.class);

    public final umc.spring.domain.Qrestaurant restaurant_id;

    public final umc.spring.domain.Quser user_id;

    public Quser_review(String variable) {
        this(user_review.class, forVariable(variable), INITS);
    }

    public Quser_review(Path<? extends user_review> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public Quser_review(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public Quser_review(PathMetadata metadata, PathInits inits) {
        this(user_review.class, metadata, inits);
    }

    public Quser_review(Class<? extends user_review> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.restaurant_id = inits.isInitialized("restaurant_id") ? new umc.spring.domain.Qrestaurant(forProperty("restaurant_id")) : null;
        this.user_id = inits.isInitialized("user_id") ? new umc.spring.domain.Quser(forProperty("user_id")) : null;
    }

}

