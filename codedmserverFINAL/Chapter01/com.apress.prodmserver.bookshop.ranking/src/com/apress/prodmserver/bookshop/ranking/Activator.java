package com.apress.prodmserver.bookshop.ranking;

import java.util.Timer;
import java.util.TimerTask;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.util.tracker.ServiceTracker;

import com.apress.prodmserver.bookshop.export.ExportService;
import com.apress.prodmserver.bookshop.ranking.impl.RankingServiceImpl;

public class Activator implements BundleActivator {

    private ServiceTracker exportServiceTracker;
    private Timer timer = new Timer();

    public void start(BundleContext context) throws Exception {
        exportServiceTracker =
            new ServiceTracker(context, ExportService.class.getName(), null);
        exportServiceTracker.open();

        final RankingService rankingService =
                new RankingServiceImpl(exportServiceTracker);

        timer.schedule(new TimerTask() {

            public void run() {
                try {
                    rankingService.exportRanking();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }, 0, 60000);
    }

    public void stop(BundleContext context) throws Exception {
        timer.cancel();
        exportServiceTracker.close();
    }
}
