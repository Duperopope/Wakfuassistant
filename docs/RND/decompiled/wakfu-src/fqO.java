/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Map;

public final class fqO {
    private final Map<Byte, Integer> sVL = new HashMap<Byte, Integer>();
    private boolean sVM = false;
    private boolean sVN = false;

    public fqO() {
    }

    public fqO(byte by, byte by2, byte by3) {
        this.g(exx_2.rGj.aJr(), by);
        this.g(exx_2.rGk.aJr(), by2);
        this.g(exx_2.rGl.aJr(), by3);
    }

    public void g(byte by, int n) {
        if (n <= 0) {
            return;
        }
        this.sVL.put(by, n);
    }

    public void h(byte by, int n) {
        this.sVL.put(by, n);
    }

    public int r(exx_2 exx_22) {
        if (exx_22 == null) {
            return 0;
        }
        if (!this.sVL.containsKey(exx_22.aJr())) {
            return 0;
        }
        return this.sVL.get(exx_22.aJr());
    }

    public boolean gjb() {
        return this.sVM;
    }

    public void lX(boolean bl) {
        this.sVM = bl;
    }

    public boolean gjc() {
        return this.sVN;
    }

    public void nS(boolean bl) {
        this.sVN = bl;
    }
}

