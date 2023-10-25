package com.sisteamderiego.sisteamderiego.domain.dto;

import java.sql.Time;
import java.time.LocalDateTime;

public class WateringScheduleDTO {

    private Integer id;
    private String time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {

        this.time = time;
    }

}
