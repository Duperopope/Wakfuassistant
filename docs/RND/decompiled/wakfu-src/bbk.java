/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.BitSet;

public final class bbk
extends eSU
implements WO,
bbC,
bbD {
    private int egP;
    private String egZ;
    private final bby hAa;

    private bbk() {
        this.hAa = new bbB(this).daf();
    }

    public bbk(int n, aoh_1 aoh_12, BitSet bitSet, BitSet bitSet2, int n2, int n3, int n4, float[] fArray, String string, String string2, String string3, String string4, float[] fArray2, boolean bl, boolean bl2, int n5) {
        super(n, aoh_12, bitSet, bitSet2, n2, n4, fArray, fArray2, bl, bl2, n5);
        this.egP = n3;
        bbB bbB2 = new bbB(this).lj(string3).lk(string4).li(string2).lh(string);
        this.egZ = string3;
        this.hAa = bbB2.daf();
    }

    @Override
    protected QQ bcv() {
        return new bbk();
    }

    public bbk l(etj_0 etj_02) {
        bbk bbk2 = (bbk)super.b(etj_02);
        bbk2.egP = this.egP;
        bbk2.hAa.b(this.hAa);
        bbk2.egZ = this.hAa.cZO();
        bbk2.aPg();
        return bbk2;
    }

    @Override
    public void aPg() {
        super.aPg();
        this.bb(this.bcP());
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
        if (this.hAa.dac() != null) {
            this.hAa.dac().a(this.bcB());
        }
    }

    @Override
    public void az(byte by) {
        super.az(by);
        this.bb(by);
    }

    private void bb(byte by) {
        if (this.egZ == null) {
            return;
        }
        String[] stringArray = BH.a(this.egZ, ';');
        if (stringArray.length <= by) {
            return;
        }
        this.hAa.le(stringArray[by]);
    }

    @Override
    public bby cZE() {
        return this.hAa;
    }

    @Override
    public boolean la(String string) {
        return false;
    }

    @Override
    public String getName() {
        if (this.hAa != null) {
            return this.hAa.getName();
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
    public /* synthetic */ eSS b(etj_0 etj_02) {
        return this.l(etj_02);
    }

    @Override
    public /* synthetic */ QQ a(QS qS) {
        return this.l((etj_0)qS);
    }
}

