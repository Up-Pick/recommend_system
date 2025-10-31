package uppick.uppickrecommend.recommend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import uppick.uppickrecommend.recommend.entity.UserAction;

public interface UserActionRepository extends JpaRepository<UserAction, Long> {

}
