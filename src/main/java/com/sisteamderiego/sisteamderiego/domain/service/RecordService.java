
package com.sisteamderiego.sisteamderiego.domain.service;

import com.sisteamderiego.sisteamderiego.domain.dto.RecordInputDTO;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.sisteamderiego.sisteamderiego.domain.repositoryDTO.RecordInputRepositoryDTO;
import java.time.*;
import java.time.format.DateTimeFormatter;
import org.springframework.data.domain.Page;

@Service
public class RecordService {

    @Autowired
    private RecordInputRepositoryDTO record;
    
    public Page<RecordInputDTO> getAll(Pageable pageable){
        return record.getAll(pageable);
    }
    
    public RecordInputDTO save(RecordInputDTO recordInputDTO){
        ZoneId guatemalaZone = ZoneId.of("America/Guatemala");
        ZonedDateTime guatemalaTime = ZonedDateTime.now(guatemalaZone);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        String formattedTime = guatemalaTime.format(formatter);
        
        recordInputDTO.setDate(formattedTime);
       
        return record.save(recordInputDTO);
    }
}
