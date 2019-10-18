package io.scorebox.scoreboxdev.widget.repository;

import io.scorebox.scoreboxdev.widget.model.Game;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Game Repository.
 *
 * @author yury.yunkevich
 */
@RepositoryRestResource(collectionResourceRel = "widgets", path = "games")
public interface GamesRepository extends MongoRepository<Game, Long> {
}
