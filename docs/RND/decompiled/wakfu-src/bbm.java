/*
 * Decompiled with CFR 0.152.
 */
import java.util.BitSet;

public final class bbm
extends eSW
implements bbC,
bbD {
    private int egP;
    private final bby hAc;

    public bbm(int n, aoh_1 aoh_12, BitSet bitSet, BitSet bitSet2, int n2, int n3, int n4, float[] fArray, String string, String string2, String string3, String string4, float[] fArray2, boolean bl, boolean bl2, int n5) {
        super(n, aoh_12, bitSet, bitSet2, n2, n4, fArray, fArray2, bl, bl2, n5);
        this.egP = n3;
        bbB bbB2 = new bbB(this).lj(string3).lk(string4).li(string2).lh(string);
        this.hAc = bbB2.daf();
    }

    private bbm() {
        this.hAc = new bbB(this).daf();
    }

    @Override
    public void aVI() {
        super.aVI();
    }

    @Override
    public void aVH() {
        super.aVH();
        this.baG();
    }

    @Override
    public QQ bcv() {
        return new bbm();
    }

    public bbm o(etj_0 etj_02) {
        bbm bbm2 = (bbm)super.b(etj_02);
        bbm2.hAc.b(this.hAc);
        bbm2.aPg();
        return bbm2;
    }

    @Override
    public void bc(byte by) {
        super.bc(by);
        if (this.hAc.cZO() != null && this.hAc.cZO().equals("[#1]")) {
            this.hAc.le(Integer.toString(aid_0.dWx[by - 1]));
        }
    }

    @Override
    public void fh(boolean bl) {
        super.fh(bl);
        if (bl) {
            this.hAc.AA(100);
        }
    }

    @Override
    public int cbt() {
        return this.egP;
    }

    @Override
    public void a(abi_1 abi_12) {
        super.a(abi_12);
        if (this.hAc.dac() != null) {
            this.hAc.dac().a(this.bcB());
        }
    }

    @Override
    public bby cZE() {
        return this.hAc;
    }

    @Override
    public boolean la(String string) {
        return false;
    }

    @Override
    public String getName() {
        if (this.hAc != null) {
            return this.hAc.getName();
        }
        return "";
    }

    @Override
    public /* synthetic */ eSS b(etj_0 etj_02) {
        return this.o(etj_02);
    }

    @Override
    public /* synthetic */ QQ a(QS qS) {
        return this.o((etj_0)qS);
    }
}

