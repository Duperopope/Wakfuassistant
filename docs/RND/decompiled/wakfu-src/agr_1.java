/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import org.apache.log4j.Logger;

/*
 * Renamed from aGR
 */
public class agr_1 {
    private static final Logger dMP = Logger.getLogger(agr_1.class);
    public static final String dMQ = "reverbdensity";
    public static final String dMR = "reverbgain";
    public static final String dMS = "decaytime";
    public static final String dMT = "decayLPF";
    public static final String dMU = "earlygain";
    public static final String dMV = "predelay";
    private float dMW = 1.0f;
    private float dMX = 0.32f;
    private float dMY = 1.49f;
    private float dMZ = 0.83f;
    private float dNa = 1.26f;
    private float dNb = 0.011f;

    private agr_1() {
    }

    public agr_1(float f2, float f3, float f4, float f5, float f6, float f7) {
        this.dMW = f2;
        this.dMX = f3;
        this.dMY = f4;
        this.dMZ = f5;
        this.dNa = f6;
        this.dNb = f7;
    }

    public static agr_1 h(apd_1 apd_12) {
        agr_1 agr_12 = new agr_1();
        for (apd_1 apd_13 : apd_12.getChildren()) {
            if (apd_13.getName().equals(dMQ)) {
                agr_12.dMW = GC.b(apd_13.fq("value").bCs(), 0.0f, 1.0f);
                continue;
            }
            if (apd_13.getName().equals(dMR)) {
                agr_12.dMX = GC.b(apd_13.fq("value").bCs(), 0.0f, 1.0f);
                continue;
            }
            if (apd_13.getName().equals(dMS)) {
                agr_12.dMY = GC.b(apd_13.fq("value").bCs(), 0.1f, 20.0f);
                continue;
            }
            if (apd_13.getName().equals(dMT)) {
                agr_12.dMZ = GC.b(apd_13.fq("value").bCs(), 0.1f, 2.0f);
                continue;
            }
            if (apd_13.getName().equals(dMU)) {
                agr_12.dNa = GC.b(apd_13.fq("value").bCs(), 0.0f, 10.0f);
                continue;
            }
            if (!apd_13.getName().equals(dMV)) continue;
            agr_12.dNb = GC.b(apd_13.fq("value").bCs(), 0.0f, 0.1f);
        }
        return agr_12;
    }

    public static TIntObjectHashMap<agr_1> g(apd_1 apd_12) {
        TIntObjectHashMap tIntObjectHashMap = new TIntObjectHashMap();
        for (apd_1 apd_13 : apd_12.getChildren()) {
            if (!apd_13.getName().equals("reverb")) continue;
            tIntObjectHashMap.put(apd_13.fq("id").bCo(), (Object)agr_1.h(apd_13));
        }
        return tIntObjectHashMap;
    }

    public float cbU() {
        return this.dMW;
    }

    public float cbV() {
        return this.dMX;
    }

    public float cbW() {
        return this.dMY;
    }

    public float cbX() {
        return this.dMZ;
    }

    public float cbY() {
        return this.dNa;
    }

    public float cbZ() {
        return this.dNb;
    }
}

