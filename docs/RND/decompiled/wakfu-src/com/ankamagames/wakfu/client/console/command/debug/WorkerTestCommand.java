/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
package com.ankamagames.wakfu.client.console.command.debug;

import java.util.ArrayList;
import org.apache.log4j.Logger;

public class WorkerTestCommand
implements aQm {
    protected static final Logger gwi = Logger.getLogger(WorkerTestCommand.class);

    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        abg_2.bUP().a((Runnable)new aTZ(this), 1000L, -1);
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

