package com.apress.prodmserver.bookshop.export.impl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import com.apress.prodmserver.bookshop.export.ExportService;
import com.apress.prodmserver.bookshop.report.ReportGenerator;
import com.apress.prodmserver.bookshop.report.text.TextReportGenerator;

public class ExportServiceImpl implements ExportService {

    private ReportGenerator reportGenerator = new TextReportGenerator(",");
    private String path;

    public ExportServiceImpl(String path) {
        this.path = path;
    }

    public void export(String filename, Object[][] data) throws IOException {
        OutputStream out = null;
        try {
            File file = new File(path + "/" + filename + "."
                    + reportGenerator.getExtension());
            out = new FileOutputStream(file);
            out.write(reportGenerator.generate(data));
        } finally {
            if (out != null) {
                out.close();
            }
        }
    }
}
