/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bMz
 */
public class bmz_0
implements RW<bmx_0, ym_1> {
    private final exP kyN;

    public bmz_0(exP exP2) {
        this.kyN = exP2;
    }

    public bmx_0 c(ym_1 ym_12) {
        bmx_0 bmx_02 = new bmx_0(this.kyN);
        if (bmx_02.e(ym_12)) {
            return bmx_02;
        }
        return null;
    }

    @Override
    public /* synthetic */ RT x(Object object) {
        return this.c((ym_1)object);
    }
}

