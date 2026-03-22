/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.debug;

import java.util.ArrayList;
import java.util.Arrays;

public class DisplayDottedLinesCommand
implements aQm {
    public final String gvj = "help";
    public final String gvk = "on";
    public final String gvl = "off";
    public final String[] gvm = new String[]{"on", "off", "help"};

    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        if (arrayList.size() < 3) {
            this.cDA();
            return;
        }
        String string = arrayList.get(2);
        if (string == null || Arrays.stream(this.gvm).noneMatch(string2 -> string2.equals(string))) {
            aqh_0.cBI().jI(String.format("Invalid argument provided : %s. Help displayed bellow :", string));
            this.cDA();
            return;
        }
        switch (string) {
            case "help": {
                this.cDA();
                break;
            }
            case "on": {
                aKb.ex(true);
                aqh_0.cBI().jF("Dotted lines are enabled for future draw of Tactical mode.");
                break;
            }
            case "off": {
                aKb.ex(false);
                aqh_0.cBI().jF("Dotted lines are disabled for future draw of Tactical mode.");
                break;
            }
            default: {
                aqh_0.cBI().jI(String.format("Unsupported argument provided : %s! Please notify developer to add support of arg provided or remove arg from arguments allowed", string));
            }
        }
    }

    public void cDA() {
        aqh_0.cBI().jF(String.format("Help :%nAllow to manage display of dotted lines in SemiTactical and Tactical Mode. Options are : %s", Arrays.toString(this.gvm)));
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

