package com.codeclan.example.filesFolders.Repositories;

import com.codeclan.example.filesFolders.Models.File;
import com.codeclan.example.filesFolders.Projections.EmbedFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(excerptProjection = EmbedFile.class)
public interface FileRepository extends JpaRepository<File, Long> {
}
