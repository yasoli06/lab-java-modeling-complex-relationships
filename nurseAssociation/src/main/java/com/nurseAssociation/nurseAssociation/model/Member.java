package com.nurseAssociation.nurseAssociation.model;

import jakarta.persistence.*;
import lombok.Data;


import java.io.Serializable;
import java.time.LocalDate;

@Data
@Entity
public class Member implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private Status status;

    @Column(name= "renewal_date")
    private LocalDate renewalDate;

    @ManyToOne
    @JoinColumn(name = "chapter_id")
    private Chapter chapter;


    public enum Status {
        ACTIVE,
        LAPSED
    }
}
