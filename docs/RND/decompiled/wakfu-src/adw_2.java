/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from aDw
 */
public class adw_2 {
    private int atn;
    private adv_2 dDH;
    private adl_1 dDI;

    public adw_2(int n, adv_2 adv_22, adl_1 adl_12) {
        this.atn = n;
        this.dDH = adv_22;
        this.dDI = adl_12;
    }

    public int aHp() {
        return this.atn;
    }

    public void ma(int n) {
        this.atn = n;
    }

    @NotNull
    public adv_2 bYv() {
        return this.dDH;
    }

    public void a(adv_2 adv_22) {
        this.dDH = adv_22;
    }

    @NotNull
    public adl_1 bYw() {
        return this.dDI;
    }

    public void a(adl_1 adl_12) {
        this.dDI = adl_12;
    }
}

