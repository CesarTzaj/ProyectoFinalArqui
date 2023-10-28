
package com.sisteamderiego.sisteamderiego.domain.service;

import com.sisteamderiego.sisteamderiego.domain.dto.ScheduleValveArduinoDTO;
import com.sisteamderiego.sisteamderiego.domain.dto.ScheduleValveDTO;
import com.sisteamderiego.sisteamderiego.domain.dto.ValveDTO;
import com.sisteamderiego.sisteamderiego.domain.repositoryDTO.ScheduleValveRepositoryDTO;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScheduleValveService {
    
    @Autowired
    private ScheduleValveRepositoryDTO schedule;
    
    public List<ScheduleValveDTO> getAll(){
        return schedule.getAll();
    }
    
    public ScheduleValveDTO save(ScheduleValveDTO scheduleValveDTO){        
        return schedule.save(scheduleValveDTO);
    }
    
    public void delete(int id){
        schedule.delete(id);
    }
    public List<ValveDTO> getAllValve(){
        return schedule.getAllValve();
    }
    public List<ScheduleValveArduinoDTO> getAllArduino(){
        return schedule.getAllArduino();
    }
}
