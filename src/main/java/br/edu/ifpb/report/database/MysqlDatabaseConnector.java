package br.edu.ifpb.report.database;

public class MysqlDatabaseConnector implements DBConnection{

    public void createConnection() {
        System.out.println("Create mysql connetion");
    }

    public void executeQuery(String query) {
        System.out.println("Run SQL query");
    }
}
