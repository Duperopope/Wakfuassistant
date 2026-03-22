/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bEC
 */
public class bec_0
implements RW<ffh_0, vy_2> {
    private static final bec_0 jPl = new bec_0();

    private bec_0() {
    }

    public static bec_0 dSv() {
        return jPl;
    }

    public ffh_0 c(vy_2 vy_22) {
        bea_0 bea_02 = new bea_0();
        if (bea_02.a(vy_22)) {
            return bea_02;
        }
        bea_02.aZp();
        return null;
    }

    @Override
    public /* synthetic */ RT x(Object object) {
        return this.c((vy_2)object);
    }
}

