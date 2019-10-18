package io.scorebox.scoreboxdev.actor.repository;

import io.scorebox.scoreboxdev.actor.model.Organization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository for 'Organization'.
 *
 * @author yury.yunkevich
 */
@Repository
public interface OrganizationRepository extends JpaRepository<Organization, Long> {
}