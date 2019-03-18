package com.mosiac.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity(name = "PROJECT")
public class ProjectBean {


    @Id
    @Column(name = "PROJECT_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private int geographicDistrict;
    private String buildingIdentifier;
    private String schoolName;
    private String type;
    private String description;
    private String phaseName;
    private String statusName;
    private Date phaseActualStartDate;
    private Date phasePlannedEndDate;
    private Date phaseActualEndDate;
    private long budgetAmount;
    private long finalEstimateActualCostsThroughEndPhaseAmount;
    private long totalPhaseActualSpendingAmount;
    private String dsfNumber;

}
