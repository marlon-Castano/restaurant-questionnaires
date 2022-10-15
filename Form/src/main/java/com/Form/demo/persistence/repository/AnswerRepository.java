
package com.Form.demo.persistence.repository;

import com.Form.demo.persistence.ententy.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository extends JpaRepository<Answer, Long>{
    
}
