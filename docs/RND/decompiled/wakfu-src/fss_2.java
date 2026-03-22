/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fSs
 */
public abstract class fss_2<T>
extends fsr_2<T> {
    public fss_2() {
    }

    public fss_2(T t, T t2, fes_2 fes_22, int n, int n2, abn abn2) {
        this.bl(t);
        this.bm(t2);
        this.setWidget(fes_22);
        this.sO(n);
        this.setDuration(n2);
        this.setEasing(abn2);
    }

    public void setWidget(fes_2 fes_22) {
        this.ved = fes_22;
    }

    public fes_2 getWidget() {
        return (fes_2)this.ved;
    }
}

