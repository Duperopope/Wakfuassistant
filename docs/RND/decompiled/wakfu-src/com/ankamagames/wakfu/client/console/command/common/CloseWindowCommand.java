/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.common;

import java.util.ArrayList;

public class CloseWindowCommand
implements aQm {
    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        CloseWindowCommand.bYm();
    }

    public static void bYm() {
        fif_2 fif_22 = ccg_2.eJI().eJH();
        switch (fif_22) {
            case uAx: {
                if (aue_0.cVJ().c(cwq_2.eVS())) {
                    aue_0.cVJ().b(cwq_2.eVS());
                    return;
                }
                if (crh_2.eML().bhl()) {
                    aie_0.cfn().ej(aue_0.cVJ().etp());
                    aue_0.cVJ().etr();
                    return;
                }
                if (aue_0.cVJ().c(crm_2.eMO())) {
                    aue_0.cVJ().b(crm_2.eMO());
                    fiu_1.uCW.N("loginLock", true);
                    aue_0.cVJ().a(csn_2.eNY());
                    return;
                }
                if (aue_0.cVJ().c(csm_1.eOv())) {
                    aie_0.cfn().ej(true);
                    csm_1.eOv().eOw();
                    aue_0.cVJ().etr();
                    return;
                }
                if (aue_0.cVJ().c(csp_1.eOC())) {
                    if (!csp_1.eOC().eOF().etL()) {
                        aue_0.cVJ().etr();
                    } else {
                        dae_0.cV((short)18465);
                    }
                    return;
                }
                if (aue_0.cVJ().c(ctu_1.nKS) && ctu_1.nKS.eRj()) {
                    String string2 = ctu_1.nKS.eRi();
                    String string3 = aum_0.cWf().c(string2, new Object[0]);
                    String string4 = string3.isEmpty() ? aum_0.cWf().c("scenario.confirmEscape", new Object[0]) : string3;
                    fiq_2.gCw().d(fik_2.a(string -> ctu_1.nKS.eRk()).vE(string4).abQ(1).vG(ccp_2.mRE.byf()));
                    return;
                }
                aue_0.cVJ().a(cwq_2.eVS());
                break;
            }
        }
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

