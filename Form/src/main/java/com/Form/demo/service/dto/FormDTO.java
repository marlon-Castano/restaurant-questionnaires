
package com.Form.demo.service.dto;

import java.util.List;
import lombok.Data;


@Data
public class FormDTO {
    
    private String name;
    private String email;
    private List<AnswerDTO> answers;
}
