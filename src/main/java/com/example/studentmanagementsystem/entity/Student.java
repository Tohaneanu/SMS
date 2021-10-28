package com.example.studentmanagementsystem.entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Service;
import javax.persistence.*;

@ToString
@Getter
@Setter
@Service
@NoArgsConstructor
@Entity
@Table(name="students")
public class Student {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @Column(name = "first_name", nullable = false)
    private String firstName;
    @Column(name = "second_name", nullable = false)
    private String secondName;
    @Column(name = "email", nullable = false)
    private String email;

    public Student(String firstName, String secondName, String email) {
        super();
        this.firstName = firstName;
        this.secondName = secondName;
        this.email = email;
    }
}
