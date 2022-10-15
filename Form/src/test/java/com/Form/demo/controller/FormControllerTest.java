package com.Form.demo.controller;

import com.Form.demo.service.FormService;
import com.Form.demo.service.dto.AnswerDTO;
import com.Form.demo.service.dto.FormDTO;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.any;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.doCallRealMethod;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;

class FormControllerTest {

    @Mock
    private FormService formService;
    
    @InjectMocks
    private FormController formController;
    
    
    private FormDTO formDTO;
    private List<AnswerDTO> answersDTO; 
    
    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        answersDTO = new ArrayList<>();
        answersDTO.add(new AnswerDTO(new Long(1),""));
        formDTO = new FormDTO();
        formDTO.setEmail("malon@gamil.com");
        formDTO.setName("marlon");
        formDTO.setAnswers(answersDTO);
    }

    @Test
    void saveForm() {
        FormController emp = mock(FormController.class);
        doThrow(IllegalArgumentException.class).when(emp).saveForm(null);
        
        doAnswer((i) -> {
            System.out.println("a");
            return null;
        }).when(emp).saveForm(formDTO);
        
    }
}