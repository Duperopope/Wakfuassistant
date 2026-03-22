/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bHJ
 */
public class bhj_2
extends bhi_1 {
    private final bEO kcE;

    public bhj_2(bEO bEO2, Runnable runnable) {
        super(runnable);
        this.kcE = bEO2;
    }

    @Override
    public bhh_1 dWS() {
        return bhh_1.kcA;
    }

    @Override
    public void b(fiu_0 fiu_02) {
        if (this.kcE.bqr()) {
            fiu_02.gap().add(this.kcE.dGh().aIi());
        } else {
            this.c(fiu_02);
        }
    }

    @Override
    protected void c(fiu_0 fiu_02) {
        this.kcE.l(bEO2 -> fiu_02.gap().remove(bEO2.dGh().aIi()));
    }

    @Override
    public boolean isValid() {
        return this.kcE.dSM() && !this.kcE.dSN();
    }

    @Override
    public String dDG() {
        return this.kcE.getName();
    }

    @Override
    public int dWT() {
        return this.kcE.dGh().cqd();
    }

    public fhy_0 dGh() {
        return this.kcE.dGh();
    }
}

