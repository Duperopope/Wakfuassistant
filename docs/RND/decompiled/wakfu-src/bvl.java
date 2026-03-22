/*
 * Decompiled with CFR 0.152.
 */
class bvl
implements ezy_1 {
    final /* synthetic */ bvk jtf;

    bvl(bvk bvk2) {
        this.jtf = bvk2;
    }

    @Override
    public void mx(String string) {
        fse_1.gFu().a((aef_2)this.jtf, "name");
    }

    @Override
    public void dKu() {
        fse_1.gFu().a((aef_2)this.jtf, "blazon");
    }

    @Override
    public void dKv() {
        fse_1.gFu().a((aef_2)this.jtf, "guildDescription");
    }

    @Override
    public void dKw() {
        this.jtf.dKf();
        fse_1.gFu().a((aef_2)this.jtf, "guildMessage");
    }

    @Override
    public void bP(short s) {
        this.dKx();
        bvf.jrC.r(new bvm(this));
        fse_1.gFu().a((aef_2)this.jtf, "canLevelUp", "nextLevelCost", "nextLevelDuration", "guildLevelText");
    }

    @Override
    public void FH(int n) {
        fse_1.gFu().a((aef_2)this.jtf, "currentGuildPoints");
    }

    @Override
    public void FI(int n) {
        fse_1.gFu().a((aef_2)this.jtf, "totalGuildPoints");
    }

    @Override
    public void b(fab fab2) {
        this.jtf.ha(true);
    }

    @Override
    public void c(fab fab2) {
        this.jtf.ha(true);
    }

    @Override
    public void d(fab fab2) {
        this.jtf.ha(true);
    }

    @Override
    public void b(ezz_1 ezz_12) {
        String string = ezz_12.Sn() == aue_0.cVJ().cVK().Sn() ? aum_0.cWf().c("notification.guildJoinText", new Object[0]) : aum_0.cWf().c("notification.guildRecrueText", ezz_12.getName());
        cwy_2.nUc.y(string, 4);
        this.jtf.hb(true);
    }

    @Override
    public void c(ezz_1 ezz_12) {
        if (ezz_12.Sn() != aue_0.cVJ().cVK().Sn()) {
            String string = aum_0.cWf().c("notification.guildQuitText", ezz_12.getName());
            cwy_2.nUc.y(string, 4);
        }
        this.jtf.hb(true);
    }

    @Override
    public void e(ezv_1 ezv_12) {
        this.h(ezv_12);
        this.jtf.c(ezv_12);
    }

    @Override
    public void f(ezv_1 ezv_12) {
        this.h(ezv_12);
        this.i(ezv_12);
    }

    @Override
    public void e(fab fab2) {
        this.jtf.ha(true);
    }

    @Override
    public void d(ezz_1 ezz_12) {
        this.jtf.a(ezz_12);
        this.jtf.ha(true);
    }

    @Override
    public void g(ezv_1 ezv_12) {
        this.h(ezv_12);
        this.jtf.c(ezv_12);
        ezn ezn2 = ezn.Pd(ezv_12.tJ());
        if (ezr.a(ezn2)) {
            return;
        }
        String string = aum_0.cWf().a(138, (long)ezv_12.tJ(), new Object[0]);
        String string2 = aum_0.cWf().c("notification.guildBonusActivatedText", string);
        cwy_2.nUc.y(string2, 4);
        aPd.f("guild.chatBonusActivated", string);
    }

    @Override
    public void FJ(int n) {
        fse_1.gFu().a((aef_2)this.jtf, "currentWeekGuildPoints");
    }

    @Override
    public void FK(int n) {
        fse_1.gFu().a((aef_2)this.jtf, "currentWeekGuildPoints");
    }

    @Override
    public void FL(int n) {
        fse_1.gFu().a((aef_2)this.jtf, "guildMembersThreshold");
    }

    private void h(ezv_1 ezv_12) {
        buT buT2 = bvf.jrC.FD(ezv_12.tJ());
        if (buT2 != null) {
            buT2.dJJ();
        }
        fse_1.gFu().a((aef_2)this.jtf, "canLevelUp", "availableBonuses", "loadingBonuses", "permanentBonuses", "temporaryBonuses", "simultaneousBonusesText");
    }

    private void i(ezv_1 ezv_12) {
        eyr_2 eyr_22 = ezq.prB.Pe(ezv_12.tJ());
        if (!buQ.b(eyr_22)) {
            return;
        }
        buT buT2 = bvf.jrC.FD(ezv_12.tJ());
        if (buT2 == null) {
            return;
        }
        buT2.dJL();
        this.c(eyr_22);
    }

    private void c(eyr_2 eyr_22) {
        String string = aum_0.cWf().a(138, (long)eyr_22.d(), new Object[0]);
        String string2 = aum_0.cWf().c("notification.guildBonusEndText", string);
        cwy_2.nUc.y(string2, 4);
        aPd.f("guild.chatBonusEnd", string);
    }

    private void dKx() {
        fse_1.gFu().a((aef_2)this.jtf, "level", "nextLevel", "nextLevelCost", "canLevelUp");
        String string = aum_0.cWf().c("notification.guildLevelText", this.jtf.dKj());
        cwy_2.nUc.y(string, 4);
        aPd.f("guild.chatLevelGain", this.jtf.dKj());
    }
}

