/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
package com.ankamagames.wakfu.client.console.command.debug;

import java.util.ArrayList;
import org.apache.log4j.Logger;

public class WorldEditorCommand
implements aQm {
    protected static final Logger gwk = Logger.getLogger(WorldEditorCommand.class);

    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        aUQ aUQ2 = aue_0.cVJ().cVO();
        if (aUQ2 != null && evm_2.b(aUQ2.cWq(), evn_2.ovh)) {
            if (aue_0.cVJ().c(czc_2.eYH())) {
                aue_0.cVJ().b(czc_2.eYH());
            } else {
                bzq_2 bzq_22 = bzp_2.eqt().mA(WX.bhh());
                if (bzq_22 != null && bzq_22.dYb()) {
                    faz_0 faz_02 = fad_0.d(this.cUe());
                    czc_2.eYH().c(faz_02);
                    aue_0.cVJ().a(czc_2.eYH());
                } else {
                    aqh_0.cBI().jG("You must be in a havenworld to open worldEditor.");
                }
            }
        }
    }

    private faa_0 cUe() {
        bjn_1 bjn_12 = aue_0.cVJ().cVK().dpI();
        return new faa_0(bjn_12.Ya(), bjn_12.getName(), bjn_12.Yc(), 0, false);
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

