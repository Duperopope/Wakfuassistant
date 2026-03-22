/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bmu
 */
public class bmu_2
implements ekz_0 {
    public static final bmu_2 iBB = new bmu_2();

    protected bmu_2() {
    }

    @Override
    public void d(@NotNull eKW eKW2) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bdl_0 bdl_02 = bgt_02.dno();
        ArrayList<ffV> arrayList = bdl_02.pd(eKW2.fzd());
        for (ffV ffV2 : arrayList) {
            if (bdl_02.aa(ffV2) == null) continue;
            ffV2.aZp();
        }
        aPd.f("craft.jobLearnt", aum_0.cWf().a(43, (long)eKW2.d(), new Object[0]));
        bqm_0.jbp.b(new brj_0(eKW2.d()));
    }

    @Override
    public void t(int n, long l) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        long l2 = bgt_02.dpK().QI(n);
        int n2 = eKX.qi(l2) - eKX.qi(l2 - l);
        String string = aum_0.cWf().a(43, (long)n, new Object[0]);
        String string2 = aum_0.cWf().c("infoPop.xpGain", string, l, bgt_02.dpK().QH(n), aPl.exs.czC(), n2);
        aPh.czg().iZ(string2);
        if (n2 == 0) {
            return;
        }
        String string3 = aum_0.cWf().c("notification.skillLevelUpTitle", string);
        String string4 = cfh_2.createLink(aum_0.cWf().c("notification.skillLevelUpText", string, bgt_02.dpK().PG(n)), biu_1.kiw, "" + n);
        dcd dcd2 = new dcd(string3, string4, biu_1.kiw);
        aaw_1.bUq().h(dcd2);
        bgt_02.dmY();
    }

    @Override
    public void Ef(int n) {
    }

    @Override
    public void du(int n, int n2) {
        eKR eKR2 = eKQ.qEb.QV(n).QZ(n2);
        String string = aum_0.cWf().c("craft.recipeDiscovered", aum_0.cWf().a(15, (long)eKR2.fyZ().azv(), new Object[0]));
        aPh.czg().iZ(string);
    }
}

