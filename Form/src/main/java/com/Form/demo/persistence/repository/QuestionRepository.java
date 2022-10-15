
package com.Form.demo.persistence.repository;

import com.Form.demo.persistence.ententy.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository  extends JpaRepository<Question, Long>{
    
}
