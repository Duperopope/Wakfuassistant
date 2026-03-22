/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from abL
 */
public class abl_0
implements abi_0 {
    private final float ceM;
    private final int ceN;
    private final float ceO;
    private final abw_1 ceP;

    public abl_0(float f2, int n, float f3, abw_1 abw_12) {
        this.ceM = f2;
        this.ceN = n;
        this.ceO = f3;
        this.ceP = abw_12;
    }

    @Override
    public void a(float[] fArray, int n, int n2, int n3, int n4) {
        abr_1.a(fArray, n, n2, this.ceO, this.ceO, n3, n4, this.ceM, this.ceN, this.ceP);
    }
}

