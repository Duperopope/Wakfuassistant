/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bLE
 */
public class ble_2
implements RW<blb_2, yi_2> {
    private static final ble_2 ktO = new ble_2();

    public static ble_2 ecR() {
        return ktO;
    }

    public blb_2 b(yi_2 yi_22) {
        blb_2 blb_22 = blb_2.ecN();
        if (blb_22.a(yi_22)) {
            return blb_22;
        }
        return null;
    }

    @Override
    public /* synthetic */ RT x(Object object) {
        return this.b((yi_2)object);
    }
}

