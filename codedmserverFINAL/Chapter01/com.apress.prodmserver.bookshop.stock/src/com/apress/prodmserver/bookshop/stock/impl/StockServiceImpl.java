package com.apress.prodmserver.bookshop.stock.impl;

import java.io.IOException;
import java.util.Date;

import org.osgi.util.tracker.ServiceTracker;

import com.apress.prodmserver.bookshop.export.ExportService;
import com.apress.prodmserver.bookshop.stock.StockService;

public class StockServiceImpl implements StockService {

    private ServiceTracker exportServiceTracker;

    public StockServiceImpl(ServiceTracker exportServiceTracker) {
        this.exportServiceTracker = exportServiceTracker;
    }

    public void exportStock() throws IOException {
        ExportService exportService =
                (ExportService) exportServiceTracker.getService();
        if (exportService == null) {
            throw new RuntimeException("Export service not available");
        }

        Object[][] stock = { { "Book", "Stock" }, { "Spring Recipes", "10" },
                { "Pro SpringSource dm Server", "20" } };

        exportService.export("stock", new Date(), stock);
    }
}
