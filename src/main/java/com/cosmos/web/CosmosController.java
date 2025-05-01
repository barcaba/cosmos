package com.cosmos.web;

import com.cosmos.service.InformationService;
import com.cosmos.web.dto.InformationRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@Controller
public class CosmosController {

    private final InformationService informationService;

    @GetMapping("/")
    public String display ()
    {
        return "cosmos";
    }

    @GetMapping("/son/{id}")
    public String son (@PathVariable(value="id") Long id, Model model)
    {
        InformationRequestDto informationRequestDto = informationService.select(id);
        model.addAttribute("info", informationRequestDto); // 타임리프에서 사용 가능하게 전달

        return "son";
    }

    @GetMapping("/son/update")
    public String son_update (Long id)
    {
        return "/son_update.html";
    }
}
