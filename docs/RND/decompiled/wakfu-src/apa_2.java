/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from apA
 */
public class apa_2
implements api_2 {
    private String cOg;
    private int Yk = -1;

    public String toString() {
        return "[Comment] " + this.cOg;
    }

    @Override
    public String bEU() {
        return this.cOg;
    }

    void fv(String string) {
        this.cOg = string;
    }

    @Override
    public int bES() {
        return 0;
    }

    void tr(int n) {
        this.Yk = n;
    }

    @Override
    public int wp() {
        return this.Yk;
    }

    @Override
    public apn_2 bET() {
        return null;
    }

    @Override
    public int bER() {
        return 0;
    }

    @Override
    public String bEQ() {
        return null;
    }
}

