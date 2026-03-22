/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from axG
 */
public class axg_1
extends axc_1 {
    @Override
    protected final axc_2 v(apl_1 apl_12) {
        boolean bl = apl_12.aIy() == 109;
        apl_12.tv(3);
        short s = apl_12.aIz();
        short s2 = apl_12.aIz();
        int n = apl_12.aIA();
        int n2 = apl_12.aIA();
        byte by = bl ? apl_12.aIy() : (byte)1;
        byte[] byArray = new byte[n];
        apl_12.dx(byArray);
        axj_2 axj_22 = new axj_2((int)s, (int)s2, 32, null, byArray);
        byte[] byArray2 = new byte[n2];
        apl_12.dx(byArray2);
        axj_22.a(byArray2, by);
        apl_12.close();
        axc_2 axc_22 = new axc_2(ayl_2.dtV, axj_22);
        axj_22.bsI();
        return axc_22;
    }

    @Override
    protected acc_1 w(apl_1 apl_12) {
        apl_12.tv(4);
        return new acc_1(apl_12.aIz(), apl_12.aIz());
    }

    @Override
    protected int bQU() {
        return 8;
    }
}

