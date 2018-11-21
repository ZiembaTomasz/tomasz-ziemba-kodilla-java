package com.kodilla.hibernate.manytomany.facade;




import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyFacade {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    public List<Company> findCompanyByPartialName(String companyPartialName) {
        List<Company> find = companyDao.findByName("%" + companyPartialName + "%");
        return find;
    }
    public List<Employee> findEmployeeByPartialName(String employeePartialName){
        List<Employee> find = employeeDao.findByPartialName("%" + employeePartialName + "%");
        return find;
    }
}
