/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
package com.ankamagames.wakfu.client.console.command.debug;

import java.util.ArrayList;
import org.apache.log4j.Logger;

public class AddLights
implements aQm {
    private static final Logger gva = Logger.getLogger(AddLights.class);
    final ArrayList<acf> gvb = new ArrayList();

    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        if (arrayList.size() != 3) {
            if (this.gvb.size() != 0) {
                for (int i = 0; i < this.gvb.size(); ++i) {
                    acq_0.cge.rD(this.gvb.get(i).d());
                }
                this.gvb.clear();
            }
            return;
        }
        try {
            int n = Integer.valueOf(arrayList.get(2));
            acd_1 acd_12 = aue_0.cVJ().cVK().aZw();
            for (int i = 0; i < n; ++i) {
                aTQ aTQ2 = new aTQ(new afU(acd_12.getX(), acd_12.getY(), acd_12.bdi()), GC.b(-0.5f, 0.5f), GC.b(-0.5f, 0.5f));
                aTQ2.u(GC.b(0.3f, 0.8f), GC.b(0.3f, 0.8f), GC.b(0.3f, 0.8f));
                aTQ2.setEnabled(true);
                aTQ2.aT(3.0f);
                this.gvb.add(aTQ2);
                acq_0.cge.a(aTQ2);
            }
        }
        catch (Exception exception) {
            gva.error((Object)"", (Throwable)exception);
        }
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

