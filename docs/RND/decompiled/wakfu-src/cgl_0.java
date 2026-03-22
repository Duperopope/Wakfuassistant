/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cgL
 */
class cgl_0
implements aaq_2<cxz_0> {
    cgl_0() {
    }

    @Override
    public boolean a(cxz_0 cxz_02) {
        int n = cxz_02.tJ();
        String string = aum_0.cWf().a(138, (long)n, new Object[0]);
        String string2 = aum_0.cWf().c("notification.guildBonusLearnedText", string);
        cwy_2.nUc.y(string2, 4);
        aPd.f("guild.chatBonusActivated", string);
        return false;
    }

    @Override
    public int bkq() {
        return 15697;
    }
}

