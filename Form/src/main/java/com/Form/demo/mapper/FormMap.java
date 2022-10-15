
package com.Form.demo.mapper;

import com.Form.demo.persistence.ententy.Form;
import com.Form.demo.service.dto.FormDTO;
import java.time.LocalDateTime;
import org.springframework.stereotype.Component;

@Component
public class FormMap implements IMapper<FormDTO, Form>{

    @Override
    public Form map(FormDTO in) {
        Form form = new Form();
        form.setEmail(in.getEmail());
        form.setName(in.getName());
        form.setCreate_time(LocalDateTime.now());
        return form;
    }
    
}
