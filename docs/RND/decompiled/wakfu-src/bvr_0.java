/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bvR
 */
public class bvr_0
extends exy_1 {
    @Override
    public String getName() {
        String string = super.getName();
        if (string != null && !string.isEmpty()) {
            return string;
        }
        eJS eJS2 = this.fPk();
        if (eJS2 == null) {
            return string;
        }
        short s = eJS2.aWP();
        bjz_1 bjz_12 = bja_1.drJ().bC(s);
        if (bjz_12 == null) {
            return string;
        }
        return bjz_12.getName();
    }
}

