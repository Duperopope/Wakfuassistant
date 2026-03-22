/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from flg
 */
public class flg_0
extends fks_0<wf_1> {
    final /* synthetic */ fld_0 sDQ;

    flg_0(fld_0 fld_02) {
        this.sDQ = fld_02;
    }

    protected wf_1 gcZ() {
        return new wf_1();
    }

    @Override
    protected void a(wf_1 wf_12) {
        this.sDQ.sDA.a(wf_12);
    }

    @Override
    protected void b(wf_1 wf_12) {
        this.sDQ.sDA.clear();
        this.sDQ.sDA.b(wf_12);
    }

    @Override
    protected /* synthetic */ gs_0 gck() {
        return this.gcZ();
    }
}

