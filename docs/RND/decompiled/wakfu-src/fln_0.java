/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fln
 */
public class fln_0
extends fks_0<wq_1> {
    final /* synthetic */ fld_0 sDY;

    fln_0(fld_0 fld_02) {
        this.sDY = fld_02;
    }

    protected wq_1 gdb() {
        return new wq_1();
    }

    @Override
    protected void a(wq_1 wq_12) {
        this.sDY.sDx.a(wq_12);
    }

    @Override
    protected void b(wq_1 wq_12) {
        this.sDY.sDx.clear();
        this.sDY.sDx.b(wq_12);
    }

    @Override
    protected /* synthetic */ gs_0 gck() {
        return this.gdb();
    }
}

