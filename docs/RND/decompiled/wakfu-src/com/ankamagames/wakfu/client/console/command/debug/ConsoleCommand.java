/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.debug;

import java.util.ArrayList;

public class ConsoleCommand
implements aQm {
    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        aUQ aUQ2 = aue_0.cVJ().cVO();
        if (aUQ2 != null && !evm_2.c(aUQ2.cWq(), evm_2.osZ)) {
            aRD.a(arg_0.eLr);
            if (fyw_0.gqw().to("consoleDialog")) {
                fyw_0.gqw().tl("consoleDialog");
            } else {
                ccj_2.g("consoleDialog", 49152L);
            }
        }
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

