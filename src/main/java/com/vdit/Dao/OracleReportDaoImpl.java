package com.vdit.Dao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository("oracle")
@Primary
public class OracleReportDaoImpl implements ReportDao {

	public OracleReportDaoImpl() {
		System.out.println("OracleReportDaoImpl const...");
	}

	public String findData() {
		System.out.println("fetching data from Oracledb...");
		return "report data";
	}
}
