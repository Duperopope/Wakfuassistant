/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public class bTr
implements aeh_2,
fgK {
    public static final String lnN = "wallets";
    public static final String lnO = "totalAmount";
    public static final String lnP = "challenge";
    public static final String lnQ = "weather";
    public static final String lnR = "ecosystem";
    private final fpg<bJr> lnS;
    private final ArrayList<bTt> lnT = new ArrayList();

    public bTr(bJr bJr2, fpg<bJr> fpg2) {
        this.lnS = fpg2;
        this.i(bJr2);
    }

    public void i(bJr bJr2) {
        block5: for (fpf fpf2 : fpf.values()) {
            switch (fpf2) {
                case sNz: {
                    if (bJr2.eax().aVo() == 0) continue block5;
                    this.lnT.add(new bTt(fpf2, this.lnS));
                    continue block5;
                }
                case sNy: {
                    if (bJr2.ear().aVo() == 0) continue block5;
                    this.lnT.add(new bTt(fpf2, this.lnS));
                    continue block5;
                }
                case sNA: {
                    if (!fse_1.gFu().dp("wakfuEcosystemEnabled")) continue block5;
                    this.lnT.add(new bTt(fpf2, this.lnS));
                }
            }
        }
    }

    @Override
    public String[] bxk() {
        return null;
    }

    private bTt a(fpf fpf2) {
        int n = this.lnT.size();
        for (int i = 0; i < n; ++i) {
            bTt bTt2 = this.lnT.get(i);
            if (bTt2.enz() != fpf2) continue;
            return bTt2;
        }
        return null;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(lnN)) {
            return this.lnT;
        }
        if (string.equals(lnP)) {
            return this.a(fpf.sNy);
        }
        if (string.equals(lnQ)) {
            return this.a(fpf.sNz);
        }
        if (string.equals(lnR)) {
            return this.a(fpf.sNA);
        }
        if (string.equals(lnO)) {
            return this.lnS.exS() + "\u00a7";
        }
        return null;
    }

    @Override
    public void a(fgj_0 fgj_02, long l) {
        this.dqL();
    }

    public void dqL() {
        bTt bTt2;
        bTt bTt3;
        fse_1.gFu().a((aef_2)this, lnN, lnO);
        bTt bTt4 = this.a(fpf.sNy);
        if (bTt4 != null) {
            bTt4.cAN();
        }
        if ((bTt3 = this.a(fpf.sNz)) != null) {
            bTt3.cAN();
        }
        if ((bTt2 = this.a(fpf.sNA)) != null) {
            bTt2.cAN();
        }
    }
}

