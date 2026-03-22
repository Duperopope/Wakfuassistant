/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
package com.ankamagames.wakfu.client.console.command.commonIn;

import java.util.ArrayList;
import org.apache.log4j.Logger;

public class MenuCommand
implements aQm {
    protected static final Logger guT = Logger.getLogger(MenuCommand.class);

    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        if (!aue_0.cVJ().c(cwq_2.eVS())) {
            aue_0.cVJ().a(cwq_2.eVS());
        } else {
            aue_0.cVJ().b(cwq_2.eVS());
        }
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

