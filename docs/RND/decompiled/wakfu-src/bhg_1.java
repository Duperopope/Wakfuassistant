/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bHG
 */
public class bhg_1
extends bhi_1 {
    private final fja kcm;
    @Nullable
    private final fja kcn;
    @Nullable
    private final Integer kco;

    public bhg_1(fja fja2, @Nullable Integer n, Runnable runnable) {
        super(runnable);
        this.kcm = fja2;
        this.kcn = fja.swa.get((Object)this.kcm);
        this.kco = n;
    }

    @Override
    public bhh_1 dWS() {
        return bhh_1.kcz;
    }

    @Override
    public void b(fiu_0 fiu_02) {
        fiP fiP2 = (fiP)fiu_02;
        this.c(fiu_02);
        if (this.isValid()) {
            boolean bl = this.kcn != null && bhz_2.dWn().dWo().dVm();
            fiP2.gag().put(bl ? this.kcn : this.kcm, this.kco);
        }
    }

    @Override
    public void c(fiu_0 fiu_02) {
        fiP fiP2 = (fiP)fiu_02;
        fiP2.gag().remove((Object)this.kcm);
        if (this.kcn != null) {
            fiP2.gag().remove((Object)this.kcn);
        }
    }

    @Override
    public boolean isValid() {
        return this.kco != null;
    }

    @Override
    public String dDG() {
        return "\u2265 " + this.kco + " " + bha_1.b(this.kcm);
    }

    @Override
    public int dWT() {
        return this.kcm.d();
    }
}

