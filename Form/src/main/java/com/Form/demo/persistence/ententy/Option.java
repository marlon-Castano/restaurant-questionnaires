
package com.Form.demo.persistence.ententy;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name = "options")
public class Option {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private long id_question;
    private String name;
    private boolean active;
    private boolean is_open;
    private LocalDateTime create_time;
    private LocalDateTime update_time;
}
