/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cYn
 */
public class cyn_2
implements adi_1 {
    private static final cyn_2 nYd = new cyn_2();
    public static final int nYe = 272;
    public static final int nYf = 52;

    public static cyn_2 eXP() {
        return nYd;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 16021: {
                if (aue_0.cVJ().cVK().dkZ() != null) {
                    return false;
                }
                if (fyw_0.gqw().to("splitStackDialog")) {
                    fyw_0.gqw().tl("splitStackDialog");
                }
                dbl_0 dbl_02 = (dbl_0)aam_22;
                fhv_2 fhv_22 = fyw_0.gqw().gqD();
                int n = cyn_2.a(dbl_02.bsM(), 272, fhv_22.bRq(), fhv_22.getScale());
                int n2 = cyn_2.a(dbl_02.bsN(), 52, fhv_22.bRr(), fhv_22.getScale());
                fyw_0.gqw().a("splitStackDialog", ccj_2.pe("splitStackDialog"), n, n2, 256L);
                short s = dbl_02.getItem() != null ? dbl_02.getItem().bfd() : (short)0;
                short s2 = dbl_02.bfd() > 0 ? dbl_02.bfd() : s;
                fse_1.gFu().f("itemToSplit", s2);
                return false;
            }
        }
        return true;
    }

    private static int a(short s, int n, float f2, float f3) {
        float f4 = (float)n * f3;
        float f5 = GC.b((float)s * f3, 0.0f, f2 - f4);
        return Math.round(f5 / f3);
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (!bl) {
            fyw_0.gqw().d("wakfu.split", che_1.class);
        }
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            fyw_0.gqw().tc("wakfu.split");
            fyw_0.gqw().tl("splitStackDialog");
            fse_1.gFu().vX("itemToSplit");
        }
    }
}

