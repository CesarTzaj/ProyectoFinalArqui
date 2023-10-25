
package com.sisteamderiego.sisteamderiego.persistance.mapper;

import com.sisteamderiego.sisteamderiego.domain.dto.ScheduleValveDTO;
import com.sisteamderiego.sisteamderiego.persistance.entity.ScheduleValve;
import java.util.List;
import org.mapstruct.*;

@Mapper(componentModel = "spring", uses = {
    WateringScheduleMapper.class,
    ValveMapper.class
})
public interface ScheduleValveMapper {
    
    ScheduleValveDTO toScheduleValveDTO(ScheduleValve scheduleValve);
    List<ScheduleValveDTO> toScheduleValveDTOs(List<ScheduleValve> scheduleValves);
    
    @InheritInverseConfiguration
    @Mapping(target = "wateringSchedule", ignore = true)
    @Mapping(target = "valve", ignore = true)
    ScheduleValve toShScheduleValve(ScheduleValveDTO scheduleValveDTO);
}
