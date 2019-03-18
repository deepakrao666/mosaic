package com.mosiac.service;

import com.mosiac.models.ProjectBean;
import com.mosiac.service.struct.ProjectService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProjectServiceImplTest {

    @Autowired
    ProjectService projectService;

    @Test
    public void findAllWithSchoolNameOrDescription() {
        List<ProjectBean> description = projectService.findAllWithSchoolNameOrDescription("I.S. 254 - BRONX");
        List<ProjectBean> schoolName = projectService.findAllWithSchoolNameOrDescription("FACADE/ROOFS");
        assertNotNull(description);
        assertNotNull(schoolName);
    }

    @Test()
    public void findAllWithSchoolNameOrDescriptionEmpty() {
        List<ProjectBean> description = projectService.findAllWithSchoolNameOrDescription("asd");
        List<ProjectBean> schoolName = projectService.findAllWithSchoolNameOrDescription("asd");
        assertTrue( description.isEmpty());
        assertTrue(schoolName.isEmpty());
    }

    @Test
    public void findAllWithPhaseActualStartDate() {
        List<ProjectBean> startDate = projectService.findAllWithPhaseActualStartDate("PNS");
        List<ProjectBean> startDate2 = projectService.findAllWithPhaseActualStartDate("05/15/2017");
        assertNotNull(startDate);
        assertNotNull(startDate2);
        List<ProjectBean> empty = projectService.findAllWithPhaseActualStartDate("12/12/1212");
        assertTrue( empty.isEmpty());
    }

    @Test
    public void findAllWithPhasePlannedEndDate() {
        List<ProjectBean> startDate = projectService.findAllWithPhasePlannedEndDate("01/15/2018");
        List<ProjectBean> startDate2 = projectService.findAllWithPhasePlannedEndDate("12/19/2016");
        assertNotNull(startDate);
        assertNotNull(startDate2);
        List<ProjectBean> empty = projectService.findAllWithPhasePlannedEndDate("12/12/1212");
        assertTrue( empty.isEmpty());
    }

    @Test
    public void findAllWithPhaseActualEndDate() {
        List<ProjectBean> startDate = projectService.findAllWithPhaseActualEndDate("09/14/2017");
        List<ProjectBean> startDate2 = projectService.findAllWithPhaseActualEndDate("02/13/2017");
        assertNotNull(startDate);
        assertNotNull(startDate2);
        List<ProjectBean> empty = projectService.findAllWithPhaseActualEndDate("12/12/1212");
        assertTrue( empty.isEmpty());
    }

    @Test
    public void findAllWithBudgetAmount() {
        List<ProjectBean> amount = projectService.findAllWithBudgetAmount("76250");
        List<ProjectBean> amount2 = projectService.findAllWithBudgetAmount("36881");
        assertNotNull(amount);
        assertNotNull(amount2);
        List<ProjectBean> empty = projectService.findAllWithBudgetAmount("12324");
        assertTrue( empty.isEmpty());
    }

    @Test
    public void findAllWithFinalEstimateActualCostsThroughEndPhaseAmount() {
        List<ProjectBean> amount = projectService.findAllWithFinalEstimateActualCostsThroughEndPhaseAmount(57074);
        List<ProjectBean> amount2 = projectService.findAllWithFinalEstimateActualCostsThroughEndPhaseAmount(75677);
        assertNotNull(amount);
        assertNotNull(amount2);
        List<ProjectBean> empty = projectService.findAllWithFinalEstimateActualCostsThroughEndPhaseAmount(13265);
        assertTrue( empty.isEmpty());
    }

    @Test
    public void findAllWithTotalPhaseActualSpendingAmount() {
        List<ProjectBean> amount = projectService.findAllWithTotalPhaseActualSpendingAmount(56288);
        List<ProjectBean> amount2 = projectService.findAllWithTotalPhaseActualSpendingAmount(75677);
        assertNotNull(amount);
        assertNotNull(amount2);
        List<ProjectBean> empty = projectService.findAllWithTotalPhaseActualSpendingAmount(13265);
        assertTrue( empty.isEmpty());
    }
}