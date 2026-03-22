/*
 * Decompiled with CFR 0.152.
 */
public final class bYU {
    private bYU() {
    }

    public static void nT(String string) {
        bYU.a(aum_0.cWf().c("security.account.intervention", new Object[0]), string, biu_1.kix);
        fiq_2.gCw().d(fik_2.gBZ().vE(string).abQ(1));
    }

    public static void epD() {
        bYU.a(aum_0.cWf().c("security.impossible.action", new Object[0]), aum_0.cWf().c("security.impossible.action.account.locked", new Object[0]), biu_1.kix);
    }

    public static void epE() {
        bYU.a(aum_0.cWf().c("security.impossible.trade", new Object[0]), aum_0.cWf().c("security.impossible.trade.target.locked", new Object[0]), biu_1.kiA);
    }

    public static void epF() {
        bYU.a(aum_0.cWf().c("security.impossible.duel", new Object[0]), aum_0.cWf().c("security.impossible.duel.target.locked", new Object[0]), biu_1.kiA);
    }

    public static void epG() {
        bYU.a(aum_0.cWf().c("security.returned.loot.title", new Object[0]), aum_0.cWf().c("security.returned.loot.text", new Object[0]), biu_1.kix);
    }

    private static void a(String string, String string2, biu_1 biu_12) {
        dcd dcd2 = new dcd(string, string2, biu_12);
        aaw_1.bUq().h(dcd2);
    }
}

