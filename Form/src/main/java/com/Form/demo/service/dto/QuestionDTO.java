
package com.Form.demo.service.dto;

import com.Form.demo.persistence.ententy.Option;
import java.util.List;
import lombok.Data;

@Data
public class QuestionDTO {
    
    private Long id;
    private String name;
    private boolean active;
    private List<Option> options;
}
