
package com.sisteamderiego.sisteamderiego.web.controller;

import com.sisteamderiego.sisteamderiego.domain.dto.*;
import com.sisteamderiego.sisteamderiego.domain.service.ScheduleValveService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RequestMapping("schedules")
@RestController
public class ScheduleValveController {

    @Autowired
private ScheduleValveService service;    
    
    @GetMapping("all")
    public ResponseEntity<List<ScheduleValveDTO>> getAll(){
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }
    
    @PostMapping("save")
    public ResponseEntity<ScheduleValveDTO> save(@RequestBody ScheduleValveDTO scheduleValveDTO){
        return new ResponseEntity<>(service.save(scheduleValveDTO), HttpStatus.CREATED);
    }
    
    @DeleteMapping("delete")
    public void delete(@RequestParam int id){
         service.delete(id);
    }
    
    @GetMapping("valve")
    public ResponseEntity<List<ValveDTO>> getAllValve(){
        return new ResponseEntity<>(service.getAllValve(), HttpStatus.OK);
    }
    
    @GetMapping("arduino")
    public ResponseEntity<List<ScheduleValveArduinoDTO>> getAllArduino(){
        return new ResponseEntity<>(service.getAllArduino(), HttpStatus.OK);
    }
}
