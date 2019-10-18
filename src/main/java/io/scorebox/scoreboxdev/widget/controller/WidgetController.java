package io.scorebox.scoreboxdev.widget.controller;

import io.scorebox.scoreboxdev.widget.service.WidgetService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * WidgetController.
 *
 * @author yury.yunkevich
 */
@Controller
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class WidgetController {

    private final WidgetService widgetService;
}