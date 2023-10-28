
package com.sisteamderiego.sisteamderiego.persistance.repository;

import com.sisteamderiego.sisteamderiego.domain.dto.*;
import com.sisteamderiego.sisteamderiego.domain.repositoryDTO.ScheduleValveRepositoryDTO;
import com.sisteamderiego.sisteamderiego.persistance.crud.*;
import com.sisteamderiego.sisteamderiego.persistance.entity.*;
import com.sisteamderiego.sisteamderiego.persistance.mapper.*;
import jakarta.persistence.EntityNotFoundException;
import java.util.LinkedList;
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
    @Autowired
    private ScheduleValveArduinoMapper arduinoMapper;
    
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
        ScheduleValve scheduleValve = crud.findById(id)
                .orElseThrow(()-> new EntityNotFoundException("El objeto no existe"));
        crud.deleteById(id);
    }

    @Override
    public List<ValveDTO> getAllValve() {
        List<Valve> valves = (List<Valve>) valveCrud.findByOrderByValveIdDesc();
        return valveMapper.toValveDTOs(valves);
    }

    @Override
    public List<ScheduleValveArduinoDTO> getAllArduino() {
        List<ScheduleValve> scheduleValves = (List<ScheduleValve>) crud.findAll();
        return arduinoMapper.toScheduleValveDTOs(scheduleValves);
    }
    
}
