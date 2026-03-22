/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aHD
 */
public class ahd_1
extends azs_2<String, ahc_1> {
    public static final ahd_1 dRq = new ahd_1();

    private ahd_1() {
        super(50);
    }

    public long cdP() {
        long l = 0L;
        for (ahc_1 ahc_12 : this.dvy.values()) {
            l += (long)ahc_12.cea();
        }
        return l;
    }
}

