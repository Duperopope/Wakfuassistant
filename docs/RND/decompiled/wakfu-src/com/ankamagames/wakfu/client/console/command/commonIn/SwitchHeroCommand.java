/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.commonIn;

import java.util.ArrayList;

public class SwitchHeroCommand
implements aQm {
    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        if (!arrayList.isEmpty()) {
            byte by = Byte.parseByte(arrayList.get(2));
            bvk_0 bvk_02 = cxs_1.eXb().eXc();
            if (bvk_02 == null) {
                return;
            }
            long l = bvk_0.bR(by);
            if (l == -1L) {
                return;
            }
            bgt_0 bgt_02 = bvz_0.dLl();
            if (bgt_02 == null) {
                return;
            }
            if (fcL.rUh.sA(bgt_02.Xi()) < 2) {
                return;
            }
            SwitchHeroCommand.ip(l);
        }
    }

    public static void ip(long l) {
        if (cvv_2.nPF.eUz()) {
            return;
        }
        if (!cvv_2.nPF.eUA()) {
            return;
        }
        cvu_2.eTO().C(() -> SwitchHeroCommand.iq(l));
    }

    private static void iq(long l) {
        aue_0 aue_02 = aue_0.cVJ();
        bgt_0 bgt_02 = aue_02.cVK();
        if (bgt_02.dnB() != null) {
            aPd.e("error.cantSwitchHeroLeader2", new Object[0]);
            return;
        }
        Object t = fcL.rUh.aw(bgt_02.Xi(), l);
        if (t == null || fcK.rUe.aU((exP)t)) {
            aPd.e("error.cantSwitchHeroLeader1", new Object[0]);
            return;
        }
        aUm.cUI().cD(false);
        bgr_0.dmo().aC(bgt_02);
        bgt_02.fZ(false);
        cvv_2.nPF.kv(false);
        fcK.rUe.ar(aue_02.cVO().xl(), l);
        bgt_0 bgt_03 = bvz_0.dLl();
        if (bgt_03 == null) {
            return;
        }
        bgt_03.dnQ().c(bgt_02.dnQ().dKL());
        bly_0.ivl.s(bgt_03);
        cjy cjy2 = new cjy(l);
        bdj_2 bdj_22 = bgt_02.ddI();
        ((ads_0)bdj_22).bvA();
        aue_02.etu().d(cjy2);
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

