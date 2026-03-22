/*
 * Decompiled with CFR 0.152.
 */
public class aTD
extends aRY {
    private final String eSe;
    private final fud_0 eSf;

    public aTD(String string) {
        this(string, fud_0.thA);
    }

    public aTD(String string, fud_0 fud_02) {
        this.eSe = string;
        this.eSf = fud_02;
    }

    @Override
    public boolean isValid() {
        return this.eSe != null && !this.eSe.isEmpty();
    }

    @Override
    public void bGy() {
        cwj_1.a(this.eSf, fub_0.thi, (Object)this.eSe);
    }
}

