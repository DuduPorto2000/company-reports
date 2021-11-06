package br.edu.ifpb.report.controller;

import br.edu.ifpb.report.database.MysqlDatabaseConnector;
public class TaxReport extends Report {

    private MysqlDatabaseConnector connector = new MysqlDatabaseConnector();

    public void generate() {
    	DatabaseConnection();
        executeQuery();
        convert();
    }
    @Override
    public void DatabaseConnection() {
        System.out.println("Creating Database Connection...");
        connector.createConnection();
    }
    @Override
    public void executeQuery() {
        System.out.println("Executing MySQL Query...");
        String query = "SELECT * FROM taxes";
        connector.executeQuery(query);
    }
    @Override
    public void convert() {
        System.out.println("Converting To PDF...");
    }
}
