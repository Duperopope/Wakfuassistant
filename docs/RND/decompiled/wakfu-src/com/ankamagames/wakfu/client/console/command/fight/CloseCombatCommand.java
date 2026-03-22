/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
package com.ankamagames.wakfu.client.console.command.fight;

import java.util.ArrayList;
import java.util.Optional;
import org.apache.log4j.Logger;

public class CloseCombatCommand
implements aQm {
    protected static final Logger gxs = Logger.getLogger(CloseCombatCommand.class);

    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        if (arrayList.get(2).length() >= 1) {
            byte by;
            ffV ffV3;
            Object object;
            bgy bgy2 = aue_0.cVJ().cVM();
            if (bgy2 == null) {
                return;
            }
            blh_2 blh_22 = bgy2.dlG();
            fqr_0 fqr_02 = null;
            if (blh_22.ede() == fqt_0.sTe) {
                return;
            }
            switch (arrayList.get(2).charAt(0)) {
                case 'l': {
                    fqr_02 = blh_22.edI();
                    break;
                }
                case 'r': {
                    fqr_02 = blh_22.edJ();
                    break;
                }
            }
            if (fqr_02.avr() == 2145) {
                object = fgD.fXh().Vd(2145);
                ffV ffV4 = new ffV(-1L);
                ffV4.l((fhc_0)object);
                ffV4.ak((short)1);
                ffV3 = ffV4;
                by = 15;
            } else {
                object = bgy2.dnP().B(fqr_02.LV());
                by = ((Optional)object).map(ffV2 -> {
                    ffS ffS2 = bgy2.dmL().tz(ffV2.LV());
                    return ffS2 != null ? (byte)ffS2.aJr() : (byte)-1;
                }).orElse((byte)-1);
                ffV3 = ((Optional)object).orElse(null);
            }
            if (ffV3 == null) {
                gxs.error((Object)("impossible de retrouver l'item d'id " + fqr_02.LV() + " suppos\u00e9 plac\u00e9 dans les mains du personnage"));
                return;
            }
            if (!ffV3.apo()) {
                return;
            }
            if (by < 0) {
                return;
            }
            object = new dbm();
            ((dbm)object).j(ffV3, by);
            ((ama_1)object).lK(16492);
            aaw_1.bUq().h((aam_2)object);
        }
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

