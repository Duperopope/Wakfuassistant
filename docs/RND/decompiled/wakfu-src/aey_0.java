/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aeY
 */
class aey_0
implements afg {
    final /* synthetic */ aex_0 cpk;

    aey_0(aex_0 aex_02) {
        this.cpk = aex_02;
    }

    @Override
    public void d(afh afh2, aeb_1 aeb_12) {
        if (!this.cpk.cpc.contains((Object)afh2) || this.cpk.cpd.get((Object)afh2) == aeb_12) {
            return;
        }
        if (aeb_12.isInitialized()) {
            this.cpk.a(afh2, aeb_12);
        } else {
            aeb_12.a(this.cpk.a(afh2));
        }
    }

    @Override
    public void e(afh afh2, aeb_1 aeb_12) {
        if (!this.cpk.cpc.contains((Object)afh2) || this.cpk.cpd.get((Object)afh2) != aeb_12) {
            return;
        }
        this.cpk.b(afh2, aeb_12);
    }
}

