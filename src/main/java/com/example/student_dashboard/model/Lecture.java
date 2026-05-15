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
@ToString(exclude = "teacher")
public class Lecture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String dayOfWeek;
    private String startTime;
    private String endTime;

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonIgnoreProperties("lectures")
    private Teacher teacher;

    private String subject;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Lecture lecture = (Lecture) o;
        return getId() != null && Objects.equals(getId(), lecture.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
