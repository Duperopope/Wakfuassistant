/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.chat.console.command;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class RandCommand
implements aQm {
    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        short s;
        byte by;
        if (aPd.czc()) {
            return;
        }
        if (arrayList.isEmpty()) {
            return;
        }
        if (!Pattern.matches("^\\d{1,4}(d\\d{1,4})?$", arrayList.get(2).trim())) {
            RandCommand.cAZ();
            return;
        }
        String[] stringArray = arrayList.get(2).trim().split("d");
        if (stringArray.length == 1) {
            by = 1;
            s = Short.parseShort(stringArray[0]);
        } else {
            by = Byte.parseByte(stringArray[0]);
            s = Short.parseShort(stringArray[1]);
        }
        if (s > 1000 || by > 20) {
            RandCommand.cAZ();
            return;
        }
        cjb_0 cjb_02 = new cjb_0();
        cjb_02.di(by);
        cjb_02.cz(s);
        aue_0.cVJ().etu().d(cjb_02);
    }

    private static void cAZ() {
        aPd.e("chat.random.error", (byte)20, (short)1000);
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

