/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.debug;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class HourCommand
implements aQm {
    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        ue_0 ue_02 = ue_0.bjV();
        DecimalFormat decimalFormat = new DecimalFormat("00");
        ux_0 ux_02 = ue_02.bjc();
        String string = ue_02.bjn().getName() + ", " + decimalFormat.format(ux_02.bjD()) + "/" + decimalFormat.format(ux_02.bjG()) + "/" + ux_02.bjI() + " " + decimalFormat.format(ux_02.bjE()) + ":" + decimalFormat.format(ux_02.bjF());
        aqh_0.cBI().jG(string);
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

