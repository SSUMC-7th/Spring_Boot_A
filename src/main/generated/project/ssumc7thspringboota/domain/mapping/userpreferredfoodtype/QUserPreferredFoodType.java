package project.ssumc7thspringboota.domain.mapping.userpreferredfoodtype;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QUserPreferredFoodType is a Querydsl query type for UserPreferredFoodType
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QUserPreferredFoodType extends EntityPathBase<UserPreferredFoodType> {

    private static final long serialVersionUID = 1640225253L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QUserPreferredFoodType userPreferredFoodType = new QUserPreferredFoodType("userPreferredFoodType");

    public final project.ssumc7thspringboota.domain.QBaseEntity _super = new project.ssumc7thspringboota.domain.QBaseEntity(this);

    //inherited
    public final BooleanPath activated = _super.activated;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createDateTime = _super.createDateTime;

    public final project.ssumc7thspringboota.domain.foodtype.QFoodType foodType;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDateTime = _super.modifiedDateTime;

    public final project.ssumc7thspringboota.domain.user.QUser user;

    public final NumberPath<Long> userPreferredFoodTypeId = createNumber("userPreferredFoodTypeId", Long.class);

    public QUserPreferredFoodType(String variable) {
        this(UserPreferredFoodType.class, forVariable(variable), INITS);
    }

    public QUserPreferredFoodType(Path<? extends UserPreferredFoodType> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QUserPreferredFoodType(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QUserPreferredFoodType(PathMetadata metadata, PathInits inits) {
        this(UserPreferredFoodType.class, metadata, inits);
    }

    public QUserPreferredFoodType(Class<? extends UserPreferredFoodType> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.foodType = inits.isInitialized("foodType") ? new project.ssumc7thspringboota.domain.foodtype.QFoodType(forProperty("foodType")) : null;
        this.user = inits.isInitialized("user") ? new project.ssumc7thspringboota.domain.user.QUser(forProperty("user")) : null;
    }

}

