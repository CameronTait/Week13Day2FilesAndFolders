package com.example.demo.models;

import org.springframework.web.bind.annotation.RestController;

import javax.persistence.*;

@Entity
@Table(name = "files")


public class File {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(extension = "extension")
    private String extension;

    @Column(size = "size")
    private String size;


    @ManyToOne
    @JoinColumn ( name = "folder_id", nullable = false)
    private Folder folder;

    public File(String name, String extension, String size, Folder folder) {
        this.name = name;
        this.extension = extension;
        this.size = size;
        this.folder = folder;
    }

    public File() {
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getFolder() {
        return folder;
    }

    public void setFolder(String folder) {
        this.folder = folder;
    }
}




}

