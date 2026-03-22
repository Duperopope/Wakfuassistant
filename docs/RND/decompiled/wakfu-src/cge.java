/*
 * Decompiled with CFR 0.152.
 */
final class cge
extends ceK<cof, bsi_0> {
    cge() {
    }

    @Override
    public boolean b(cof cof2) {
        bgy bgy2 = bgg_0.dlO().ju(cof2.evP());
        if (bgy2 != null && bgy2.bqo() != -1 && cgj.lTp.lTq.contains(bgy2.bqo())) {
            if (cgj.lTp.lTB.get(bgy2.bqo()) == null) {
                cgj.lTp.lTB.put(bgy2.bqo(), (Object)aVk.a(7, eui_1.rsy.aJr(), 0, bgy2.ddI(), cof2.evt()));
            } else {
                ((aVk)cgj.lTp.lTB.get(bgy2.bqo())).a(bgy2.ddI(), cof2.evt());
            }
            return false;
        }
        return true;
    }
}

