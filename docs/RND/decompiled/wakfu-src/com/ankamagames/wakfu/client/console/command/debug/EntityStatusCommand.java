/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.debug;

import java.util.ArrayList;

public class EntityStatusCommand
implements aQm {
    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        StringBuilder stringBuilder = new StringBuilder("Status de WakfuGameEntity :");
        try {
            stringBuilder.append('\n').append("Connect\u00e9 : ").append(aue_0.cVJ().etu().bSr());
        }
        catch (Exception exception) {
            // empty catch block
        }
        stringBuilder.append('\n').append("Frames : ");
        for (aao_2 aao_22 : aue_0.cVJ().bSl()) {
            stringBuilder.append('\n').append(" - ").append(aao_22.getClass().getSimpleName());
        }
        aqh_0.cBI().jG(stringBuilder.toString());
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

