package com.Form.demo.controller;

import com.Form.demo.persistence.ententy.Option;
import com.Form.demo.service.QuestionService;
import com.Form.demo.service.dto.QuestionDTO;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

class QuestionControllerTest {

    @Mock
    private QuestionService questionService;
    
    @InjectMocks
    private QuestionController questionController;
    
    private QuestionDTO questionDTO;
    private List<Option> options;
    
    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        
        options = new ArrayList<>();
        Option option = new Option();
        option.setActive(true);
        option.setId_question(2);
        option.setName("pregunta");
        options.add(option);
        questionDTO = new QuestionDTO();
        questionDTO.setId(new Long(1));
        questionDTO.setName("pregunta");
        questionDTO.setActive(true);
        questionDTO.setOptions(options);
    }

    @Test
    void findAll() {
        Mockito.when(questionService.questions()).thenReturn(Arrays.asList(questionDTO));
        assertNotNull(questionController.findAll());
    }
}