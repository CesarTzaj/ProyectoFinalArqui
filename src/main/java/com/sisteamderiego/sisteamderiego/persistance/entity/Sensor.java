
package com.sisteamderiego.sisteamderiego.persistance.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;

@Entity
@Table(name = "sensor")
public class Sensor {
    
    @Column(name = "ID_SENSOR")
    @Id
    private Integer id_sensor;
    
    @Column(name = "NOMBRE")
    private String name;

    @OneToMany(mappedBy = "sensor")
    private List<RecordInput> recordInputs;
    
    public Integer getId_sensor() {
        return id_sensor;
    }

    public void setId_sensor(Integer id_sensor) {
        this.id_sensor = id_sensor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<RecordInput> getRecordInputs() {
        return recordInputs;
    }

    public void setRecordInputs(List<RecordInput> recordInputs) {
        this.recordInputs = recordInputs;
    }
   
}
