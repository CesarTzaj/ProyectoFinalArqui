
package com.sisteamderiego.sisteamderiego.persistance.crud;

import com.sisteamderiego.sisteamderiego.persistance.entity.RecordInput;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.JpaRepository;





public interface RecordInputCrud extends JpaRepository<RecordInput, Integer>{
    
    Page<RecordInput> findByOrderByDateDesc(Pageable pageable);
    
    
}
