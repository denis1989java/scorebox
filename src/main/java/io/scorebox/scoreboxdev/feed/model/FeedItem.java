package io.scorebox.scoreboxdev.feed.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Date;

/**
 * 'Widget' Document.
 *
 * @author yury.yunkevich
 */
@Data
public abstract class FeedItem {

    @Id private long id;

    private String name;

    private Date createdOn;
    private long createdBy;
}