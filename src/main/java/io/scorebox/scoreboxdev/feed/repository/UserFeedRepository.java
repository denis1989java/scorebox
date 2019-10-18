package io.scorebox.scoreboxdev.feed.repository;

import io.scorebox.scoreboxdev.feed.model.UserFeed;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * User's Feeds Repository.
 *
 * @author yury.yunkevich
 */
@RepositoryRestResource(collectionResourceRel = "feeds", path = "user_feeds")
public interface UserFeedRepository extends MongoRepository<UserFeed, Long> {
}
