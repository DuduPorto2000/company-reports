package br.edu.ifpb.report.database;

public interface DBConnection {
	abstract void createConnection();
	abstract void executeQuery(String query);
	
}
