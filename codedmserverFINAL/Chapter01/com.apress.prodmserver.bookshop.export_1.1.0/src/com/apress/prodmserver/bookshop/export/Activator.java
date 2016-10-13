package com.apress.prodmserver.bookshop.export;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.util.tracker.ServiceTracker;

import com.apress.prodmserver.bookshop.export.impl.ExportServiceImpl;
import com.apress.prodmserver.bookshop.report.ReportGenerator;

public class Activator implements BundleActivator {

    private ServiceTracker reportGeneratorTracker;
    private ServiceRegistration exportServiceRegistration;

    public void start(BundleContext context) throws Exception {
        reportGeneratorTracker =
                new ServiceTracker(context, ReportGenerator.class.getName(), null);
        reportGeneratorTracker.open();

        ExportService exportService =
                new ExportServiceImpl(reportGeneratorTracker, "c:/bookshop");
        exportServiceRegistration = context.registerService(
                ExportService.class.getName(), exportService, null);
    }

    public void stop(BundleContext context) throws Exception {
        exportServiceRegistration.unregister();
        reportGeneratorTracker.close();
    }
}
