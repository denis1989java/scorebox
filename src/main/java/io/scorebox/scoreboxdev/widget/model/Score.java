package io.scorebox.scoreboxdev.widget.model;

import lombok.Data;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 'Score' Document.
 *
 * @author yury.yunkevich
 */
@Data
@Document(collection = "feed_items")
@TypeAlias("Score")
public class Score extends Game {

    private int homeScore;
    private int guestScore;

    private int homePenaltyScore;
    private int guestPenaltyScore;
}
