package com.apress.prodmserver.bookshop.report;

public interface ReportGenerator {

    public String getExtension();
    public byte[] generate(Object[][] data);
}
