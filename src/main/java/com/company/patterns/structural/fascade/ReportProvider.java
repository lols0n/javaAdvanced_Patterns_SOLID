package com.company.patterns.structural.fascade;

import java.sql.Connection;

public class ReportProvider {

    public enum DBType {
        MYSQL,
        ORACLE;
    }

    public enum ReportType {
        HTML,
        PDF;
    }

    public static void generateReport(DBType dbType, ReportType reportType,String table) {
        Connection connection = null;
        switch (dbType) {
            case ORACLE:
                connection = OracleReportGenerator.getOracleDBConnection();
                OracleReportGenerator generator = new OracleReportGenerator();
                switch (reportType) {
                    case PDF:
                        generator.generatePDFReportFromOracle(table, connection);
                        break;
                    case HTML:
                        generator.generateHTMLReportFromOracle(table, connection);
                        break;
                }
                break;
        }

            switch (dbType) {
                case MYSQL:
                    connection = MySQLReportGenerator.getMySQLDBConnection();
                    MySQLReportGenerator generator1 = new MySQLReportGenerator();
                    switch (reportType) {
                        case PDF:
                            generator1.generatePDFReportFromMySQL(table, connection);
                            break;
                        case HTML:
                            generator1.generateHTMLReportFromMySQL(table,connection);
                            break;
                    }
                    break;

            }
    }
}
