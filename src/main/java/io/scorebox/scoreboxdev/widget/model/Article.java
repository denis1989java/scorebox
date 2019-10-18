package io.scorebox.scoreboxdev.widget.model;

import io.scorebox.scoreboxdev.feed.model.FeedItem;
import lombok.Data;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 'Article' Document.
 *
 * @author yury.yunkevich
 */
@Data
@Document(collection = "feed_items")
@TypeAlias("Article")
public class Article extends FeedItem {

    private String alternateText;
}
