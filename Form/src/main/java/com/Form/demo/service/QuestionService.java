
package com.Form.demo.service;

import com.Form.demo.mapper.QuestionMap;
import com.Form.demo.persistence.ententy.Question;
import com.Form.demo.persistence.repository.OptionRepository;
import com.Form.demo.persistence.repository.QuestionRepository;
import com.Form.demo.service.dto.QuestionDTO;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class QuestionService {
    private final OptionRepository optionRepository;
    private final QuestionRepository questionRepository;
    private final QuestionMap questionMap;

    public QuestionService(OptionRepository optionRepository, QuestionRepository questionRepository, QuestionMap questionMap) {
        this.optionRepository = optionRepository;
        this.questionRepository = questionRepository;
        this.questionMap = questionMap;
    }

    
    
    public List<QuestionDTO> questions(){
        List<Question> listQuestion = this.questionRepository.findAll();
        List<QuestionDTO> listQuestionDTO = new ArrayList<>();
        for(Question question : listQuestion){
             QuestionDTO aux = this.questionMap.map(question);
             aux.setOptions(this.optionRepository.findByIdQuestion(question.getId()));
             listQuestionDTO.add(aux);
        }
        return listQuestionDTO;
    }
    
}
