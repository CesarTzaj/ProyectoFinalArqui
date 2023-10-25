
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
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping
@RestController("record")
public class RecordInputController {
    
    @Autowired
    private RecordService record;
    

    @GetMapping("all")
    public Page<RecordInputDTO> getAll(Pageable pageable){
        return record.getAll(pageable);
    }
    
    @PostMapping("save")
    public RecordInputDTO save(@RequestBody RecordInputDTO recordInputDTO){
     return record.save(recordInputDTO);
    }  
    
    
}
