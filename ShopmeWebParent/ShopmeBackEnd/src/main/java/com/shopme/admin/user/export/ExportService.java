package com.shopme.admin.user.export;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class ExportService {

	@Autowired
	ApplicationContext context;

	public AbstractExporter getExporter(String exportType) {

		switch (exportType.toUpperCase()) {
		case "EXCEL":
			return context.getBean("excelExporter", AbstractExporter.class);
		case "PDF":
			return context.getBean("pdfExporter", AbstractExporter.class);
		case "CSV":
			return context.getBean("csvExporter", AbstractExporter.class);
		default:
			return null; // Invalid type returns null
		}
	}
}
