/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from flb
 */
class flb_0
extends fks_0<wo_2> {
    final /* synthetic */ fkz_0 sDi;

    flb_0(fkz_0 fkz_02) {
        this.sDi = fkz_02;
    }

    protected wo_2 gcO() {
        return new wo_2();
    }

    @Override
    protected void a(wo_2 wo_22) {
        this.sDi.sDb.a(wo_22);
    }

    @Override
    protected void b(wo_2 wo_22) {
        this.sDi.sDb.b(wo_22);
    }

    @Override
    protected /* synthetic */ gs_0 gck() {
        return this.gcO();
    }
}

