/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from axv
 */
public class axv_2 {
    public static final int dpQ = 18;
    public int dpR;
    public int dpS;
    public final byte[] dpT = new byte[18];

    public void a(byte[] byArray, azc_2<Integer> azc_22) {
        this.dpR = ayj_2.e(byArray, azc_22);
        this.dpS = ayj_2.e(byArray, azc_22);
        System.arraycopy(byArray, azc_22.aTx(), this.dpT, 0, 18);
        azc_22.L(azc_22.aTx() + 18);
    }

    public void d(fs_0 fs_02) {
        fs_02.mz(this.dpR);
        fs_02.mz(this.dpS);
        fs_02.di(this.dpT);
    }
}

