package org.maren.phd.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Table(name = "Student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long StudentId;
    private long PHD_ID;
    private String Name;
    private long RegistrationNo;
    private long Mobile;
    private String EmailId;
    private String ProposedThesis;
    private String Department;
    private String SupervisorName;
    private String SupInstAff;
    private String Specialization;
    private String CoSupName;
    private String CoSupInstAff;
    private String InstDeptName;
    private String Result;
    private String StatusOfPreRegistrationPayment;
    private String RMCourseworkAttendanceStatus;
    private String RMCourseworkExam;
    private String AnnualProgressReview_One;
    private String AnnualProgressReview_Two;
    private String AnnualProgressReview_Three;
    private String AnnualProgressReview_Four;
    private String AnnualProgressReview_Five;
    private String AnnualFeePayment_OneStatus;
    private String AnnualFeePayment_TwoStatus;

}
