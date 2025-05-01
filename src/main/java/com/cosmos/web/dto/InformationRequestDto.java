package com.cosmos.web.dto;

import com.cosmos.domain.Information;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
public class InformationRequestDto {

    private String name;
    private String nationality;
    private String team;

    @Builder
    public InformationRequestDto(String name, String nationality, String team) {
        this.name = name;
        this.nationality = nationality;
        this.team = team;
    }

    public Information toEntity() {
        return Information.builder()
                .name(name)
                .nationality(nationality)
                .team(team)
                .build();
    }
}
