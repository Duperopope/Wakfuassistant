/*
 * Decompiled with CFR 0.152.
 */
import java.util.BitSet;

/*
 * Renamed from baZ
 */
public final class baz_0
extends eSN
implements pu_0,
bbC,
bbD,
bbp_2 {
    private static final short hzK = 9;
    private int egP;
    private final bby hzL;

    private baz_0() {
        this.hzL = new bbB(this).daf();
        this.hzL.a(new bbd_0());
    }

    public baz_0(int n, aoh_1 aoh_12, BitSet bitSet, BitSet bitSet2, int n2, int n3, int n4, float[] fArray, String string, String string2, String string3, String string4, float[] fArray2, boolean bl, boolean bl2, int n5) {
        super(n, aoh_12, bitSet, bitSet2, n2, n4, fArray, fArray2, bl, bl2, n5);
        this.egP = n3;
        bbB bbB2 = new bbB(this).lj(string3).lk(string4).li(string2).lh(string);
        bbB2.bf((short)9);
        this.hzL = bbB2.daf();
        this.hzL.a(new bbd_0());
    }

    @Override
    public void aPg() {
        super.aPg();
        this.rlm.c(this);
    }

    @Override
    public QQ bcv() {
        return new baz_0();
    }

    public baz_0 f(etj_0 etj_02) {
        baz_0 baz_02 = (baz_0)super.b(etj_02);
        baz_02.egP = this.egP;
        baz_02.hzL.b(this.hzL);
        baz_02.aPg();
        return baz_02;
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
        if (this.hzL.dac() != null) {
            this.hzL.dac().a(this.bcB());
        }
    }

    @Override
    public void bcK() {
        bbq_2.dao().a(this.Sn(), this);
    }

    @Override
    public void bcL() {
        bbq_2.dao().jc(this.Sn());
    }

    @Override
    public bby cZE() {
        return this.hzL;
    }

    @Override
    public void a(pr_0 pr_02) {
        if (pr_02.aYQ() == exx_2.rGi && this.la("AnimHit")) {
            this.hzL.ld("AnimHit");
        }
    }

    @Override
    public void a(int n, int n2, short s) {
        super.a(n, n2, s);
        if (this.hzL.dac() != null) {
            this.hzL.dac().e(n, n2, s);
        }
    }

    @Override
    public boolean isVisible() {
        return true;
    }

    @Override
    public float getAltitude() {
        return this.bcE();
    }

    @Override
    public float getWorldX() {
        return this.bcC();
    }

    @Override
    public float getWorldY() {
        return this.bcD();
    }

    @Override
    public float bpZ() {
        return 0.0f;
    }

    @Override
    public void aB(float f2, float f3) {
    }

    @Override
    public void e(float f2, float f3, float f4) {
    }

    @Override
    public void fg(boolean bl) {
        if (bl) {
            cub_1.eSi();
            cub_1.a(this);
        } else {
            cub_1.eSi();
            cub_1.a(null);
        }
    }

    @Override
    public boolean la(String string) {
        if ("AnimMort".equals(string)) {
            return true;
        }
        if ("AnimAttaque".equals(string)) {
            return true;
        }
        return "AnimHit".equals(string);
    }

    @Override
    public String getName() {
        if (this.hzL != null) {
            return this.hzL.getName();
        }
        return "";
    }

    @Override
    public /* synthetic */ eSS b(etj_0 etj_02) {
        return this.f(etj_02);
    }

    @Override
    public /* synthetic */ QQ a(QS qS) {
        return this.f((etj_0)qS);
    }
}

