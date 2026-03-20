/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
import lombok.Generated;

public class clV
extends Nv {
    private fiU mar;
    private final fjc mas;

    @Override
    public byte[] aVX() {
        byte[] byArray = this.mar.aVX();
        azg azg2 = new azg(byArray.length + 1);
        azg2.dH(byArray);
        azg2.aF((byte)this.mas.ordinal());
        return this.a((byte)3, azg2.bTe());
    }

    @Override
    public int d() {
        return 13088;
    }

    @Generated
    public void e(fiU fiU2) {
        this.mar = fiU2;
    }

    @Generated
    public clV(fjc fjc2) {
        this.mas = fjc2;
    }
}
