/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
package com.ankamagames.wakfu.client.console.command.debug;

import java.util.ArrayList;
import org.apache.log4j.Logger;

public class PlayMusicCommand
implements aQm {
    protected static final Logger gvX = Logger.getLogger(PlayMusicCommand.class);

    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        long l = Bw.p(arrayList.get(2));
        int n = 100;
        if (arrayList.size() > 3 && (n = Bw.m(arrayList.get(3))) == 0) {
            n = 100;
        }
        cAY.eHc().h(l, (float)n / 100.0f);
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

