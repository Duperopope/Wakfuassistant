/*
 * Decompiled with CFR 0.152.
 */
public class bHR
extends bHI {
    private final bIl kcK;

    public bHR(bIl bIl2, Runnable runnable) {
        super(runnable);
        this.kcK = bIl2;
    }

    @Override
    public bHH dWS() {
        return bHH.kcr;
    }

    @Override
    public void b(fiU fiU2) {
        fiU2.gau().add(this.kcK.dxF());
    }

    @Override
    protected void c(fiU fiU2) {
        fiU2.gau().remove(this.kcK.dxF());
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
