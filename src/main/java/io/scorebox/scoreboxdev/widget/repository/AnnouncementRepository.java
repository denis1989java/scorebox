package io.scorebox.scoreboxdev.widget.repository;

import io.scorebox.scoreboxdev.widget.model.Announcement;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Announcement Repository.
 *
 * @author yury.yunkevich
 */
@RepositoryRestResource(collectionResourceRel = "widgets", path = "announcements")
public interface AnnouncementRepository extends MongoRepository<Announcement, Long> {
}
