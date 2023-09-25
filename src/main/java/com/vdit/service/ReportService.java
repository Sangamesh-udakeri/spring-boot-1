package com.vdit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.vdit.Dao.ReportDao;

@Service
public class ReportService {

	ReportDao reportDao;

	public ReportService() {
		System.out.println("ReportService const...");
	}

	public void generateReport() {
		reportDao.findData();
		System.out.println("generating Report....");
	}

	
	@Autowired
	public void setReportDao(ReportDao reportDao) {
		this.reportDao = reportDao;
	}

}
