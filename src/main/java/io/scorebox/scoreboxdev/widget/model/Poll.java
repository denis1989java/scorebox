package io.scorebox.scoreboxdev.widget.model;

import io.scorebox.scoreboxdev.feed.model.FeedItem;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 'Poll' Document.
 *
 * @author yury.yunkevich
 */
@Document(collection = "feed_items")
@TypeAlias("Poll")
public class Poll extends FeedItem {
}
