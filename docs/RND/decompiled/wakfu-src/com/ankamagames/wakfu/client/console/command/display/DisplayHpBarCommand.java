/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.display;

import java.util.ArrayList;

public class DisplayHpBarCommand
implements aQm {
    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        fsf_1 fsf_12 = fse_1.gFu().getProperty("fight.displayHPBar");
        byte by = fsf_12 != null && fsf_12.bGI() >= 0 ? (byte)fsf_12.bGI() : (byte)((bsg_1)aie_0.cfn().bmH()).d(bsn_1.liS);
        DisplayHpBarCommand.aW(bsa_1.cQ(by));
    }

    public static void aW(byte by) {
        fse_1.gFu().f("fight.displayHPBar", by);
        bsj_0 bsj_02 = aue_0.cVJ().cVK().dkZ();
        if (bsj_02 != null) {
            for (bgy bgy2 : bsj_02.dGs()) {
                fse_1.gFu().a((aef_2)bgy2, "hpBarVisible");
            }
        }
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

