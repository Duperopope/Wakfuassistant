/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

class bbj
extends bbd_0 {
    bbj() {
    }

    @Override
    protected String b(eSS eSS2) {
        uu_0<QD> uu_02;
        ahv_2 ahv_22 = new ahv_2();
        qu_0 qu_02 = eSS2.bci();
        if (qu_02 instanceof exP) {
            ahv_22.c("[").c(((bgy)qu_02).getName()).c("] ");
        }
        ahv_22.c(aum_0.cWf().a(6, (long)((int)eSS2.bcw()), new Object[0]));
        if (eSS2 instanceof bbi) {
            uu_02 = (bbi)eSS2;
            if (eSS2.a(exx_2.rGi)) {
                ahv_22.c(" (").c(aum_0.cWf().c("hp.var", eSS2.c(exx_2.rGi))).c(")");
            }
            switch (((eST)uu_02).fIN()) {
                case 1: {
                    int n;
                    if (eSS2.a(exx_2.rGj) && (n = eSS2.c(exx_2.rGj)) > 0) {
                        ahv_22.c("\n . ").c(aum_0.cWf().c("xelors.dial.ap.var", n));
                    }
                    if (!eSS2.a(exx_2.rGI) || (n = eSS2.c(exx_2.rGI)) <= 0) break;
                    ahv_22.c("\n . ").c(aum_0.cWf().c("xelors.dial.init.var", n));
                    break;
                }
                case 4: {
                    ahv_22.c(" (");
                    if (((eSS)uu_02).kW(1467L)) {
                        ahv_22.c(aum_0.cWf().c("microbot.is.activated", new Object[0]));
                    } else {
                        ahv_22.c(aum_0.cWf().c("microbot.is.not.activated", new Object[0]));
                    }
                    ahv_22.k(')');
                }
            }
        }
        if ((uu_02 = eSS2.baz()) != null) {
            ArrayList<enk_0> arrayList = new ArrayList<enk_0>();
            Object object = ((QE)uu_02).iterator();
            while (object.hasNext()) {
                QD qD = object.next();
                if (!(qD instanceof enk_0)) continue;
                arrayList.add((enk_0)((Object)qD));
            }
            if (!((QE)uu_02).aJG()) {
                object = eLL.a(new eLU(arrayList, (int)eSS2.bcw(), 0, true, eLN.qJo, 0));
                int n = ((ArrayList)object).size();
                for (int i = 0; i < n; ++i) {
                    ahv_22.ceH().c((CharSequence)((ArrayList)object).get(i));
                }
            }
        }
        return ahv_22.ceL();
    }
}

