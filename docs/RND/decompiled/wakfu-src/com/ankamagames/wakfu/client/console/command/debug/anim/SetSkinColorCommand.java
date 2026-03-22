/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 */
package com.ankamagames.wakfu.client.console.command.debug.anim;

import com.ankamagames.framework.graphics.engine.Anm2.Anm;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.log4j.Logger;

public class SetSkinColorCommand
implements aQm {
    private static final Logger gww = Logger.getLogger(SetSkinColorCommand.class);
    private static final TIntObjectHashMap<float[]> gwx = new TIntObjectHashMap();

    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        Object[] objectArray;
        float[] fArray;
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        int n = arrayList.size();
        if (n != 3 && n != 4) {
            return;
        }
        if (bgt_02 == null) {
            aqh_0.cBI().jI("pas de localPlayer");
            return;
        }
        bdj_2 bdj_22 = bgt_02.ddI();
        String string = arrayList.get(2);
        int n2 = Anm.fO(string);
        if (n2 == 0) {
            return;
        }
        boolean bl = false;
        if (arrayList.get(3) == null) {
            fArray = (float[])gwx.remove(n2);
            bl = true;
        } else {
            objectArray = arrayList.get(3).split("\\s+");
            float f2 = Float.parseFloat(objectArray[0]);
            float f3 = Float.parseFloat(objectArray[1]);
            float f4 = Float.parseFloat(objectArray[2]);
            float f5 = objectArray.length == 4 ? Float.parseFloat(objectArray[3]) : 1.0f;
            fArray = new float[]{f2 * f5, f3 * f5, f4 * f5, f5};
        }
        objectArray = bdj_22.qU(n2);
        bdj_22.a(n2, fArray);
        if (!gwx.contains(n2) && objectArray != null && !bl) {
            gwx.put(n2, (Object)objectArray);
        }
        bdj_22.bpC();
    }

    @Override
    public boolean cAW() {
        return false;
    }

    public static void main(String[] stringArray) {
        Pattern pattern = Pattern.compile("(setSkinColor)\\s+([\\w\\-]+)\\s*((?:[0-1](?:\\.[0-9]+)?\\s*){3,4})?");
        Matcher matcher = pattern.matcher("setSkinColor Cheveux 1.0");
        if (matcher.matches()) {
            matcher.reset();
            ArrayList arrayList = new ArrayList();
            while (matcher.find()) {
                for (int i = 0; i <= matcher.groupCount(); ++i) {
                    if (i == 3) {
                        String[] stringArray2 = matcher.group(3).split("\\s+");
                        for (int j = 0; j < stringArray2.length; ++j) {
                            System.out.println(stringArray2[j]);
                        }
                        continue;
                    }
                    System.out.println(matcher.group(i));
                }
            }
        }
    }
}

