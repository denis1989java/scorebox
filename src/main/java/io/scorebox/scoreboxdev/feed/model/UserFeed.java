package io.scorebox.scoreboxdev.feed.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * User Feeds.
 *
 * @author yury.yunkevich
 */
@Data
@Document(collection = "user_feeds")
public class UserFeed {

    @Id private long id;

    private long userId;
    private List<Feed> feeds;
}
