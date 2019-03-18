package com.mosiac.service.struct;

import com.mosiac.models.ProjectBean;

import java.util.Date;
import java.util.List;

public interface ProjectService {
    List<ProjectBean> findAll();

    List<ProjectBean> saveAll(List<ProjectBean> projectBeans);

    List<ProjectBean> findAllWithSchoolNameOrDescription(String value);

    List<ProjectBean> findAllWithPhaseActualStartDate(Date date);

    List<ProjectBean> findAllWithPhasePlannedEndDate(Date date);

    List<ProjectBean> findAllWithPhaseActualEndDate(Date date);

    List<ProjectBean> findAllWithBudgetAmount(long amount);

    List<ProjectBean> findAllWithFinalEstimateActualCostsThroughEndPhaseAmount(long amount);

    List<ProjectBean> findAllWithTotalPhaseActualSpendingAmount(long amount);
}
