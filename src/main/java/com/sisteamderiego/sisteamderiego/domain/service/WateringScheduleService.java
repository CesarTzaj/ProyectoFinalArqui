package com.sisteamderiego.sisteamderiego.domain.service;

import com.sisteamderiego.sisteamderiego.domain.dto.WateringScheduleDTO;
import com.sisteamderiego.sisteamderiego.domain.repositoryDTO.WateringScheduleRepositoryDTO;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WateringScheduleService {

    private WateringScheduleRepositoryDTO schedule;

    @Autowired
    public WateringScheduleService(WateringScheduleRepositoryDTO schedule) {
        this.schedule = schedule;
    }

    public List<WateringScheduleDTO> getAll() {
        return schedule.getAll();
    }

    public WateringScheduleDTO save(WateringScheduleDTO wateringScheduleDTO) {
        DateTimeFormatter formatters = DateTimeFormatter.ofPattern("HH:mm:00");
        String formattedTimes = wateringScheduleDTO.getTime(); 
        
        wateringScheduleDTO.setTime(formattedTimes);
        return schedule.save(wateringScheduleDTO);
    }

    public void delete(int id) {
        schedule.delete(id);
    }
}
