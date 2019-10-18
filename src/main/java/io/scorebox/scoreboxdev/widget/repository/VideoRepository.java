package io.scorebox.scoreboxdev.widget.repository;

import io.scorebox.scoreboxdev.widget.model.Video;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Video Repository.
 *
 * @author yury.yunkevich
 */
@RepositoryRestResource(collectionResourceRel = "widgets", path = "videos")
public interface VideoRepository extends MongoRepository<Video, Long> {
}
