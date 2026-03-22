/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cxw
 */
public class cxw_0
extends nv_0 {
    private final int mlO;
    private final fpO mlP;

    public cxw_0(int n, fpO fpO2) {
        this.mlO = n;
        this.mlP = fpO2;
    }

    @Override
    public byte[] aVX() {
        azg_1 azg_12 = new azg_1();
        azg_12.vC(this.mlO);
        fpm_0.a(this.mlP, azg_12);
        return this.a((byte)6, azg_12.bTe());
    }

    @Override
    public int d() {
        return 15954;
    }
}

