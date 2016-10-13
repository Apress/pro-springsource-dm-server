package com.apress.prodmserver.bookshop.stock.impl;

import java.io.IOException;

import com.apress.prodmserver.bookshop.export.ExportService;
import com.apress.prodmserver.bookshop.export.impl.ExportServiceImpl;
import com.apress.prodmserver.bookshop.stock.StockService;

public class StockServiceImpl implements StockService {

    private ExportService exportService = new ExportServiceImpl("c:/bookshop");

    public void exportStock() throws IOException {
        Object[][] stock = { { "Book", "Stock" }, { "Spring Recipes", "10" },
                { "Pro SpringSource dm Server", "20" } };

        exportService.export("stock", stock);
    }
}
