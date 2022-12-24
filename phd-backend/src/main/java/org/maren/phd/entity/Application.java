package org.maren.phd.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Table(name="Application")
public class Application {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ApplicationId;
    private String Name;
    private long Mobile;
    private String EmailId;
    // Qualification
    private String MatriculationBoard;
    private String MatriculationYOP;
    private String MatriculationScore;
    private String IntermediateBoard;
    private String IntermediateYOP;
    private String IntermediateScore;
    private String UG_University;
    private String UG_YearOfCompletion;
    private String UG_FinalScore;
    private String PG_University;
    private String PG_YearOfCompletion;
    private String PG_FinalScore;
    // Address
    private String Address;
}
