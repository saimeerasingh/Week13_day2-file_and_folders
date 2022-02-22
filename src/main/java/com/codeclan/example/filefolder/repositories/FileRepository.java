package com.codeclan.example.filefolder.repositories;

import com.codeclan.example.filefolder.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
