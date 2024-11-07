package project.ssumc7thspringboota.domain.foodtype;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QFoodType is a Querydsl query type for FoodType
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QFoodType extends EntityPathBase<FoodType> {

    private static final long serialVersionUID = 49776837L;

    public static final QFoodType foodType = new QFoodType("foodType");

    public final project.ssumc7thspringboota.domain.QBaseEntity _super = new project.ssumc7thspringboota.domain.QBaseEntity(this);

    //inherited
    public final BooleanPath activated = _super.activated;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createDateTime = _super.createDateTime;

    public final NumberPath<Long> foodTypeId = createNumber("foodTypeId", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDateTime = _super.modifiedDateTime;

    public final StringPath name = createString("name");

    public final SetPath<project.ssumc7thspringboota.domain.mapping.storefoodtype.StoreFoodType, project.ssumc7thspringboota.domain.mapping.storefoodtype.QStoreFoodType> storeFoodTypes = this.<project.ssumc7thspringboota.domain.mapping.storefoodtype.StoreFoodType, project.ssumc7thspringboota.domain.mapping.storefoodtype.QStoreFoodType>createSet("storeFoodTypes", project.ssumc7thspringboota.domain.mapping.storefoodtype.StoreFoodType.class, project.ssumc7thspringboota.domain.mapping.storefoodtype.QStoreFoodType.class, PathInits.DIRECT2);

    public final SetPath<project.ssumc7thspringboota.domain.mapping.userpreferredfoodtype.UserPreferredFoodType, project.ssumc7thspringboota.domain.mapping.userpreferredfoodtype.QUserPreferredFoodType> userPreferredFoodTypes = this.<project.ssumc7thspringboota.domain.mapping.userpreferredfoodtype.UserPreferredFoodType, project.ssumc7thspringboota.domain.mapping.userpreferredfoodtype.QUserPreferredFoodType>createSet("userPreferredFoodTypes", project.ssumc7thspringboota.domain.mapping.userpreferredfoodtype.UserPreferredFoodType.class, project.ssumc7thspringboota.domain.mapping.userpreferredfoodtype.QUserPreferredFoodType.class, PathInits.DIRECT2);

    public QFoodType(String variable) {
        super(FoodType.class, forVariable(variable));
    }

    public QFoodType(Path<? extends FoodType> path) {
        super(path.getType(), path.getMetadata());
    }

    public QFoodType(PathMetadata metadata) {
        super(FoodType.class, metadata);
    }

}

