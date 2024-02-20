package com.Spring.Elearning.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Resource {

    @Id
    @GeneratedValue
    private Integer id;
    private String type;
    private Integer length;
    private String url;
    // Lecture-Resource relationship
    @OneToOne
    @JoinColumn(name = "lectureId")
    private Lecture lecture;

}
