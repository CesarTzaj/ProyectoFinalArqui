
package com.sisteamderiego.sisteamderiego.persistance.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "ubicacion")
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ubicacion")
    private Integer id;
    @Column(name = "lugar")
    private String location;
    
    @OneToMany(mappedBy = "location")
    private List<RecordInput> recordInputs;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<RecordInput> getRecordInputs() {
        return recordInputs;
    }

    public void setRecordInputs(List<RecordInput> recordInputs) {
        this.recordInputs = recordInputs;
    }
    
    
}
