/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.debug;

import com.ankamagames.framework.graphics.engine.entity.Entity;
import java.util.ArrayList;

public class HideEntitiesCommand
implements aQm {
    public static int gvE = 0;
    public static final int gvF = 1;
    public static final int gvG = 2;
    public static final int gvH = 4;

    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        int n = 0;
        if (!arrayList.isEmpty()) {
            n = gvE;
            for (String string : arrayList.get(0).split(" ")) {
                n = HideEntitiesCommand.d(n, string);
            }
        }
        Entity.cWZ = (gvE = n) == 0 ? null : this.cTY();
        this.cTX();
    }

    private void cTX() {
        if (gvE == 0) {
            aqh_0.cBI().jG("Tout visible");
            return;
        }
        Object object = "";
        if ((gvE & 1) == 1) {
            object = (String)object + "mobs ";
        }
        if ((gvE & 2) == 2) {
            object = (String)object + "joueurs ";
        }
        if ((gvE & 4) == 4) {
            object = (String)object + "localPlayer ";
        }
        aqh_0.cBI().jG("masqu\u00e9: " + (String)object);
    }

    private static int d(int n, String string) {
        if (string.equals("npc")) {
            return n ^ 1;
        }
        if (string.equals("players")) {
            return n ^ 2;
        }
        if (string.equals("local")) {
            return n ^ 4;
        }
        if (string.equals("0")) {
            return 0;
        }
        return n;
    }

    private ase_2 cTY() {
        return new aTS(this);
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

