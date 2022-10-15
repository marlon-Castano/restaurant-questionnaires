/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Form.demo.exceptions;

import lombok.Data;
import org.springframework.http.HttpStatus;


@Data
public class FormExceptions  extends RuntimeException{

    private String mesagge;
    private HttpStatus httpStatus;

    public FormExceptions(String mesagge, HttpStatus httpStatus){
        super(mesagge);
        this.mesagge = mesagge;
        this.httpStatus = httpStatus;
    }
}
