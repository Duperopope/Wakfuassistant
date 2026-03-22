/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Iterator;

public class fdn
extends fdz_0 {
    public static final short rVH = 0;
    public static final short rVI = 1;
    public static final short rVJ = 2;
    private final int rVK;
    private final long rVL;
    private final int rVM;
    private final int rVN;
    private final int rVO;
    private final int rVP;
    private final ArrayList<enk_0> rVQ = new ArrayList();

    public fdn(int n, int n2, long l, int n3, int n4, int n5, int n6) {
        super(n, 0, eIx.qwB, 0);
        this.rVK = n2;
        this.rVL = l;
        this.rVM = n3;
        this.rVN = n4;
        this.rVO = n5;
        this.rVP = n6;
    }

    public int cmA() {
        return this.rVK;
    }

    public long fTr() {
        return this.rVL;
    }

    public boolean fTs() {
        return this.rVL >= 0L;
    }

    public int cmC() {
        return this.rVM;
    }

    public int cmD() {
        return this.rVN;
    }

    public int cmE() {
        return this.rVO;
    }

    public int cmF() {
        return this.rVP;
    }

    public void v(enk_0 enk_02) {
        this.rVQ.add(enk_02);
    }

    public Iterator<enk_0> fTt() {
        return this.rVQ.iterator();
    }
}

