package com.codeclan.example.filesFolders.Components;

import com.codeclan.example.filesFolders.Models.File;
import com.codeclan.example.filesFolders.Models.Folder;
import com.codeclan.example.filesFolders.Models.User;
import com.codeclan.example.filesFolders.Repositories.FileRepository;
import com.codeclan.example.filesFolders.Repositories.FolderRepository;
import com.codeclan.example.filesFolders.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader() {
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        User robert = new User("Robert");
        userRepository.save(robert);
        User claire = new User("Claire");
        userRepository.save(claire);

        Folder myAnimals = new Folder("Roberts Animals", robert);
        folderRepository.save(myAnimals);
        Folder clairesAnimals = new Folder("Claires Animals", claire);
        folderRepository.save(clairesAnimals);

        File dog = new File("Dog", "jpg", "240kb", myAnimals);
        fileRepository.save(dog);
        File cat = new File("Cat", "jpg", "300kb", clairesAnimals);
        fileRepository.save(cat);

    }
}
