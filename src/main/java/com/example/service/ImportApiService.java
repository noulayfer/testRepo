package com.example.service;

import com.example.dto.MessageResponseDto;
import com.example.entities.Company;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.lang.reflect.Field;
import java.util.Arrays;

@Service
public class ImportApiService {

    @SneakyThrows
    public MessageResponseDto parseAndSaveXml(MultipartFile file) {
        String linesOfXml = new String(file.getBytes());

        return null;
    }

    private Company parseXmlToCompany(String linesOfXml) {
        Field[] fields = Company.class.getFields();
        linesOfXml.split(fields)
    }

}
