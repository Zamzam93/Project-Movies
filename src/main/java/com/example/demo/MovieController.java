package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;

public class MovieController {
    @RequestMapping("/")
    public String getIndexPage(){
        return "index";
    }
    @RequestMapping("/bestMovie")
    public String getBestMoviePage(Model mode){
        model.addAttribute("BestMovie", bestMovieService.getBestMovie().getTittle());
        return "voteForBestMovie";

    }
}
