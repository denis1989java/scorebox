package io.scorebox.scoreboxdev.widget.service;

import io.scorebox.scoreboxdev.widget.repository.AnnouncementRepository;
import io.scorebox.scoreboxdev.widget.repository.ArticleRepository;
import io.scorebox.scoreboxdev.widget.repository.GamesRepository;
import io.scorebox.scoreboxdev.widget.repository.PollRepository;
import io.scorebox.scoreboxdev.widget.repository.ScoreRepository;
import io.scorebox.scoreboxdev.widget.repository.VideoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * WidgetService.
 *
 * @author yury.yunkevich
 */
@Service
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class WidgetService {

    private final AnnouncementRepository announcementRepository;
    private final ArticleRepository articleRepository;
    private final GamesRepository gamesRepository;
    private final PollRepository pollRepository;
    private final ScoreRepository scoreRepository;
    private final VideoRepository videoRepository;
}
