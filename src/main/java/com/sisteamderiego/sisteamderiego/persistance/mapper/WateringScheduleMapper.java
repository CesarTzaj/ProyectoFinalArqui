
package com.sisteamderiego.sisteamderiego.persistance.mapper;

import com.sisteamderiego.sisteamderiego.domain.dto.WateringScheduleDTO;
import com.sisteamderiego.sisteamderiego.persistance.entity.WateringSchedule;
import java.util.List;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface WateringScheduleMapper {
    
    WateringScheduleDTO toWateringScheduleDTO(WateringSchedule wateringSchedule);
    List<WateringScheduleDTO> toWateringScheduleDTOs(List<WateringSchedule> wateringSchedule);
    
    @InheritInverseConfiguration     
    @Mapping(target = "scheduleValve", ignore = true)
    WateringSchedule toWateringSchedule(WateringScheduleDTO wateringScheduleDTO);
}
