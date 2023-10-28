
package com.sisteamderiego.sisteamderiego.domain.repositoryDTO;

import com.sisteamderiego.sisteamderiego.domain.dto.ScheduleValveArduinoDTO;
import com.sisteamderiego.sisteamderiego.domain.dto.ScheduleValveDTO;
import com.sisteamderiego.sisteamderiego.domain.dto.ValveDTO;
import java.util.List;


public interface ScheduleValveRepositoryDTO {
    
    List<ScheduleValveDTO> getAll();
    ScheduleValveDTO save(ScheduleValveDTO scheduleValveDTO);
    void delete(int id);
    List<ValveDTO> getAllValve();
    List<ScheduleValveArduinoDTO> getAllArduino();
}
