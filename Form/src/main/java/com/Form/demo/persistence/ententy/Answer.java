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
@Table(name = "anwers")
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private long id_form;
    private long id_option;
    private String open_option;
    private LocalDateTime create_time;
    private LocalDateTime update_time;
}
