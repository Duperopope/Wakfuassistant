/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
package com.ankamagames.wakfu.client.chat.console.command;

import java.util.ArrayList;
import org.apache.log4j.Logger;

public class EmoteCommand
implements aQm {
    protected static final Logger eAe = Logger.getLogger(EmoteCommand.class);
    private final int eAf;

    public EmoteCommand(int n) {
        this.eAf = n;
    }

    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        bgt_0 bgt_02 = bvz_0.dLl();
        if (bgt_02 == null) {
            return;
        }
        boolean bl = bbe_0.hAP.a(this.eAf, bbg_0.hAY);
        if (!bl) {
            eAe.error((Object)("Impossible d'utiliser l'Emote " + this.eAf));
        }
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

