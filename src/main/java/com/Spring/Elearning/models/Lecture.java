package com.Spring.Elearning.models;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Entity
public class Lecture  extends BaseEntity{

    private String name;
    // Section-Lecture relationship
    // 1 Section belong to a lecture
    @ManyToOne
    @JoinColumn(name = "sectionId")
    private Section section;
    // Lecture to Resource relationship
    @OneToOne
    @JoinColumn(name = "resourceID")
    private Resource resource;
}
