package com.codeclan.example.filesFolders.Repositories;

import com.codeclan.example.filesFolders.Models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
