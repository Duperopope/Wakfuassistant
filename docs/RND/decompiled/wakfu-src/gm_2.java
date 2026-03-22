/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.codahale.metrics.Meter
 */
import com.codahale.metrics.Meter;

/*
 * Renamed from GM
 */
class gm_2 {
    private final Meter aGW;

    gm_2(Meter meter) {
        this.aGW = meter;
    }

    public long aNZ() {
        return this.aGW.getCount();
    }

    public double aOk() {
        return this.aGW.getMeanRate();
    }

    public double aOl() {
        return this.aGW.getOneMinuteRate();
    }

    public double aOm() {
        return this.aGW.getFiveMinuteRate();
    }

    public double aOn() {
        return this.aGW.getFifteenMinuteRate();
    }

    public String toString() {
        return "MeterReport{m_meter=" + this.aGW.getCount() + "}";
    }
}

