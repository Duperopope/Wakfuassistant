/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cRK
 */
public abstract class crk_2
implements adi_1,
adp_0 {
    protected faz_0 mgp;

    public void c(faz_0 faz_02) {
        this.mgp = faz_02;
        bRb.kYS.b(faz_02);
    }

    public faz_0 eAj() {
        return this.mgp;
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            fyw_0.gqw().tc("wakfu.havenWorld");
        }
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (!bl) {
            fyw_0.gqw().d("wakfu.havenWorld", cex_2.class);
        }
    }

    public abstract fas_0 eMN();
}

