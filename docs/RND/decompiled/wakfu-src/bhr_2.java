/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bHR
 */
public class bhr_2
extends bhi_1 {
    private final bil_1 kcK;

    public bhr_2(bil_1 bil_12, Runnable runnable) {
        super(runnable);
        this.kcK = bil_12;
    }

    @Override
    public bhh_1 dWS() {
        return bhh_1.kcr;
    }

    @Override
    public void b(fiu_0 fiu_02) {
        fiu_02.gau().add(this.kcK.dxF());
    }

    @Override
    protected void c(fiu_0 fiu_02) {
        fiu_02.gau().remove(this.kcK.dxF());
    }

    @Override
    public boolean isValid() {
        return this.kcK != null;
    }

    @Override
    public String dDG() {
        return this.kcK.getName();
    }

    @Override
    public int dWT() {
        return this.kcK.dxF().fWK();
    }

    public fgj dwg() {
        return this.kcK.dxF();
    }
}

