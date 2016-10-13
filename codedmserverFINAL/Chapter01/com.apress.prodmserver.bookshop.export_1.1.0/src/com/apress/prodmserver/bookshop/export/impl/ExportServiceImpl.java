package com.apress.prodmserver.bookshop.export.impl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.osgi.util.tracker.ServiceTracker;

import com.apress.prodmserver.bookshop.export.ExportService;
import com.apress.prodmserver.bookshop.report.ReportGenerator;

public class ExportServiceImpl implements ExportService {

    private DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
    private ServiceTracker reportGeneratorTracker;
    private String path;

    public ExportServiceImpl(ServiceTracker reportGeneratorTracker, String path) {
        this.reportGeneratorTracker = reportGeneratorTracker;
        this.path = path;
    }

    public void export(String filename, Date time, Object[][] data)
            throws IOException {
        ReportGenerator reportGenerator =
            (ReportGenerator) reportGeneratorTracker.getService();
        if (reportGenerator == null) {
            throw new RuntimeException("Report generator service not available");
        }

        OutputStream out = null;
        try {
            File file = new File(path + "/" + filename
                    + dateFormat.format(time) + "."
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
