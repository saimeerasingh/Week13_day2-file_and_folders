package com.codeclan.example.filefolder.controllers;

import com.codeclan.example.filefolder.repositories.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FileController {

    @Autowired
    FileRepository fileRepository;
}
