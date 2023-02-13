package com.RestAPI.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.ResponseEntity;

import java.util.List;

import javax.persistence.*;

@Data
@AllArgsConstructor
@Entity
@Table(name = "student")

public class Student {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "clg_name")
    private String clgName;
    @Column(name = "address")
    private String address;
	


}
