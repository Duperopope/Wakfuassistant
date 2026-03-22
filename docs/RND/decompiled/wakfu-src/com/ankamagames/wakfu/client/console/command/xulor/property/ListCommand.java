/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.xulor.property;

import java.util.ArrayList;

public class ListCommand
implements aQm {
    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        StringBuilder stringBuilder = new StringBuilder("# Liste des propri\u00e9t\u00e9s #");
        fse_1.gFu().ae(new aUj(this, stringBuilder));
        aqh_0.cBI().jG(stringBuilder.toString());
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

