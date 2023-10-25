
package com.sisteamderiego.sisteamderiego.persistance.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;

@Entity
@Table(name = "valvula")
public class Valve {
    @Column(name = "ID_VALVULA")
    @Id
    private Integer valveId;
    @Column(name = "NOMBRE")
    private String name;
    @OneToMany(mappedBy = "valve")
    private List<RecordInput> recordInputs;
    
    @OneToMany(mappedBy = "valve")
    private List<ScheduleValve> scheduleValve;

    public Integer getValveId() {
        return valveId;
    }

    public void setValveId(Integer valveId) {
        this.valveId = valveId;
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

    public List<ScheduleValve> getScheduleValve() {
        return scheduleValve;
    }

    public void setScheduleValve(List<ScheduleValve> scheduleValve) {
        this.scheduleValve = scheduleValve;
    }
    
}
