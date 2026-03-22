/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from axx
 */
public class axx_2
extends axc_1 {
    private static final int dqd = 54;

    private void a(apl_1 apl_12, axy_2 axy_22, axz_2 axz_22) {
        azc_2<Integer> azc_22 = new azc_2<Integer>(0);
        byte[] byArray = new byte[54];
        apl_12.dx(byArray);
        axy_22.b(byArray, azc_22);
        axz_22.b(byArray, azc_22);
    }

    @Override
    protected axc_2 v(apl_1 apl_12) {
        axy_2 axy_22 = new axy_2();
        axz_2 axz_22 = new axz_2();
        this.a(apl_12, axy_22, axz_22);
        axk_2 axk_22 = null;
        if (axz_22.doL < 16) {
            int n = axz_22.dqo;
            if (n == 0) {
                n = 1 << axz_22.doL;
            }
            azc_2<Integer> azc_22 = new azc_2<Integer>(0);
            byte[] byArray = new byte[n * 4];
            apl_12.dx(byArray);
            axk_22 = new axk_2(n);
            for (int i = 0; i < n; ++i) {
                int n2 = azc_22.aTx();
                axk_22.a(new awx_2(this.cOG[n2 + 3], this.cOG[n2 + 2], this.cOG[n2 + 1], this.cOG[n2]));
                azc_22.L(n2 + 4);
            }
        }
        byte[] byArray = this.a(apl_12, axz_22.brs, axz_22.brt, axz_22.doL);
        return this.a(axz_22, axk_22, byArray);
    }

    private axc_2 a(axz_2 axz_22, axk_2 axk_22, byte ... byArray) {
        axj_2 axj_22 = new axj_2(axz_22.brs, axz_22.brt, axz_22.doL, axk_22, byArray);
        axc_2 axc_22 = new axc_2(ayl_2.dtX, axj_22);
        axj_22.bsI();
        return axc_22;
    }

    @Override
    protected acc_1 w(apl_1 apl_12) {
        axy_2 axy_22 = new axy_2();
        axz_2 axz_22 = new axz_2();
        this.a(apl_12, axy_22, axz_22);
        return new acc_1(axz_22.brs, axz_22.brt);
    }

    @Override
    protected int bQU() {
        return 54;
    }
}

