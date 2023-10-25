
package com.sisteamderiego.sisteamderiego.persistance.crud;

import com.sisteamderiego.sisteamderiego.persistance.entity.Sensor;
import org.springframework.data.repository.CrudRepository;


public interface SensorCrud extends CrudRepository<Sensor, Integer>{
    
}
