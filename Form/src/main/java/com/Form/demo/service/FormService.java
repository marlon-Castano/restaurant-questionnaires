package com.Form.demo.service;

import com.Form.demo.exceptions.FormExceptions;
import com.Form.demo.mapper.AnswerMap;
import com.Form.demo.mapper.FormMap;
import com.Form.demo.persistence.ententy.Answer;
import com.Form.demo.persistence.ententy.Form;
import com.Form.demo.persistence.repository.AnswerRepository;
import com.Form.demo.persistence.repository.FormRepository;
import com.Form.demo.service.dto.AnswerDTO;
import com.Form.demo.service.dto.FormDTO;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class FormService {

    private final FormRepository formRepositoy;
    private final AnswerRepository answerRepository;
    private final FormMap formMap;
    private final AnswerMap answerMap;

    public FormService(FormRepository formRepositoy, AnswerRepository answerRepository, FormMap formMap, AnswerMap answerMap) {
        this.formRepositoy = formRepositoy;
        this.answerRepository = answerRepository;
        this.formMap = formMap;
        this.answerMap = answerMap;
    }

    public void saveForm(FormDTO formDTO) {
        if (formDTO.getAnswers().isEmpty()) {
            throw new FormExceptions("Lista de respuatas vacia", HttpStatus.CONFLICT);
        }
        Form form = this.formMap.map(formDTO);
        Form newform = this.formRepositoy.save(form);
        if (form == null) {
            throw new FormExceptions("Error al insertar", HttpStatus.CONFLICT);
        }
        for (AnswerDTO answer : formDTO.getAnswers()) {
            Answer aux = this.answerMap.map(answer);
            aux.setId_form(newform.getId());
            if (this.answerRepository.save(aux) == null) {
                throw new FormExceptions("Error al insertar", HttpStatus.CONFLICT);
            }
        }
    }
}
