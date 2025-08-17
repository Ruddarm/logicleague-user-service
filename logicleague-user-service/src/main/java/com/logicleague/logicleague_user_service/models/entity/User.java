package com.logicleague.logicleague_user_service.models.entity;

import java.util.UUID;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table
public class User {
    
    @Id
    @GeneratedValue(strategy=GenerationType.UUID)
    private UUID userId;
    private String firstName;
    private String lastName;
    private String userName;
    private String email;
}
