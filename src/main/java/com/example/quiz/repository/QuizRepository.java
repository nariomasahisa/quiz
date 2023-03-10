package com.example.quiz.repository;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import com.example.quiz.entity.Quiz;

/**
 * Quizテーブル: RepositoryImpl 
 * リポジトリはインターフェースであり、データベースの操作だけをこの中に定義する
 * CrudRepositoryの定義
*/
public interface QuizRepository extends CrudRepository<Quiz, Integer> {
    @Query("SELECT id FROM quiz ORDER BY RANDOM() limit 1")
    Integer getRandomId();
}