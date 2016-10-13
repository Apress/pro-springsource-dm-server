package com.apress.prodmserver.bookshop.ranking.impl;

import java.io.IOException;
import java.util.Date;

import org.osgi.util.tracker.ServiceTracker;

import com.apress.prodmserver.bookshop.export.ExportService;
import com.apress.prodmserver.bookshop.ranking.RankingService;

public class RankingServiceImpl implements RankingService {

    private ServiceTracker exportServiceTracker;

    public RankingServiceImpl(ServiceTracker exportServiceTracker) {
        this.exportServiceTracker = exportServiceTracker;
    }

    public void exportRanking() throws IOException {
        ExportService exportService =
                (ExportService) exportServiceTracker.getService();
        if (exportService == null) {
            throw new RuntimeException("Export service not available");
        }

        Object[][] ranking = { { "Rank", "Book" }, { 1, "Spring Recipes" },
                { 2, "Pro SpringSource dm Server" } };

        exportService.export("ranking", new Date(), ranking);
    }
}
