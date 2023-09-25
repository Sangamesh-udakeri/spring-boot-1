package com.vdit.Dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository("mysql")

public class MysqlReportDaoImpl implements ReportDao {

	public MysqlReportDaoImpl() {
		System.out.println("MysqlReportDaoImpl const...");
	}

	public String findData() {
		System.out.println("fetching data from Mysqldb...");
		return "report data";
	}
}
