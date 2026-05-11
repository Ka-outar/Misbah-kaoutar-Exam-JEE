package com.misbah.kaoutar.misbahkaoutarexamjee.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;
    private String email;

    @ElementCollection(fetch = FetchType.EAGER)
    private List<String> roles;
}
