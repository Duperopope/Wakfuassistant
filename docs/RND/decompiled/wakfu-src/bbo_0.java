/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bbO
 */
public class bbo_0
extends bbi_0 {
    public bbo_0(int n, String string) {
        super(n, string);
        this.fj(true);
        this.hBe = false;
    }

    @Override
    @NotNull
    public String getName() {
        VI vI = VI.pX(this.d());
        return aum_0.cWf().c(vI.name(), new Object[0]);
    }

    @Override
    @NotNull
    public String dah() {
        VI vI = VI.pX(this.d());
        return aum_0.cWf().d(vI.name(), new Object[0]);
    }

    @Override
    public String bkG() {
        VI vI = VI.pX(this.d());
        return vI.bkH();
    }

    @Override
    public String byf() {
        return auc_0.cVq().zJ(this.hBf);
    }
}

