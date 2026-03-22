/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cDJ
 */
class cdj_1
extends fmz_1 {
    final /* synthetic */ String mTZ;

    cdj_1(String string) {
        this.mTZ = string;
    }

    @Override
    public boolean run(fiq_1 fiq_12) {
        apa_0.jn(this.mTZ);
        return false;
    }
}

