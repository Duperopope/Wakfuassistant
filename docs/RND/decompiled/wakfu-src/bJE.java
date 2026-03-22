/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public class bJE {
    private final int kmi;
    private final acd_1 kmj = new acd_1();
    private final ArrayList<bJC> kmk = new ArrayList();
    private int[] klL;

    public bJE(int n) {
        this.kmi = n;
    }

    public int d() {
        return this.kmi;
    }

    public void a(int n, int n2, short s) {
        this.kmj.Q(n, n2, s);
    }

    public acd_1 eap() {
        return this.kmj;
    }

    public void a(bJC bJC2) {
        this.kmk.add(bJC2);
    }

    public ArrayList<bJC> eaR() {
        return this.kmk;
    }

    public int[] eaq() {
        return this.klL;
    }

    public void D(int[] nArray) {
        this.klL = nArray;
    }
}

