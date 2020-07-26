package com.company.solid.srp.fixed;

import com.company.solid.srp.Person;

public class DrivingLicenseRules {

    private static final int DRIVING_LICENSE_REQUIRED_AGE = 18;
    private static final int DRIVING_LICENSE_REQUIRED_AGE_WITH_MENTOR = 16;

    public static boolean canGerDrivingLicense(Person person) {
        return person.getAge() > DRIVING_LICENSE_REQUIRED_AGE;
    }
}
