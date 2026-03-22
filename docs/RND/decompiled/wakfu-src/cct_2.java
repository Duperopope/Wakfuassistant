/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.LinkedList;

/*
 * Renamed from cCT
 */
public final class cct_2 {
    private static final int mSm = 2500;
    static fka_1 mSn = null;
    static faw_2 mSo = null;
    static ArrayList<fzc> mSp = null;
    static final LinkedList<String> mSq = new LinkedList();

    private cct_2() {
    }

    public static void pj(String string) {
        if (fse_1.gFu().vY("splashText") != null) {
            mSq.addLast(string);
        } else {
            fse_1.gFu().f("splashText", string);
            if (!fyw_0.gqw().to("splashMessageDialog") || mSo == null) {
                mSo = (faw_2)ccj_2.g("splashMessageDialog", 8210L);
            }
            if (mSo != null) {
                if (mSn != null) {
                    mSo.getAppearance().c(mSn);
                }
                mSn = new fka_1();
                mSn.aVI();
                mSn.setFile("6001037.xps");
                mSn.setAlignment(faa_2.tLO);
                mSo.getAppearance().d(mSn);
            }
            cct_2.jL(true);
        }
    }

    private static void eJM() {
        mSp = new ArrayList();
        fhs_2 fhs_22 = mSo.getElementMap();
        mSp.add(((faw_2)fhs_22.uH("mainContainer")).getAppearance());
        mSp.add(((fdy_1)fhs_22.uH("text")).getAppearance());
    }

    private static void jK(boolean bl) {
        fhs_2 fhs_22 = mSo.getElementMap();
        ((faw_2)fhs_22.uH("mainContainer")).setNonBlocking(bl);
    }

    static void jL(boolean bl) {
        int n;
        int n2;
        if (mSp == null) {
            cct_2.eJM();
        }
        cct_2.jK(!bl);
        fhs_2 fhs_22 = mSo.getElementMap();
        faw_2 faw_22 = (faw_2)fhs_22.uH("mainContainer");
        fzc fzc2 = mSp.get(0);
        if (bl) {
            n2 = awx_2.dnC.aTn();
            n = awx_2.dnF.aTn();
        } else {
            n2 = awx_2.dnF.aTn();
            n = awx_2.dnC.aTn();
        }
        if (n2 != n) {
            if (bl) {
                cAY.eHc().eHq();
            } else {
                cAY.eHc().eHr();
            }
            awx_2 awx_22 = new awx_2(n2);
            awx_2 awx_23 = new awx_2(n);
            faw_22.x(fsz_2.class);
            fsz_2 fsz_22 = new fsz_2(awx_22, awx_23, mSp, 0, 500, 1, abn.cdr);
            fsz_22.a(new ccu_2(bl));
            faw_22.a(fsz_22);
        }
    }
}

