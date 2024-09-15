package com.example.helloworld.services;

import com.example.helloworld.Model.Question;
import com.example.helloworld.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    public Question postQuestion(Question question) {
        return questionRepository.save(question);
    }
}
