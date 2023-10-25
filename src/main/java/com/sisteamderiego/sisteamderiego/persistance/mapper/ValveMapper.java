
package com.sisteamderiego.sisteamderiego.persistance.mapper;

import com.sisteamderiego.sisteamderiego.domain.dto.ValveDTO;
import com.sisteamderiego.sisteamderiego.persistance.entity.Valve;
import java.util.List;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ValveMapper {

    ValveDTO toValveDTO(Valve valve);
    List<ValveDTO> toValveDTOs(List<Valve> valves);
}
