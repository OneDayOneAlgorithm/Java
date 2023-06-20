package chap_08.camera;

import chap_08.detector.Detectable;
import chap_08.reporter.Reportable;

public class FactoryCam extends Camera implements Detectable, Reportable {
    private Detectable detectable;
    private Reportable reporter;

    public void setDetectable(Detectable detectable) {
        this.detectable = detectable;
    }

    public void setReporter(Reportable reporter) {
        this.reporter = reporter;
    }


    @Override
    public void showMainFeature() {
        System.out.println("화재 감지");
    }

    @Override
    public void detect() {
        detectable.detect();
    }

    @Override
    public void report() {
        reporter.report();
    }
}
