/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import java.util.BitSet;
import org.apache.log4j.Logger;

/*
 * Renamed from byx
 */
public class byx_0
extends bCA
implements qu_0,
rj_0,
ant_1,
eIy,
eyo_0 {
    static final Logger jCF = Logger.getLogger(byx_0.class);
    protected fdn jCG;
    protected eja_0 jCH;
    private byte bin;
    private static final pt_0[] jCI = new pt_0[]{exx_2.rGi, exx_2.rGC, exx_2.rGD, exx_2.rGE, exx_2.rGF};
    private final fi_1 jCJ = new byy_0(this, 7);

    @Override
    public boolean bep() {
        return true;
    }

    void e(rh_0 rh_02) {
        if (rh_02 != null) {
            rh_02.g(this);
        }
    }

    void fa(ByteBuffer byteBuffer) {
        this.ibY = byteBuffer.getInt();
        this.bin = byteBuffer.get();
        if (this.ibY <= 0) {
            return;
        }
        bsS bsS2 = bsU.dHk().Ft(this.ibY);
        if (this.t(bsS2)) {
            return;
        }
        aVi.cWF().a(this.ibY, (aft_2)new byA(this, agb_1.cbm(), 0, 0));
    }

    boolean t(bsS bsS2) {
        return bsS2 != null && bsS2.bag() != null && bsS2.bag().P(this.bin) == this;
    }

    void dOj() {
        bsS bsS2 = bsU.dHk().Ft(this.ibY);
        if (bsS2 == null) {
            jCF.error((Object)("Impossible d'ajouter l'obstacle a un combat inconnu " + this.ibY));
        }
        this.u(bsS2);
    }

    private void u(bsS bsS2) {
        rh_0 rh_02 = bsS2.bag();
        if (rh_02 == null) {
            jCF.error((Object)"Le combat n'a pas de FightMap, impossible d'ajouter l'obstacle");
            return;
        }
        rj_0 rj_02 = rh_02.P(this.bin);
        if (rj_02 == null) {
            jCF.info((Object)("Ajout de l'obstacle = " + String.valueOf(this)));
            rh_02.i(this);
        } else if (rj_02 != this) {
            jCF.error((Object)"Un autre obstacle diff\u00e9rent a le meme ID, ce n'est pas normal");
        }
    }

    @Override
    public boolean bEf() {
        return true;
    }

    @Override
    public boolean b(rw_0 rw_02, RG rG) {
        this.b(rw_02);
        return false;
    }

    @Override
    public rw_0 dNn() {
        return rw_0.bkR;
    }

    @Override
    public rw_0[] dNf() {
        return rw_0.bly;
    }

    @Override
    public String getName() {
        return aum_0.cWf().a(81, (long)this.jCG.d(), new Object[0]);
    }

    @Override
    public String dOk() {
        int n = this.jCH.c(exx_2.rGi);
        int n2 = this.jCH.h(exx_2.rGi);
        return this.ibY != -1 ? " (" + n + " / " + n2 + ")" : "";
    }

    @Override
    public boolean dOf() {
        return this.bmf != 2 && super.dOf();
    }

    @Override
    public void c(ng_1 ng_12) {
    }

    @Override
    public boolean a(ng_1 ng_12) {
        if (ng_12 instanceof ZC) {
            ((ZC)((Object)ng_12)).qR(afX.csq.byy());
        }
        return super.a(ng_12);
    }

    @Override
    protected fi_1 bey() {
        return this.jCJ;
    }

    @Override
    public void dNq() {
        String[] stringArray = this.baB.split(";");
        if (stringArray.length != 1) {
            jCF.error((Object)("[LD] La Machine Destructible " + this.aXv + " doit avoir 1 param\u00e8tre"));
            return;
        }
        fdn fdn2 = (fdn)fda_0.rWI.a(fdv_0.rYZ, Integer.valueOf(stringArray[0]));
        if (fdn2 == null) {
            jCF.error((Object)("[LD] La Machine Destructible " + this.aXv + " \u00e0 un param\u00e8tre [" + Integer.valueOf(stringArray[0]) + "] qui ne correspond a rien dans les Admins"));
            return;
        }
        this.jCG = fdn2;
        this.dOl();
    }

    private void dOl() {
        this.jCH.aYH();
        this.jCH.b(exx_2.rGi).ot(this.jCG.cmA());
        this.jCH.b(exx_2.rGi).aYO();
        this.jCH.b(exx_2.rGD).op(this.jCG.cmC());
        this.jCH.b(exx_2.rGC).op(this.jCG.cmD());
        this.jCH.b(exx_2.rGE).op(this.jCG.cmE());
        this.jCH.b(exx_2.rGF).op(this.jCG.cmF());
    }

    @Override
    public void aVI() {
        super.aVI();
        this.ibY = -1;
        this.bin = (byte)-1;
        assert (this.jCH == null);
        this.jCH = new eja_0(jCI);
        this.setVisible(true);
        this.hu(true);
        this.a(RJ.bmt);
        this.ac((short)0);
        this.ht(true);
        this.bf(true);
        this.bi(true);
        this.a(abi_1.dzk);
        this.setSelectable(true);
        assert (this.jCG == null);
    }

    @Override
    public void aVH() {
        super.aVH();
        this.setVisible(false);
        this.ac((short)2);
        this.jCH = null;
        this.jCG = null;
    }

    @Override
    public byte bcO() {
        return 0;
    }

    @Override
    public void N(byte by) {
        this.bin = by;
    }

    @Override
    public byte bcQ() {
        return this.bin;
    }

    @Override
    public boolean bcR() {
        return true;
    }

    @Override
    public boolean bcS() {
        return this.beq();
    }

    @Override
    public boolean bcT() {
        return this.beo();
    }

    @Override
    public byte bax() {
        return 10;
    }

    @Override
    public QE baz() {
        return null;
    }

    @Override
    public boolean bay() {
        return true;
    }

    @Override
    public byte[] baB() {
        return new byte[0];
    }

    @Override
    public void dp(byte[] byArray) {
    }

    @Override
    public void a(int n, int n2, short s) {
    }

    @Override
    public void b(int n, int n2, short s) {
    }

    @Override
    public boolean a(pt_0 pt_02) {
        return this.jCH.g(pt_02);
    }

    @Override
    public boolean i(pv_0 pv_02) {
        return false;
    }

    @Override
    public boolean kW(long l) {
        return false;
    }

    @Override
    public int dh(long l) {
        return -1;
    }

    @Override
    public boolean v(long l, long l2) {
        return false;
    }

    @Override
    public boolean a(long l, eyo_0 eyo_02) {
        return false;
    }

    @Override
    public boolean a(long l, long l2, eyo_0 eyo_02) {
        return false;
    }

    @Override
    public boolean b(long l, eyo_0 eyo_02) {
        return false;
    }

    @Override
    public boolean b(long l, long l2, eyo_0 eyo_02) {
        return false;
    }

    @Override
    public boolean w(long l, long l2) {
        return false;
    }

    @Override
    public boolean a(eyp_0 eyp_02) {
        return eyp_0.pmS == eyp_02;
    }

    @Override
    public int dOm() {
        return 0;
    }

    @Override
    public int Gc(int n) {
        return 0;
    }

    @Override
    public boolean dOn() {
        return false;
    }

    @Override
    public pr_0 b(pt_0 pt_02) {
        return this.jCH.b(pt_02);
    }

    @Override
    public eyp doV() {
        return null;
    }

    @Override
    public byte bcP() {
        return -1;
    }

    @Override
    public void az(byte by) {
    }

    @Override
    public long dOo() {
        return 0L;
    }

    @Override
    public boolean dOp() {
        return false;
    }

    @Override
    public int c(pt_0 pt_02) {
        return this.jCH.c(pt_02);
    }

    @Override
    public int d(pt_0 pt_02) {
        return this.jCH.h(pt_02);
    }

    @Override
    public boolean a(pv_0 pv_02) {
        return false;
    }

    @Override
    public byte b(pv_0 pv_02) {
        return 0;
    }

    @Override
    public void a(pv_0 pv_02, byte by) {
    }

    @Override
    public void f(pv_0 pv_02) {
    }

    @Override
    public void g(pv_0 pv_02) {
    }

    @Override
    public void h(pv_0 pv_02) {
    }

    @Override
    public void a(abi_1 abi_12) {
        super.a(abi_12);
    }

    @Override
    public abi_1 baC() {
        return null;
    }

    @Override
    public void b(abi_1 abi_12) {
    }

    @Override
    public sp_0 baD() {
        return null;
    }

    @Override
    public void b(qu_0 qu_02) {
    }

    @Override
    public void c(qu_0 qu_02) {
    }

    @Override
    public void d(qu_0 qu_02) {
    }

    @Override
    public boolean baE() {
        return false;
    }

    @Override
    public boolean baF() {
        return false;
    }

    @Override
    public void baG() {
    }

    @Override
    public boolean djT() {
        return true;
    }

    @Override
    public boolean baH() {
        return false;
    }

    @Override
    public boolean baI() {
        return false;
    }

    @Override
    public void baJ() {
    }

    @Override
    public boolean baK() {
        return false;
    }

    @Override
    public void baL() {
    }

    @Override
    public boolean baM() {
        return false;
    }

    @Override
    public boolean baN() {
        return true;
    }

    @Override
    public void aT(boolean bl) {
    }

    @Override
    public boolean a(BitSet bitSet, QD qD, byte by) {
        return false;
    }

    @Override
    public eIw dNx() {
        return this.jCG;
    }

    static /* synthetic */ short a(byx_0 byx_02) {
        return byx_02.bmf;
    }

    static /* synthetic */ void a(byx_0 byx_02, ayv_2 ayv_22) {
        byx_02.a(ayv_22);
    }
}

