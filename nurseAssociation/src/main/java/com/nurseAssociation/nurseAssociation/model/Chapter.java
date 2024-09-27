package com.nurseAssociation.nurseAssociation.model;


import jakarta.persistence.*;
import jdk.jfr.DataAmount;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Data
@Entity
public class Chapter{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String district;

    @OneToOne
    @JoinColumn(name = "president_id")
    private Member president;

    @OneToMany(mappedBy = "chapter", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Member> members;

}
