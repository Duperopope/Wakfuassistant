/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.debug;

import java.util.ArrayList;

public class AddPlayListDataCommand
implements aQm {
    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        long l = Bw.p(arrayList.get(2));
        long l2 = Bw.p(arrayList.get(3));
        short s = Bw.r(arrayList.get(4));
        adD adD2 = new adD();
        adD2.a(1, l, l2, (byte)100, (short)0, (byte)1, 3);
        adD2.a(2, l, l2, (byte)100, (short)0, (byte)1, 3);
        adD2.au(s);
        adf_0.buP().b(adD2);
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

