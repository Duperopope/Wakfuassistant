/*
 * Decompiled with CFR 0.152.
 */
import java.util.BitSet;

public final class bbo
extends eSY
implements bbC,
bbD {
    private int egP;
    private final bby hAf;

    private bbo() {
        this.hAf = new bbB(this).daf();
        this.hAf.a(new bbd_0());
    }

    public bbo(int n, aoh_1 aoh_12, BitSet bitSet, BitSet bitSet2, int n2, int n3, int n4, float[] fArray, String string, String string2, String string3, String string4, float[] fArray2, boolean bl, boolean bl2, int n5) {
        super(n, aoh_12, bitSet, bitSet2, n2, n4, fArray, fArray2, bl, bl2, n5);
        this.egP = n3;
        bbB bbB2 = new bbB(this).lj(string3).lk(string4).li(string2).lh(string);
        this.hAf = bbB2.daf();
        this.hAf.a(new bbd_0());
    }

    @Override
    public void a(int n, int n2, short s) {
        super.a(n, n2, s);
        if (this.hAf.dac() != null) {
            this.hAf.dac().e(n, n2, s);
        }
    }

    @Override
    public QQ bcv() {
        return new bbo();
    }

    public bbo q(etj_0 etj_02) {
        bbo bbo2 = (bbo)super.r(etj_02);
        bbo2.egP = this.egP;
        bbo2.hAf.b(this.hAf);
        bbo2.aPg();
        return bbo2;
    }

    @Override
    public void a(int n, int n2, short s, QD qD) {
    }

    @Override
    public int cbt() {
        return this.egP;
    }

    @Override
    public void a(abi_1 abi_12) {
        super.a(abi_12);
        if (this.hAf.dac() != null) {
            this.hAf.dac().a(this.bcB());
        }
    }

    @Override
    public bby cZE() {
        return this.hAf;
    }

    @Override
    public boolean la(String string) {
        return false;
    }

    @Override
    public String getName() {
        if (this.hAf != null) {
            return this.hAf.getName();
        }
        return "";
    }

    @Override
    public /* synthetic */ eSY r(etj_0 etj_02) {
        return this.q(etj_02);
    }

    @Override
    public /* synthetic */ eSS b(etj_0 etj_02) {
        return this.q(etj_02);
    }

    @Override
    public /* synthetic */ QQ a(QS qS) {
        return this.q((etj_0)qS);
    }
}

