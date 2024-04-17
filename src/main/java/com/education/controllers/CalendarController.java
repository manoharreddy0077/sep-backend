package com.education.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;


import com.education.models.Event;
import com.education.repositories.EventRepository;

@Controller
public class CalendarController {

    private final EventRepository eventRepository;

    public CalendarController(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @GetMapping("/calendar")
    public String showCalendar(Model model) {
        List<Event> events = eventRepository.findAll();
        List<Week> weeks = generateCalendarData(events);
        model.addAttribute("weeks", weeks);
        return "calendarofevents";
    }

    // Helper method to generate data for the calendar
    private List<Week> generateCalendarData(List<Event> events) {
        Calendar cal = Calendar.getInstance();
        List<Week> weeks = new ArrayList<>();
        cal.set(Calendar.DAY_OF_WEEK, cal.getFirstDayOfWeek()); // Set to the first day of the week
        Date today = new Date(); // Get the current date
    
        int currentMonth = -1;
        for (int i = 0; i < 6; i++) { // Assuming 6 weeks in the calendar
            Week week = new Week();
            List<Day> days = new ArrayList<>();
            for (int j = 0; j < 7; j++) { // 7 days in a week
                Date currentDate = cal.getTime();
                String day = Integer.toString(cal.get(Calendar.DAY_OF_MONTH));
                boolean isEvent = events.stream().anyMatch(event -> {
                    Date startTime = event.getStartTime();
                    return startTime != null && isSameDay(startTime, currentDate);
                });
                boolean isPast = currentDate.before(today); // Check if the date is in the past
                String monthName = currentMonth != cal.get(Calendar.MONTH) ? getMonthName(cal.get(Calendar.MONTH)) : null;
                days.add(new Day(day, isEvent, isPast, monthName)); // Pass monthName parameter
                cal.add(Calendar.DAY_OF_MONTH, 1); // Move to the next day
            }
            week.setDays(days);
            weeks.add(week);
        }
        return weeks;
    }
    
    private String getMonthName(int month) {
        String[] monthNames = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        return monthNames[month];
    }
    
       
    // Check if two dates are on the same day
    private boolean isSameDay(Date date1, Date date2) {
        Calendar cal1 = Calendar.getInstance();
        cal1.setTime(date1);
        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(date2);
        return cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR) &&
                cal1.get(Calendar.MONTH) == cal2.get(Calendar.MONTH) &&
                cal1.get(Calendar.DAY_OF_MONTH) == cal2.get(Calendar.DAY_OF_MONTH);
    }

    // Inner classes representing a week and a day in the calendar
    static class Week {
        private List<Day> days;

        public List<Day> getDays() {
            return days;
        }

        public void setDays(List<Day> days) {
            this.days = days;
        }
    }

    static class Day {
        private String date;
        private boolean hasEvent;
        private boolean isPast;
        private String monthName; // Add monthName property

    public Day(String date, boolean hasEvent, boolean isPast, String monthName) {
        this.date = date;
        this.hasEvent = hasEvent;
        this.isPast = isPast;
        this.monthName = monthName;
    }

        public String getDate() {
            return date;
        }
    
        public void setDate(String date) {
            this.date = date;
        }
    
        public boolean isHasEvent() {
            return hasEvent;
        }
    
        public void setHasEvent(boolean hasEvent) {
            this.hasEvent = hasEvent;
        }
    
        public boolean isPast() {
            return isPast;
        }
    
        public void setPast(boolean past) {
            isPast = past;
        }
        public String getMonthName() {
            return monthName;
        }
    
        public void setMonthName(String monthName) {
            this.monthName = monthName;
        }
    }
}