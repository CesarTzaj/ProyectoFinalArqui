
package com.sisteamderiego.sisteamderiego.persistance.mapper;

import com.sisteamderiego.sisteamderiego.domain.dto.LocationDTO;
import com.sisteamderiego.sisteamderiego.persistance.entity.Location;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface LocationMapper {
    
  
    LocationDTO toLocationDTO(Location location);
}
