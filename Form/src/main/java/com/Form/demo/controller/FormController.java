
package com.Form.demo.controller;

import com.Form.demo.service.FormService;
import com.Form.demo.service.dto.FormDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inserform")
public class FormController {
    public final FormService formService;

    public FormController(FormService formService) {
        this.formService = formService;
    }


    @PostMapping
    public ResponseEntity<Void> saveForm(@RequestBody FormDTO formDTO){
        this.formService.saveForm(formDTO);
        return ResponseEntity.noContent().build();
    }
}
