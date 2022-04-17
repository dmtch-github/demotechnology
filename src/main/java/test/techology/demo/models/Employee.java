package test.techology.demo.models;

import lombok.Data;

import javax.persistence.*;

@Data

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "fullname", nullable = false)
    private String fullname;
}
