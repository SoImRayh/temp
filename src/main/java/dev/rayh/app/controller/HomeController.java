package dev.rayh.app.controller;

import dev.rayh.app.domain.views.AppViews;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @GetMapping("")
    public ModelAndView home(){
        ModelAndView modelAndView = new ModelAndView(AppViews.HOME.toString());
        return modelAndView;
    }
}
