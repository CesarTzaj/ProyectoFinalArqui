
package com.sisteamderiego.sisteamderiego.persistance.repository;

import com.sisteamderiego.sisteamderiego.domain.dto.WateringScheduleDTO;
import com.sisteamderiego.sisteamderiego.domain.repositoryDTO.WateringScheduleRepositoryDTO;
import com.sisteamderiego.sisteamderiego.persistance.crud.WateringScheduleCrud;
import com.sisteamderiego.sisteamderiego.persistance.entity.WateringSchedule;
import com.sisteamderiego.sisteamderiego.persistance.mapper.WateringScheduleMapper;
import java.util.LinkedList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class WateringScheduleRepository implements WateringScheduleRepositoryDTO{
    
    private final WateringScheduleCrud crud;
    private final WateringScheduleMapper mapper;

    @Autowired
    public WateringScheduleRepository(WateringScheduleCrud crud, WateringScheduleMapper mapper) {
        this.crud = crud;
        this.mapper = mapper;
    }
    
    
    @Override
    public List<WateringScheduleDTO> getAll() {
        List<WateringSchedule> scheduless = (List<WateringSchedule>) crud.findAll();
        return mapper.toWateringScheduleDTOs(scheduless);
    }

    @Override
    public WateringScheduleDTO save(WateringScheduleDTO wateringScheduleDTO) {
        WateringSchedule wateringSchedule = mapper.toWateringSchedule(wateringScheduleDTO);
        return mapper.toWateringScheduleDTO(crud.save(wateringSchedule));
    }

    @Override
    public void delete(int id) {
        crud.deleteById(id);
    }
    
}
