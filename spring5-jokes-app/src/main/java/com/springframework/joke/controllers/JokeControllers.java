package com.springframework.joke.controllers;


import com.springframework.joke.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeControllers {

    private JokeService jokeService;

    @Autowired
    public JokeControllers(JokeService jokeService) {
        this.jokeService = jokeService;
    }


    @RequestMapping({"/",""})
    private String showJoke(Model model){
        model.addAttribute("joke", jokeService.getJoke());
        return"chucknorris";
    }



}
