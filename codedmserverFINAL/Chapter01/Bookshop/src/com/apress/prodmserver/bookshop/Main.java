package com.apress.prodmserver.bookshop;

import java.util.Timer;
import java.util.TimerTask;

import com.apress.prodmserver.bookshop.ranking.RankingService;
import com.apress.prodmserver.bookshop.ranking.impl.RankingServiceImpl;
import com.apress.prodmserver.bookshop.stock.StockService;
import com.apress.prodmserver.bookshop.stock.impl.StockServiceImpl;

public class Main {

    public static void main(String[] args) {
        final RankingService rankingService = new RankingServiceImpl();

        new Timer().schedule(new TimerTask() {

            public void run() {
                try {
                    rankingService.exportRanking();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }, 0, 60000);

        final StockService stockService = new StockServiceImpl();

        new Timer().schedule(new TimerTask() {

            public void run() {
                try {
                    stockService.exportStock();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }, 0, 60000);
    }
}
