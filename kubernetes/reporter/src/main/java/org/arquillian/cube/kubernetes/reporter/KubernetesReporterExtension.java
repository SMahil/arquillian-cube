package org.arquillian.cube.kubernetes.reporter;

import org.jboss.arquillian.core.spi.LoadableExtension;


public class KubernetesReporterExtension implements LoadableExtension{

    @Override
    public void register(ExtensionBuilder builder) {
        final boolean reportedInClasspath = Validate.classExists("org.arquillian.recorder.reporter.ReporterExtension");
        if (reportedInClasspath) {
            builder.observer(TakeKubernetesResourcesInformation.class);
        }
    }
}
