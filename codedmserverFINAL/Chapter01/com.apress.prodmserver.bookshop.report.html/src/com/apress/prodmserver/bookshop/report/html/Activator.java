package com.apress.prodmserver.bookshop.report.html;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import com.apress.prodmserver.bookshop.report.ReportGenerator;

public class Activator implements BundleActivator {

    private ServiceRegistration reportGeneratorRegistration;

    public void start(BundleContext context) throws Exception {
        ReportGenerator reportGenerator = new HtmlReportGenerator("Export");
        reportGeneratorRegistration = context.registerService(
                ReportGenerator.class.getName(), reportGenerator, null);
    }

    public void stop(BundleContext context) throws Exception {
        reportGeneratorRegistration.unregister();
    }
}
