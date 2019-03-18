package com.mosiac.repo;

import com.mosiac.models.ProjectBean;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

public interface ProjectRepo extends CrudRepository<ProjectBean, Long> {
    List<ProjectBean> findAll();
    List<ProjectBean> findAllBySchoolNameOrDescription(String schoolName, String description);
    List<ProjectBean> findAllByPhaseActualStartDate(Date date);
    List<ProjectBean> findAllByPhasePlannedEndDate(Date date);
    List<ProjectBean> findAllByPhaseActualEndDate(Date date);
    List<ProjectBean> findAllByBudgetAmount(long amount);
    List<ProjectBean> findAllByFinalEstimateActualCostsThroughEndPhaseAmount(long amount);
    List<ProjectBean> findAllByTotalPhaseActualSpendingAmount(long amount);

}
