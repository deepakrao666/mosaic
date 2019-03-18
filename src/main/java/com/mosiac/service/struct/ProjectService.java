package com.mosiac.service.struct;

import com.mosiac.models.ProjectBean;

import java.util.Date;
import java.util.List;

public interface ProjectService {
    List<ProjectBean> findAll();

    List<ProjectBean> saveAll(List<ProjectBean> projectBeans);

    List<ProjectBean> findAllWithSchoolNameOrDescription(String value);

    List<ProjectBean> findAllWithPhaseActualStartDate(String date);

    List<ProjectBean> findAllWithPhasePlannedEndDate(String date);

    List<ProjectBean> findAllWithPhaseActualEndDate(String date);

    List<ProjectBean> findAllWithBudgetAmount(String amount);

    List<ProjectBean> findAllWithFinalEstimateActualCostsThroughEndPhaseAmount(long amount);

    List<ProjectBean> findAllWithTotalPhaseActualSpendingAmount(long amount);
}
