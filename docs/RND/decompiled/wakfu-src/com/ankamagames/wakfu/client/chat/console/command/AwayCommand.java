/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.chat.console.command;

import java.util.ArrayList;

public class AwayCommand
implements aQm {
    public static boolean eAb = false;
    public static String eAc = "";

    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        if (!eAb && arrayList.get(2) == null) {
            aPd.e("command.error.away", new Object[0]);
            return;
        }
        if (eAb ^= true) {
            String string = arrayList.get(2);
            eAc = string.isEmpty() ? "" : string;
            aPd.f("command.away.enabled", new Object[0]);
        } else {
            eAc = "";
            aPd.f("command.away.disabled", new Object[0]);
        }
        AwayCommand.cAX();
    }

    private static void cAX() {
        cnV cnV2 = new cnV(eAb);
        aue_0.cVJ().etu().d(cnV2);
    }

    public static void cAY() {
        if (eAb) {
            eAb = false;
            eAc = "";
            AwayCommand.cAX();
            aPd.f("command.away.disabled", new Object[0]);
        }
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

