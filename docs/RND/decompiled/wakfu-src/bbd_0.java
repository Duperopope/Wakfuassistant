/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from bbd
 */
class bbd_0
implements bbz {
    bbd_0() {
    }

    @Override
    public void a(bby bby2) {
        ZH zH = bby2.dac();
        if (zH == null) {
            return;
        }
        eSS eSS2 = bby2.dad();
        zH.dV("AnimStatique");
        zH.a(new bbe(this, zH, eSS2));
        daY daY2 = new daY(eSS2);
        daY2.lK(19231);
        daY2.cC(true);
        aaw_1.bUq().h(daY2);
    }

    protected String b(eSS eSS2) {
        QE qE;
        ahv_2 ahv_22 = new ahv_2();
        if (eSS2.bci() != null) {
            ahv_22.c("[").c(((fjm)((Object)eSS2.bci())).getName()).c("] ");
        }
        ahv_22.c(aum_0.cWf().a(6, (long)((int)eSS2.bcw()), new Object[0]));
        exx_2 exx_22 = exx_2.rGi;
        String string = "hp.var";
        if (eSS2.aeV() == etm_0.rnz.aHp()) {
            exx_22 = exx_2.rHi;
            string = "remaining.turns";
        } else if (eSS2.aeV() == etm_0.rnE.aHp()) {
            exx_22 = exx_2.rGi;
            string = "hp.var.barrel";
        } else if (eSS2.aeV() == etm_0.rns.aHp()) {
            exx_22 = eSN.fIA();
            string = "hp.var.beacon";
        }
        if (eSS2.a(exx_22)) {
            ahv_22.c(" (");
            ahv_22.c(aum_0.cWf().c(string, eSS2.c(exx_22)));
            ahv_22.c(")");
        }
        if ((qE = eSS2.baz()) != null) {
            ArrayList<enk_0> arrayList = new ArrayList<enk_0>();
            for (QD qD : qE) {
                if (!(qD instanceof enk_0)) continue;
                arrayList.add((enk_0)((Object)qD));
            }
            if (!qE.aJG()) {
                ArrayList<String> arrayList2 = eLL.a(new eLU(arrayList, (int)eSS2.bcw(), 0, true, eLN.qJo, 0));
                int n = arrayList2.size();
                for (int i = 0; i < n; ++i) {
                    ahv_22.ceH().c((CharSequence)arrayList2.get(i));
                }
            }
        }
        return ahv_22.ceL();
    }
}

