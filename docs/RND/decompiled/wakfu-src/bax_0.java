/*
 * Decompiled with CFR 0.152.
 */
import java.util.BitSet;

/*
 * Renamed from baX
 */
public final class bax_0
extends eSL
implements ado_0,
bbC,
bbD {
    private static final short hzG = 1;
    private int egP;
    private final bby hzH;
    private adj_0 hzI;

    private bax_0() {
        this.hzH = new bbB(this).daf();
        this.hzH.a(new bbd_0());
    }

    public bax_0(int n, aoh_1 aoh_12, BitSet bitSet, BitSet bitSet2, int n2, int n3, int n4, float[] fArray, String string, String string2, String string3, String string4, float[] fArray2, boolean bl, boolean bl2, int n5) {
        super(n, aoh_12, bitSet, bitSet2, n2, n4, fArray, fArray2, bl, bl2, n5);
        this.egP = n3;
        bbB bbB2 = new bbB(this).lj(string3).lk(string4).li(string2).lh(string);
        bbB2.bf((short)1);
        this.hzH = bbB2.daf();
        this.hzH.a(new bbd_0());
    }

    protected bax_0 cZF() {
        return new bax_0();
    }

    public bax_0 d(etj_0 etj_02) {
        bax_0 bax_02 = (bax_0)super.b(etj_02);
        bax_02.egP = this.egP;
        bax_02.hzH.b(this.hzH);
        bax_02.aPg();
        return bax_02;
    }

    @Override
    public void a(int n, int n2, short s, QD qD) {
    }

    @Override
    public int cbt() {
        return this.egP;
    }

    @Override
    public bby cZE() {
        return this.hzH;
    }

    @Override
    public adj_0 bvp() {
        return this.hzI;
    }

    public void n(adj_0 adj_02) {
        this.hzI = adj_02;
    }

    @Override
    public void a(ezz ezz2) {
        super.a(ezz2);
        daY daY2 = new daY(this);
        daY2.b(ezz2);
        daY2.lK(19231);
        daY2.cC(true);
        aaw_1.bUq().h(daY2);
    }

    @Override
    public void cZG() {
        bsj_0 bsj_02;
        super.cZG();
        akj_0.ciY().o(this);
        if (this.bbh() instanceof enu_0 && (bsj_02 = aue_0.cVJ().cVK().dmV()) != null && bsj_02.d() == ((enu_0)this.bbh()).bha()) {
            akj_0.ciY().a((QQ)this, bsj_02);
        }
        ((aIs)aie_0.cfn().bmC()).a(akj_0.ciY());
    }

    @Override
    public void b(int n, int n2, short s) {
        super.b(n, n2, s);
        akj_0.ciY().m(this);
        ((aIs)aie_0.cfn().bmC()).a(akj_0.ciY());
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
        return "AnimMort".equals(string);
    }

    @Override
    public String getName() {
        if (this.hzH != null) {
            return this.hzH.getName();
        }
        return "";
    }

    @Override
    public /* synthetic */ eSS b(etj_0 etj_02) {
        return this.d(etj_02);
    }

    @Override
    protected /* synthetic */ QQ bcv() {
        return this.cZF();
    }

    @Override
    public /* synthetic */ QQ a(QS qS) {
        return this.d((etj_0)qS);
    }
}

