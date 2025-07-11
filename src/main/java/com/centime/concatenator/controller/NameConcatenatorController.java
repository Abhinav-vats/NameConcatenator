package com.centime.concatenator.controller;


import com.centime.concatenator.service.NameConcatenatorService;
import com.centime.concatenator.vo.DetailVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/concatenator")
@Slf4j
public class NameConcatenatorController {

    private final NameConcatenatorService nameConcatenatorService;

    public NameConcatenatorController( NameConcatenatorService nameConcatenatorService) {

        this.nameConcatenatorService = nameConcatenatorService;
    }

    @GetMapping("/check")
    public String healthCheck(){
        log.info("Entered: healthCheck|"+getClass().getName());
        log.info("Exited: healthCheck|"+getClass().getName());
        return "UP";
    }

    @PostMapping
    public String concatenateName(@RequestBody DetailVo detailVo){

        log.info("Entered: concatenateName|"+getClass().getName());
        final String concatenatedString = nameConcatenatorService.getCompleteName(detailVo);
        log.info("Exited: concatenateName|"+getClass().getName());
        return concatenatedString;
    }
}
