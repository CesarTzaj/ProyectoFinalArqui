package com.sisteamderiego.sisteamderiego.persistance.mapper;

import com.sisteamderiego.sisteamderiego.domain.dto.*;
import com.sisteamderiego.sisteamderiego.persistance.entity.ScheduleValve;
import java.util.List;
import org.mapstruct.*;

@Mapper(componentModel = "spring", uses = WateringScheduleTimeMapper.class)
public interface ScheduleValveArduinoMapper {
    
    @Mappings({
        @Mapping(source = "idValve", target = "id"),
        @Mapping(source = "wateringSchedule", target = "time")
    })
    ScheduleValveArduinoDTO toScheduleValveDTO(ScheduleValve scheduleValve);
    List<ScheduleValveArduinoDTO> toScheduleValveDTOs(List<ScheduleValve> scheduleValves);
}
