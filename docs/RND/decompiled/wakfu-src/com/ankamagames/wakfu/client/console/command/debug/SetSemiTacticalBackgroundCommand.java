/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.debug;

import java.util.ArrayList;
import java.util.Arrays;

public class SetSemiTacticalBackgroundCommand
implements aQm {
    public final String gvZ = "help";
    public final String gwa = "theme";
    public final String gwb = "parallax";
    public final String[] gwc = new String[]{"theme", "parallax", "help"};

    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        if (arrayList.size() < 3) {
            this.cDA();
            return;
        }
        String string = arrayList.get(2);
        if (string == null || Arrays.stream(this.gwc).noneMatch(string2 -> string2.equals(string))) {
            aqh_0.cBI().jI(String.format("Invalid argument provided : %s. Help displayed bellow :", string));
            this.cDA();
            return;
        }
        switch (string) {
            case "help": {
                this.cDA();
                break;
            }
            case "theme": {
                ((bsg_1)aie_0.cfn().bmH()).a((afe)bsn_1.lje, false);
                aqh_0.cBI().jF("Background in SemiTactical use color from theme.");
                break;
            }
            case "parallax": {
                ((bsg_1)aie_0.cfn().bmH()).a((afe)bsn_1.lje, true);
                aqh_0.cBI().jF("Background in SemiTactical use parallax.");
                break;
            }
            default: {
                aqh_0.cBI().jI(String.format("Unsupported argument provided : %s! Please notify developer to add support of arg provided or remove arg from arguments allowed", string));
            }
        }
    }

    public void cDA() {
        aqh_0.cBI().jF(String.format("Help :%nAllow to set background in SemiTactical Mode. Options are : %s", Arrays.toString(this.gwc)));
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

