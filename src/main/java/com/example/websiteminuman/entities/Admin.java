package com.example.websiteminuman.entities;

import java.util.ArrayList;

<<<<<<< HEAD
public class Admin extends User {
=======
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Admin {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    
    @Column(unique=true)
>>>>>>> f01bbdd63c147e77f7ebba8ad6e153716af23da9
    private String username;
    private String password;
    protected ArrayList<Minuman> M;

<<<<<<< HEAD
    public Admin(String username, String password) {
        super(password);
=======
    public Admin() {
    }
    
    public Admin(Long id, String username, String password) {
        this.id = id;
>>>>>>> f01bbdd63c147e77f7ebba8ad6e153716af23da9
        this.username = username;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

<<<<<<< HEAD
    @Override
    public void login() {
        if (username == null || username.isEmpty()) {
            System.out.println("Nama admin tidak boleh kosong.");
            return;
        } else if (getPassword() == null || getPassword().isEmpty()) {
            System.out.println("Password tidak boleh kosong.");
            return;
        } else {
            System.out.println("Login berhasil.");
        }
        System.out.println("Admin " + username + " logged in.");
    }
=======
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // @Override
    // public void login() {
    //     if (username == null || username.isEmpty()) {
    //         System.out.println("Nama admin tidak boleh kosong.");
    //         return;
    //     } else if (getPassword() == null || getPassword().isEmpty()) {
    //         System.out.println("Password tidak boleh kosong.");
    //         return;
    //     } else {
    //         System.out.println("Login berhasil.");
    //     }
    //     System.out.println("Admin " + username + " logged in.");
    // }
>>>>>>> f01bbdd63c147e77f7ebba8ad6e153716af23da9

}
