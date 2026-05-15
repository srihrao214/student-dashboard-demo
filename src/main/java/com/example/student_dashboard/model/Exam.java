package com.example.student_dashboard.model;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;

import java.util.Objects;

@Getter
@Setter
@Entity
@ToString(exclude = "student")
public class Exam {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String subject;
    private String date;
    private String result;

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonIgnoreProperties("exams")
    private Student student;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Exam exam = (Exam) o;
        return getId() != null && Objects.equals(getId(), exam.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
