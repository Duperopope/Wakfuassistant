/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.THashMap
 *  org.apache.log4j.Logger
 */
package com.ankamagames.wakfu.client.console.command.debug;

import gnu.trove.map.hash.THashMap;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class ShaderCommand
implements aQm {
    private static final Logger gwd = Logger.getLogger(ShaderCommand.class);
    private static final THashMap<String, abW> gwe = new THashMap();

    private static String cgO() {
        try {
            return auc_0.cVq().bS("shadersPath");
        }
        catch (fu_0 fu_02) {
            gwd.error((Object)"", (Throwable)fu_02);
            return "";
        }
    }

    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        if (arrayList.size() == 3) {
            String string = arrayList.get(2);
            abW abW2 = (abW)gwe.get((Object)string);
            if (abW2 == null) {
                abW2 = new abW(ShaderCommand.cgO() + string + ".cgfx", "test");
                abW2.b(aie_0.cfn().bmC().bqL());
                abW2.bX(true);
                abW2.a(new abX(4000));
                gwe.put((Object)string, (Object)abW2);
                ast_1.bJG().a(abW2);
            } else {
                abW2.rz(500);
                gwe.remove((Object)string);
            }
        }
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

