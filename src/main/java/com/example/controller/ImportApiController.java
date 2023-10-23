package com.example.controller;

import com.example.dto.MessageResponseDto;
import com.example.service.ImportApiService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import static com.example.controller.ImportApiController.ROOT_URL;

@RestController
@RequestMapping(ROOT_URL)
@RequiredArgsConstructor
public class ImportApiController {
    protected static final String ROOT_URL = "api/import";
    private final ImportApiService service;

    @PostMapping
    public MessageResponseDto importApi(MultipartFile file) {
        return service.parseAndSaveXml(file);
    }

}
