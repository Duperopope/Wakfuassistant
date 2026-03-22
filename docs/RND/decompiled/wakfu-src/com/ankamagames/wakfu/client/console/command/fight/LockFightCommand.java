/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
package com.ankamagames.wakfu.client.console.command.fight;

import java.util.ArrayList;
import org.apache.log4j.Logger;

public class LockFightCommand
implements aQm {
    protected static final Logger gxA = Logger.getLogger(LockFightCommand.class);

    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        ceg_2.lockFight();
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

