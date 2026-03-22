/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
import lombok.Generated;

/*
 * Renamed from cme
 */
public class cme_0
extends nv_0 {
    private final fiu_0 max;

    @Override
    public byte[] aVX() {
        byte[] byArray = this.max.aVX();
        azg_1 azg_12 = new azg_1(byArray.length + 1);
        azg_12.dH(byArray);
        return this.a((byte)3, azg_12.bTe());
    }

    @Override
    public int d() {
        return 12525;
    }

    @Generated
    public cme_0(fiu_0 fiu_02) {
        this.max = fiu_02;
    }
}

