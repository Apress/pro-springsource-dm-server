package com.apress.prodmserver.bookshop.export;

import java.io.IOException;
import java.util.Date;

public interface ExportService {

    public void export(String filename, Date time, Object[][] data)
            throws IOException;
}
