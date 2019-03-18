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
    private String phaseActualStartDate;
    private String phasePlannedEndDate;
    private String phaseActualEndDate;
    private String budgetAmount;
    private long finalEstimateActualCostsThroughEndPhaseAmount;
    private long totalPhaseActualSpendingAmount;
    private String dsfNumber;

    public ProjectBean() {
    }

    public ProjectBean(int geographicDistrict,
                       String buildingIdentifier,
                       String schoolName,
                       String type,
                       String description,
                       String phaseName,
                       String statusName,
                       String phaseActualStartDate,
                       String phasePlannedEndDate,
                       String phaseActualEndDate,
                       String budgetAmount,
                       long finalEstimateActualCostsThroughEndPhaseAmount,
                       long totalPhaseActualSpendingAmount,
                       String dsfNumber) {
        this.geographicDistrict = geographicDistrict;
        this.buildingIdentifier = buildingIdentifier;
        this.schoolName = schoolName;
        this.type = type;
        this.description = description;
        this.phaseName = phaseName;
        this.statusName = statusName;
        this.phaseActualStartDate = phaseActualStartDate;
        this.phasePlannedEndDate = phasePlannedEndDate;
        this.phaseActualEndDate = phaseActualEndDate;
        this.budgetAmount = budgetAmount;
        this.finalEstimateActualCostsThroughEndPhaseAmount = finalEstimateActualCostsThroughEndPhaseAmount;
        this.totalPhaseActualSpendingAmount = totalPhaseActualSpendingAmount;
        this.dsfNumber = dsfNumber;
    }
}
