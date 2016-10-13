package com.apress.prodmserver.bookshop.report.text;

import com.apress.prodmserver.bookshop.report.ReportGenerator;

public class TextReportGenerator implements ReportGenerator {

    private String delimiter;

    public TextReportGenerator(String delimiter) {
        this.delimiter = delimiter;
    }

    public String getExtension() {
        return "txt";
    }

    public byte[] generate(Object[][] data) {
        StringBuffer buffer = new StringBuffer();
        for (int row = 0; row < data.length; row++) {
            for (int column = 0; column < data[row].length; column++) {
                if (column != 0) {
                    buffer.append(delimiter);
                }
                buffer.append(data[row][column]);
            }
            buffer.append("\r\n");
        }
        return buffer.toString().getBytes();
    }
}
