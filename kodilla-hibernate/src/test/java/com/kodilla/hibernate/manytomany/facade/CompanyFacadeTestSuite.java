package com.kodilla.hibernate.manytomany.facade;


import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyFacadeTestSuite {

    @Autowired
    CompanyFacade companyFacade;
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    @Test
    public void companyFinderTest(){
        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        companyFacade.companyDao.save(softwareMachine);
        companyFacade.companyDao.save(dataMaesters);
        companyFacade.companyDao.save(greyMatter);

        List<Company> find = companyFacade.findCompanyByPartialName("%Gre%");


        Assert.assertEquals(1, find.size());


        companyFacade.companyDao.delete(softwareMachine.getId());
        companyFacade.companyDao.delete(dataMaesters.getId());
        companyFacade.companyDao.delete(greyMatter.getId());
    }
    @Test
    public void  employeeFinderTest(){
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        companyFacade.employeeDao.save(johnSmith);
        companyFacade.employeeDao.save(stephanieClarckson);
        companyFacade.employeeDao.save(lindaKovalsky);

        List<Employee> find = companyFacade.findEmployeeByPartialName("%Smi%");

        Assert.assertEquals(1, find.size());

        companyFacade.employeeDao.delete(johnSmith.getId());
        companyFacade.employeeDao.delete(stephanieClarckson.getId());
        companyFacade.employeeDao.delete(lindaKovalsky.getId());
    }

}
