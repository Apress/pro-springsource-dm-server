package com.apress.prodmserver.bookshop.ranking.impl;

import java.io.IOException;

import com.apress.prodmserver.bookshop.export.ExportService;
import com.apress.prodmserver.bookshop.export.impl.ExportServiceImpl;
import com.apress.prodmserver.bookshop.ranking.RankingService;

public class RankingServiceImpl implements RankingService {

    private ExportService exportService = new ExportServiceImpl("c:/bookshop");

    public void exportRanking() throws IOException {
        Object[][] ranking = { { "Rank", "Book" }, { 1, "Spring Recipes" },
                { 2, "Pro SpringSource dm Server" } };

        exportService.export("ranking", ranking);
    }
}
