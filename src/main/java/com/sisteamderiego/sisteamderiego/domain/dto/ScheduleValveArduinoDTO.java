package com.sisteamderiego.sisteamderiego.domain.dto;

public class ScheduleValveArduinoDTO {

    private Integer id;
    private WateringScheduleTimeDTO time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public WateringScheduleTimeDTO getTime() {
        return time;
    }

    public void setTime(WateringScheduleTimeDTO time) {
        this.time = time;
    }
    
}
