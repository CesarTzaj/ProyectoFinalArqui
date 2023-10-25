package com.sisteamderiego.sisteamderiego.domain.dto;

public class ScheduleValveDTO {

    private Integer id;
    private Integer idValve;
    private Integer idSchedule;
    private WateringScheduleDTO wateringSchedule;
    private ValveDTO valve;
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdValve() {
        return idValve;
    }

    public void setIdValve(Integer idValve) {
        this.idValve = idValve;
    }

    public Integer getIdSchedule() {
        return idSchedule;
    }

    public void setIdSchedule(Integer idSchedule) {
        this.idSchedule = idSchedule;
    }

    public WateringScheduleDTO getWateringSchedule() {
        return wateringSchedule;
    }

    public void setWateringSchedule(WateringScheduleDTO wateringSchedule) {
        this.wateringSchedule = wateringSchedule;
    }

    public ValveDTO getValve() {
        return valve;
    }

    public void setValve(ValveDTO valve) {
        this.valve = valve;
    }
    
}
