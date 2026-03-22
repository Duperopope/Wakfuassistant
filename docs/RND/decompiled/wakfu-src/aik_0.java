/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aIk
 */
class aik_0
implements afl<aie_0> {
    final /* synthetic */ aie_0 dXn;

    aik_0(aie_0 aie_02) {
        this.dXn = aie_02;
    }

    @Override
    public void a(aie_0 aie_02) {
        this.dXn.cfx();
        aie_02.b(this);
    }

    @Override
    public String getName() {
        return aum_0.cWf().c("contentLoader.game.managers", new Object[0]);
    }
}

