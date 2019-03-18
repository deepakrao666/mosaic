package com.mosiac.utils;

import com.mosiac.models.ProjectBean;
import com.mosiac.repo.ProjectRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Configuration
@Slf4j
class Init {
    private static List<ProjectBean> projects;
    @Bean
    CommandLineRunner initDatabase(ProjectRepo projectRepo) {
        projects = Arrays.asList(
                new ProjectBean(10,"X254","I.S. 254 - BRONX","SCA CIP","FACADE/ROOFS","Construction","In-Progress","07/07/2016","03/28/2018","","4050000",4229193,3791127,"DSF: 0000821031, 0000822210"),
                new ProjectBean(10,"X254","I.S. 254 - BRONX","SCA CIP","FACADE/ROOFS","CM, F&E","In-Progress","07/07/2016","03/28/2018","","252000",489326,485620,"DSF: 0000821031, 0000822210"),
                new ProjectBean(10,"X254","I.S. 254 - BRONX","SCA CIP RESOA","FY16 RESO A IP SURVEILLANCE CAMERA INSTALLATION","Scope","Complete","07/27/2017","11/27/2017","08/03/2017","0",1792,1792,"DSF: 0000823560"),
                new ProjectBean(10,"X254","I.S. 254 - BRONX","SCA CIP RESOA","FY16 RESO A IP SURVEILLANCE CAMERA INSTALLATION","Design","In-Progress","08/04/2017","02/05/2018","","19110",17318,7169,"DSF: 0000823560"),
                new ProjectBean(10,"X254","I.S. 254 - BRONX","SCA CIP RESOA","FY16 RESO A IP SURVEILLANCE CAMERA INSTALLATION","Construction","PNS","PNS","PNS","PNS","280280",280280,951,"DSF: 0000823560"),
                new ProjectBean(10,"X254","I.S. 254 - BRONX","SCA CIP RESOA","FY16 RESO A IP SURVEILLANCE CAMERA INSTALLATION","CM, F&E","PNS","PNS","PNS","PNS","69238",52551,2423,"DSF: 0000823560"),
                new ProjectBean(10,"X254","I.S. 254 - BRONX","DIIT - RESOA","FY17 RESO A TECHNOLOGY","Purch & Install","Complete","05/15/2017","01/15/2018","09/14/2017","50000",49625,49625,"DSF: 0000844624"),
                new ProjectBean(10,"X254","I.S. 254 - BRONX","DIIT - RESOA","FY17 RESO A TECHNOLOGY","Purch & Install","Complete","05/15/2017","01/15/2018","09/14/2017","76250",75677,75677,"DSF: 0000845571"),
                new ProjectBean(10,"X279","P.S. 279 - BRONX","SCA CIP","WATER PENETRATION/ROOFS","Scope","Complete","08/02/2016","12/19/2016","02/13/2017","36881",57074,56288,"DSF: 0000820035, 0000866151"),
                new ProjectBean(10,"X279","P.S. 279 - BRONX","SCA CIP","WATER PENETRATION/ROOFS","Design","Complete","05/15/2017","10/16/2017","12/18/2017","141246",183396,180358,"DSF: 0000820035, 0000866151"),
                new ProjectBean(10,"X279","P.S. 279 - BRONX","SCA CIP","WATER PENETRATION/ROOFS","Construction","PNS","PNS","PNS","PNS","2085039",2085039,1718,"DSF: 0000820035, 0000866151"),
                new ProjectBean(10,"X279","P.S. 279 - BRONX","SCA CIP","WATER PENETRATION/ROOFS","CM, F&E","PNS","PNS","PNS","PNS","253705",253705,7119,"DSF: 0000820035, 0000866151"),
                new ProjectBean(10,"X279","P.S. 279 - BRONX","DOE- RESOA","FY15 RESO A ROOM CONVERSIONS / PART","Construction","PNS","PNS","PNS","PNS","435000",435000,0,"DSF: 0000800475"),
                new ProjectBean(10,"X283","I.S. 228 - BRONX","SCA Furniture & Equi","FY17 RESO A MOBILE SCIENCE LAB","F&E","Complete","03/13/2017","F&E","11/13/2017","62000",62000,61974,"DSF: 0000845399"),
                new ProjectBean(10,"X306","I.S. 331 - BRONX","Trust For Public Lan","FY18 RESO A PLAYGROUNDS","Scope","PNS","PNS","PNS","PNS","50000",50000,0,"DSF: 0000866453"),
                new ProjectBean(10,"X306","I.S. 331 - BRONX","Trust For Public Lan","FY18 RESO A PLAYGROUNDS","Design","PNS","PNS","PNS","PNS","150000",150000,0,"DSF: 0000866453"),
                new ProjectBean(10,"X306","I.S. 331 - BRONX","Trust For Public Lan","FY18 RESO A PLAYGROUNDS","Construction","PNS","PNS","PNS","PNS","500000",500000,0,"DSF: 0000866453"),
                new ProjectBean(10,"X306","I.S. 331 - BRONX","Trust For Public Lan","FY18 RESO A PLAYGROUNDS","F&E","PNS","PNS","PNS","PNS","135000",135000,0,"DSF: 0000866453"),
                new ProjectBean(10,"X340","P.S. 340 - BRONX","DIIT - RESOA","FY17 RESO A TECHNOLOGY","Purch & Install","Complete","05/01/2017","01/15/2018","07/27/2017","50000",49621,49621,"DSF: 0000845054"),
                new ProjectBean(10,"X347","P.S. 33 ANNEX - BRONX","SCA Capacity","NEW SCHOOL","Scope","In-Progress","08/07/2017","02/26/2018","","1294751",1294751,161755,"DSF: 0000798177"),
                new ProjectBean(10,"X347","P.S. 33 ANNEX - BRONX","SCA Capacity","NEW SCHOOL","Design","PNS","PNS","PNS","PNS","4143204",4143204,47882,"DSF: 0000798177"),
                new ProjectBean(10,"X347","P.S. 33 ANNEX - BRONX","SCA Capacity","NEW SCHOOL","Construction","PNS","PNS","PNS","PNS","58108434",58108434,9977,"DSF: 0000798177"),
                new ProjectBean(10,"X347","P.S. 33 ANNEX - BRONX","SCA Capacity","NEW SCHOOL","CM,Art,F&E","PNS","PNS","PNS","PNS","8182828",8182828,30676,"DSF: 0000798177"),
                new ProjectBean(10,"X360","P.S. 360 - BRONX","SCA CIP RESOA","FY18 RESO A PLAYGROUNDS","Scope","PNS","PNS","PNS","PNS","0",0,0,"DSF: 0000866428"),
                new ProjectBean(10,"X360","P.S. 360 - BRONX","SCA CIP RESOA","FY18 RESO A PLAYGROUNDS","Design","PNS","PNS","PNS","PNS","7500",7500,0,"DSF: 0000866428"),
                new ProjectBean(10,"X360","P.S. 360 - BRONX","SCA CIP RESOA","FY18 RESO A PLAYGROUNDS","Construction","PNS","PNS","PNS","PNS","110000",110000,0,"DSF: 0000866428"),
                new ProjectBean(10,"X360","P.S. 360 - BRONX","SCA CIP RESOA","FY18 RESO A PLAYGROUNDS","CM, F&E","PNS","PNS","PNS","PNS","7500",7500,0,"DSF: 0000866428"),
                new ProjectBean(10,"X368","M.S./H.S. 368 - BRONX","SCA CIP","PAVED AREAS CONCRETE","Scope","Complete","05/13/2014","09/26/2014","09/10/2014","8017",23855,23855,"DSF: 0000799913"),
                new ProjectBean(10,"X368","M.S./H.S. 368 - BRONX","SCA CIP","PAVED AREAS CONCRETE","Design","Complete","10/15/2014","03/20/2015","04/28/2015","29395",80349,64886,"DSF: 0000799913"),
                new ProjectBean(10,"X368","M.S./H.S. 368 - BRONX","SCA CIP","PAVED AREAS CONCRETE","Construction","In-Progress","06/02/2017","02/26/2018","","311317",272329,104,"DSF: 0000799913"),
                new ProjectBean(10,"X368","M.S./H.S. 368 - BRONX","SCA CIP","PAVED AREAS CONCRETE","CM, F&E","In-Progress","06/02/2017","02/26/2018","","72151",36406,20060,"DSF: 0000799913"),
                new ProjectBean(10,"X368","M.S./H.S. 368 - BRONX","SCA CIP RESOA","FY18 RESO A GYMNASIUM UPGRADE","Scope","PNS","PNS","PNS","PNS","0",0,0,"DSF: 0000867305"),
                new ProjectBean(10,"X368","M.S./H.S. 368 - BRONX","SCA CIP RESOA","FY18 RESO A GYMNASIUM UPGRADE","Design","PNS","PNS","PNS","PNS","26880",26880,0,"DSF: 0000867305"),
                new ProjectBean(10,"X368","M.S./H.S. 368 - BRONX","SCA CIP RESOA","FY18 RESO A GYMNASIUM UPGRADE","Construction","PNS","PNS","PNS","PNS","394240",394240,0,"DSF: 0000867305"),
                new ProjectBean(10,"X368","M.S./H.S. 368 - BRONX","SCA CIP RESOA","FY18 RESO A GYMNASIUM UPGRADE","CM, F&E","PNS","PNS","PNS","PNS","26880",26880,0,"DSF: 0000867305"),
                new ProjectBean(10,"X368","M.S./H.S. 368 - BRONX","SCA CIP RESOA","FY18 RESO A GYMNASIUM UPGRADE","Scope","PNS","PNS","PNS","PNS","PNB",0,0,"DSF: 0000867312"),
                new ProjectBean(10,"X368","M.S./H.S. 368 - BRONX","SCA CIP RESOA","FY18 RESO A GYMNASIUM UPGRADE","Design","PNS","PNS","PNS","PNS","PNB",0,0,"DSF: 0000867312"),
                new ProjectBean(10,"X368","M.S./H.S. 368 - BRONX","SCA CIP RESOA","FY18 RESO A GYMNASIUM UPGRADE","Construction","PNS","PNS","PNS","PNS","PNB",0,0,"DSF: 0000867312"),
                new ProjectBean(10,"X368","M.S./H.S. 368 - BRONX","SCA CIP RESOA","FY18 RESO A GYMNASIUM UPGRADE","CM, F&E","PNS","PNS","PNS","PNS","PNB",0,0,"DSF: 0000867312"),
                new ProjectBean(10,"X368","IN-TECH ACADEMY (M.S. / HIGH S","DIIT - RESOA","FY17 RESO A TECHNOLOGY","Purch & Install","In-Progress","11/17/2017","01/31/2018","","50000",49620,49620,"DSF: 0000845056"),
                new ProjectBean(10,"X430","M.S./H.S. 342 - BRONX","SCA CIP","BOILER FOR SWIMMING","Scope","Complete","04/30/2013","09/13/2013","06/21/2013","43040",41498,41498,"DSF: 0000775984"),
                new ProjectBean(10,"X430","M.S./H.S. 342 - BRONX","SCA CIP","BOILER FOR SWIMMING","Design","Complete","07/17/2013","12/18/2013","02/03/2014","150640",204664,204664,"DSF: 0000775984"),
                new ProjectBean(10,"X430","M.S./H.S. 342 - BRONX","SCA CIP","BOILER FOR SWIMMING","Construction","In-Progress","04/10/2014","10/01/2015","","2442520",2294926,1527373,"DSF: 0000775984"),
                new ProjectBean(10,"X430","M.S./H.S. 342 - BRONX","SCA CIP","BOILER FOR SWIMMING","CM, F&E","In-Progress","04/10/2014","10/01/2015","","172160",473323,473323,"DSF: 0000775984"),
                new ProjectBean(10,"X430","M.S./H.S. 342 - BRONX","SCA CIP","IP SURVEILLANCE CAMERAS","Scope","Complete","06/29/2016","10/28/2016","01/17/2017","6840",22583,22583,"DSF: 0000843858"),
                new ProjectBean(10,"X430","M.S./H.S. 342 - BRONX","SCA CIP","IP SURVEILLANCE CAMERAS","Design","Complete","01/17/2017","07/17/2017","04/20/2017","25080",59165,59165,"DSF: 0000843858"),
                new ProjectBean(10,"X430","M.S./H.S. 342 - BRONX","SCA CIP","IP SURVEILLANCE CAMERAS","Construction","In-Progress","06/26/2017","04/01/2018","","265620",238433,6283,"DSF: 0000843858"),
                new ProjectBean(10,"X430","M.S./H.S. 342 - BRONX","SCA CIP","IP SURVEILLANCE CAMERAS","CM, F&E","In-Progress","06/26/2017","04/01/2018","","243952",213552,12476,"DSF: 0000843858"),
                new ProjectBean(10,"X430","M.S./H.S. 342 - BRONX","SCA CIP RESOA","FY18 RESO A LIBRARY UPGRADES","Scope","PNS","PNS","PNS","PNS","0",0,0,"DSF: 0000866411"),
                new ProjectBean(10,"X430","M.S./H.S. 342 - BRONX","SCA CIP RESOA","FY18 RESO A LIBRARY UPGRADES","Design","PNS","PNS","PNS","PNS","51000",51000,0,"DSF: 0000866411")
        );
        return args -> {
            log.info("Preloading " + projectRepo.saveAll(projects));

        };
    }

}
