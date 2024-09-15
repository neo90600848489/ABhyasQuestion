package com.example.helloworld.controller;

import com.example.helloworld.Model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.helloworld.services.QuestionService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/questions")
public class QuestionController {
    @Autowired
    private QuestionService questionService;

    // POST method to add a new question
    @PostMapping
    public Question postQuestion(@RequestBody Question question) {
        return questionService.postQuestion(question);
    }

}
