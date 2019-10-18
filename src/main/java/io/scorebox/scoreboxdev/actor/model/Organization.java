package io.scorebox.scoreboxdev.actor.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.List;

/**
 * Organization.
 *
 * @author yury.yunkevich
 */
@Data
public class Organization {

    @Id private long id;

    private List<League> leagues;
}
