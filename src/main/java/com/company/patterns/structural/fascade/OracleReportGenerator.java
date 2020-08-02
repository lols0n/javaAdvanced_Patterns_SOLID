package com.company.patterns.structural.fascade;

import java.sql.Connection;



    public class OracleReportGenerator {

        public static Connection getOracleDBConnection() {
            System.out.println("Connection to Oracle established");
            return null;
        }
        public void generatePDFReportFromOracle(String table, Connection connection) {
            System.out.println("Creating PDF report from " + table);
        }
        public void generateHTMLReportFromOracle(String table, Connection connection) {
            System.out.println("Creating HTML report from " + table);
        }
    }

