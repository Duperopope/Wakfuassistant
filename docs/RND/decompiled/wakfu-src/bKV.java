/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.Comparator;
import org.apache.commons.pool.ObjectPool;
import org.apache.log4j.Logger;

public class bKV
extends ZH
implements ayx_2,
fpZ {
    private static final int kqZ = 16;
    private static final Comparator<cpm_1> kra = (cpm_12, cpm_13) -> {
        if (cpm_12 instanceof cqd_2 && cpm_13 instanceof cqd_2) {
            return ((cqd_2)cpm_12).eLU() - ((cqd_2)cpm_13).eLU();
        }
        if (!(cpm_12 instanceof cqe_1)) {
            return 1;
        }
        if (!(cpm_13 instanceof cqe_1)) {
            return -1;
        }
        return ((bkb_1)((Object)cpm_12)).dsB().aGu() - ((bkb_1)((Object)cpm_13)).dsB().aGu();
    };
    private static final ZJ krb = new bKW();
    public static boolean krc = true;
    private static final ObjectPool krd = new ayv_2(new bKX());
    protected bKT kre;
    private String ayZ;
    private byte krf;
    protected boolean krg;
    protected boolean bsj;
    private long krh;
    private int kri;
    boolean krj;
    private boolean krk;
    private float krl = 1.0f;
    private acf krm;

    public static bKV a(int n, int n2, short s, int n3, byte by, boolean bl, boolean bl2, long l, int n4) {
        bKV bKV2;
        try {
            bKV2 = (bKV)krd.borrowObject();
        }
        catch (Exception exception) {
            bWl.error((Object)"Erreur lors de l'extraction d'une resource du pool", (Throwable)exception);
            bKV2 = new bKV();
        }
        if (!bKV2.b(n, n2, s, n3, by, bl, bl2, l, n4)) {
            return null;
        }
        return bKV2;
    }

    protected boolean b(int n, int n2, short s, int n3, byte by, boolean bl, boolean bl2, long l, int n4) {
        long l2 = GC.s(n, n2);
        this.dC(l2);
        this.bVz = n;
        this.bVA = n2;
        this.bVB = s - 1;
        this.krg = bl2;
        this.krh = l;
        this.kri = n4;
        this.bsj = false;
        this.kre = (bKT)bKU.eca().YN(n3);
        if (this.kre == null) {
            bWl.error((Object)("Error reference inexistante pour la ressource d'ID " + n3));
            return false;
        }
        this.dV(bKZ.ecp().h((byte)1, by));
        this.bUW = false;
        this.m(by, bl);
        this.qR(afX.csk.byy());
        agX.c(this);
        return true;
    }

    protected bKV() {
        super(0L, 0.0f, 0.0f);
        this.a(new bKY(this));
    }

    public String l(bKV bKV2) {
        if (!bKV2.ecd()) {
            return null;
        }
        ejj_0 ejj_02 = ejj_0.dG(bKV2.eco().ghz());
        if (ejj_02 == null) {
            return null;
        }
        if (!ejj_02.fxc()) {
            return null;
        }
        bof_1 bof_12 = boh_1.ehH().ehM().ehG();
        if (bof_12 == null) {
            return null;
        }
        float f2 = bof_12.blu();
        bKT bKT2 = bKV2.eco();
        String string = bLk.a(f2, bKT2.ghC(), bKT2.cux(), bKT2.cuy(), bKT2.ghD()).name();
        return auc_0.cVq().a("temperatureInfluenceIconUrl", "defaultIconPath", string);
    }

    private void ecb() {
        if (this.krm != null) {
            acq_0.cge.bn(this.krm.d(), 500);
            this.krm = null;
        }
    }

    private void ecc() {
        this.ecb();
        bLc bLc2 = (bLc)this.kre.hn(this.krf);
        if (!bLc2.ect()) {
            return;
        }
        this.krm = (acf)asx_2.day.btu();
        this.krm.a(this);
        float[] fArray = bLc2.ecr();
        this.krm.t(0.0f, 0.0f, 0.0f);
        this.krm.u(fArray[0], fArray[1], fArray[2]);
        this.krm.s(0.0f, 0.0f, 0.2f);
        this.krm.aT(bLc2.ecs());
        this.krm.cT(false);
        acq_0.cge.a(this.krm);
    }

    public boolean ecd() {
        bLc bLc2 = (bLc)this.kre.hn(this.krf);
        eki_0 eki_02 = baj_2.hzf.cZr();
        int n = bLc2.ghG();
        for (int i = 0; i < n; ++i) {
            bmv_2 bmv_22 = (bmv_2)bLc2.YQ(i);
            if (bmv_22.cms() == 0) {
                return true;
            }
            if (!eki_02.tX(bmv_22.cms())) continue;
            return true;
        }
        return false;
    }

    public boolean bcS() {
        if (this.ecj() == 16) {
            return false;
        }
        return this.kre.cuz();
    }

    public boolean awH() {
        return this.krh > 0L;
    }

    public long awI() {
        return this.krh;
    }

    public void lI(long l) {
        this.krh = l;
    }

    public int awK() {
        return this.kri;
    }

    public void HR(int n) {
        this.kri = n;
    }

    @Override
    public void aVI() {
        this.krf = 0;
        this.kre = null;
        this.krg = false;
        this.krj = false;
        this.krh = 0L;
        this.kri = 0;
        this.setVisible(false);
        this.a(krb);
        this.a(abi_1.dzk);
    }

    @Override
    public void aVH() {
        if (this.krk) {
            aJs.eaS.b(this);
            this.krk = false;
        }
        this.ecb();
        this.bpI();
        this.krf = 0;
        this.kre = null;
        this.bsj = false;
        this.krh = 0L;
        this.kri = 0;
        cxq_1.eWO().a(this);
    }

    @Override
    public boolean m(eh_2 eh_22) {
        if (eh_22.aJd() == es_1.azn) {
            this.ayZ = bKZ.ecp().h((byte)4, this.krf);
            this.bUV = false;
            this.dT(this.ayZ);
            return true;
        }
        return false;
    }

    @Override
    public void g(ArrayList<eh_2> arrayList) {
        for (eh_2 eh_22 : arrayList) {
            if (eh_22.aJd() == es_1.azo) {
                boolean bl = this.krj = !this.krg;
                if (!this.krg) continue;
                this.setVisible(false);
                continue;
            }
            if (eh_22.aJd() == es_1.azp) {
                this.l(this.krf, false);
                continue;
            }
            Object r = zw_0.l(eh_22.getClass());
            r.a(this, (eh_2)eh_22);
        }
    }

    public boolean ece() {
        return this.krj;
    }

    public cpm_1[] ecf() {
        if (!this.ecg()) {
            return cpm_1.nip;
        }
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02.a(ezj_0.ptE)) {
            return cpm_1.nip;
        }
        azz_1<cpm_1> azz_12 = new azz_1<cpm_1>(kra);
        boolean bl = evm_2.b(bgt_02.dpL().cWq(), evn_2.otV);
        boolean bl2 = bgt_02.dkH();
        if (bl || bl2) {
            this.kre.t(bLc2 -> {
                if (bLc2.ghH() == 0 || bLc2.ghH() == 16 || bLc2.ghH() == this.krf) {
                    return;
                }
                azz_12.add(new cqd_2(bLc2.cuJ(), this.aXv, bLc2.ghH()));
            });
            azz_12.add(new cqd_2(0, this.aXv, -1));
            if (bl2) {
                return azz_12.toArray(new cpm_1[azz_12.size()]);
            }
        }
        if (!bl && bgt_02.dnw() == bgt_02.dnx()) {
            azz_12.add(new cqd_2(0, this.aXv, -1));
        }
        bLc bLc3 = (bLc)this.kre.hn(this.krf);
        int n = bLc3.ghG();
        for (int i = 0; i < n; ++i) {
            bmv_2 bmv_22 = (bmv_2)bLc3.YQ(i);
            azz_12.add(new cqe_1(this, bmv_22));
        }
        return azz_12.toArray(new cpm_1[azz_12.size()]);
    }

    private boolean ecg() {
        return this.kre.ca(this.krf);
    }

    public bmv_2 HS(int n) {
        return (bmv_2)((bLc)this.kre.hn(this.krf)).YP(n);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected void a(int[] nArray, long l) {
        long l2 = System.nanoTime();
        try {
            String string = this.kre.b((int)this.bVz, (int)this.bVA, l);
            if (string != null) {
                this.k(string, true);
                this.dP(string);
                this.bsj = true;
            }
        }
        catch (Exception exception) {
            bWl.error((Object)"Erreur de cr\u00e9ation de ressource ", (Throwable)exception);
        }
        finally {
            long l3 = System.nanoTime();
            nArray[0] = (int)((long)nArray[0] - (l3 - l2) / 1000000L);
        }
    }

    public void aZp() {
        if (krd != null) {
            try {
                krd.returnObject((Object)this);
            }
            catch (Exception exception) {
                bWl.error((Object)"Erreur lors du retour d'une resource au pool", (Throwable)exception);
            }
        } else {
            this.aVH();
        }
    }

    private void l(byte by, boolean bl) {
        if (by == 16) {
            return;
        }
        this.setVisible(true);
        if (by == 0) {
            cxq_1.eWO().a(this);
            this.ayZ = bKZ.ecp().h((byte)0, this.krf);
            this.bUV = false;
        } else if (bl && by != this.krf) {
            this.ayZ = by > this.krf || this.krf == 16 ? bKZ.ecp().h((byte)1, by) : bKZ.ecp().b((byte)3, this.krf, by);
            this.bUV = false;
            this.dV(bKZ.ecp().h((byte)2, by));
            this.bUW = true;
        } else {
            this.ayZ = bKZ.ecp().h((byte)2, by);
            this.bUV = true;
            this.dV(this.ayZ);
            this.bUW = true;
        }
        this.dT(this.ayZ);
    }

    public void m(byte by, boolean bl) {
        this.l(by, bl);
        this.krf = by;
        this.ech();
        this.eci();
    }

    public void ech() {
        wy_0 wy_02 = wa_0.aQ((short)this.bcC(), (short)this.bcD());
        if (wy_02 != null) {
            wy_02.b(this.bcC(), this.bcD(), this.bcS());
        } else {
            bWl.warn((Object)("mise \u00e0 jour de l'\u00e9tat d'une ressource en (" + this.bcC() + ", " + this.bcD() + ") alors que la map est inconnue/pas charg\u00e9e\t"));
        }
    }

    public boolean a(afV afV2, int n, int[] nArray) {
        if (!this.bsj) {
            if (nArray[0] <= 0) {
                return false;
            }
            this.a(nArray, WX.bhh());
        }
        return super.b(afV2, n);
    }

    @Override
    public void k(String string, boolean bl) {
        super.k(string, bl);
        this.eci();
    }

    private void eci() {
        this.ecc();
        if (this.krf == 0 || this.krf == 16) {
            return;
        }
        fsi_0 fsi_02 = ((bLc)this.kre.hn(this.krf)).ecq();
        if (fsi_02 == null) {
            bWl.warn((Object)("resource sans resourceSizeCategory " + this.ecm() + " m_evolutionStep=" + this.krf));
            return;
        }
        this.aq((short)(fsi_02.gkQ() / 10));
        this.bC(fsi_02.gkP());
        if (fsi_02.gkR()) {
            if (!this.krk) {
                aJs.eaS.a(this);
                this.krk = true;
            }
        } else if (this.krk) {
            aJs.eaS.b(this);
            this.krk = false;
        }
        if (fsi_0.b(fsi_02)) {
            this.qR(afX.csk.byy());
        } else {
            this.qR(afX.css.byy());
        }
    }

    public byte ecj() {
        return this.krf;
    }

    public boolean eck() {
        return this.krg;
    }

    public void hV(boolean bl) {
        this.krg = bl;
    }

    public boolean ecl() {
        return this.krf != 0 && this.krf != 16;
    }

    @Override
    public short aKu() {
        if (this.kre != null) {
            return this.kre.aKu();
        }
        return super.aKu();
    }

    String ecm() {
        if (this.ecf().length == 0) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        boolean bl = this.bps();
        if (bl) {
            stringBuilder.append("[").append(this.Sn()).append("] ");
        }
        stringBuilder.append(this.kre.ebZ());
        if (bl) {
            stringBuilder.append(" [").append(this.bcC()).append(", ").append(this.bcD()).append(", ").append(this.bcE()).append("]");
            if (this.krg) {
                stringBuilder.append(" (autoRespawn)");
            }
        }
        return stringBuilder.toString();
    }

    @Override
    public int bnd() {
        return 0;
    }

    @Override
    public axb_2 bnf() {
        return awx_2.dnL;
    }

    @Override
    public String bne() {
        return this.ecm();
    }

    public fsi_0 ecn() {
        bLc bLc2 = (bLc)this.kre.hn(this.krf);
        return bLc2.ecq();
    }

    public bKT eco() {
        return this.kre;
    }

    @Override
    public String bpT() {
        return bKZ.ecp().h((byte)2, this.ecj());
    }

    public void eD(float f2) {
        this.krl = f2;
    }

    @Override
    public void p(float[] fArray) {
        fArray[0] = fArray[0] * this.krl;
        fArray[1] = fArray[1] * this.krl;
        fArray[2] = fArray[2] * this.krl;
        super.p(fArray);
    }

    @Override
    public boolean bqs() {
        cpm_1[] cpm_1Array;
        for (cpm_1 cpm_12 : cpm_1Array = this.ecf()) {
            if (!cpm_12.bxO()) continue;
            return super.bqs();
        }
        return false;
    }

    @Override
    public acd_1 aZw() {
        return this.bVC;
    }

    @Override
    public int cqy() {
        return this.kre.ghz();
    }

    @Override
    public long aqZ() {
        throw new UnsupportedOperationException("On ne devrait pas faire appel \u00e0 getInstanceId dans le client");
    }

    static /* synthetic */ Logger aGh() {
        return bWl;
    }
}

