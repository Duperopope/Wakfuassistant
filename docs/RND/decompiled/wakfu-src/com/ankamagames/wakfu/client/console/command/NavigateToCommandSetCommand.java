/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command;

import java.util.ArrayList;

public class NavigateToCommandSetCommand
implements aQm {
    private final aUd eCj;

    public NavigateToCommandSetCommand(aUd aUd2) {
        this.eCj = aUd2;
    }

    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        aqg_0.cBA().a(this.eCj);
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

