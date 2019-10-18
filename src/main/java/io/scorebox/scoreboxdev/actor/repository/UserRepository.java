package io.scorebox.scoreboxdev.actor.repository;

import io.scorebox.scoreboxdev.actor.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository for 'User'.
 *
 * @author yury.yunkevich
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}