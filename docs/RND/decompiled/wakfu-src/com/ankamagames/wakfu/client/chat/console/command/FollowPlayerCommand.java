/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.chat.console.command;

import java.util.ArrayList;

public class FollowPlayerCommand
implements aQm {
    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        String string = arrayList.get(2).replaceAll("\"", "");
        bgy bgy2 = bgg_0.dlO().lI(string);
        if (!(bgy2 instanceof bhJ)) {
            return;
        }
        if (bgy2.Xi() == bbs_2.xl()) {
            return;
        }
        bhJ bhJ2 = (bhJ)bgy2;
        if (bhJ2.ddI().isVisible() && dcJ.aI((bhJ)bgy2)) {
            dcJ.fce().fg(bhJ2.Sn());
            aue_0.cVJ().a(dcJ.fce());
        }
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

