package com.nurseAssociation.nurseAssociation.model;


import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class Conference extends Event{

    @OneToMany
    @JoinColumn(name = "conference_id")
    private List<Speaker> speakers;

}
