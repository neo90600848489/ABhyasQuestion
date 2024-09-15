package com.example.helloworld.repository;

import com.example.helloworld.Model.Question;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface QuestionRepository extends MongoRepository<Question, String> {
    // You can define custom query methods if needed
}
