/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cRH
 */
public class crh_2
extends aly_2 {
    private static final crh_2 nox = new crh_2();
    private boolean hNy;

    public static crh_2 eML() {
        return nox;
    }

    @Override
    protected alz_2 bCk() {
        return new crg_2();
    }

    @Override
    protected void a(alz_2 alz_22, boolean bl, boolean bl2) {
        if (!this.hNy) {
            this.hNy = true;
            fse_1.gFu().f("progress.task.intro", bl);
            fse_1.gFu().f("progress.task.background.visible", bl2);
            long l = 8192L;
            if (!bl) {
                l |= 0x100L;
            }
            ccj_2.g("progressDialog", l);
        }
    }

    @Override
    protected void a(alz_2 alz_22) {
        if (this.hNy) {
            this.hNy = false;
            fse_1.gFu().f("progress.task.intro", false);
            fyw_0.gqw().tl("progressDialog");
        }
    }

    public boolean bhl() {
        return this.hNy;
    }
}

