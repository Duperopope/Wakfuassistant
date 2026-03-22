/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from bqU
 */
public class bqu_0
implements SH {
    private final int jbC;
    private final short jbD;
    private final ang_2 jbE;
    private final ArrayList<bqq_0> jbF;

    public bqu_0(int n, short s, ang_2 ang_22) {
        this.jbC = n;
        this.jbD = s;
        this.jbE = ang_22;
        this.jbF = new ArrayList();
    }

    public void a(bqq_0 bqq_02) {
        this.jbF.add(bqq_02);
    }

    public ArrayList<bqq_0> aGT() {
        return this.jbF;
    }

    @Override
    public int d() {
        return this.jbC;
    }

    @Override
    public ang_2 bdo() {
        return this.jbE;
    }

    @Override
    public short bdn() {
        return this.jbD;
    }
}

