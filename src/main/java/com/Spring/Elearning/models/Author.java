package com.Spring.Elearning.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.*;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
// primary Entiry -> No Foreign Key
public class Author extends BaseEntity{


    private String name;
    private String Department;
    private Integer age;
    private Integer yearsOfExp;
    // Course-Author relationship
    @ManyToMany(mappedBy = "author")
    private List<Course> course;

}
