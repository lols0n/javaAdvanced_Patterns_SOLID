package com.company.patterns.structural.proxy;

import java.util.Arrays;
import java.util.List;

public class ProxyDemo {

    public static void main(String[] args) {

        CompanyEmployees companyEmployees = new CompanyEmployees();

        List<String> employeeList = Arrays.asList("Anna", "Jan", "Pawel");
        companyEmployees.setEmployees(employeeList);

        CompanyInternetNetwork internetNetwork = new ProxyCompanyInternetNetwork();
        internetNetwork.getAccess("Anna");
        internetNetwork.getAccess("Marian");
        internetNetwork.getAccess("Pawel");
        internetNetwork.getAccess("Igor");

    }
}
