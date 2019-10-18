package io.scorebox.scoreboxdev.feed.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Date;

/**
 * 'Feed'.
 *
 * @author yury.yunkevich
 */
@Data
public class Feed {

    @Id private long id;

    private long widgetId;
    private Date createdOn;
    private int rate;
    private boolean active;
}