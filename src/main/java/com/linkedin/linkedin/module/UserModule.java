package com.linkedin.linkedin.module;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class UserModule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String useremail;
    private String userpassword;

    // Default constructor
    public UserModule() {}

    // Constructor with parameters
    public UserModule(String useremail, String userpassword) {
        this.useremail = useremail;
        this.userpassword = userpassword;
    }

    // Getters and setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUseremail() {
        return useremail;
    }

    public void setUseremail(String useremail) {
        this.useremail = useremail;
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }
}