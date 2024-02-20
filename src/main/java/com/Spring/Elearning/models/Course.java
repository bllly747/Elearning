package com.Spring.Elearning.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Entity

// Secondary Entity -> Foreign Key
public class Course  extends BaseEntity{

    private String name;
    private String description;
    private Integer hours;
    // Author-Course relationship
    @ManyToMany
    @JoinTable(
            name = "authorsCourses",
            joinColumns = {
                    @JoinColumn(
                            name = "courseID"
                    )
            },
            inverseJoinColumns = {
                    @JoinColumn(
                            name = "authorID"
                    )
            }
    )
    private List<Author> author;

    // Course-Section relationship
    // List of sections belongs to a course
    //This is a primary Entity
    @OneToMany(mappedBy = "course")
    private List<Section> section;


}
