package com.apress.prodmserver.bookshop.export;

import java.io.IOException;

public interface ExportService {

    public void export(String filename, Object[][] data) throws IOException;
}
