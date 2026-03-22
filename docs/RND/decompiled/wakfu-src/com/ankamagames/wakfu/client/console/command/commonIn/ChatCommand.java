/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.commonIn;

import java.util.ArrayList;

public class ChatCommand
implements aQm {
    public static final String guR = "textEditorRenderableContainer.chatInput";

    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        if (!fhx_2.gAQ().aJG()) {
            return;
        }
        ChatCommand.cTG();
        aPh.czg().eB(true);
    }

    @Override
    public boolean cAW() {
        return false;
    }

    public static void cTG() {
        fhw_2.gAL().s((fes_2)csz_1.ePn().ePo().getElementMap().uH(guR));
    }

    public static void a(fhs_2 fhs_22) {
        fhw_2.gAL().s((fes_2)fhs_22.uH(guR));
    }
}

