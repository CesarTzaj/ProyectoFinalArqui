/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.sisteamderiego.sisteamderiego.persistance.mapper;

import com.sisteamderiego.sisteamderiego.domain.dto.WateringScheduleTimeDTO;
import com.sisteamderiego.sisteamderiego.persistance.entity.WateringSchedule;
import java.util.List;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface WateringScheduleTimeMapper {
 
    WateringScheduleTimeDTO toWateringScheduleDTO(WateringSchedule wateringSchedule);
    List<WateringScheduleTimeDTO> toWateringScheduleDTOs(List<WateringSchedule> wateringSchedule);
}
