package com.mosiac.service;


import com.mosiac.models.ProjectBean;
import com.mosiac.repo.ProjectRepo;
import com.mosiac.service.struct.ProjectService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {
    private ProjectRepo projectRepo;

    private ProjectServiceImpl(ProjectRepo projectRepo) {
        this.projectRepo = projectRepo;
    }

    @Override
    public List<ProjectBean> findAll() {
        return projectRepo.findAll();
    }

    @Override
    public List<ProjectBean> saveAll(List<ProjectBean> projectBeans) {
        projectRepo.saveAll(projectBeans);
        return projectBeans;
    }

    @Override
    public List<ProjectBean> findAllWithSchoolNameOrDescription(String value) {
        return projectRepo.findAllBySchoolNameOrDescription(value, value);
    }

    @Override
    public List<ProjectBean> findAllWithPhaseActualStartDate(String date) {
        return projectRepo.findAllByPhaseActualStartDate(date);
    }

    @Override
    public List<ProjectBean> findAllWithPhasePlannedEndDate(String date) {
        return projectRepo.findAllByPhasePlannedEndDate(date);

    }

    @Override
    public List<ProjectBean> findAllWithPhaseActualEndDate(String date) {
        return projectRepo.findAllByPhaseActualEndDate(date);
    }

    @Override
    public List<ProjectBean> findAllWithBudgetAmount(String amount) {
        return projectRepo.findAllByBudgetAmount(amount);
    }

    @Override
    public List<ProjectBean> findAllWithFinalEstimateActualCostsThroughEndPhaseAmount(long amount) {
        return projectRepo.findAllByFinalEstimateActualCostsThroughEndPhaseAmount(amount);
    }

    @Override
    public List<ProjectBean> findAllWithTotalPhaseActualSpendingAmount(long amount) {
        return projectRepo.findAllByTotalPhaseActualSpendingAmount(amount);
    }
}
