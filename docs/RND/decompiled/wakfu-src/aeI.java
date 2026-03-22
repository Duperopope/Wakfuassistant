/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

public class aeI
implements agd_1 {
    private int o;
    private long cnJ;
    private float cnK;
    private boolean cnL;
    private boolean cnM;
    private short cnN;
    private short cnO;
    private float cnP;
    private int cnQ;
    private int cnR;

    public aeI() {
    }

    public aeI(int n, long l, float f2, boolean bl, boolean bl2, short s, short s2, float f3, int n2, int n3) {
        this.o = n;
        this.cnJ = l;
        this.cnK = f2;
        this.cnL = bl;
        this.cnM = bl2;
        this.cnN = s;
        this.cnO = s2;
        this.cnP = f3;
        this.cnQ = n2;
        this.cnR = n3;
    }

    final void l(@NotNull apl_1 apl_12) {
        this.o = apl_12.aIA();
        this.cnJ = apl_12.bFQ();
        this.cnK = apl_12.aIB();
        this.cnL = apl_12.bFS();
        this.cnM = apl_12.bFS();
        this.cnN = apl_12.aIz();
        this.cnO = apl_12.aIz();
        this.cnP = apl_12.aIB();
        this.cnQ = apl_12.aIA();
        this.cnR = apl_12.aIA();
    }

    final void n(@NotNull fs_0 fs_02) {
        fs_02.mz(this.o);
        fs_02.cq(this.cnJ);
        fs_02.b(this.cnK);
        fs_02.ay(this.cnL);
        fs_02.ay(this.cnM);
        fs_02.k(this.cnN);
        fs_02.k(this.cnO);
        fs_02.b(this.cnP);
        fs_02.mz(this.cnQ);
        fs_02.mz(this.cnR);
    }

    @Override
    public int d() {
        return this.o;
    }

    @Override
    public long bwC() {
        return this.cnJ;
    }

    @Override
    public boolean bwD() {
        return this.cnL;
    }

    @Override
    public float bwE() {
        return this.cnK;
    }

    @Override
    public float bwF() {
        return this.cnO;
    }

    @Override
    public int bwG() {
        return this.cnR;
    }

    @Override
    public float bwH() {
        return this.cnP;
    }

    @Override
    public float bwI() {
        return this.cnN;
    }

    @Override
    public int bwJ() {
        return this.cnQ;
    }
}

