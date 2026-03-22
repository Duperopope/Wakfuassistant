/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 *  org.apache.log4j.Logger
 */
package com.ankamagames.wakfu.client.console.command.climate;

import gnu.trove.list.array.TIntArrayList;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class TemperatureCommand
implements aQm {
    protected static final Logger guM = Logger.getLogger(TemperatureCommand.class);
    private static final TIntArrayList guN = new TIntArrayList();
    private static final ArrayList<acf> guO = new ArrayList();

    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        try {
            afV afV2 = aht_0.bBe().bBf();
            int n = 2;
            if (!arrayList.get(2).equalsIgnoreCase("start") && !arrayList.get(2).equalsIgnoreCase("stop")) {
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

