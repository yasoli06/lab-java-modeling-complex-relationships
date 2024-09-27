package com.nurseAssociation.nurseAssociation.model;


import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
public class Exhibition extends Event{


}
