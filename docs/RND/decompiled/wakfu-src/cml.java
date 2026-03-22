/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
import lombok.Generated;

public class cml
extends nv_0 {
    private final fiu_0 maB;

    @Override
    public byte[] aVX() {
        byte[] byArray = this.maB.aVX();
        azg_1 azg_12 = new azg_1(byArray.length + 1);
        azg_12.dH(byArray);
        return this.a((byte)3, azg_12.bTe());
    }

    @Override
    public int d() {
        return 13183;
    }

    @Generated
    public cml(fiu_0 fiu_02) {
        this.maB = fiu_02;
    }
}

