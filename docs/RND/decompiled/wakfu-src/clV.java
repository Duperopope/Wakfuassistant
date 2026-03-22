/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
import lombok.Generated;

public class clV
extends nv_0 {
    private fiu_0 mar;
    private final fjc mas;

    @Override
    public byte[] aVX() {
        byte[] byArray = this.mar.aVX();
        azg_1 azg_12 = new azg_1(byArray.length + 1);
        azg_12.dH(byArray);
        azg_12.aF((byte)this.mas.ordinal());
        return this.a((byte)3, azg_12.bTe());
    }

    @Override
    public int d() {
        return 13088;
    }

    @Generated
    public void e(fiu_0 fiu_02) {
        this.mar = fiu_02;
    }

    @Generated
    public clV(fjc fjc2) {
        this.mas = fjc2;
    }
}

