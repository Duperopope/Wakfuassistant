/*
 * Decompiled with CFR 0.152.
 */
import java.util.BitSet;

public final class bbr
extends eta_0
implements bbC,
bbD {
    private int egP;
    private final bby hAi;

    private bbr() {
        this.hAi = new bbB(this).daf();
        this.hAi.a(new bbs());
    }

    public bbr(int n, aoh_1 aoh_12, BitSet bitSet, BitSet bitSet2, int n2, int n3, int n4, float[] fArray, String string, String string2, String string3, String string4, float[] fArray2, boolean bl, boolean bl2, int n5) {
        super(n, aoh_12, bitSet, bitSet2, n2, n4, fArray, fArray2, bl, bl2, n5);
        this.egP = n3;
        bbB bbB2 = new bbB(this).lj(string3).lk(string4).li(string2).lh(string);
        this.hAi = bbB2.daf();
        this.hAi.a(new bbs());
    }

    public bbr cZK() {
        return new bbr();
    }

    public bbr t(etj_0 etj_02) {
        bbr bbr2 = (bbr)super.b(etj_02);
        bbr2.egP = this.egP;
        bbr2.hAi.b(this.hAi);
        bbr2.aPg();
        return bbr2;
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
        if (this.hAi.dac() != null) {
            this.hAi.dac().a(this.bcB());
        }
    }

    @Override
    public bby cZE() {
        return this.hAi;
    }

    @Override
    public boolean la(String string) {
        return "AnimMort".equals(string);
    }

    @Override
    public String getName() {
        if (this.hAi != null) {
            return this.hAi.getName();
        }
        return "";
    }

    @Override
    public /* synthetic */ eSS b(etj_0 etj_02) {
        return this.t(etj_02);
    }

    @Override
    public /* synthetic */ QQ bcv() {
        return this.cZK();
    }

    @Override
    public /* synthetic */ QQ a(QS qS) {
        return this.t((etj_0)qS);
    }
}

