package com.Spring.Elearning.models;

import jakarta.persistence.*;
import jdk.jfr.BooleanFlag;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.annotation.processing.SupportedOptions;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Entity
public class Section extends BaseEntity {

    private String name;

    // Section-Course relationship
    //Section belongs to a course
    //This is Secondary Entity
    @ManyToOne
    @JoinColumn(name = "courseId")
    private Course course;
    // Section-Lecture Relationship
    // List of lectures Belongs to a section
    @OneToMany(mappedBy = "section")
    private List<Lecture> lecture;


}
