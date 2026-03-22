/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.common;

import java.util.ArrayList;

public class BindCommand
implements aQm {
    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        if (arrayList.get(2) == null) {
            return;
        }
        bbf_0 bbf_02 = bbl_0.hBr.lm(arrayList.get(2));
        if (bbf_02 != null) {
            bbf_02.dai();
            return;
        }
        daw daw2 = new daw();
        daw2.co(BindCommand.jW(arrayList.get(2)));
        aaw_1.bUq().h(daw2);
    }

    private static String jW(String string) {
        if (string.startsWith("/")) {
            return string;
        }
        apr_0 apr_02 = aPt.cAg().cAl();
        if (apr_02 != null && apr_02.czW() != null) {
            return apr_02.czW().cyL() + " " + string;
        }
        return aPb.iE(aPa.evq.cyR()).cBl() + " " + string;
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

