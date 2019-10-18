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

    private long homeTeamID;
    private String homeTeam;
    private String homeTeamLogo;

    private long guestTeamID;
    private String guestTeam;
    private String guestTeamLogo;

    private Date dateOfGame;
    private GameStatus status;
}
