package com.apress.prodmserver.bookshop.report.html;

import com.apress.prodmserver.bookshop.report.ReportGenerator;

public class HtmlReportGenerator implements ReportGenerator {

    private String title;

    public HtmlReportGenerator(String title) {
        this.title = title;
    }

    public String getExtension() {
        return "html";
    }

    public byte[] generate(Object[][] data) {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<html><head><title>");
        buffer.append(title);
        buffer.append("</title></head><body><table>");
        for (int row = 0; row < data.length; row++) {
            buffer.append("<tr>");
            for (int column = 0; column < data[row].length; column++) {
                buffer.append("<td>");
                buffer.append(data[row][column]);
                buffer.append("</td>");
            }
            buffer.append("</tr>");
        }
        buffer.append("</table></body></html>");
        return buffer.toString().getBytes();
    }
}
