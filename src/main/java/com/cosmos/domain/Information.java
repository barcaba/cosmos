package com.cosmos.domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor
public class Information {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 10, nullable = false)
    private String name;

    @Column(length = 10, nullable = false)
    private String nationality;

    @Column(length = 10, nullable = false)
    private String team;

    @Builder
    public Information(String name, String nationality, String team) {
        this.name = name;
        this.nationality = nationality;
        this.team = team;
    }
}
