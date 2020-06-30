package com.example.demo.components;

import com.example.demo.models.File;
import com.example.demo.models.Folder;
import com.example.demo.models.User;
import com.example.demo.repositories.FileRepository;
import com.example.demo.repositories.FolderRepository;
import com.example.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {
    
    @Autowired
    FolderRepository folderRepository;
    
    @Autowired
    FileRepository fileRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args){
        User bob = new User("Bob");
        userRepository.save(bob);

        User tony = new User("Tony");
        userRepository.save(tony);
        
        User michael = new User("Michael");
        userRepository.save(michael);

        User jill = new User("Jill");
        userRepository.save(jill);
        
        Folder homework = new Folder("Homework", bob);
        folderRepository.save(homework);

        Folder chores = new Folder("Chores", michael);
        folderRepository.save(chores);

        File maths = new File("Maths", "txt", "kb", homework);
        fileRepository.save(maths);

        File laundry = new File("Laundry", "jpg", "mb", chores);
        fileRepository.save(laundry);
    }
}
