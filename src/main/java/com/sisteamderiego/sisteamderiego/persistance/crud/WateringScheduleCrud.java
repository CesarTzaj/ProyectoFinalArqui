package com.sisteamderiego.sisteamderiego.persistance.crud;

import com.sisteamderiego.sisteamderiego.persistance.entity.WateringSchedule;
import org.springframework.data.repository.CrudRepository;


public interface WateringScheduleCrud extends CrudRepository<WateringSchedule, Integer>{
    
}
