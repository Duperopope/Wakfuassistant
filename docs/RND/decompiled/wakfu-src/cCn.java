/*
 * Decompiled with CFR 0.152.
 */
public class cCn
implements cCk {
    public static final byte mzx = 1;
    private int ena;
    private short epZ = (short)-1;
    private short eqa = (short)-1;

    public cCn() {
    }

    public cCn(int n, short s, short s2) {
        this.ena = n;
        this.epZ = s;
        this.eqa = s2;
    }

    public void Lh(int n) {
        this.ena = n;
    }

    public int cqy() {
        return this.ena;
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
        if (cCs2.eJm() != 1) {
            return false;
        }
        cCo cCo2 = (cCo)cCs2;
        if (cCo2.cqy() != this.ena) {
            return false;
        }
        if (this.epZ != -1 && cCo2.bfd() < this.epZ) {
            return false;
        }
        return this.eqa == -1 || cCo2.bfd() <= this.eqa;
    }

    @Override
    public void a(apl_1 apl_12) {
        this.ena = apl_12.aIA();
        this.epZ = apl_12.aIz();
        this.eqa = apl_12.aIz();
    }

    @Override
    public void b(fs_0 fs_02) {
        fs_02.mz(this.ena);
        fs_02.k(this.epZ);
        fs_02.k(this.eqa);
    }

    @Override
    public byte eIT() {
        return 1;
    }

    @Override
    public cCk eJk() {
        return new cCn(this.ena, this.epZ, this.eqa);
    }

    public /* synthetic */ Object clone() {
        return this.eJk();
    }
}

