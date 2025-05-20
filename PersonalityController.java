package com.example.redditpersonalityanalyser.controller;

import com.example.redditpersonalityanalyser.model.PersonalityResult;
import com.example.redditpersonalityanalyser.model.RedditTextRequest;
import com.example.redditpersonalityanalyser.service.PersonalityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/personality")
public class PersonalityController {

    @Autowired
    private PersonalityService personalityService;

    @PostMapping("/analyze")
    public PersonalityResult analyzeText(@RequestBody RedditTextRequest request) {
        return personalityService.analyzeText(request.getText());
    }
}