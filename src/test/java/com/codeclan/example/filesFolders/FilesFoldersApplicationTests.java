package com.codeclan.example.filesFolders;

import com.codeclan.example.filesFolders.Models.File;
import com.codeclan.example.filesFolders.Models.Folder;
import com.codeclan.example.filesFolders.Repositories.FileRepository;
import com.codeclan.example.filesFolders.Repositories.FolderRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FilesFoldersApplicationTests {

	@Autowired
	FileRepository fileRepository;

	@Autowired
	FolderRepository folderRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createFileAndFolderAndAndSave(){
		Folder folder = new Folder("Animals");
		folderRepository.save(folder);
		File file = new File("dog", "jpg", "240kb", folder);
		fileRepository.save(file);
	}

}
