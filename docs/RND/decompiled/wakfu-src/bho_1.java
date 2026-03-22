/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bHO
 */
public class bho_1
extends bhq_2 {
    public bho_1(long l, long l2) {
        super(l, l2, () -> {});
    }

    public bho_1(long l, long l2, bhl_1 bhl_12) {
        super(l, l2, bhl_12::dVf);
    }

    @Override
    public bhh_1 dWS() {
        return bhh_1.kcu;
    }

    @Override
    public void b(fiu_0 fiu_02) {
        if (!this.isValid()) {
            this.c(fiu_02);
            return;
        }
        fiu_02.tL(this.kcI);
        fiu_02.tM(this.kcJ);
    }

    @Override
    protected void c(fiu_0 fiu_02) {
        fiu_02.tL(-1L).tM(-1L);
    }

    @Override
    public String dDG() {
        if (this.dWV() && this.dWW()) {
            if (this.kcI == this.kcJ) {
                return this.kcI + " $";
            }
            return this.kcI + " - " + this.kcJ + " $";
        }
        if (this.dWV()) {
            return "\u2265 " + this.kcI + " $";
        }
        return "\u2264 " + this.kcJ + " $";
    }
}

