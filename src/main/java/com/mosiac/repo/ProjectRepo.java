package com.mosiac.repo;

import com.mosiac.models.ProjectBean;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

public interface ProjectRepo extends CrudRepository<ProjectBean, Long> {
    List<ProjectBean> findAll();
    List<ProjectBean> findAllBySchoolNameOrDescription(String schoolName, String description);
    List<ProjectBean> findAllByPhaseActualStartDate(String date);
    List<ProjectBean> findAllByPhasePlannedEndDate(String date);
    List<ProjectBean> findAllByPhaseActualEndDate(String date);
    List<ProjectBean> findAllByBudgetAmount(String amount);
    List<ProjectBean> findAllByFinalEstimateActualCostsThroughEndPhaseAmount(long amount);
    List<ProjectBean> findAllByTotalPhaseActualSpendingAmount(long amount);

}
