/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
package com.ankamagames.wakfu.client.console.command.debug.anim;

import java.util.ArrayList;
import org.apache.log4j.Logger;

public class AnmDebuggerCommand
implements aQm {
    private static final Logger gwl = Logger.getLogger(AnmDebuggerCommand.class);

    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        AnmDebuggerCommand.cUf();
    }

    @Override
    public boolean cAW() {
        return false;
    }

    public static void cUf() {
        fse_1.gFu().f("debug.anm", aUa.cUg());
        ccj_2.pd("debugAnmDialog");
        fyw_0.gqw().d("wakfu.debugAnm", cek_1.class);
    }
}

