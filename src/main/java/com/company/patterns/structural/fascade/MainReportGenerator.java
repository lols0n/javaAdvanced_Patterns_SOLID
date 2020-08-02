package com.company.patterns.structural.fascade;

import java.sql.Connection;

public class MainReportGenerator {

    public static void main(String[] args) {

        //=====MySQL
        System.out.println("Classic wy report calling");
        Connection mySQLconnection = MySQLReportGenerator.getMySQLDBConnection();
        MySQLReportGenerator mySQLReportGenerator = new MySQLReportGenerator();
        mySQLReportGenerator.generatePDFReportFromMySQL("customers", mySQLconnection);

        //=====Oracle

        Connection oracleConnection = OracleReportGenerator.getOracleDBConnection();
        OracleReportGenerator oracleReportGenerator = new OracleReportGenerator();
        oracleReportGenerator.generateHTMLReportFromOracle("cars", oracleConnection);

        //FASCADE
        System.out.println("FASCADE usage:");
        ReportProvider.generateReport(ReportProvider.DBType.ORACLE,ReportProvider.ReportType.PDF,"customers");
    }
}
