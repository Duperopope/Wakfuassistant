/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
package com.ankamagames.wakfu.client.console.command.fight;

import java.util.ArrayList;
import org.apache.log4j.Logger;

public class ResetFightCameraCommand
implements aQm {
    protected static final Logger gxD = Logger.getLogger(ResetFightCameraCommand.class);

    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        czn_2.oaQ.reset();
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

