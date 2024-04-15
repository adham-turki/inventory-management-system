package com.inventoryManagmentSystem.demo.service.impl;

import com.inventoryManagmentSystem.demo.entity.Company;
import com.inventoryManagmentSystem.demo.repository.CompanyRepository;
import com.inventoryManagmentSystem.demo.service.CompanyService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service //To enable this class for component scanning
public class CompanyServiceImpl implements CompanyService {
    private final CompanyRepository companyRepository;

    @Autowired
    public CompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    public Company saveCompany(Company company) {
        return companyRepository.save(company);
    }

    @Override
    public Optional<Company> findCompanyById(Integer companyId) {
        return companyRepository.findById(companyId);
    }

    @Override
    public List<Company> findAllCompanies() {
        return companyRepository.findAll();
    }

    @Override
    public Company updateCompany(Integer companyId, Company company) {
        Optional<Company> existingCompanyOptional = companyRepository.findById(companyId);
        if (existingCompanyOptional.isPresent()) {
            Company existingCompany = existingCompanyOptional.get();
            existingCompany.setCompanyName(company.getCompanyName());
            existingCompany.setLocation(company.getLocation());
            return companyRepository.save(existingCompany);
        } else {
            throw new EntityNotFoundException("Company with ID " + companyId + " not found");
        }
    }

    @Override
    public Company patchCompany(Integer companyId, Company company) {
        Optional<Company> existingCompanyOptional = companyRepository.findById(companyId);
        if (existingCompanyOptional.isPresent()) {
            Company existingCompany = existingCompanyOptional.get();
            if (company.getCompanyName() != null) {
                existingCompany.setCompanyName(company.getCompanyName());
            }
            if (company.getLocation() != null) {
                existingCompany.setLocation(company.getLocation());
            }
            return companyRepository.save(existingCompany);
        } else {
            throw new EntityNotFoundException("Company with ID " + companyId + " not found");
        }
    }


    @Override
    public void deleteCompany(Integer companyId) {
        companyRepository.deleteById(companyId);
    }
}
