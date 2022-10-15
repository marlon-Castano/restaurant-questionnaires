
package com.Form.demo.mapper;

import com.Form.demo.persistence.ententy.Answer;
import com.Form.demo.service.dto.AnswerDTO;
import java.time.LocalDateTime;
import org.springframework.stereotype.Component;

@Component
public class AnswerMap implements IMapper<AnswerDTO, Answer>{

    @Override
    public Answer map(AnswerDTO in) {
        Answer answer = new Answer();
        answer.setId_option(in.getId_option());
        answer.setOpen_option(in.getOpen_option());
        answer.setCreate_time(LocalDateTime.now());
        return answer;
    }

    
    
}
