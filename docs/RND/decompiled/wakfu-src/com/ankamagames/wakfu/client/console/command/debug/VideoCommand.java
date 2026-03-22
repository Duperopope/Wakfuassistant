/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
package com.ankamagames.wakfu.client.console.command.debug;

import java.util.ArrayList;
import org.apache.log4j.Logger;

public class VideoCommand
implements aQm {
    protected static final Logger gwh = Logger.getLogger(VideoCommand.class);

    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        VideoCommand.cUd();
    }

    public static void cUd() {
        if (aQd.cgp()) {
            return;
        }
        aUQ aUQ2 = aue_0.cVJ().cVO();
        if (aUQ2 != null && !evm_2.c(aUQ2.cWq(), evm_2.osZ)) {
            if (fyw_0.gqw().to("videoDialog")) {
                fyw_0.gqw().tl("videoDialog");
                fyw_0.gqw().tc("wakfu.video");
            } else {
                ccj_2.g("videoDialog", 32768L);
                fyw_0.gqw().d("wakfu.video", chq_1.class);
                gwh.info((Object)"Chargement de l'ui video");
            }
        }
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

