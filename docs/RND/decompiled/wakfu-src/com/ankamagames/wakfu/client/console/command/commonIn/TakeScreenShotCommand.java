/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
package com.ankamagames.wakfu.client.console.command.commonIn;

import com.ankamagames.wakfu.client.WakfuClient;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class TakeScreenShotCommand
implements aQm {
    public static final Logger guU = Logger.getLogger(TakeScreenShotCommand.class);
    private static final String guV = ".png";

    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        aTP aTP2 = new aTP();
        try {
            if (!this.a(aTP2)) {
                aTP2.a(new RuntimeException("Internal error"));
                return;
            }
        }
        catch (IOException iOException) {
            aTP2.a(iOException);
            return;
        }
        boolean bl = aie_0.cfn().bmE().a(aTP2);
        if (!bl) {
            guU.error((Object)"Impossible de faire une requ\u00eate de screenShot aupr\u00e8s du Renderer");
        }
    }

    private boolean a(aTP aTP2) {
        String string = WakfuClient.dSV.cfh();
        File file = new File(string);
        if (!file.exists() && !file.mkdirs()) {
            throw new IOException("Unable to create directory : path=" + string);
        }
        aTP2.dQU = new File(file, System.currentTimeMillis() + guV);
        return aTP2.dQU.createNewFile();
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

