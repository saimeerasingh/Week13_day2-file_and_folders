package com.codeclan.example.filefolder.repositories;

import com.codeclan.example.filefolder.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;


public interface FolderRepository extends JpaRepository<Folder, Long> {


}
