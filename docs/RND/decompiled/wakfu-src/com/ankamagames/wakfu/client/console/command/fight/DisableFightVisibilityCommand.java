/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
package com.ankamagames.wakfu.client.console.command.fight;

import java.util.ArrayList;
import org.apache.log4j.Logger;

public class DisableFightVisibilityCommand
implements aQm {
    protected static final Logger gxv = Logger.getLogger(DisableFightVisibilityCommand.class);

    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        aJP.cig().eu(true);
        aJP.cig().cij();
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

