/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.nation;

import java.util.ArrayList;

public final class ShowDiplomacy
implements aQm {
    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        fjo_0 fjo_02 = aue_0.cVJ().cVK().ffF().ems();
        int[] nArray = fjt.syH.gbS();
        for (int i = 0; i < nArray.length; ++i) {
            fkc_0 fkc_02;
            int n = nArray[i];
            fjo_0 fjo_03 = fjt.syH.WG(n);
            fku_0 fku_02 = fjo_03.gbD();
            fku_0 fku_03 = fjo_02.gbD();
            fkc_0 fkc_03 = fku_03.WO(n);
            aqh_0.cBI().jF(n + " -> " + String.valueOf(fkc_03));
            fkc_0 fkc_04 = fku_02.WN(fjo_02.Xt());
            if (fkc_04 != null) {
                aqh_0.cBI().jF(n + " attend une r\u00e9ponse pour : " + String.valueOf(fkc_04));
            }
            if ((fkc_02 = fku_03.WN(n)) == null) continue;
            aqh_0.cBI().jF(n + " doit r\u00e9pondre pour : " + String.valueOf(fkc_03));
        }
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

