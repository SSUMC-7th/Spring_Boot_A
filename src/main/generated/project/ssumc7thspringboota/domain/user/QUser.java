package project.ssumc7thspringboota.domain.user;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QUser is a Querydsl query type for User
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QUser extends EntityPathBase<User> {

    private static final long serialVersionUID = 1851108997L;

    public static final QUser user = new QUser("user");

    public final project.ssumc7thspringboota.domain.QBaseEntity _super = new project.ssumc7thspringboota.domain.QBaseEntity(this);

    //inherited
    public final BooleanPath activated = _super.activated;

    public final StringPath address = createString("address");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createDateTime = _super.createDateTime;

    public final DatePath<java.time.LocalDate> dateOfBirth = createDate("dateOfBirth", java.time.LocalDate.class);

    public final StringPath email = createString("email");

    public final StringPath gender = createString("gender");

    public final SetPath<project.ssumc7thspringboota.domain.inquiry.Inquiry, project.ssumc7thspringboota.domain.inquiry.QInquiry> inquiries = this.<project.ssumc7thspringboota.domain.inquiry.Inquiry, project.ssumc7thspringboota.domain.inquiry.QInquiry>createSet("inquiries", project.ssumc7thspringboota.domain.inquiry.Inquiry.class, project.ssumc7thspringboota.domain.inquiry.QInquiry.class, PathInits.DIRECT2);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDateTime = _super.modifiedDateTime;

    public final StringPath name = createString("name");

    public final StringPath phoneNumber = createString("phoneNumber");

    public final NumberPath<Integer> points = createNumber("points", Integer.class);

    public final SetPath<project.ssumc7thspringboota.domain.mapping.userpreferredfoodtype.UserPreferredFoodType, project.ssumc7thspringboota.domain.mapping.userpreferredfoodtype.QUserPreferredFoodType> preferredFoodTypes = this.<project.ssumc7thspringboota.domain.mapping.userpreferredfoodtype.UserPreferredFoodType, project.ssumc7thspringboota.domain.mapping.userpreferredfoodtype.QUserPreferredFoodType>createSet("preferredFoodTypes", project.ssumc7thspringboota.domain.mapping.userpreferredfoodtype.UserPreferredFoodType.class, project.ssumc7thspringboota.domain.mapping.userpreferredfoodtype.QUserPreferredFoodType.class, PathInits.DIRECT2);

    public final SetPath<project.ssumc7thspringboota.domain.review.Review, project.ssumc7thspringboota.domain.review.QReview> reviews = this.<project.ssumc7thspringboota.domain.review.Review, project.ssumc7thspringboota.domain.review.QReview>createSet("reviews", project.ssumc7thspringboota.domain.review.Review.class, project.ssumc7thspringboota.domain.review.QReview.class, PathInits.DIRECT2);

    public final NumberPath<Long> userId = createNumber("userId", Long.class);

    public final SetPath<project.ssumc7thspringboota.domain.mapping.usermission.UserMission, project.ssumc7thspringboota.domain.mapping.usermission.QUserMission> userMissions = this.<project.ssumc7thspringboota.domain.mapping.usermission.UserMission, project.ssumc7thspringboota.domain.mapping.usermission.QUserMission>createSet("userMissions", project.ssumc7thspringboota.domain.mapping.usermission.UserMission.class, project.ssumc7thspringboota.domain.mapping.usermission.QUserMission.class, PathInits.DIRECT2);

    public QUser(String variable) {
        super(User.class, forVariable(variable));
    }

    public QUser(Path<? extends User> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUser(PathMetadata metadata) {
        super(User.class, metadata);
    }

}

