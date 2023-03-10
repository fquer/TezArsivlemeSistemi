package com.fquer.TezArsivlemeSistemi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
@Table(name="user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private String id;
    private String userName;
    private String userSurname;
    private String userMail;
    private String userPassword;
    @OneToMany(mappedBy = "user")
    private Set<File> files;
}
