/*
 * Decompiled with CFR 0.152.
 */
import java.util.BitSet;

public final class bbv
extends etc_0
implements bbC {
    private int egP;
    private final bby hAl;

    private bbv() {
        this.hAl = new bbB(this).daf();
    }

    public bbv(int n, aoh_1 aoh_12, BitSet bitSet, BitSet bitSet2, int n2, int n3, int n4, float[] fArray, String string, String string2, String string3, String string4, float[] fArray2, boolean bl, boolean bl2, int n5) {
        super(n, aoh_12, bitSet, bitSet2, n2, n4, fArray, fArray2, bl, bl2, n5);
        this.egP = n3;
        bbB bbB2 = new bbB(this).lj(string3).lk(string4).li(string2).lh(string);
        this.hAl = bbB2.daf();
    }

    @Override
    public void a(int n, int n2, short s) {
        super.a(n, n2, s);
        if (this.hAl.dac() != null) {
            this.hAl.dac().e(n, n2, s);
        }
    }

    @Override
    public QQ bcv() {
        return new bbv();
    }

    public bbv v(etj_0 etj_02) {
        bbv bbv2 = (bbv)super.b(etj_02);
        bbv2.egP = this.egP;
        bbv2.hAl.b(this.hAl);
        bbv2.aPg();
        return bbv2;
    }

    @Override
    public void a(int n, int n2, short s, QD qD) {
    }

    public int cbt() {
        return this.egP;
    }

    @Override
    public void a(abi_1 abi_12) {
        super.a(abi_12);
        if (this.hAl.dac() != null) {
            this.hAl.dac().a(this.bcB());
        }
    }

    @Override
    public bby cZE() {
        return this.hAl;
    }

    @Override
    public boolean la(String string) {
        return false;
    }

    @Override
    public String getName() {
        if (this.hAl != null) {
            return this.hAl.getName();
        }
        return "";
    }

    @Override
    public /* synthetic */ eSS b(etj_0 etj_02) {
        return this.v(etj_02);
    }

    @Override
    public /* synthetic */ QQ a(QS qS) {
        return this.v((etj_0)qS);
    }
}

