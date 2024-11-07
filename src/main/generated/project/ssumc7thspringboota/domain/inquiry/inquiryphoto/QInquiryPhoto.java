package project.ssumc7thspringboota.domain.inquiry.inquiryphoto;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QInquiryPhoto is a Querydsl query type for InquiryPhoto
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QInquiryPhoto extends EntityPathBase<InquiryPhoto> {

    private static final long serialVersionUID = -401787650L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QInquiryPhoto inquiryPhoto = new QInquiryPhoto("inquiryPhoto");

    public final project.ssumc7thspringboota.domain.QBaseEntity _super = new project.ssumc7thspringboota.domain.QBaseEntity(this);

    //inherited
    public final BooleanPath activated = _super.activated;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createDateTime = _super.createDateTime;

    public final project.ssumc7thspringboota.domain.inquiry.QInquiry inquiry;

    public final NumberPath<Long> inquiryPhotoId = createNumber("inquiryPhotoId", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDateTime = _super.modifiedDateTime;

    public final StringPath photoUrl = createString("photoUrl");

    public QInquiryPhoto(String variable) {
        this(InquiryPhoto.class, forVariable(variable), INITS);
    }

    public QInquiryPhoto(Path<? extends InquiryPhoto> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QInquiryPhoto(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QInquiryPhoto(PathMetadata metadata, PathInits inits) {
        this(InquiryPhoto.class, metadata, inits);
    }

    public QInquiryPhoto(Class<? extends InquiryPhoto> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.inquiry = inits.isInitialized("inquiry") ? new project.ssumc7thspringboota.domain.inquiry.QInquiry(forProperty("inquiry"), inits.get("inquiry")) : null;
    }

}

