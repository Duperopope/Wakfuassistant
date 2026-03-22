/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
package com.ankamagames.wakfu.client.console.command.commonIn;

import java.util.ArrayList;
import org.apache.log4j.Logger;

public class MapCommand
implements aQm {
    protected static Logger oO = Logger.getLogger(MapCommand.class);

    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        MapCommand.cTQ();
    }

    public static void cTQ() {
        cwh_1 cwh_12 = cwh_1.eVi();
        if (aue_0.cVJ().c(cwh_12)) {
            aue_0.cVJ().b(cwh_12);
            return;
        }
        big_2.dZe();
        if (bif_2.dYO().dYa()) {
            aue_0.cVJ().a(cwh_12);
            return;
        }
        biq_1 biq_12 = bih_2.dZf().b(bii_2.khF, -2L);
        if (biq_12 == null) {
            return;
        }
        bif_2.dYO().a(biq_12);
        aue_0.cVJ().a(cwh_12);
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

