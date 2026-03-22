/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cCc
 */
public class ccc_0
implements cCk {
    public static final byte mzb = 3;
    private cBj mxB;
    private short epZ = (short)-1;
    private short eqa = (short)-1;

    public ccc_0() {
    }

    public ccc_0(cBj cBj2, short s, short s2) {
        this.mxB = cBj2;
        this.epZ = s;
        this.eqa = s2;
    }

    public cBj eIr() {
        return this.mxB;
    }

    public void a(cBj cBj2) {
        this.mxB = cBj2;
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
        if (cCs2.eJm() != 3) {
            return false;
        }
        ccd_0 ccd_02 = (ccd_0)cCs2;
        if (ccd_02.eJl() != this.mxB) {
            return false;
        }
        if (this.epZ != -1 && ccd_02.bfd() < this.epZ) {
            return false;
        }
        return this.eqa == -1 || ccd_02.bfd() <= this.eqa;
    }

    @Override
    public void a(apl_1 apl_12) {
        this.mxB = cBj.LA(apl_12.aIA());
        this.epZ = apl_12.aIz();
        this.eqa = apl_12.aIz();
    }

    @Override
    public void b(fs_0 fs_02) {
        fs_02.mz(this.mxB.d());
        fs_02.k(this.epZ);
        fs_02.k(this.eqa);
    }

    @Override
    public byte eIT() {
        return 3;
    }

    @Override
    public cCk eJk() {
        return new ccc_0(this.mxB, this.epZ, this.eqa);
    }

    public /* synthetic */ Object clone() {
        return this.eJk();
    }
}

