
package com.Form.demo.service.dto;

import lombok.Data;

@Data
public class AnswerDTO {
    
    private Long id_option;
    private String open_option;

    public AnswerDTO(Long id_option, String open_option) {
        this.id_option = id_option;
        this.open_option = open_option;
    }

    
    
}
