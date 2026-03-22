/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
package com.ankamagames.wakfu.client.console.command.commonIn;

import java.util.ArrayList;
import org.apache.log4j.Logger;

public class GetPrivateContactCommand
implements aQm {
    private static final Logger guS = Logger.getLogger(GetPrivateContactCommand.class);

    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        if (arrayList.get(2) != null && arrayList.get(2).length() > 0) {
            GetPrivateContactCommand.eR(arrayList.get(2).charAt(0) == '1');
        }
    }

    public static void eR(boolean bl) {
        String string = aPh.czg().eA(bl);
        if (string != null && string.length() > 0) {
            int n = aPt.cAg().cAl().czm();
            String string2 = cza_2.NL(n);
            fdu_1 fdu_12 = (fdu_1)fyw_0.gqw().gqC().uR(string2).uH((n == 0 ? "textEditorRenderableContainer." : "") + "chatInput");
            if (fdu_12 == null) {
                return;
            }
            apn_0 apn_02 = aPt.cAg().cAl().czW();
            apn_02.c("input", (Object)("/w \"" + string + "\" "));
            fse_1.gFu().a((aef_2)apn_02, "input");
            if (!fdu_12.equals(fhw_2.gAL().gAM())) {
                fhw_2.gAL().s(fdu_12);
            }
        }
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

