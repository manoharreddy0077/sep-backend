package com.education.controllers;


import java.util.List;
import org.springframework.stereotype.Controller;

import com.education.services.EventService;


import com.education.models.Event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class EventController {


    @Autowired
    private EventService eventService;

    @GetMapping("/events")
     public String  showEvets(Model model) {
        List<Event> events = eventService.getAllEvents();
        model.addAttribute("eventList", events);
        System.out.println(events);
        return "eventslist"; // Renders assignment.jsp
    }
}
