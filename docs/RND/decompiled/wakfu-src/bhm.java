/*
 * Decompiled with CFR 0.152.
 */
final class bhm
extends eyj_0 {
    private final rf_1 ige;
    final /* synthetic */ bgt_0 igf;

    bhm(bgt_0 bgt_02, rf_1 rf_12) {
        this.igf = bgt_02;
        this.ige = rf_12;
        this.ige.DM().a(this);
    }

    @Override
    public void zl() {
        this.ige.clear();
        this.ige.SY = fek_0.a((feh_0)this.igf.a(fez_0.seq));
    }

    @Override
    public void zm() {
        if (this.ige.SY != null) {
            fek_0.a((feh_0)this.igf.a(fez_0.seq), this.ige.SY, bgt_0.l(this.igf));
        }
    }

    public String toString() {
        return "LocalPlayerCharacterPartInventories{m_part=" + String.valueOf(this.ige) + "} ";
    }
}

