/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.debug;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class FloodChatCommand
implements aQm {
    private long eCL;

    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        if (arrayList.size() != 3) {
            return;
        }
        ArrayList<String> arrayList2 = new ArrayList<String>();
        for (Field field : aua_0.class.getDeclaredFields()) {
            try {
                if (field.getType() != String.class) continue;
                arrayList2.add(aum_0.cWf().c((String)field.get(aum_0.cWf()), new Object[0]));
            }
            catch (IllegalAccessException illegalAccessException) {
                // empty catch block
            }
        }
        Runnable runnable = () -> {
            String string = (String)arrayList2.get(GC.mR(arrayList2.size()));
            aPh.czg().iZ(string);
        };
        this.eCL = Long.parseLong(arrayList.get(2));
        int n = 0;
        while ((long)n < this.eCL) {
            abg_2.bUP().a(runnable, n, 1);
            ++n;
        }
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

