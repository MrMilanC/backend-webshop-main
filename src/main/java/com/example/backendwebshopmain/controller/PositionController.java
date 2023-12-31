package com.example.backendwebshopmain.controller;

import com.example.backendwebshopmain.model.Position;
import com.example.backendwebshopmain.service.PositionService;
import com.example.backendwebshopmain.dto.PositionDTO;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("/positions")
public class PositionController {

    private final PositionService positionService;

    // /////////////////////////////////////////////////////////////////////////
    // Init
    // /////////////////////////////////////////////////////////////////////////

    public PositionController(PositionService positionService) {
        this.positionService = positionService;
    }

    // /////////////////////////////////////////////////////////////////////////
    // Methods
    // /////////////////////////////////////////////////////////////////////////

    @PostMapping
    @ResponseStatus(code = CREATED)
    public Position createPosition(@RequestBody @Valid PositionDTO positionDTO) {
        return positionService.save(fromDTO(positionDTO), 0L, positionDTO.getProductId());
    }

    private static Position fromDTO(PositionDTO positionDTO) {
        return new Position(positionDTO.getId(),
                positionDTO.getQuantity());
    }
}
