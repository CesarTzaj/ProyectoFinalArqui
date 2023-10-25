
package com.sisteamderiego.sisteamderiego.persistance.repository;

import com.sisteamderiego.sisteamderiego.domain.dto.ScheduleValveDTO;
import com.sisteamderiego.sisteamderiego.domain.dto.ValveDTO;
import com.sisteamderiego.sisteamderiego.domain.repositoryDTO.ScheduleValveRepositoryDTO;
import com.sisteamderiego.sisteamderiego.persistance.crud.ScheduleValveCrud;
import com.sisteamderiego.sisteamderiego.persistance.crud.ValveCrud;
import com.sisteamderiego.sisteamderiego.persistance.entity.ScheduleValve;
import com.sisteamderiego.sisteamderiego.persistance.entity.Valve;
import com.sisteamderiego.sisteamderiego.persistance.mapper.ScheduleValveMapper;
import com.sisteamderiego.sisteamderiego.persistance.mapper.ValveMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ScheduleValveRepository implements ScheduleValveRepositoryDTO{

    @Autowired
    private ScheduleValveCrud crud;
    @Autowired
    private ScheduleValveMapper mapper;
    @Autowired
    private ValveCrud valveCrud;
    @Autowired
    private ValveMapper valveMapper;
    @Override
    public List<ScheduleValveDTO> getAll() {
        List<ScheduleValve> scheduleValves = (List<ScheduleValve>) crud.findAll();
        return mapper.toScheduleValveDTOs(scheduleValves);
    }

    @Override
    public ScheduleValveDTO save(ScheduleValveDTO scheduleValveDTO) {
        ScheduleValve scheduleValve = mapper.toShScheduleValve(scheduleValveDTO);
        return mapper.toScheduleValveDTO(crud.save(scheduleValve));
    }

    @Override
    public void delete(int id) {
        crud.deleteById(id);
    }

    @Override
    public List<ValveDTO> getAllValve() {
        List<Valve> valves = (List<Valve>) valveCrud.findByOrderByValveIdDesc();
        return valveMapper.toValveDTOs(valves);
    }
    
}
