/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bZU
 */
abstract class bzu_2
extends cad_2 {
    private aJq hKs;

    bzu_2() {
    }

    @Override
    public void b(afb_0 afb_02) {
        this.hKs = aJq.a((ZC)afb_02, this.HP(), "blason", "blason_bg");
    }

    @Override
    public void c(afb_0 afb_02) {
        if (this.hKs != null) {
            this.hKs.chD();
            this.hKs = null;
        }
    }

    protected abstract long HP();
}

