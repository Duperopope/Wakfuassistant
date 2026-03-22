/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
package com.ankamagames.wakfu.client.console.command.debug;

import java.util.ArrayList;
import org.apache.log4j.Logger;

public class FlyingImageCommand
implements aQm {
    protected static final Logger gvo = Logger.getLogger(FlyingImageCommand.class);
    private static Runnable gvp;

    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        if (gvp == null) {
            gvp = new aTR(this);
            abg_2.bUP().a(gvp, 5000L, -1);
        } else {
            abg_2.bUP().h(gvp);
            gvp = null;
        }
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

