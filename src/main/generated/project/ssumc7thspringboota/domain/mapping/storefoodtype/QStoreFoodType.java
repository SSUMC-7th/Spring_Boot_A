package project.ssumc7thspringboota.domain.mapping.storefoodtype;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QStoreFoodType is a Querydsl query type for StoreFoodType
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QStoreFoodType extends EntityPathBase<StoreFoodType> {

    private static final long serialVersionUID = -879109541L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QStoreFoodType storeFoodType = new QStoreFoodType("storeFoodType");

    public final project.ssumc7thspringboota.domain.QBaseEntity _super = new project.ssumc7thspringboota.domain.QBaseEntity(this);

    //inherited
    public final BooleanPath activated = _super.activated;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createDateTime = _super.createDateTime;

    public final project.ssumc7thspringboota.domain.foodtype.QFoodType foodType;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDateTime = _super.modifiedDateTime;

    public final project.ssumc7thspringboota.domain.store.QStore store;

    public final NumberPath<Long> storeFoodTypeId = createNumber("storeFoodTypeId", Long.class);

    public QStoreFoodType(String variable) {
        this(StoreFoodType.class, forVariable(variable), INITS);
    }

    public QStoreFoodType(Path<? extends StoreFoodType> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QStoreFoodType(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QStoreFoodType(PathMetadata metadata, PathInits inits) {
        this(StoreFoodType.class, metadata, inits);
    }

    public QStoreFoodType(Class<? extends StoreFoodType> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.foodType = inits.isInitialized("foodType") ? new project.ssumc7thspringboota.domain.foodtype.QFoodType(forProperty("foodType")) : null;
        this.store = inits.isInitialized("store") ? new project.ssumc7thspringboota.domain.store.QStore(forProperty("store")) : null;
    }

}

