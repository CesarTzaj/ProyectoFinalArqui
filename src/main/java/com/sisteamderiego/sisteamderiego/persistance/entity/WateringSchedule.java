
package com.sisteamderiego.sisteamderiego.persistance.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "horario_riego")
public class WateringSchedule {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "id_horario")
    private String time;
    
    @OneToMany(mappedBy = "wateringSchedule")
    private List<ScheduleValve> scheduleValve;

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

    public List<ScheduleValve> getScheduleValve() {
        return scheduleValve;
    }

    public void setScheduleValve(List<ScheduleValve> scheduleValve) {
        this.scheduleValve = scheduleValve;
    }

    
}
