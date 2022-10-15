
package com.Form.demo.persistence.repository;

import com.Form.demo.persistence.ententy.Option;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface OptionRepository extends JpaRepository<Option, Long>{
    
    
    @Modifying
    @Query(value = "SELECT * FROM options where id_question = :id", nativeQuery = true)
    public List<Option> findByIdQuestion(@Param("id") long id);
}
