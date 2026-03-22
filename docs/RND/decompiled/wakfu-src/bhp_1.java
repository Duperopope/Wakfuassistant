/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bHP
 */
public class bhp_1
extends bhq_2 {
    public bhp_1(long l, long l2) {
        super(l, l2, () -> {});
    }

    public bhp_1(long l, long l2, bhl_1 bhl_12) {
        super(l, l2, bhl_12::dVg);
    }

    @Override
    public bhh_1 dWS() {
        return bhh_1.kcw;
    }

    @Override
    public void b(fiu_0 fiu_02) {
        if (!this.isValid()) {
            this.c(fiu_02);
            return;
        }
        fiu_02.Wk((int)this.kcI);
        fiu_02.Wl((int)this.kcJ);
    }

    @Override
    protected void c(fiu_0 fiu_02) {
        fiu_02.Wk(-1).Wl(-1);
    }

    @Override
    public String dDG() {
        if (this.dWV() && this.dWW()) {
            if (this.kcI == this.kcJ) {
                return String.valueOf(this.kcI);
            }
            return this.kcI + " - " + this.kcJ;
        }
        if (this.dWV()) {
            return "\u2265 " + this.kcI;
        }
        return "\u2264 " + this.kcJ;
    }
}

