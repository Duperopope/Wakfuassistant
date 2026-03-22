/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.display;

import java.util.ArrayList;

public class AlphaMaskCommand
implements aQm {
    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        bsg_1 bsg_12 = (bsg_1)aie_0.cfn().bmH();
        boolean bl = !bsg_12.a(bsn_1.liL);
        bsg_12.a((afe)bsn_1.liL, bl);
        AlphaMaskCommand.eT(bl);
    }

    public static void eT(boolean bl) {
        AlphaMaskCommand.eU(bl);
        AlphaMaskCommand.eV(bl);
        aPd.f(bl ? "options.alphaMaskActivated" : "options.alphaMaskDisactivated", new Object[0]);
    }

    public static void eU(boolean bl) {
        aie_0.cfn();
        bgt_0 bgt_02 = aie_0.cfo().cVK();
        if (bgt_02 == null) {
            return;
        }
        bdj_2 bdj_22 = bgt_02.ddI();
        if (bdj_22 == null) {
            return;
        }
        bdj_22.bA(bl);
    }

    public static void eV(boolean bl) {
        aie_0.cfn();
        bgt_0 bgt_02 = aie_0.cfo().cVK();
        if (bgt_02 == null) {
            return;
        }
        bdj_2 bdj_22 = bgt_02.ddI();
        assert (bdj_22 != null);
        bsj_0 bsj_02 = bgt_02.dkZ();
        if (bsj_02 == null) {
            return;
        }
        for (bgy bgy2 : bsj_02.dGs()) {
            bdj_2 bdj_23 = bgy2.ddI();
            if (bdj_23 == null || bdj_22 == bdj_23) continue;
            bdj_23.bA(bl);
        }
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

