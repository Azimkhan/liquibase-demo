package com.example.liquibasedemo.web;

import com.example.liquibasedemo.dto.ObjectAnalysisDto;
import com.example.liquibasedemo.repo.ObjectAnalysisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/object-analysis/")
public class ObjectAnalysisController {

    private final ObjectAnalysisRepository repository;

    @Autowired
    public ObjectAnalysisController(ObjectAnalysisRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    Page<ObjectAnalysisDto> index(Pageable pageable) {
        return repository.findAll(pageable).map(oa -> new ObjectAnalysisDto(
                oa.getId(),
                oa.getStatus(),
                oa.getSha2Sum(),
                oa.getSha1Sum(),
                oa.getMd5Sum(),
                oa.getCreateTime()
        ));
    }
}
