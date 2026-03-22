/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.BitSet;

public final class bbl
extends eSV
implements WO,
bbC,
bbD {
    private int egP;
    private final bby hAb;

    private bbl() {
        this.hAb = new bbB(this).daf();
    }

    public bbl(int n, aoh_1 aoh_12, BitSet bitSet, BitSet bitSet2, int n2, int n3, int n4, float[] fArray, String string, String string2, String string3, String string4, float[] fArray2, boolean bl, boolean bl2, int n5) {
        super(n, aoh_12, bitSet, bitSet2, n2, n4, fArray, fArray2, bl, bl2, n5);
        this.egP = n3;
        bbB bbB2 = new bbB(this).lj(string3).lk(string4).li(string2).lh(string);
        this.hAb = bbB2.daf();
    }

    @Override
    public QQ bcv() {
        return new bbl();
    }

    public bbl m(etj_0 etj_02) {
        bbl bbl2 = (bbl)super.n(etj_02);
        bbl2.egP = this.egP;
        bbl2.hAb.b(this.hAb);
        bbl2.aPg();
        return bbl2;
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
        if (this.hAb.dac() != null) {
            this.hAb.dac().a(this.bcB());
        }
    }

    @Override
    public bby cZE() {
        return this.hAb;
    }

    @Override
    public boolean la(String string) {
        return false;
    }

    @Override
    public String getName() {
        if (this.hAb != null) {
            return this.hAb.getName();
        }
        return "";
    }

    @Override
    public int bnd() {
        return 0;
    }

    @Override
    public String bne() {
        ahv_2 ahv_22 = new ahv_2();
        ahv_22.c(this.getName());
        ArrayList<String> arrayList = eLL.a(new eLW(this, this.ejt, 0));
        int n = arrayList.size();
        for (int i = 0; i < n; ++i) {
            ahv_22.ceH().c(arrayList.get(i));
        }
        return ahv_22.ceL();
    }

    @Override
    public axb_2 bnf() {
        return awx_2.dnF;
    }

    @Override
    public /* synthetic */ eSV n(etj_0 etj_02) {
        return this.m(etj_02);
    }

    @Override
    public /* synthetic */ eSS b(etj_0 etj_02) {
        return this.m(etj_02);
    }

    @Override
    public /* synthetic */ QQ a(QS qS) {
        return this.m((etj_0)qS);
    }
}

