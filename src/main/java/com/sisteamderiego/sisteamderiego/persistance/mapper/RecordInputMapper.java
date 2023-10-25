
package com.sisteamderiego.sisteamderiego.persistance.mapper;



import com.sisteamderiego.sisteamderiego.domain.dto.RecordInputDTO;
import com.sisteamderiego.sisteamderiego.persistance.entity.RecordInput;
import java.util.List;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;
import org.springframework.data.domain.Page;

@Mapper(componentModel = "spring", uses = {
    LocationMapper.class,
    SensorMapper.class,
    ValveMapper.class
})
public interface RecordInputMapper {
    //RecordInputMapper INSTANCE = Mappers.getMapper(RecordInputMapper.class);
    
    RecordInputDTO toRecordInputDTO(RecordInput record);
    List<RecordInputDTO> toRecordInputDTOs (List<RecordInput> records);
    
    @InheritInverseConfiguration
    @Mapping(target = "location", ignore = true)
    @Mapping(target = "sensor", ignore = true)
    @Mapping(target = "valve", ignore = true)
    RecordInput toRecordInput(RecordInputDTO recordInputDTO);

}
