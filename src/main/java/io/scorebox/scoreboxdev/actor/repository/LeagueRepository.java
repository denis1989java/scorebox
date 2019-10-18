package io.scorebox.scoreboxdev.actor.repository;

import io.scorebox.scoreboxdev.actor.model.League;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository for 'League'.
 *
 * @author yury.yunkevich
 */
@Repository
public interface LeagueRepository extends JpaRepository<League, Long> {
}