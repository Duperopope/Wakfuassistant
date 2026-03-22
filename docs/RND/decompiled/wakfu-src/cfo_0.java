/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cfO
 */
final class cfo_0
extends ceK<cqi_0, bsj_0> {
    private static final bsT lTg = new bsT();

    cfo_0() {
    }

    public boolean a(cqi_0 cqi_02) {
        long l = cqi_02.aXb();
        byte by = cqi_02.eyP();
        bgy bgy2 = (bgy)((bsj_0)this.jkR).qJ(l);
        if (bgy2 == null) {
            return false;
        }
        String string = null;
        if (by == 0) {
            string = aum_0.cWf().c("fight.disconnection", bgy2.getName());
        } else if (by == 1) {
            string = aum_0.cWf().c("fight.reconnection", bgy2.getName());
        }
        if (string != null) {
            lTg.aq(string);
        }
        return false;
    }

    @Override
    public /* synthetic */ boolean b(aam_2 aam_22) {
        return this.a((cqi_0)aam_22);
    }
}

