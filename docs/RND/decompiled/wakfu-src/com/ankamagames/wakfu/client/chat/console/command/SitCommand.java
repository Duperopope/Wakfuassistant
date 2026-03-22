/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
package com.ankamagames.wakfu.client.chat.console.command;

import java.util.ArrayList;
import org.apache.log4j.Logger;

public class SitCommand
implements aQm {
    protected static final Logger eAh = Logger.getLogger(SitCommand.class);

    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        if (!this.a(aUf2)) {
            return;
        }
        SitCommand.run();
    }

    public static void run() {
        nv_0 nv_02;
        bgt_0 bgt_02 = bvz_0.dLl();
        if (bgt_02 == null) {
            return;
        }
        bkb_0 bkb_02 = bgt_02.dps();
        if (bkb_02 != null && bkb_02.dsm() != 1) {
            return;
        }
        bdj_2 bdj_22 = aue_0.cVJ().cVK().ddI();
        abi_1 abi_12 = bdj_22.bcB();
        abi_1 abi_13 = null;
        switch (abi_12) {
            case dzl: 
            case dzj: {
                abi_13 = abi_1.dzk;
                break;
            }
            case dzp: 
            case dzn: {
                abi_13 = abi_1.dzo;
            }
        }
        if (abi_13 != null) {
            nv_02 = new ciJ(abi_13);
            aue_0.cVJ().etu().d(nv_02);
        }
        nv_02 = new ciN();
        aue_0.cVJ().etu().d(nv_02);
    }

    private boolean a(aUf aUf2) {
        bgt_0 bgt_02 = bvz_0.dLl();
        bbf_0 bbf_02 = bbl_0.hBr.c(aUf2);
        if (bgt_02 == null || bbf_02 == null || !bbe_0.hAP.AD(bbf_02.d())) {
            return false;
        }
        bdj_2 bdj_22 = bgt_02.ddI();
        return bdj_22.bvF() == null;
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

