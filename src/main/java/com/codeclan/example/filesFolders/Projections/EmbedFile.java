package com.codeclan.example.filesFolders.Projections;

import com.codeclan.example.filesFolders.Models.File;
import com.codeclan.example.filesFolders.Models.Folder;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedFile", types = File.class)
public interface EmbedFile {

    String getName();

    String getExtension();

    String getSize();

    Folder getFolder();



}
