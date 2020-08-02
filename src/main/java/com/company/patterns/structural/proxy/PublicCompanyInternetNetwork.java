package com.company.patterns.structural.proxy;

public class PublicCompanyInternetNetwork implements CompanyInternetNetwork {

    private String username;

    public PublicCompanyInternetNetwork(String username) {
        this.username = username;
    }

    @Override
    public void getAccess(String username) {
        System.out.println("Access granted to public network for " + username);
    }
}
