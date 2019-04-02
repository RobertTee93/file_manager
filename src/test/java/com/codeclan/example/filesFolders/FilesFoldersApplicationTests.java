package com.codeclan.example.filesFolders;

import com.codeclan.example.filesFolders.Models.File;
import com.codeclan.example.filesFolders.Models.Folder;
import com.codeclan.example.filesFolders.Models.User;
import com.codeclan.example.filesFolders.Repositories.FileRepository;
import com.codeclan.example.filesFolders.Repositories.FolderRepository;
import com.codeclan.example.filesFolders.Repositories.UserRepository;
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

	@Autowired
	UserRepository userRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createFileAndFolderAndUserAndAndSave(){
		User user = new User("Robert");
		userRepository.save(user);
		Folder folder = new Folder("Animals", user);
		folderRepository.save(folder);
		File file = new File("dog", "jpg", "240kb", folder);
		fileRepository.save(file);
	}

}
