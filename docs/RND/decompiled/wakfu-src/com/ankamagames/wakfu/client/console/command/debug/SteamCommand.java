/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.debug;

import java.util.ArrayList;

public class SteamCommand
implements aQm {
    private static final String gwf = "help";
    private static final String gwg = "resetUserStats";

    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        if (arrayList.size() == 3) {
            String string = arrayList.get(2);
            if (string.equals(gwf)) {
                this.cBS();
            } else if (string.equals(gwg)) {
                this.cUc();
            }
        }
    }

    private void cUc() {
        bMX bMX2 = bMX.kAi;
        if (!bMX2.blc()) {
            return;
        }
        if (bMX2.efk()) {
            aqh_0.cBI().jF("Stats r\u00e9initialis\u00e9es");
        } else {
            aqh_0.cBI().jI("Probl\u00e8me \u00e0 la r\u00e9initialisation des stats");
        }
    }

    private void cBS() {
        aqh_0.cBI().jF("steam help : ce message");
        aqh_0.cBI().jF("steam resetUserStats : remet \u00e0 zero toutes les stats du joueur");
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

