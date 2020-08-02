package com.company.patterns.structural.proxy;

import java.util.ArrayList;
import java.util.List;


    public class CompanyEmployees {
        static List<String> employees;
        public List<String> getEmployees() {
            return employees;
        }
        public void setEmployees(List<String> employees) {
            this.employees = employees;
        }
        public CompanyEmployees() {
            this.employees = new ArrayList<>();
        }
        public static boolean isEmployee(String username) {
            return employees.contains(username);
        }
    }
