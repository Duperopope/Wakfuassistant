/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.commonIn;

import java.util.ArrayList;

public class UseShortcutItemCommand
implements aQm {
    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        if (arrayList.get(2).length() >= 2) {
            blh_2 blh_22 = cxx_2.eXH().dlG();
            if (blh_22 == null) {
                return;
            }
            byte by = Byte.parseByte("" + arrayList.get(2).charAt(1));
            by = blh_22.cl(by).deO();
            blh_22.a(by, Short.parseShort("" + arrayList.get(2).charAt(0)));
        }
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

