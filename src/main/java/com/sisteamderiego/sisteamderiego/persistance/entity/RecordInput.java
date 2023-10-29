package com.sisteamderiego.sisteamderiego.persistance.entity;

import jakarta.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;


@Entity
@Table(name = "registro")
public class RecordInput {
    
    @Id
    @Column(name = "id_registro")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "id_sesor")
    private Integer idSensor;
    @Column(name = "fecha_registro")
    private String date ;
    @Column(name = "id_valvula")
    private Integer idValve;
    @Column(name = "valvula_estado")
    private boolean status;
    @Column(name = "id_ubicacion")
    private Integer idLocation;
    private String humedad;

    @ManyToOne
    @JoinColumn(name = "id_ubicacion", insertable = false, updatable = false)
    Location location;

    @ManyToOne
    @JoinColumn(name = "id_sesor", insertable = false, updatable = false)
    Sensor sensor;

    @ManyToOne
    @JoinColumn(name = "id_valvula", insertable = false, updatable = false)
    Valve valve;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdSensor() {
        return idSensor;
    }

    public void setIdSensor(Integer idSensor) {
        this.idSensor = idSensor;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getIdValve() {
        return idValve;
    }

    public void setIdValve(Integer idValve) {
        this.idValve = idValve;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Integer getIdLocation() {
        return idLocation;
    }

    public void setIdLocation(Integer idLocation) {
        this.idLocation = idLocation;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Sensor getSensor() {
        return sensor;
    }

    public void setSensor(Sensor sensor) {
        this.sensor = sensor;
    }

    public Valve getValve() {
        return valve;
    }

    public void setValve(Valve valve) {
        this.valve = valve;
    }

    public String getHumedad() {
        return humedad;
    }

    public void setHumedad(String humedad) {
        this.humedad = humedad;
    }
    
}
