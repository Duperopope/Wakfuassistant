/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import java.util.ArrayList;
import java.util.Optional;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bdj
 */
public class bdj_2
extends bdf_1
implements eyk_0 {
    private static final Logger hKj = Logger.getLogger(bdj_2.class);
    public static final boolean hKk = false;
    final bgy hKl;
    final bds_2 hKm = new bds_2(this);
    private final bdt_2 hKn = new bdt_2(this);
    @Nullable
    private bke_2 hKo;
    private boolean hKp;
    private bth_0 hKq = btl_0.dHL();
    private float hKr = 0.0f;
    private aJq hKs = null;
    private boolean hKt;
    private bdy_2 hKu;
    private boolean hKv;
    private boolean hKw;
    private short bdM;

    public bdj_2(bgy bgy2) {
        super(bgy2.Sn());
        if (bgy2.bvY()) {
            this.bVc = agh_1.dLJ;
            this.qR(afX.csr.byy());
        } else {
            this.bVc = new cCC(bgy2);
            this.qR(afX.csq.byy());
        }
        this.hKl = bgy2;
        this.hKl.a(this);
        this.bE(this.isVisible());
        this.p(this.hKl);
        this.j(this.hKl);
        this.q(this.hKl);
        this.bqt();
        this.a(new bdn_2(this));
    }

    @Override
    public int bqo() {
        return this.hKl.bqo();
    }

    public bgy dcP() {
        return this.hKl;
    }

    public void dcQ() {
        this.hKl.dln();
    }

    @Override
    public void j(exP exP2) {
        if (exP2.aVt() != 0) {
            this.lf(String.valueOf(exP2.aVt()));
        }
    }

    @Override
    public void k(exP exP2) {
    }

    @Override
    public void l(exP exP2) {
    }

    @Override
    public void m(exP exP2) {
    }

    @Override
    public void n(exP exP2) {
    }

    @Override
    public void o(exP exP2) {
    }

    @Override
    public void p(exP exP2) {
        this.e(exP2.bcC(), exP2.bcD(), exP2.bcE());
    }

    @Override
    public void q(exP exP2) {
        this.a(exP2.bcB());
    }

    @Override
    public void r(exP exP2) {
    }

    @Override
    public void s(exP exP2) {
    }

    @Override
    public void b(Sl sl) {
        this.hKl.dkr();
    }

    @Override
    public long Sn() {
        return super.Sn();
    }

    @Override
    public byte bcO() {
        if (this.hKl != null) {
            return this.hKl.bcO();
        }
        return super.bcO();
    }

    @Override
    public short bvy() {
        if (this.hKl != null) {
            return this.hKl.bvy();
        }
        return super.bvy();
    }

    public void bh(short s) {
        this.hKw = true;
        this.bdM = s;
    }

    public void dcR() {
        this.hKw = false;
        this.bdM = (short)-1;
    }

    @Override
    public short aKu() {
        if (this.hKw) {
            return this.bdM;
        }
        if (this.hKl != null) {
            return this.hKl.bcN();
        }
        return super.aKu();
    }

    @Override
    public final boolean isVisible() {
        if (this.hKt) {
            return false;
        }
        if (adn_0.bvh().bvo() && !this.bvY() && this.hKl.aFW() == 0) {
            this.a(false, WU.bQg);
            return false;
        }
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02 == null) {
            return true;
        }
        bsj_0 bsj_02 = bgt_02.dmV();
        if (bsj_02 != null) {
            rh_0 rh_02 = bsj_02.bag();
            if (!bsj_02.aL(this.hKl) && bsj_02.dHb() && rh_02.U(this.bcC(), this.bcD()) && !this.hKl.a(ezj_0.pud)) {
                if (!this.hKp) {
                    this.hKp = true;
                    this.bVM = true;
                    this.a(false, WU.bQh);
                }
                return false;
            }
        }
        if (this.hKp) {
            this.hKp = false;
            this.bVM = true;
            this.a(true, WU.bQh);
        }
        if (this.hKl.fhf()) {
            return false;
        }
        return super.isVisible();
    }

    @Override
    protected anp_2 a(bnv_2 bnv_22, anp_2 anp_22) {
        return bnv_22.a(this.hKl, anp_22);
    }

    @Override
    protected boolean dcF() {
        return !(this.hKl instanceof bhx_0);
    }

    @Override
    protected boolean dcG() {
        if (!(this.hKl instanceof bhJ)) {
            return false;
        }
        bhJ bhJ2 = (bhJ)this.hKl;
        return bhJ2.i(ezj_0.ptL);
    }

    @Override
    protected boolean dcH() {
        if (!(this.hKl instanceof bhJ)) {
            return false;
        }
        bhJ bhJ2 = (bhJ)this.hKl;
        return bhJ2.i(ezj_0.pue);
    }

    @Override
    protected boolean dcI() {
        if (!(this.hKl instanceof bhJ)) {
            return false;
        }
        bhJ bhJ2 = (bhJ)this.hKl;
        return bhJ2.i(ezj_0.puq);
    }

    @Override
    protected boolean dcJ() {
        if (!(this.hKl instanceof bhJ)) {
            return false;
        }
        bhJ bhJ2 = (bhJ)this.hKl;
        return bhJ2.i(ezj_0.pur);
    }

    @Override
    public int bvM() {
        return this.hKl.bvM();
    }

    @Override
    public boolean bvN() {
        return this.hKl.bvN();
    }

    @Override
    public void a(anp_2 anp_22, boolean bl, boolean bl2) {
        this.a(anp_22, bl, bl2, aea_0.cmC);
    }

    @Override
    public void a(anp_2 anp_22, boolean bl, boolean bl2, aea_0 aea_02) {
        this.dds();
        super.a(anp_22, bl, bl2, aea_02);
        int[] nArray = anp_22.bDX();
        if (nArray != null && nArray.length == 3) {
            this.hKl.T(nArray[0], nArray[1], (short)nArray[2]);
        }
        if (this.hKl.dkZ() != null && this.hKl.aWP() == eym.pia.aWP()) {
            this.hKm.ddF();
            this.hKm.ddD();
            this.hKm.bvf();
            this.b(new bdk_2(this));
        }
    }

    @Override
    public void a(abi_1 abi_12) {
        if (abi_12 == null) {
            hKj.error((Object)"Unable to set a Direction8 to null", (Throwable)new Exception());
            return;
        }
        super.a(abi_12);
        this.hKl.j(abi_12);
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02 == null) {
            return;
        }
        bsj_0 bsj_02 = this.hKl.dkZ();
        if (this.bqo() != -1 && this.bqo() == bgt_02.dmW() && this.hKl.djT() && bsj_02 != null && !bsj_02.dGP()) {
            this.i(abi_12);
        }
    }

    @Override
    public boolean c(aaj_0 aaj_02) {
        if (!super.c(aaj_02)) {
            return false;
        }
        if (this.hKl != null && this.hKl.i(exe_1.rEu)) {
            this.dcV();
        }
        return true;
    }

    @Override
    public byte bvx() {
        if (this.hKl.djT()) {
            return 4;
        }
        return super.bvx();
    }

    public void h(abi_1 abi_12) {
        this.a(abi_12);
        ciJ ciJ2 = new ciJ(abi_12);
        aue_0.cVJ().etu().d(ciJ2);
    }

    public void dcS() {
        aIp.b(this);
    }

    public void dcT() {
        this.bpV();
    }

    public void eq(float f2) {
        this.hKr += f2;
        this.bUP = true;
    }

    public void er(float f2) {
        this.hKr -= f2;
        this.bUP = true;
    }

    @Override
    public float getAltitude() {
        return super.getAltitude() + this.hKr;
    }

    @Override
    public void g(ArrayList<eh_2> arrayList) {
        ZH zH = this.hKl.dla();
        int n = arrayList.size();
        for (int i = 0; i < n; ++i) {
            eh_2 eh_22 = arrayList.get(i);
            if (zH != null && zH.m(eh_22)) continue;
            Object r = zw_0.l(eh_22.getClass());
            r.a(this, (eh_2)eh_22);
        }
    }

    public void dcU() {
        this.hKm.ddC();
        this.hKm.ddE();
        this.hKm.bvg();
        this.hKn.ddK();
    }

    public void dcV() {
        this.hKm.ddD();
        this.hKm.ddF();
        this.hKm.bvf();
        this.hKm.ddG();
        this.hKn.ddL();
    }

    @Override
    public void bvf() {
        this.hKm.bvf();
    }

    @Override
    public void bvg() {
        this.hKm.bvg();
    }

    public void dcW() {
        this.hKm.dcW();
    }

    @Override
    public String bpE() {
        bgy bgy2 = this.hKl;
        if (bgy2 == null) {
            hKj.error((Object)("Actor sans characterInfo id=" + this.Sn() + " gfxId=" + this.aXE()));
            return super.bpE();
        }
        eyp eyp2 = bgy2.doV();
        if (eyp2 != null && (eyp2 == eym.pij || eyp2.aWP() == 2382)) {
            int n;
            int n2 = n = this.hKq == null ? Integer.MAX_VALUE : this.hKq.aeV();
            if (n == 1 || n == 0) {
                return null;
            }
        }
        return super.bpE();
    }

    public bth_0 dcX() {
        return this.hKq;
    }

    public void a(bth_0 bth_02) {
        assert (bth_02 != null) : "utiliser plutot NoneAttack.getInstance()";
        this.hKq = bth_02;
    }

    public int b(bth_0 bth_02) {
        if (this.hKq.c(bth_02)) {
            btn_0.a(this, this.hKq.dHK(), bth_02.dHK());
            return 0;
        }
        return btn_0.d(this, bth_02);
    }

    public void dcY() {
        if (this.hKl instanceof bhJ) {
            this.hKl.dkL();
        }
        this.hKm.bf((byte)-1);
    }

    public void dcZ() {
        if (this.hKl instanceof bhJ) {
            this.hKl.dkL();
        }
        this.hKm.ddj();
    }

    public int dda() {
        if (this.hKl != null) {
            return this.hKl.doV().bcN();
        }
        return 0;
    }

    @Override
    public int bnd() {
        return 0;
    }

    @Override
    public axb_2 bnf() {
        if (this.hKl instanceof bhx_0 && (this.hKl.doP() || this.hKl.a(ezj_0.psF))) {
            return awx_2.dnU;
        }
        if (this.hKl.a(ezj_0.psG)) {
            return awx_2.dnJ;
        }
        if (this.hKl.a(ezj_0.psH)) {
            return awx_2.dnO;
        }
        return awx_2.dnF;
    }

    public void ddb() {
        FreeParticleSystem freeParticleSystem = agY.bzw().sk(15000);
        freeParticleSystem.a(this);
        if (this.hKl != null && this.hKl.djT()) {
            freeParticleSystem.pu(this.hKl.bqo());
        }
        agZ.bzy().b(freeParticleSystem);
    }

    @Override
    public void bpI() {
        this.dcW();
        this.hKn.e(this);
        this.bvB();
        cxq_1.eWO().a(this);
        this.chD();
        super.bpI();
    }

    public void aZp() {
        this.bpI();
    }

    public void ddc() {
        this.hKm.ddc();
    }

    public void i(abi_1 abi_12) {
        this.hKm.i(abi_12);
    }

    public void ddd() {
        this.hKm.ddd();
    }

    public void dde() {
        this.hKm.dde();
    }

    public void ddf() {
        this.hKm.ddf();
    }

    public void ddg() {
        this.hKm.ddg();
    }

    public void ddh() {
        this.hKm.ddh();
    }

    public void bd(byte by) {
        this.hKm.bd(by);
    }

    public void be(byte by) {
        this.hKm.be(by);
    }

    public void a(ero_0 ero_02, boolean bl) {
        this.hKn.a(ero_02, bl);
    }

    public void b(ero_0 ero_02, boolean bl) {
        this.hKn.b(ero_02, bl);
    }

    public void c(ero_0 ero_02, boolean bl) {
        this.hKn.c(ero_02, bl);
    }

    public void bf(byte by) {
        this.hKm.bf(by);
    }

    public void ddi() {
        this.hKm.ddi();
    }

    public void ddj() {
        this.hKm.ddj();
    }

    public void ddk() {
        this.hKm.ddk();
    }

    public void ddl() {
        this.hKm.ddl();
    }

    @Override
    public final String bvL() {
        if (this.hKl instanceof bhJ) {
            return this.bkI() + "-Fin";
        }
        return super.bvL();
    }

    @Override
    public sm_0 bvR() {
        return this.hKl.doV().bvR();
    }

    @Override
    public int bvS() {
        return this.bvR().bfX();
    }

    @Override
    public sm_0 bvP() {
        return this.hKl.doV().bvP();
    }

    @Override
    public int bvQ() {
        return this.bvP().bfX();
    }

    @Override
    protected void bvv() {
        if (this.bvx() < 8) {
            return;
        }
        FreeParticleSystem freeParticleSystem = agY.bzw().sk(999998);
        freeParticleSystem.r(this.bVz, this.bVA, this.bVB);
        agZ.bzy().b(freeParticleSystem);
        this.clM.add(freeParticleSystem.bLJ());
    }

    @Override
    protected void bvz() {
        if (this.bvx() < 8) {
            return;
        }
        try {
            String string = "currentPathLayer";
            float[] fArray = new float[]{1.0f, 0.0f, 0.0f, 0.9f};
            agu_0 agu_02 = agx_0.bze().eH("currentPathLayer");
            if (agu_02 == null) {
                agu_02 = agx_0.bze().eF("currentPathLayer");
            }
            String string2 = "currentPathCellLayer";
            float[] fArray2 = new float[]{0.0f, 0.0f, 1.0f, 0.9f};
            agu_0 agu_03 = agx_0.bze().eH("currentPathCellLayer");
            if (agu_03 == null) {
                agu_03 = agx_0.bze().eF("currentPathCellLayer");
            }
            if (this.clH != null) {
                aaa_0 aaa_02 = aaa_0.brC();
                agx_0.bze().eI("currentPathLayer");
                agx_0.bze().eI("currentPathCellLayer");
                for (int i = 0; i < this.clH.bDU(); ++i) {
                    int[] nArray = this.clH.tj(i);
                    DisplayedScreenElement displayedScreenElement = aaa_02.e(nArray[0], nArray[1], nArray[2], abd.ccZ);
                    if (displayedScreenElement == null) continue;
                    if (i != this.clI) {
                        agu_02.q(fArray);
                        agx_0.bze().a(displayedScreenElement.brp(), "currentPathLayer");
                        continue;
                    }
                    agu_03.q(fArray2);
                    agx_0.bze().a(displayedScreenElement.brp(), "currentPathCellLayer");
                }
            }
        }
        catch (Exception exception) {
            hKj.error((Object)"", (Throwable)exception);
        }
    }

    public void t(int n, boolean bl) {
        try {
            fqy_0 fqy_02 = fqz_0.giz().YY(n);
            if (blq_0.c(fqy_02)) {
                return;
            }
            if (bl) {
                blq_0.a(this, fqy_02);
            } else {
                blq_0.b(this, fqy_02);
            }
        }
        catch (Exception exception) {
            hKj.error((Object)("Erreur d'animation li\u00e9e au visuel " + n), (Throwable)exception);
            this.dT(this.bpT());
        }
    }

    public void a(fhc_0 fhc_02, short s) {
        this.a(fhc_02, s, this.hKl.aWO());
    }

    @Override
    public boolean bqs() {
        bgy bgy2 = this.hKl;
        if (bgy2 == null) {
            return false;
        }
        if (bgy2.djT()) {
            return super.bqs();
        }
        if (bgy2.bvY()) {
            return super.bqs();
        }
        cpm_1[] cpm_1Array = bgy2.chR();
        if (cpm_1Array != null && cpm_1Array.length > 0) {
            for (int i = 0; i < cpm_1Array.length; ++i) {
                cpm_1 cpm_12 = cpm_1Array[i];
                if (cpm_12 == null) continue;
                cpm_12.aH(bgy2);
                if (!cpm_12.isUsable() || !cpm_12.bxO()) continue;
                return super.bqs();
            }
        }
        return false;
    }

    public void X(int n, int n2, int n3) {
        this.a(new int[]{n, n2, n3}, new int[]{this.bcC(), this.bcD(), this.bcE()});
    }

    @Override
    protected void a(int[] nArray, int[] nArray2) {
        super.a(nArray, nArray2);
        if (this.hKl == null || !this.hKl.bvY()) {
            return;
        }
        if (this.clH == null || this.clI < 0 || this.clI == this.clH.bDU()) {
            return;
        }
        if (this.bvO() instanceof aem_0 || this.bvO() instanceof aeh_0) {
            return;
        }
        FreeParticleSystem freeParticleSystem = agY.bzw().sk(800189);
        freeParticleSystem.r(nArray[0], nArray[1], nArray[2]);
        agZ.bzy().b(freeParticleSystem);
    }

    public bdt_2 ddm() {
        return this.hKn;
    }

    public void ddn() {
        this.hKn.f(this);
    }

    public void ddo() {
        this.hKn.g(this);
    }

    public void ddp() {
        this.hKn.aUI();
    }

    @Override
    public boolean bvY() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        return bgt_02 != null && this.Sn() == bgt_02.Sn();
    }

    @Override
    public void setVisible(boolean bl) {
        super.setVisible(bl);
        fse_1.gFu().a((aef_2)this.hKl, "visible");
    }

    @Override
    protected String qT(int n) {
        try {
            return bdf_1.By(n);
        }
        catch (fu_0 fu_02) {
            hKj.error((Object)"Exception levee", (Throwable)fu_02);
            return null;
        }
    }

    public void chD() {
        if (this.hKs != null) {
            this.hKs.chD();
            this.hKs = null;
        }
    }

    public void a(bjn_1 bjn_12) {
        this.hKs = aJq.a((ZC)this, bjn_12, "blason", null);
    }

    public void fs(boolean bl) {
        this.hKt = bl;
    }

    @Override
    public anp_2 a(int n, int n2, short s, boolean bl, boolean bl2) {
        long l = this.hKl.aqZ();
        bzq_2 bzq_22 = bzp_2.eqt().mA(l);
        bdj_2.hJZ.bqN = bzq_22 == null || !bzq_22.eqx() ? 400 : 1200;
        return super.a(n, n2, s, bl, bl2);
    }

    public void a(bdy_2 bdy_22) {
        this.hKu = bdy_22;
    }

    public bdy_2 ddq() {
        return this.hKu;
    }

    public boolean ddr() {
        return this.hKv;
    }

    public void ft(boolean bl) {
        this.hKv = bl;
    }

    public void dds() {
        if (wa_0.k(this.bvI(), this.bvJ(), this.bvK())) {
            if (!aeC.bwx().equals(this.bvD())) {
                this.a(aeC.bwx());
                this.dT("AnimArtefact-Nager-Statique");
            }
        } else if (aeC.bwx().equals(this.bvD())) {
            if (this.bwb()) {
                this.bwc();
            } else {
                this.a(aeB.bww());
            }
            this.dT(this.bpT());
        }
    }

    @Override
    protected boolean b(acp_1 acp_12, int n, int n2, float[] fArray) {
        boolean bl = super.b(acp_12, n, n2, fArray);
        if (bl) {
            this.fu(false);
        }
        return bl;
    }

    @Override
    protected boolean c(acp_1 acp_12, int n, int n2, float[] fArray) {
        boolean bl = super.c(acp_12, n, n2, fArray);
        if (bl) {
            this.fu(true);
        }
        return bl;
    }

    private void fu(boolean bl) {
        bhJ bhJ2;
        bjo_0 bjo_02;
        if (this.hKl instanceof bhJ && (bjo_02 = (bhJ2 = (bhJ)this.hKl).dpe()) != null && bjo_02.eam() != null && bjo_02.eam().isVisible() == !bl) {
            bjo_02.eam().setVisible(bl);
        }
    }

    @Override
    public Byte bHZ() {
        fos_0 fos_02 = this.ddt();
        if (fos_02 == null) {
            return null;
        }
        return (byte)fos_02.gfA().d();
    }

    @Override
    public void bwd() {
        if (this.hKl.bwb() && this.ddv().isEmpty() && !this.hKl.djT()) {
            this.hKl.dni();
        }
    }

    @Nullable
    private fos_0 ddt() {
        if (this.hKl == null || !(this.hKl instanceof bhJ)) {
            return null;
        }
        bjo_0 bjo_02 = ((bhJ)this.hKl).dpf();
        if (bjo_02 == null) {
            return null;
        }
        fnl_0 fnl_02 = bjo_02.ead();
        if (fnl_02 == null) {
            return null;
        }
        if (fnl_02.agK() != 0) {
            return fou_0.sLB.aA(fnl_02.agK());
        }
        return fou_0.sLB.az(fnl_02.geL().aVt());
    }

    @Override
    public Integer bIa() {
        fos_0 fos_02 = this.ddt();
        if (fos_02 == null) {
            return null;
        }
        return fos_02.d();
    }

    public String toString() {
        return "CharacterActor{m_characterInfo=" + String.valueOf(this.hKl) + "}";
    }

    public String ddu() {
        return this.ddv().map(bke_2::dsL).orElse(this.bpT());
    }

    public Optional<bke_2> ddv() {
        return Optional.ofNullable(this.hKo);
    }

    public bke_2 a(bjo_0 bjo_02) {
        fnl_0 fnl_02 = bjo_02.ead();
        return new bke_2(cdO.a(fnl_02), ((for_0)fnl_02.geL()).gfy(), this);
    }

    public void a(@Nullable bke_2 bke_22) {
        this.hKo = bke_22;
    }

    @Override
    public boolean bwb() {
        return this.hKl != null && this.hKl.bwb();
    }

    @Override
    public void bwc() {
        this.ddv().ifPresent(bke_2::dsM);
    }

    @Override
    public boolean cf(boolean bl) {
        return bl ? this.hKl instanceof bgt_0 : this.hKl instanceof bhJ;
    }
}

