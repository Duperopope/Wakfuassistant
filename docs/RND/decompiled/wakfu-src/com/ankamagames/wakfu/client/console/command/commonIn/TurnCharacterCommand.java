/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
package com.ankamagames.wakfu.client.console.command.commonIn;

import java.util.ArrayList;
import org.apache.log4j.Logger;

public class TurnCharacterCommand
implements aQm {
    private static final Logger guW = Logger.getLogger(TurnCharacterCommand.class);
    public static final long guX = 100L;
    public static final long guY = 500L;
    private static long guZ = -1L;

    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        abi_1 abi_12 = null;
        if (!arrayList.isEmpty()) {
            try {
                abi_12 = abi_1.wG(Integer.parseInt(arrayList.get(2)));
            }
            catch (NumberFormatException numberFormatException) {
                guW.error((Object)"Mauvais argument", (Throwable)numberFormatException);
            }
            catch (RuntimeException runtimeException) {
                guW.error((Object)"Exception \u00e0 la r\u00e9cuperation de la direction", (Throwable)runtimeException);
            }
        }
        if (abi_12 == null) {
            return;
        }
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bkb_0 bkb_02 = bgt_02.dps();
        if (bkb_02 != null && bkb_02.dsm() != 1) {
            return;
        }
        if (aue_0.cVJ().c(ctg_1.eQG())) {
            return;
        }
        bsj_0 bsj_02 = bgt_02.dkZ();
        if (bsj_02 != null) {
            if (!TurnCharacterCommand.cTR()) {
                return;
            }
            ceb_2.fightSetDirection(bsj_02, abi_12);
            TurnCharacterCommand.is(100L);
        } else {
            if (!TurnCharacterCommand.cTR()) {
                aue_0.cVJ().cVK().bvp().a(abi_12);
                return;
            }
            aue_0.cVJ().etu().d(new ciJ(abi_12));
            TurnCharacterCommand.is(500L);
        }
    }

    public static void is(long l) {
        guZ = System.currentTimeMillis() + l;
    }

    public static boolean cTR() {
        return System.currentTimeMillis() >= guZ;
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

