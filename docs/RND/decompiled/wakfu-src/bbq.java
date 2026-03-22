/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.BitSet;

public final class bbq
extends eSZ
implements WO,
bbC,
bbD {
    private int egP;
    private final bby hAh;

    private bbq() {
        this.hAh = new bbB(this).daf();
    }

    public bbq(int n, aoh_1 aoh_12, BitSet bitSet, BitSet bitSet2, int n2, int n3, int n4, float[] fArray, String string, String string2, String string3, String string4, float[] fArray2, boolean bl, boolean bl2, int n5) {
        super(n, aoh_12, bitSet, bitSet2, n2, n4, fArray, fArray2, bl, bl2, n5);
        this.egP = n3;
        bbB bbB2 = new bbB(this).lj(string3).lk(string4).li(string2).lh(string);
        this.hAh = bbB2.daf();
    }

    public bbq cZJ() {
        return new bbq();
    }

    public bbq s(etj_0 etj_02) {
        bbq bbq2 = (bbq)super.b(etj_02);
        bbq2.egP = this.egP;
        bbq2.hAh.b(this.hAh);
        bbq2.aPg();
        return bbq2;
    }

    @Override
    public void a(int n, int n2, short s, QD qD) {
    }

    @Override
    public int cbt() {
        return this.egP;
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
    public void a(abi_1 abi_12) {
        super.a(abi_12);
        if (this.hAh.dac() != null) {
            this.hAh.dac().a(this.bcB());
        }
    }

    @Override
    public bby cZE() {
        return this.hAh;
    }

    @Override
    public void fg(boolean bl) {
        if (bl) {
            cub_1.c(this);
        } else {
            cub_1.c(null);
        }
    }

    @Override
    public boolean la(String string) {
        return false;
    }

    @Override
    public String getName() {
        if (this.hAh != null) {
            return this.hAh.getName();
        }
        return "";
    }

    @Override
    public /* synthetic */ eSS b(etj_0 etj_02) {
        return this.s(etj_02);
    }

    @Override
    public /* synthetic */ QQ bcv() {
        return this.cZJ();
    }

    @Override
    public /* synthetic */ QQ a(QS qS) {
        return this.s((etj_0)qS);
    }
}

