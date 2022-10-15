
package com.Form.demo.persistence.repository;


import com.Form.demo.persistence.ententy.Form;
import org.springframework.data.jpa.repository.JpaRepository;


public interface FormRepository extends JpaRepository<Form, Long>{
    
}
