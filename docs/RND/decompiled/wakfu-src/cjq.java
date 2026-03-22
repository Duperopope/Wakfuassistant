/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.jetbrains.annotations.Nullable
 */
import lombok.Generated;
import org.jetbrains.annotations.Nullable;

public class cjq
extends nv_0 {
    private static final byte[] lWk = new byte[0];
    private final long lWl;
    private final int lWm;
    private final eIj lWn;
    @Nullable
    private fhk jzA;
    @Nullable
    private frd jzG;
    @Nullable
    private ehy_0 hOz;

    public cjq(long l, eIj eIj2) {
        this.lWl = l;
        this.lWn = eIj2;
        this.lWm = this.lWn.wp();
    }

    @Override
    public byte[] aVX() {
        this.lWn.tr(this.lWm);
        byte[] byArray = eIl.a(this.lWn, this.lWm);
        byte[] byArray2 = this.jzA == null ? lWk : fhj.g(this.jzA);
        byte[] byArray3 = this.jzG == null ? lWk : fre.m(this.jzG);
        byte[] byArray4 = this.hOz == null ? lWk : eHN.f(this.hOz);
        azg_1 azg_12 = new azg_1(cjq.a(byArray, byArray2, byArray3, byArray4));
        azg_12.gK(this.lWl);
        azg_12.vC(byArray.length);
        azg_12.dH(byArray);
        azg_12.vC(byArray2.length);
        azg_12.dH(byArray2);
        azg_12.vC(byArray3.length);
        azg_12.dH(byArray3);
        azg_12.vC(byArray4.length);
        azg_12.dH(byArray4);
        return this.a((byte)3, azg_12.bTe());
    }

    private static int a(byte[] byArray, byte[] byArray2, byte[] byArray3, byte[] byArray4) {
        return 12 + byArray.length + 4 + byArray2.length + 4 + byArray3.length + 4 + byArray4.length;
    }

    @Override
    public int d() {
        return 12882;
    }

    @Generated
    public void c(@Nullable fhk fhk2) {
        this.jzA = fhk2;
    }

    @Generated
    public void d(@Nullable frd frd2) {
        this.jzG = frd2;
    }

    @Generated
    public void c(@Nullable ehy_0 ehy_02) {
        this.hOz = ehy_02;
    }
}

