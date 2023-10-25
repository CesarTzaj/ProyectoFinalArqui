
package com.sisteamderiego.sisteamderiego.persistance.crud;

import com.sisteamderiego.sisteamderiego.persistance.entity.Valve;
import java.util.List;

import org.springframework.data.repository.CrudRepository;


public interface ValveCrud extends CrudRepository<Valve, Integer>{
    
    List<Valve> findByOrderByValveIdDesc();
}
