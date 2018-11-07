package edu.xavier.eventscheduler.controller;

import edu.xavier.eventscheduler.domain.Event;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EventSchedulerHandler {

    @RequestMapping(value = "scheduler", method = RequestMethod.GET)
    public String getScheduler(Model model)
    {
        model.addAttribute("Event", new Event());
        return "scheduler";
    }

    /**
     * Event event, is the input from the forms
     * fields can be called by getters
     * i.e: event.getHour(); will return what the user put in as the hour when they clicked submit
     */
    @RequestMapping(value = "scheduler", method = RequestMethod.POST)
    public String getScheduler(@ModelAttribute Event event)
    {
        event.getHour();
        return "scheduledEvent";
    }
}
