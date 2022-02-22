package com.codeclan.example.filefolder.controllers;

import com.codeclan.example.filefolder.repositories.FolderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FolderController {

    @Autowired
    FolderRepository folderRepository;
}
