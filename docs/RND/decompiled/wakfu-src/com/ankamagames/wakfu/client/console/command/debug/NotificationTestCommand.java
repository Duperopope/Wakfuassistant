/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
package com.ankamagames.wakfu.client.console.command.debug;

import java.util.ArrayList;
import org.apache.log4j.Logger;

public class NotificationTestCommand
implements aQm {
    protected static final Logger gvW = Logger.getLogger(NotificationTestCommand.class);
    private Runnable bIf;

    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        if (this.bIf == null) {
            this.bIf = new aTY(this);
            abg_2.bUP().a(this.bIf, 5000L, 25);
            aqh_0.cBI().jG("Test started.");
        } else {
            abg_2.bUP().h(this.bIf);
            this.bIf = null;
            aqh_0.cBI().jG("Test stopped.");
        }
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

