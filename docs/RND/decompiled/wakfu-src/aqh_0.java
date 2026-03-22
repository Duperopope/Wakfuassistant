/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from aQh
 */
public final class aqh_0 {
    private static final aqh_0 eBU = new aqh_0();
    private final List<aqi_0> eBV = new ArrayList<aqi_0>();

    public static aqh_0 cBI() {
        return eBU;
    }

    private aqh_0() {
    }

    public void a(aqi_0 aqi_02) {
        this.eBV.add(aqi_02);
    }

    public boolean b(aqi_0 aqi_02) {
        if (this.eBV.contains(aqi_02)) {
            this.eBV.remove(aqi_02);
            return true;
        }
        return false;
    }

    public List<aqi_0> cBJ() {
        return this.eBV;
    }

    public void jF(String string) {
        for (aqi_0 aqi_02 : this.eBV) {
            aqi_02.jF(string);
        }
    }

    public void jG(String string) {
        for (aqi_0 aqi_02 : this.eBV) {
            aqi_02.jG(string);
        }
    }

    public void jH(String string) {
        for (aqi_0 aqi_02 : this.eBV) {
            aqi_02.jH(string);
        }
    }

    public void n(String string, int n) {
        for (aqi_0 aqi_02 : this.eBV) {
            aqi_02.n(string, n);
        }
    }

    public void jI(String string) {
        for (aqi_0 aqi_02 : this.eBV) {
            aqi_02.jI(string);
        }
    }
}

