package com.codeclan.example.filefolder.components;

import com.codeclan.example.filefolder.models.File;
import com.codeclan.example.filefolder.models.Folder;
import com.codeclan.example.filefolder.models.User;
import com.codeclan.example.filefolder.repositories.FileRepository;
import com.codeclan.example.filefolder.repositories.FolderRepository;
import com.codeclan.example.filefolder.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    public DataLoader(){}

    @Override
    public void run(ApplicationArguments args)  {
        User pia = new User("Pia");
        userRepository.save(pia);

        User ria = new User("Ria");
        userRepository.save(ria);

        User sia = new User("Pia");
        userRepository.save(pia);

        User jia = new User("Jia");
        userRepository.save(jia);

        Folder study = new Folder("Study Material",sia);
        folderRepository.save(study);

        Folder resources = new Folder("Resources",jia);
        folderRepository.save(resources);

        Folder reference = new Folder("reference material",pia);
        folderRepository.save(reference);

        File week1 = new File("Week1",".pdf","100MB",reference);
        fileRepository.save(week1);

        File week2 = new File("Week2",".png","120MB",resources);
        fileRepository.save(week2);

        File week3 = new File("Week3",".pdf","500GB",study);
        fileRepository.save(week3);

        File week4 = new File("Week4",".pdf","480GB",reference);
        fileRepository.save(week4);

        
    }
}
