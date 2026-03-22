/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.display;

import java.util.ArrayList;

public class EnableMiniMapCommand
implements aQm {
    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        bsg_1 bsg_12 = (bsg_1)aie_0.cfn().bmH();
        boolean bl = bsg_12.a(bsn_1.ljK);
        EnableMiniMapCommand.eW(!bl);
    }

    @Override
    public boolean cAW() {
        return false;
    }

    public static void eW(boolean bl) {
        if (!bik_2.dZl().dYa() || bl == EnableMiniMapCommand.cUs()) {
            return;
        }
        dae_0 dae_02 = new dae_0();
        dae_02.lK(16221);
        dae_02.cC(bl);
        aaw_1.bUq().h(dae_02);
    }

    public static boolean cUs() {
        return ((bsg_1)aie_0.cfn().bmH()).a(bsn_1.ljK);
    }
}

