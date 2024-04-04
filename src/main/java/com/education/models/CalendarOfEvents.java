package com.education.models;

import java.awt.BorderLayout;
import java.awt.Color;
//import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CalendarOfEvents extends JFrame {
    private CalendarPanel calendarPanel;

    public CalendarOfEvents() {
        setTitle("Custom Calendar");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 600);
        
        calendarPanel = new CalendarPanel();
        add(calendarPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    public void updateEvents(List<Event> events) {
        calendarPanel.updateEvents(events);
    }

    public static void main(String[] args) {
        CalendarOfEvents customCalendar = new CalendarOfEvents();
        
        // Example: Fetch events from the model and update the calendar
        List<Event> events = new ArrayList<>();
        // Add events to the list...
        customCalendar.updateEvents(events);
    }
}

class CalendarPanel extends JPanel {
    private List<Event> events;

    public CalendarPanel() {
        setBorder(BorderFactory.createLineBorder(Color.BLACK));
        setPreferredSize(new Dimension(600, 400));
        events = new ArrayList<>();
    }

    public void updateEvents(List<Event> events) {
        this.events = events;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Example: Draw the calendar grid
        int cellWidth = getWidth() / 7;
        int cellHeight = getHeight() / 6;
        for (int row = 0; row < 6; row++) {
            for (int col = 0; col < 7; col++) {
                int x = col * cellWidth;
                int y = row * cellHeight;
                g2d.drawRect(x, y, cellWidth, cellHeight);
            }
        }

        // Example: Draw events on the calendar
        for (Event event : events) {
            Date startTime = event.getStartTime();
            Calendar cal = Calendar.getInstance();
            cal.setTime(startTime);
            int day = cal.get(Calendar.DAY_OF_MONTH) - 1; // Zero-based index
            int col = day % 7;
            int row = day / 7;
            int x = col * cellWidth;
            int y = row * cellHeight;
            
            // Set event color based on status
            Color color = Color.GREEN; // Default color for upcoming events
            if (startTime.before(new Date())) {
                color = Color.ORANGE; // Orange color for past events
            }
            
            g2d.setColor(color);
            g2d.fillRect(x, y, cellWidth, cellHeight);
        }
    }
}
