/*
 * Decompiled with CFR 0.152.
 */
public class aYw
implements afl {
    private static final aYw hxE = new aYw();

    public static aYw cYq() {
        return hxE;
    }

    @Override
    public String getName() {
        return aum_0.cWf().c("contentLoader.console", new Object[0]);
    }

    public void a(WL wL) {
        aqh_0.cBI().a(aqk_0.cBK());
        fse_1.gFu().f("adminConsole", aqk_0.cBK());
        aqh_0.cBI().a(new aqj_0());
        if (aid_0.dUu == null) {
            throw new RuntimeException("Impossible de trouver la d\u00e9finition des commandes de console.");
        }
        aqg_0.cBA().g(aid_0.dUu);
        aqg_0.cBA().g(aid_0.dUv);
        aqg_0.cBA().cBG().cUl().cUn().ifPresent(aUd2 -> aqg_0.cBA().a((aUd)aUd2));
        wL.b(this);
    }
}

