package com.busyqa.course.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GreetingController {


    @ModelAttribute("currentTime")
    public String addCurrentTime() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm");
        LocalDateTime currentTime = LocalDateTime.now();

        String formattedcurrentTime = currentTime.format(formatter);

        return formattedcurrentTime;
    }
   
    
    
    @GetMapping("/")
    public String init() {

        return "greeting";
    }
    
    @PostMapping("/greeting")
    public ModelAndView show(HttpServletRequest request) {
    	
    	String first = request.getParameter("first");
    	String last = request.getParameter("last");
    	
    	String name = String.format("%s %s", first, last);
    	
    	System.out.printf("Welcome %s !!!!%n",name);
    	
    	return new ModelAndView("greeting","name",name);
    }
    
}
