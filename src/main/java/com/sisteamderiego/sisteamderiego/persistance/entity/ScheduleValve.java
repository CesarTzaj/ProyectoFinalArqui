package com.sisteamderiego.sisteamderiego.persistance.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "horario_valvula")
public class ScheduleValve {

    @Id
    private Integer id; 
    @Column(name = "id_valvula")
    private Integer idValve;
    @Column(name = "id_horario")
    private Integer idSchedule;

    @ManyToOne
    @JoinColumn(name = "id_horario", insertable = false, updatable = false)
    private WateringSchedule wateringSchedule;
    
    @ManyToOne
    @JoinColumn(name = "id_valvula", insertable = false, updatable = false)
    private Valve valve;

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

    public WateringSchedule getWateringSchedule() {
        return wateringSchedule;
    }

    public void setWateringSchedule(WateringSchedule wateringSchedule) {
        this.wateringSchedule = wateringSchedule;
    }

    public Valve getValve() {
        return valve;
    }

    public void setValve(Valve valve) {
        this.valve = valve;
    }
    

}
