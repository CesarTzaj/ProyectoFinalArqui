
package com.sisteamderiego.sisteamderiego.web.controller;

import com.sisteamderiego.sisteamderiego.domain.dto.ScheduleValveDTO;
import com.sisteamderiego.sisteamderiego.domain.dto.ValveDTO;
import com.sisteamderiego.sisteamderiego.domain.service.ScheduleValveService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("schedules")
@RestController
public class ScheduleValveController {

    @Autowired
private ScheduleValveService service;    
    
    @GetMapping("all")
    public List<ScheduleValveDTO> getAll(){
        return service.getAll();
    }
    
    @PostMapping("save")
    public ScheduleValveDTO save(@RequestBody ScheduleValveDTO scheduleValveDTO){
        return service.save(scheduleValveDTO);
    }
    
    @DeleteMapping("delete")
    public void delete(@RequestParam int id){
         service.delete(id);
    }
    
    @GetMapping("valve")
    public List<ValveDTO> getAllValve(){
        return service.getAllValve();
    }
}
