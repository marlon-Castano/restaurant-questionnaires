
package com.Form.demo.mapper;

import com.Form.demo.persistence.ententy.Question;
import com.Form.demo.service.dto.QuestionDTO;
import org.springframework.stereotype.Component;


@Component
public class QuestionMap implements IMapper<Question, QuestionDTO>{

    @Override
    public QuestionDTO map(Question in) {
        QuestionDTO questiondto = new QuestionDTO();
        questiondto.setId(in.getId());
        questiondto.setName(in.getName());
        questiondto.setActive(in.isActive());
        return questiondto;
    }
      
    
}
