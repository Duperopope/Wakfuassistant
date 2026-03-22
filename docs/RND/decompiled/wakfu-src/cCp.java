/*
 * Decompiled with CFR 0.152.
 */
public class cCp
implements cCk {
    public static final byte mzB = 2;
    private cCq mzC;
    private short epZ = (short)-1;
    private short eqa = (short)-1;

    public cCp() {
    }

    public cCp(cCq cCq2, short s, short s2) {
        this.mzC = cCq2;
        this.epZ = s;
        this.eqa = s2;
    }

    public cCq eJt() {
        return this.mzC;
    }

    public void a(cCq cCq2) {
        this.mzC = cCq2;
    }

    public short ctB() {
        return this.epZ;
    }

    public void cI(short s) {
        this.epZ = s;
    }

    public short ctC() {
        return this.eqa;
    }

    public void cJ(short s) {
        this.eqa = s;
    }

    @Override
    public boolean c(cCs cCs2) {
        if (cCs2.eJm() != 2) {
            return false;
        }
        cCr cCr2 = (cCr)cCs2;
        if (cCr2.eJv() != this.mzC) {
            return false;
        }
        if (this.epZ != -1 && cCr2.bgK() < this.epZ) {
            return false;
        }
        return this.eqa == -1 || cCr2.bgK() <= this.eqa;
    }

    @Override
    public void a(apl_1 apl_12) {
        this.mzC = cCq.dX(apl_12.aIy());
        this.epZ = apl_12.aIz();
        this.eqa = apl_12.aIz();
    }

    @Override
    public void b(fs_0 fs_02) {
        fs_02.g(this.mzC.mzI);
        fs_02.k(this.epZ);
        fs_02.k(this.eqa);
    }

    @Override
    public byte eIT() {
        return 2;
    }

    @Override
    public cCk eJk() {
        return new cCp(this.mzC, this.epZ, this.eqa);
    }

    public /* synthetic */ Object clone() {
        return this.eJk();
    }
}

