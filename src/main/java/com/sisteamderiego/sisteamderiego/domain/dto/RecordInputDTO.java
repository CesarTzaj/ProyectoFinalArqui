package com.sisteamderiego.sisteamderiego.domain.dto;

import java.sql.Date;

public class RecordInputDTO {

    private Integer id;
    private Integer idSensor;
    private String  date;
    private String humedad;
    private Integer idValve;
    private boolean status;
    private Integer idLocation;
    private LocationDTO location;
    private SensorDTO sensor;    
    private ValveDTO valve;

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

    public String getHumedad() {
        return humedad;
    }

    public void setHumedad(String humedad) {
        this.humedad = humedad;
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

    public LocationDTO getLocation() {
        return location;
    }

    public void setLocation(LocationDTO location) {
        this.location = location;
    }

    public SensorDTO getSensor() {
        return sensor;
    }

    public void setSensor(SensorDTO sensor) {
        this.sensor = sensor;
    }

    public ValveDTO getValve() {
        return valve;
    }

    public void setValve(ValveDTO valve) {
        this.valve = valve;
    }
    
    
}
