/*
 * Decompiled with CFR 0.152.
 */
public interface cBg {
    default public aix_2 n(apd_1 apd_12) {
        apd_1 apd_13;
        apd_1 apd_14;
        apd_1 apd_15;
        apd_1 apd_16 = apd_12.fq("id");
        if (apd_16 == null) {
            return null;
        }
        aix_2 aix_22 = new aix_2();
        aix_22.gc(apd_16.bCp());
        apd_1 apd_17 = apd_12.fq("gain");
        if (apd_17 != null) {
            aix_22.cI((float)apd_17.bCo() / 100.0f);
        }
        if ((apd_15 = apd_12.fq("rollOff")) != null) {
            aix_22.sy(apd_15.bCo());
        }
        if ((apd_14 = apd_12.fq("minPitch")) != null) {
            aix_22.cJ(apd_14.bCs());
        }
        if ((apd_13 = apd_12.fq("maxPitch")) != null) {
            aix_22.cK(apd_13.bCs());
        }
        return aix_22;
    }
}

