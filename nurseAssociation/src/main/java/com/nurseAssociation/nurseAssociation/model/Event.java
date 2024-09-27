package com.nurseAssociation.nurseAssociation.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@MappedSuperclass
public class Event implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate date;
    private int duration;
    private String location;
    private String title;

    @OneToMany
    @JoinColumn(name = "event_id")
    private List<Guest> guests;

}


