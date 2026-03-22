/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cVZ
 */
public class cvz_2
implements adi_1 {
    private static final cvz_2 nRt = new cvz_2();
    private static final Logger nRu = Logger.getLogger(cvz_2.class);
    private alx_2 ikv;

    public static cvz_2 eUZ() {
        return nRt;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        aam_22.d();
        return true;
    }

    public void No(int n) {
        fhs_2 fhs_22 = fyw_0.gqw().gqC().uR("jailInfoDialog");
        if (fhs_22 == null) {
            return;
        }
        fbt_1 fbt_12 = (fbt_1)fhs_22.uH("timerImage");
        if (fbt_12 == null) {
            return;
        }
        int n2 = 250;
        int n3 = n / 250;
        if (n3 % 2 != 0) {
            ++n3;
        }
        fyY fyY2 = fbt_12.getAppearance();
        fyY2.a(new fsa_2(awx_2.dnF, awx_2.dnQ, fyY2, 0, 250, n3, true, abn.cdr));
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
            this.ikv = new cwa_2(this);
            fyw_0.gqw().a(this.ikv);
            ccj_2.g("jailInfoDialog", 8192L);
            fyw_0.gqw().d("wakfu.jailInfo", cfj_2.class);
        }
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            fyw_0.gqw().tc("wakfu.jailInfo");
            fyw_0.gqw().tl("jailInfoDialog");
        }
    }
}

