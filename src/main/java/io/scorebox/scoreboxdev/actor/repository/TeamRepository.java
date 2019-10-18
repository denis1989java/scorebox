package io.scorebox.scoreboxdev.actor.repository;

import io.scorebox.scoreboxdev.actor.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository for 'Team'.
 *
 * @author yury.yunkevich
 */
@Repository
public interface TeamRepository extends JpaRepository<Team, Long> {
}