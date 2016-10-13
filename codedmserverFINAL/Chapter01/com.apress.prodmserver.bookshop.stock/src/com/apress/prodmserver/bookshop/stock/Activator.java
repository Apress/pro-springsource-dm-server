package com.apress.prodmserver.bookshop.stock;

import java.util.Timer;
import java.util.TimerTask;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.util.tracker.ServiceTracker;

import com.apress.prodmserver.bookshop.export.ExportService;
import com.apress.prodmserver.bookshop.stock.impl.StockServiceImpl;

public class Activator implements BundleActivator {

    private ServiceTracker exportServiceTracker;
    private Timer timer = new Timer();

    public void start(BundleContext context) throws Exception {
        exportServiceTracker =
            new ServiceTracker(context, ExportService.class.getName(), null);
        exportServiceTracker.open();

        final StockService stockService =
                new StockServiceImpl(exportServiceTracker);

        timer.schedule(new TimerTask() {

            public void run() {
                try {
                    stockService.exportStock();
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
