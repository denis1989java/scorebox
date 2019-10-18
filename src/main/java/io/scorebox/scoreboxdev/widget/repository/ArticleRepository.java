package io.scorebox.scoreboxdev.widget.repository;

import io.scorebox.scoreboxdev.widget.model.Article;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Article Repository.
 *
 * @author yury.yunkevich
 */
@RepositoryRestResource(collectionResourceRel = "widgets", path = "articles")
public interface ArticleRepository extends MongoRepository<Article, Long> {
}
