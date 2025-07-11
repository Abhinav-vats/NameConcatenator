package com.centime.concatenator.service.Impl;

import com.centime.concatenator.service.NameConcatenatorService;
import com.centime.concatenator.vo.DetailVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Service
@Slf4j
public class NameConcatenatorServiceImpl implements NameConcatenatorService {
    @Override
    public String getCompleteName(DetailVo detailVo) {
        log.info("Entered: getCompleteName|"+getClass().getName());
        log.info("Exited: getCompleteName|"+getClass().getName());
        return detailVo.getName().concat(" ").concat(detailVo.getSurname());
    }
}
