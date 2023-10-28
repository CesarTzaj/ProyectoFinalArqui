
package com.sisteamderiego.sisteamderiego.web.controller;

import com.sisteamderiego.sisteamderiego.domain.dto.RecordInputDTO;
import com.sisteamderiego.sisteamderiego.domain.service.RecordService;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("record")
@RestController()
public class RecordInputController {
    
    @Autowired
    private RecordService record;
    

    @GetMapping("all")
    public ResponseEntity<Page<RecordInputDTO>> getAll(Pageable pageable){
        return new ResponseEntity<>(record.getAll(pageable), HttpStatus.OK) ;
    }
    
    @PostMapping("save")
    public ResponseEntity<RecordInputDTO> save(@RequestBody RecordInputDTO recordInputDTO){
     return new ResponseEntity<>(record.save(recordInputDTO), HttpStatus.CREATED);
    }  
    
    
}
