/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
package com.ankamagames.wakfu.client.chat.console.command;

import java.util.ArrayList;
import org.apache.log4j.Logger;

public final class ChatPauseCommand
implements aQm {
    private static final Logger eAd = Logger.getLogger(ChatPauseCommand.class);

    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        apn_0 apn_02;
        apn_02.setPaused(!(apn_02 = aPt.cAg().cAl().czW()).isPaused());
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

