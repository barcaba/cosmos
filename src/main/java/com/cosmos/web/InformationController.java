package com.cosmos.web;

import com.cosmos.service.InformationService;
import com.cosmos.web.dto.InformationRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class InformationController {

    private final InformationService informationService;

    @PostMapping("/api/save")
    public void save(@RequestBody InformationRequestDto informationRequestDto) {
        informationService.save(informationRequestDto);
    }
}
