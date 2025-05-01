package com.cosmos.service;

import com.cosmos.domain.Information;
import com.cosmos.domain.InformationRepository;
import com.cosmos.web.dto.InformationRequestDto;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class InformationService {

    private final InformationRepository informationRepository;

    // 'InformationRepository'은(는) abstract이며, 인스턴스화할 수 없습니다
    // InformationRepository informationRepository = new InformationRepository();

    @Transactional
    public void save(InformationRequestDto informationRequestDto) {
        informationRepository.save(informationRequestDto.toEntity());
    }

    public InformationRequestDto select(Long id) {
        Information information = informationRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 사용자가 없습니다. id=" + id));

        return new InformationRequestDto(
                information.getName(),
                information.getTeam(),
                information.getNationality()
        );
    }
}
