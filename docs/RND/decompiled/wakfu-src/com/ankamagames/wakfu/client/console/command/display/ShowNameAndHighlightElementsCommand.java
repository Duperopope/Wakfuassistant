/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.display;

import java.util.ArrayList;

public class ShowNameAndHighlightElementsCommand
implements aQm {
    private static boolean gxq = false;

    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        boolean bl = gxq = !gxq;
        if (gxq) {
            cxq_1.eWO().eWT();
        } else {
            cxq_1.eWO().eWV();
        }
        ShowNameAndHighlightElementsCommand.cUu();
    }

    private static void cUu() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        boolean bl = bgt_02 == null || bgt_02.djT() ? false : gxq;
        adn_0.bvh().bvk().stream().filter(adj_02 -> {
            bdj_2 bdj_22;
            return !(adj_02 instanceof bdj_2) || !((bdj_22 = (bdj_2)adj_02).dcP() instanceof bhJ);
        }).forEach(adj_02 -> adj_02.bJ(bl));
        afh_0.bxU().bph().forEach(afk_02 -> afk_02.bJ(bl));
        ZM.bqw().bph().stream().filter(zC -> zC instanceof ZH).map(zC -> (ZH)zC).forEach(zH -> zH.bJ(bl));
        bLe.ecw().bph().forEach(bKV2 -> bKV2.bJ(bl));
    }

    public static boolean apo() {
        return gxq;
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

