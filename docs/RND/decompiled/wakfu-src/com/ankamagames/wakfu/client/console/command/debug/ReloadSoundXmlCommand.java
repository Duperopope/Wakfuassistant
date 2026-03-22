/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
package com.ankamagames.wakfu.client.console.command.debug;

import java.util.ArrayList;
import org.apache.log4j.Logger;

public class ReloadSoundXmlCommand
implements aQm {
    protected static final Logger gvY = Logger.getLogger(ReloadSoundXmlCommand.class);

    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        cAY.eHc().eHF();
        try {
            cAY.eHc().eHG();
        }
        catch (Exception exception) {
            aqh_0.cBI().jI("Probl\u00e8me au rechargement des barks");
        }
        try {
            cAY.eHc().eHH();
        }
        catch (Exception exception) {
            aqh_0.cBI().jI("Probl\u00e8me au rechargement des grounds");
        }
        try {
            cAY.eHc().eHI();
        }
        catch (Exception exception) {
            aqh_0.cBI().jI("Probl\u00e8me au rechargement des mounts");
        }
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

