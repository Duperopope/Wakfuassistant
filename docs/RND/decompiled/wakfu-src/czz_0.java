/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from czz
 */
public final class czz_0
implements aaq_2<cok_0> {
    @Override
    public boolean a(cok_0 cok_02) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        eyp_1 eyp_12 = bgt_02.dnQ().dKL();
        exz_1 exz_12 = eyp_12.rw(cok_02.aXb());
        if (exz_12 == null) {
            return false;
        }
        String string = aum_0.cWf().a(62, (long)cok_02.apw(), new Object[0]);
        String string2 = cok_02.ewA() ? aum_0.cWf().c("chat.notify.questShareAccepted", exz_12.getName(), string) : aum_0.cWf().c("chat.notify.questShareRefused", exz_12.getName(), string);
        aPh.czg().iZ(string2);
        return false;
    }

    @Override
    public int bkq() {
        return 12872;
    }
}

