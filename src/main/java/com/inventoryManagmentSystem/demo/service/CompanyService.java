package com.inventoryManagmentSystem.demo.service;

import com.inventoryManagmentSystem.demo.entity.Company;

import java.util.List;
import java.util.Optional;

public interface CompanyService {
    // Create
    Company saveCompany(Company company);

    // Get
    Optional<Company> findCompanyById(Integer companyId);
    List<Company> findAllCompanies();

    // Update
    Company updateCompany(Integer companyId, Company company);

    //Patch
    Company patchCompany(Integer companyId, Company company);

    // Delete
    void deleteCompany(Integer companyId);

}
