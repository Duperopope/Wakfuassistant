/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from ccS
 */
public class ccs_1
implements adi_1 {
    protected static final Logger lPV = Logger.getLogger(ccs_1.class);
    public static final ccs_1 lPW = new ccs_1();

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 12046: {
                cry_0 cry_02 = (cry_0)aam_22;
                this.a(cry_02);
                return false;
            }
            case 12860: {
                crx_0 crx_02 = (crx_0)aam_22;
                this.a(crx_02);
                return false;
            }
        }
        return true;
    }

    public void a(cry_0 cry_02) {
        ArrayList<us_2> arrayList = cry_02.eAa();
        if (cry_02.eAb()) {
            aPd.e("playerGift.error.capReached", new Object[0]);
        }
        ArrayList<bud_0> arrayList2 = new ArrayList<bud_0>();
        for (int i = 0; i < arrayList.size(); ++i) {
            us_2 us_22 = arrayList.get(i);
            bud_0 bud_02 = new bud_0();
            bud_02.a(us_22);
            arrayList2.add(bud_02);
        }
        buc_0.dJg().G(arrayList2);
        fse_1.gFu().f("playerGift", buc_0.dJg());
    }

    public void a(crx_0 crx_02) {
        boolean bl = crx_02.ezZ();
        buc_0.dJg().gW(bl);
        cuv_2.eTk().kp(true);
        if (buc_0.dJg().aJG()) {
            aue_0.cVJ().b(cuv_2.eTk());
        }
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }
}

