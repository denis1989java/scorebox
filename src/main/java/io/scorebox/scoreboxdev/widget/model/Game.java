package io.scorebox.scoreboxdev.widget.model;

import io.scorebox.scoreboxdev.feed.model.FeedItem;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * 'Game' Document.
 *
 * @author yury.yunkevich
 */
@Document(collection = "feed_items")
@TypeAlias("Game")
public class Game extends FeedItem {

    private String homeTeam;
    private String guestTeam;

    private Date dateOfGame;
    private GameStatus status;
}
