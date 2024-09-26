package com.nurseAssociation.nurseAssociation.model;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Conference extends Event{

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "conference_id")
    private List<Speaker> speakers;

}
