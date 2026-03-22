/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
package com.ankamagames.wakfu.client.console.command.climate;

import java.util.ArrayList;
import org.apache.log4j.Logger;

public class WindCommand
implements aQm {
    protected static final Logger guP = Logger.getLogger(WindCommand.class);

    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        try {
            int n = 2;
            if (!arrayList.get(2).equalsIgnoreCase("start")) {
                aqh_0.cBI().jI("Arguments incorrects");
            }
        }
        catch (Exception exception) {
            aqh_0.cBI().jI("Probl\u00e8me lors de l'execution de la commande : " + exception.toString());
        }
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

