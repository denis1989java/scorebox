package io.scorebox.scoreboxdev.widget.repository;

import io.scorebox.scoreboxdev.widget.model.Poll;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Poll Repository.
 *
 * @author yury.yunkevich
 */
@RepositoryRestResource(collectionResourceRel = "widgets", path = "polls")
public interface PollRepository extends MongoRepository<Poll, Long> {
}
