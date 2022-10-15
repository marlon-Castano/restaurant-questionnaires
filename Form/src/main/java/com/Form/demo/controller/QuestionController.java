
package com.Form.demo.controller;

import com.Form.demo.service.QuestionService;
import com.Form.demo.service.dto.QuestionDTO;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/form")
public class QuestionController {
    
    public final QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }
    
    @GetMapping("/findAll")
    public List<QuestionDTO> findAll(){
        return questionService.questions();
    }
}
