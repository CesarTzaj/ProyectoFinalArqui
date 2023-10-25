
package com.sisteamderiego.sisteamderiego.persistance.mapper;

import com.sisteamderiego.sisteamderiego.domain.dto.SensorDTO;
import com.sisteamderiego.sisteamderiego.persistance.entity.Sensor;
import org.mapstruct.*;


@Mapper(componentModel = "spring")
public interface SensorMapper {
   
    
    SensorDTO toSensorDTO(Sensor sensor);
}
