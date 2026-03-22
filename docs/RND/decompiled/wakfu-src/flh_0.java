/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from flh
 */
public class flh_0
extends fks_0<wi_2> {
    private final Boolean sDR;
    final /* synthetic */ fld_0 sDS;

    flh_0(fld_0 fld_02, Boolean bl) {
        this.sDS = fld_02;
        this.sDR = bl;
    }

    protected wi_2 gda() {
        return new wi_2();
    }

    @Override
    protected void a(wi_2 wi_22) {
        this.sDS.sDz.gdR().a(wi_22, this.sDR);
    }

    @Override
    protected void b(wi_2 wi_22) {
        fna_0 fna_02 = this.sDS.sDz.gdR();
        fna_02.clear();
        fna_02.b(wi_22);
    }

    @Override
    protected /* synthetic */ gs_0 gck() {
        return this.gda();
    }
}

