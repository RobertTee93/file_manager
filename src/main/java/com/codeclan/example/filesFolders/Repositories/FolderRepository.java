package com.codeclan.example.filesFolders.Repositories;

import com.codeclan.example.filesFolders.Models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
