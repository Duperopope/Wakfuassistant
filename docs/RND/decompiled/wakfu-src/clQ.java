/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
import lombok.Generated;

public class clQ
extends nv_0 {
    private long mam;
    private int man;
    private long jYa;
    private fjg keK;

    @Override
    public byte[] aVX() {
        azg_1 azg_12 = new azg_1(21);
        azg_12.gK(this.mam);
        azg_12.vC(this.man);
        azg_12.gK(this.jYa);
        azg_12.aF(this.keK.aJr());
        return this.a((byte)3, azg_12.bTe());
    }

    @Override
    public int d() {
        return 13981;
    }

    @Generated
    public void ns(long l) {
        this.mam = l;
    }

    @Generated
    public void Ld(int n) {
        this.man = n;
    }

    @Generated
    public void nt(long l) {
        this.jYa = l;
    }

    @Generated
    public void a(fjg fjg2) {
        this.keK = fjg2;
    }
}

