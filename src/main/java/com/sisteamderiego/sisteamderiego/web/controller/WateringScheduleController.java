package com.sisteamderiego.sisteamderiego.web.controller;

import com.sisteamderiego.sisteamderiego.domain.dto.WateringScheduleDTO;
import com.sisteamderiego.sisteamderiego.domain.service.WateringScheduleService;
import java.time.LocalDateTime;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("schedule")
public class WateringScheduleController {

    @Autowired
    private WateringScheduleService schedule;

    @GetMapping("guatemala-time")
    public ResponseEntity<?> getCurrentTimeInGuatemala() {
        Map<String, String> time = new HashMap<>();
        ZoneId guatemalaZone = ZoneId.of("America/Guatemala");
        ZonedDateTime guatemalaTime = ZonedDateTime.now(guatemalaZone);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:00");
        String formattedTime = guatemalaTime.format(formatter);
        time.put("time", formattedTime);

        return ResponseEntity.ok(time);
    }

    @GetMapping("all")
    public List<WateringScheduleDTO> getAll() {
        return schedule.getAll();
    }

    @PostMapping("save")
    public WateringScheduleDTO save(@RequestBody WateringScheduleDTO wateringScheduleDTO) {
        return schedule.save(wateringScheduleDTO);
    }

    @DeleteMapping("delete")
    public void delete(@RequestParam int id) {
        schedule.delete(id);

    }
}
