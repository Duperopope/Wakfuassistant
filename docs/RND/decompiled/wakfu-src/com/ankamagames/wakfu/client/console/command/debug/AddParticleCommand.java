/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
package com.ankamagames.wakfu.client.console.command.debug;

import com.ankamagames.baseImpl.graphics.isometric.particles.CellParticleSystem;
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class AddParticleCommand
implements aQm {
    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        if (arrayList.size() == 3) {
            try {
                boolean bl = false;
                String string = arrayList.get(2);
                if (string.startsWith("@")) {
                    string = string.substring(1);
                    bl = true;
                }
                int n = Integer.valueOf(string);
                if (bl) {
                    FreeParticleSystem freeParticleSystem = agY.bzw().sk(n);
                    bgt_0 bgt_02 = aue_0.cVJ().cVK();
                    freeParticleSystem.a(bgt_02.ddI());
                    agZ.bzy().b(freeParticleSystem);
                } else {
                    CellParticleSystem cellParticleSystem = agY.bzw().sl(n);
                    acd_1 acd_12 = aue_0.cVJ().cVK().aZw();
                    cellParticleSystem.r(acd_12.getX(), acd_12.getY(), acd_12.bdi());
                    agZ.bzy().b(cellParticleSystem);
                }
            }
            catch (Exception exception) {
                Logger.getLogger(AddParticleCommand.class).error((Object)("Impossible d'ajouter la particule " + arrayList.get(1)), (Throwable)exception);
            }
        }
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

