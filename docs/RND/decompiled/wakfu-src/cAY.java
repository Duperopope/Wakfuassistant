/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.openal.ALCcontext
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import com.jogamp.openal.ALCcontext;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class cAY
extends ald_2
implements uf_0,
aeh_2,
afp<ads_0, bze_2> {
    public static final int mpY = 0;
    public static final int mpZ = 10;
    public static final int mqa = 20;
    public static final float mqb = 1.0f;
    public static final int mqc = 200000;
    public static final int mqd = 200200;
    public static final int mqe = 291000;
    public static final int mqf = 5000;
    public static final int mqg = 12000;
    public static final float mqh = 0.7f;
    public static final int mqi = 290996;
    public static final int mqj = 290997;
    public static final int mqk = 0;
    public static final int mql = 15384;
    public static final int mqm = 600001;
    public static final int mqn = 600005;
    public static final int mqo = 600002;
    public static final int mqp = 600003;
    public static final int mqq = 600004;
    public static final int mqr = 600006;
    public static final int mqs = 600007;
    public static final int mqt = 600008;
    public static final int mqu = 600009;
    public static final int mqv = 600010;
    public static final int mqw = 600011;
    public static final int mqx = 600012;
    public static final int mqy = 600013;
    public static final int mqz = 600014;
    public static final int mqA = 600015;
    public static final int mqB = 600016;
    public static final int mqC = 600017;
    public static final int mqD = 600018;
    public static final int mqE = 600019;
    public static final int mqF = 600020;
    public static final int mqG = 600021;
    public static final int mqH = 600022;
    public static final int mqI = 600023;
    public static final int mqJ = 600024;
    public static final int mqK = 600025;
    public static final int mqL = 600026;
    public static final int mqM = 600027;
    public static final int mqN = 600028;
    public static final int mqO = 600029;
    public static final int mqP = 600030;
    public static final int mqQ = 600036;
    public static final int mqR = 600037;
    public static final int mqS = 600038;
    public static final int mqT = 600039;
    public static final int mqU = 600040;
    public static final int mqV = 600043;
    public static final int mqW = 600044;
    public static final int mqX = 600045;
    public static final int mqY = 600046;
    public static final int mqZ = 600046;
    public static final int mra = 600053;
    public static final int mrb = 600054;
    public static final int mrc = 600057;
    public static final int mrd = 600058;
    public static final int mre = 600059;
    public static final int mrf = 600060;
    public static final int mrg = 600062;
    public static final int mrh = 600063;
    public static final int mri = 600064;
    public static final int mrj = 600065;
    public static final int mrk = 600066;
    public static final int mrl = 600067;
    public static final int mrm = 600068;
    public static final int mrn = 600069;
    public static final int mro = 600070;
    public static final int mrp = 600071;
    public static final int mrq = 600072;
    public static final int mrr = 600074;
    public static final int mrs = 600075;
    public static final int mrt = 600077;
    public static final int mru = 600078;
    public static final int mrv = 600082;
    public static final int mrw = 600083;
    public static final int mrx = 600109;
    public static final int mry = 600114;
    public static final int mrz = 600195;
    public static final int mrA = 600116;
    public static final int mrB = 600117;
    public static final int mrC = 600118;
    public static final int mrD = 600119;
    public static final int mrE = 600120;
    public static final int mrF = 600121;
    public static final int mrG = 600122;
    public static final int mrH = 600123;
    public static final int mrI = 600124;
    public static final int mrJ = 600125;
    public static final int mrK = 600126;
    public static final int mrL = 600127;
    public static final int mrM = 600128;
    public static final int mrN = 600129;
    public static final int mrO = 600130;
    public static final int mrP = 600131;
    public static final int mrQ = 600132;
    public static final int mrR = 600133;
    public static final int mrS = 600134;
    public static final int mrT = 600136;
    public static final int mrU = 600137;
    public static final int mrV = 600138;
    public static final int mrW = 600139;
    public static final int mrX = 600140;
    public static final int mrY = 600141;
    public static final int mrZ = 600142;
    public static final int msa = 600143;
    public static final int msb = 600144;
    public static final int msc = 600145;
    public static final int msd = 600146;
    public static final int mse = 600147;
    public static final int msf = 600148;
    public static final int msg = 600149;
    public static final int msh = 600152;
    public static final int msi = 600153;
    public static final int msj = 600154;
    public static final int msk = 600155;
    public static final int msl = 600156;
    public static final int msm = 600158;
    public static final int msn = 600182;
    public static final int mso = 600193;
    public static final int msp = 600197;
    public static final int msq = 600204;
    public static final int msr = 600205;
    public static final int mss = 600205;
    public static final int mst = 600204;
    public static final int msu = 600206;
    public static final int msv = 600207;
    public static final int msw = 600208;
    public static final int msx = 600209;
    public static final int msy = 600210;
    public static final int msz = 600211;
    private static final boolean msA = false;
    public static final int msB = 2160;
    public static final float msC = 0.3f;
    public static final int msD = 500;
    public static final String msE = "debugEnabled";
    public static final String msF = "selectedDevice";
    public static final String msG = "devicesAvailables";
    public static final String[] msH = new String[]{"debugEnabled", "selectedDevice", "devicesAvailables"};
    @Nullable
    private List<String> msI;
    @Nullable
    private List<cAM> msJ;
    private boolean msK = true;
    private final aig_2 msL = new cAZ(this);
    private final ftx_1 msM = new cBh(this);
    private agf_1 msN;
    private boolean msO;
    private final cBn msP = new cBn();
    private final cAS msQ = new cAS();
    final cAU msR = new cAU();
    private final cAW msS = new cAW();
    private static final cAY msT = new cAY();
    private ahi_2 msU = new ahi_2(new String[0]);
    private boolean msV;
    boolean msW;
    private boolean msX;
    private long msY;
    private final ArrayList<ahc_2> msZ = new ArrayList();
    private final ArrayList<ahc_2> mta = new ArrayList();
    private long mtb;
    private float mtc;
    private short mtd = (short)-1;
    private boolean mte;
    cBe mtf;
    cBe mtg;
    cBe mth;
    private ahk_1 mti;
    private ahk_1 mtj;
    private Runnable mtk;
    private TIntObjectHashMap<agr_1> mtl;
    private TIntObjectHashMap<agq_1> mtm;
    private aah_1<agz_1> mtn;

    public static cAY eHc() {
        return msT;
    }

    private cAY() {
        ahu_1.c(this);
    }

    private cBe a(byte by, cBe cBe2, float f2, int n) {
        float f3 = 1.0f;
        if (cBe2 != null) {
            f3 = cBe2.mtH;
            abg_2.bUP().h(cBe2);
        } else {
            switch (by) {
                case 0: {
                    f3 = cAN.mpo.eGS().cbK();
                    break;
                }
                case 1: {
                    f3 = cAN.mpp.eGT().cbK();
                    break;
                }
                case 2: {
                    f3 = cAN.mps.eGT().cbK();
                }
            }
        }
        int n2 = 100;
        int n3 = Math.max(1, n / 100);
        cBe cBe3 = new cBe(this, by, f3, f2, n3);
        abg_2.bUP().a((Runnable)cBe3, 100L, n3);
        return cBe3;
    }

    public void e(float f2, int n) {
        this.mtf = this.a((byte)0, this.mtf, f2, n);
    }

    public void f(float f2, int n) {
        this.mtg = this.a((byte)1, this.mtg, f2, n);
    }

    public void g(float f2, int n) {
        this.mth = this.a((byte)2, this.mth, f2, n);
    }

    @Override
    protected boolean cdE() {
        ue_0.bjV().a(this);
        try {
            this.msO = auc_0.cVq().aK("soundAmbianceEnable");
            if (this.msO) {
                this.msP.dJ(auc_0.kG("dynamicSoundAmbianceFile"));
                this.msP.c(new cBa(this));
            }
        }
        catch (fu_0 fu_02) {
            dQs.warn((Object)fu_02.getMessage());
        }
        cbr_0.eIZ().a(new cbz_0());
        if (this.msN != null) {
            this.msN.cbw();
        }
        for (cAN cAN2 : cAN.values()) {
            cAN2.eGX();
        }
        cAN.mpo.eGS().dN(auc_0.cVq().cVA());
        this.a(cAN.mpo.eGS());
        cAN.mpo.eGU().dN(auc_0.cVq().cVA());
        this.a(cAN.mpo.eGU());
        cAN.mpp.eGS().dN(auc_0.cVq().cVw());
        this.a(cAN.mpp.eGS());
        cAN.mpp.eGT().dN(auc_0.cVq().cVw());
        this.a(cAN.mpp.eGT());
        cAN.mpp.eGU().dN(auc_0.cVq().cVw());
        this.a(cAN.mpp.eGU());
        cAN.mpq.eGU().dN(auc_0.cVq().cVx());
        this.a(cAN.mpq.eGU());
        cAN.mps.eGT().dN(auc_0.cVq().cVz());
        this.a(cAN.mps.eGT());
        cAN.mpu.eGT().dN(auc_0.cVq().cVv());
        this.a(cAN.mpu.eGT());
        cAN.mpu.eGU().dN(auc_0.cVq().cVv());
        this.a(cAN.mpu.eGU());
        cAN.mpr.eGT().dN(auc_0.cVq().cVy());
        this.a(cAN.mpr.eGT());
        cAN.mpr.eGU().dN(auc_0.cVq().cVy());
        this.a(cAN.mpr.eGU());
        cAN.mpt.eGT().dN(auc_0.cVq().cVB());
        this.a(cAN.mpt.eGT());
        cAN.mpt.eGU().dN(auc_0.cVq().cVB());
        this.a(cAN.mpt.eGU());
        cAN.mpw.eGT().dN(auc_0.cVq().cVt());
        this.a(cAN.mpw.eGT());
        cAN.mpw.eGU().dN(auc_0.cVq().cVt());
        this.a(cAN.mpw.eGU());
        cAN.mpv.eGT().dN(auc_0.cVq().cVu());
        this.a(cAN.mpv.eGT());
        cAN.mpv.eGU().dN(auc_0.cVq().cVu());
        this.a(cAN.mpv.eGU());
        agi_1.dLL = auc_0.cVq().cVC();
        agi_1.dLK = auc_0.cVq().cVD();
        aiv_2.bBr().a(this.msL);
        aiv_2.bBr().a(this.msQ);
        aiv_2.bBr().a(this.msR);
        aiv_2.bBr().a(this.msS);
        return true;
    }

    @Override
    public void ic(@Nullable String string) {
        super.ic(string);
        this.eHf();
    }

    @Override
    protected void hR(long l) {
        super.hR(l);
        this.msL.bBm();
        int n = aie_0.cfn().bmC().bqL().bqG();
        if (this.cEJ != n) {
            this.sM(n);
        }
    }

    @Override
    public void b(ALCcontext aLCcontext) {
        super.b(aLCcontext);
        this.eHf();
    }

    public void eHd() {
        if (this.cdv()) {
            fse_1.gFu().a((aef_2)cAM.mpj, cAM.mpm);
        }
    }

    public void eHe() {
        this.eHd();
        fse_1.gFu().a((aef_2)this, msG);
    }

    public void eHf() {
        this.eHd();
        fse_1.gFu().a((aef_2)this, msF);
    }

    @Override
    protected void cdF() {
        this.b(cAN.mpo.eGS());
        this.b(cAN.mpo.eGU());
        this.b(cAN.mpp.eGS());
        this.b(cAN.mpp.eGT());
        this.b(cAN.mpp.eGU());
        this.b(cAN.mpr.eGT());
        this.b(cAN.mpr.eGU());
        this.b(cAN.mpq.eGU());
        this.b(cAN.mps.eGT());
        this.b(cAN.mpu.eGT());
        this.b(cAN.mpu.eGU());
        this.b(cAN.mpt.eGT());
        this.b(cAN.mpt.eGU());
        this.b(cAN.mpw.eGT());
        this.b(cAN.mpw.eGU());
        this.b(cAN.mpv.eGT());
        this.b(cAN.mpv.eGU());
        aiv_2.bBr().a(this.msL);
        bzj_2.eqi().c(this);
    }

    public void eHg() {
        if (!this.cdn()) {
            return;
        }
        try {
            cAN.mpp.eGS().bhk();
            cAN.mpp.eGT().bhk();
            cAN.mpp.eGU().bhk();
            cAN.mpq.eGU().bhk();
            cAN.mpr.eGT().bhk();
            cAN.mpr.eGU().bhk();
            cAN.mpu.eGT().bhk();
            cAN.mpu.eGU().bhk();
            cAN.mpt.eGT().bhk();
            cAN.mpt.eGU().bhk();
            cAN.mpw.eGT().bhk();
            cAN.mpw.eGU().bhk();
            cAN.mpv.eGT().bhk();
            cAN.mpv.eGU().bhk();
        }
        catch (Exception exception) {
            dQs.error((Object)"Erreur lors de l'arr\u00eat des sons du monde ", (Throwable)exception);
        }
    }

    private void eHh() {
        ArrayList<ahc_2> arrayList;
        ahc_2 ahc_22;
        if (!this.msV || !this.mte || this.msW || this.msX) {
            return;
        }
        this.mte = false;
        boolean bl = ue_0.bjV().bjr();
        adD adD2 = adf_0.buP().av(this.mtd);
        if (adD2 == null) {
            this.eHj();
            this.eHk();
            return;
        }
        ahc_2 ahc_23 = ahc_22 = bl ? adD2.buK() : adD2.buL();
        if (ahc_22 == null) {
            this.eHj();
        } else {
            this.g(ahc_22.ccf(), (float)ahc_22.cch() / 100.0f);
        }
        ArrayList<ahc_2> arrayList2 = arrayList = bl ? adD2.buG() : adD2.buH();
        if (arrayList == null) {
            this.eHk();
        } else {
            cAN.mpo.eGS().a(arrayList, adD2.buO());
        }
        this.msZ.clear();
        this.msZ.addAll(adD2.buI());
        this.mta.clear();
        this.mta.addAll(adD2.buJ());
    }

    public void jw(boolean bl) {
        cAN.mpo.eGS().dT(bl);
        this.mte = true;
        this.eHh();
    }

    public void eGW() {
        for (cAN cAN2 : cAN.values()) {
            cAN2.eGW();
        }
        this.msV = true;
        ahd_2 ahd_22 = cAN.mpo.eGS();
        ahd_22.yc(4000);
        ahd_22.yb(4000);
        if (this.msO) {
            this.msP.ccA();
        }
    }

    public void eHi() {
        if (this.msO) {
            this.msP.ccA();
        }
    }

    public void eGX() {
        ahk_1 ahk_12;
        for (cAN cAN2 : cAN.values()) {
            cAN2.eGX();
        }
        this.msV = false;
        ahd_2 ahd_22 = cAN.mpo.eGS();
        ahd_22.yc(1000);
        ahd_22.yb(1000);
        this.mtd = (short)-1;
        this.mte = false;
        this.msW = false;
        this.msX = false;
        if (this.msO) {
            this.msP.bhk();
        }
        if ((ahk_12 = this.nO(200000L)) == null) {
            this.eHk();
        }
    }

    @Override
    public void bq(boolean bl) {
        this.mte = true;
        this.eHh();
    }

    public void cH(short s) {
        this.b(s, false);
    }

    public void b(short s, boolean bl) {
        if (s == this.mtd && !bl) {
            return;
        }
        this.mtd = s;
        this.mte = true;
        this.eHh();
    }

    public void jx(boolean bl) {
        cAN.mpo.eGS().dU(bl);
    }

    public void g(long l, float f2) {
        this.b(l, f2, true);
    }

    @Override
    private void b(long l, float f2, boolean bl) {
        if (!this.cdn()) {
            return;
        }
        if (l == 0L) {
            return;
        }
        ahd_2 ahd_22 = cAN.mpp.eGS();
        if (bl) {
            this.mtb = l;
            this.mtc = f2;
        }
        if (!this.msW) {
            ahd_22.e(l, f2);
        }
    }

    public void eHj() {
        if (!this.cdn()) {
            return;
        }
        ahd_2 ahd_22 = cAN.mpp.eGS();
        ahd_22.dW(4000.0f);
    }

    @Nullable
    public ahk_1 nO(long l) {
        float f2 = cAN.mpo.eGS().bBt();
        return this.h(l, f2);
    }

    public void b(long l, float f2) {
        float f3 = cAN.mpo.eGS().bBt();
        this.h(l, f3 * f2);
    }

    @Nullable
    public ahk_1 h(long l, float f2) {
        if (l != 0L) {
            return cAN.mpo.eGS().e(l, f2);
        }
        return null;
    }

    private void eHk() {
        if (!this.cdn()) {
            return;
        }
        ahd_2 ahd_22 = cAN.mpo.eGS();
        if (ahd_22.ccm() != ahf_2.dOD) {
            ahd_22.s(null);
        }
        if (!this.msW) {
            try {
                ahd_22.ccn();
            }
            catch (Exception exception) {
                dQs.warn((Object)"Probl\u00e8me \u00e0 l'arr\u00eat du groupe de musique.");
            }
        }
    }

    public void a(long l, boolean bl, int n) {
        if (!this.cdn()) {
            return;
        }
        if (n == -1) {
            this.r(l, bl);
        } else {
            abg_2.bUP().a((Runnable)new cBf(this, l, bl), n, 1);
        }
    }

    @Nullable
    public ahk_1 nP(long l) {
        if (!this.cdn()) {
            return null;
        }
        return this.r(l, false);
    }

    @Nullable
    public ahk_1 r(long l, boolean bl) {
        return this.a(cAN.mps.eGT(), l, bl);
    }

    @Nullable
    public ahk_1 a(long l, float f2, int n, int n2, int n3) {
        ahd_2 ahd_22 = cAN.mpo.eGS();
        float f3 = ahd_22.cbL();
        ahd_22.br(f3 * f2, n);
        abg_2.bUP().a((Runnable)new cBb(this, ahd_22, f3, n2), n3, 1);
        return this.nP(l);
    }

    public void b(long l, float f2, int n, int n2, int n3) {
        ahd_2 ahd_22 = cAN.mpo.eGS();
        float f3 = ahd_22.cbL();
        ahd_22.br(f3 * f2, n);
        abg_2.bUP().a((Runnable)new cBc(this, ahd_22, f3, n2), n3, 1);
        this.a(l, false, n);
    }

    @Nullable
    public ahk_1 nQ(long l) {
        return this.s(l, false);
    }

    @Nullable
    public ahk_1 s(long l, boolean bl) {
        return this.a(cAN.mpu.eGT(), l, bl);
    }

    @Nullable
    private ahk_1 a(agk_1 agk_12, long l, boolean bl) {
        if (!this.cdn()) {
            return null;
        }
        return agk_12.a(l, true, true, bl, -1L);
    }

    public void eHl() {
        if (!this.cdn()) {
            return;
        }
        try {
            cAN.mps.eGT().bhk();
        }
        catch (Exception exception) {
            dQs.warn((Object)("Probl\u00e8me lors de l'arr\u00eat des sons de l'interface : " + exception.getMessage()));
        }
    }

    public void reset() {
        ahd_2 ahd_22;
        this.msX = false;
        if (this.msW) {
            this.msW = false;
            ahd_22 = cAN.mpp.eGS();
            ahd_22.yb(4000);
            cAN.mpq.eGU().dO(((bsg_1)aie_0.cfn().bmH()).a(afd.cpC));
        }
        ahd_22 = cAN.mpo.eGS();
        ahd_22.yc(4000);
        ahd_22.yb(4000);
    }

    public boolean eHm() {
        return this.msK;
    }

    public void jy(boolean bl) {
        this.msK = bl;
    }

    public ftx_1 eHn() {
        return this.msM;
    }

    public void Ly(int n) {
        if (!this.cdn()) {
            return;
        }
        if (this.mti == null && this.mtj == null && this.mtk == null) {
            this.mtj = this.r(n, true);
        }
    }

    public void ae(int n, int n2, int n3) {
        if (!this.cdn()) {
            return;
        }
        if (this.mti == null && this.mtj == null && this.mtk == null) {
            this.mti = this.r(n, false);
            this.mtk = () -> {
                this.mtj = this.r(n3, true);
                this.mtk = null;
            };
            abg_2.bUP().a(this.mtk, n2, 1);
        }
    }

    public void jz(boolean bl) {
        if (bl) {
            this.ae(600001, 2160, 600005);
        } else {
            this.Ly(600005);
        }
    }

    public void eHo() {
        if (!this.cdn()) {
            return;
        }
        if (this.mtk != null) {
            abg_2.bUP().h(this.mtk);
            this.mtk = null;
        }
        if (this.mti != null) {
            this.mti.ee(0.01f);
            this.mti = null;
        }
        if (this.mtj != null) {
            this.mtj.ee(0.01f);
            this.mtj = null;
        }
    }

    public void eHp() {
        if (!this.cdn()) {
            return;
        }
        this.nP(600011L);
    }

    public void eHq() {
        if (!this.cdn()) {
            return;
        }
        ahk_1 ahk_12 = this.nP(600012L);
        if (ahk_12 != null) {
            float f2 = ahk_12.bBt();
            ahk_12.cI(f2 * 0.5f);
        }
    }

    public void eHr() {
        if (!this.cdn()) {
            return;
        }
        ahk_1 ahk_12 = this.nP(600013L);
        if (ahk_12 != null) {
            float f2 = ahk_12.bBt();
            ahk_12.cI(f2 * 0.5f);
        }
    }

    public void c(ffS ffS2, int n) {
        if (!this.cdn()) {
            return;
        }
        if (!this.msK) {
            return;
        }
        if (ffS2 == null) {
            this.nP(n);
        } else {
            switch (ffS2) {
                case sgS: {
                    this.nP(600037L);
                    break;
                }
                case sgQ: 
                case sgR: {
                    this.nP(600038L);
                    break;
                }
                case sgF: {
                    this.nP(600036L);
                    break;
                }
                case sgN: {
                    this.nP(600028L);
                    break;
                }
                case sgH: {
                    this.nP(600029L);
                    break;
                }
                default: {
                    this.nP(n);
                }
            }
        }
        this.eHu();
    }

    public void l(ffS ffS2) {
        this.c(ffS2, 600030);
    }

    public void eHs() {
        this.m(null);
    }

    public void m(ffS ffS2) {
        this.c(ffS2, 600043);
    }

    public void eHt() {
        if (!this.cdn() || !this.msK) {
            return;
        }
        this.nP(600040L);
        this.eHu();
    }

    private void eHu() {
        this.msK = false;
        abg_2.bUP().a(() -> {
            this.msK = true;
        }, 1000L, 1);
    }

    public void eHv() {
        this.jx(boa_2.ehn().ehr() < 0.0f);
    }

    public synchronized void i(long l, float f2) {
        this.nS(l);
        if (this.msW) {
            return;
        }
        ahd_2 ahd_22 = cAN.mpo.eGS();
        ahd_22.yb(1000);
        ahd_22.yc(1000);
        ahd_22.dV(true);
        float f3 = ahd_22.bBt();
        float f4 = GC.b(f2 * f3, 0.0f, 1.0f);
        ahd_22.e(this.msY, f4);
    }

    public synchronized void nR(long l) {
        this.nS(l);
        if (this.msW) {
            return;
        }
        ahd_2 ahd_22 = cAN.mpo.eGS();
        ahd_22.yb(1000);
        ahd_22.yc(1000);
        ahd_22.dV(true);
        ahd_22.e(this.msY, ahd_22.bBt());
    }

    private synchronized void nS(long l) {
        this.msX = true;
        this.msY = l;
    }

    public synchronized void bBk() {
        this.msX = false;
        if (this.msW) {
            return;
        }
        ahd_2 ahd_22 = cAN.mpo.eGS();
        ahd_22.yb(2000);
        ahd_22.yc(1000);
        ahd_22.dV(false);
        ahd_22.yc(4000);
        ahd_22.yb(4000);
        this.eHh();
    }

    public void eHw() {
        if (!this.cdn()) {
            return;
        }
        this.nP(600067L);
    }

    public synchronized ahc_2 n(bsj_0 bsj_02) {
        if (!this.cdn()) {
            return null;
        }
        this.msW = true;
        if (this.msO) {
            this.msP.bhk();
        }
        cAN.mpq.eGU().dO(true);
        cAN.mpo.eGU().dO(true);
        cAN.mpp.eGU().dN(0.3f * auc_0.cVq().cVw());
        ahc_2 ahc_22 = this.o(bsj_02);
        ahd_2 ahd_22 = cAN.mpo.eGS();
        ahd_22.yb(1000);
        ahd_22.yc(1500);
        if (!this.msX) {
            ahd_22.dV(true);
        }
        ahd_22.e(ahc_22.ccf(), 0.4f * (float)ahc_22.cch() / 100.0f);
        return ahc_22;
    }

    private ahc_2 o(bsj_0 bsj_02) {
        ArrayList<ahc_2> arrayList;
        ArrayList<ahc_2> arrayList2 = arrayList = this.p(bsj_02) ? this.mta : this.msZ;
        if (arrayList.isEmpty()) {
            return new ahc_2(200200L, 1, 0, 0);
        }
        return arrayList.get(GC.mR(arrayList.size()));
    }

    private boolean p(bsj_0 bsj_02) {
        for (bgy bgy2 : bsj_02.dGs()) {
            bhx_0 bhx_02;
            if (!(bgy2 instanceof bhx_0) || (bhx_02 = (bhx_0)bgy2).doD() == null && !bgy2.i(ezj_0.psW)) continue;
            return true;
        }
        return false;
    }

    public void a(ahc_2 ahc_22) {
        if (!this.cdn()) {
            return;
        }
        ahd_2 ahd_22 = cAN.mpo.eGS();
        ahk_1 ahk_12 = ahd_22.ccl();
        if (ahk_12 != null) {
            ahk_12.dQ(ahc_22.ccf());
            ahk_12.br((float)ahc_22.cch() / 100.0f, 1000.0f);
        }
    }

    public void q(bsj_0 bsj_02) {
        if (!this.cdn()) {
            return;
        }
        ahd_2 ahd_22 = cAN.mpo.eGS();
        ahc_2 ahc_22 = this.o(bsj_02);
        ahd_22.e(ahc_22.ccf(), (float)ahc_22.cch() / 100.0f);
    }

    public void jA(boolean bl) {
        if (!this.cdn()) {
            return;
        }
        if (!this.msW) {
            return;
        }
        ahd_2 ahd_22 = cAN.mpo.eGS();
        ahd_22.yc(1000);
        ahd_22.yb(0);
        ahd_22.e(bl ? 291000L : 290996L, 0.7f);
        abg_2.bUP().a(this::eHx, 5000L, 1);
    }

    public synchronized void eHx() {
        if (!this.cdn()) {
            return;
        }
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02 == null) {
            return;
        }
        ahd_2 ahd_22 = cAN.mpp.eGS();
        ahd_22.yb(4500);
        this.g(this.mtb, this.mtc);
        cAN.mpq.eGU().dO(((bsg_1)aie_0.cfn().bmH()).a(afd.cpC));
        cAN.mpo.eGU().dO(((bsg_1)aie_0.cfn().bmH()).a(afd.cpB));
        cAN.mpp.eGU().dN(auc_0.cVq().cVw());
        ahd_2 ahd_23 = cAN.mpo.eGS();
        if (this.msX) {
            ahd_23.e(this.msY, 0.5f);
        } else {
            ahd_23.dV(false);
            ahd_23.yc(1500);
            ahd_23.yb(4500);
        }
        this.msW = false;
        this.eHh();
        if (this.msO) {
            this.msP.ccA();
            bzq_1.lCJ.epV();
            cBk.eIg();
        }
    }

    public final void eHy() {
        agu_1 agu_12 = cAN.mpq.eGU();
        agu_12.dQ(false);
    }

    public final void eHz() {
        agu_1 agu_12 = cAN.mpq.eGU();
        agu_12.dQ(true);
    }

    @Override
    public final void b(ads_0 ads_02, bze_2 bze_22, bze_2 bze_23) {
        if (!this.cdn()) {
            return;
        }
    }

    public void oU(String string) {
        this.msN = cAO.oO(string);
    }

    public void eT(float f2) {
        if (!this.cdn()) {
            return;
        }
        this.a(cAN.mpo.eGS(), f2);
        this.a(cAN.mpo.eGU(), f2);
    }

    private void a(agk_1 agk_12, float f2) {
        agk_12.dQ(f2);
        agk_12.dP(f2);
    }

    public float eHA() {
        return cAN.mpo.eGS().cbM();
    }

    public void jB(boolean bl) {
        if (!this.cdn()) {
            return;
        }
        cAN.mpo.eGS().dO(bl);
        cAN.mpo.eGU().dO(bl);
    }

    public boolean eHB() {
        return cAN.mpo.eGS().cbN();
    }

    public void eU(float f2) {
        if (!this.cdn()) {
            return;
        }
        this.a(cAN.mps.eGT(), f2);
    }

    public void eV(float f2) {
        if (!this.cdn()) {
            return;
        }
        this.a(cAN.mpp.eGS(), f2);
        this.a(cAN.mpp.eGT(), f2);
        this.a(cAN.mpp.eGU(), f2);
        this.a(cAN.mpq.eGU(), f2);
        this.a(cAN.mpr.eGT(), f2);
        this.a(cAN.mpr.eGU(), f2);
        this.a(cAN.mpu.eGT(), f2);
        this.a(cAN.mpu.eGU(), f2);
        this.a(cAN.mpt.eGT(), f2);
        this.a(cAN.mpt.eGU(), f2);
        this.a(cAN.mpw.eGT(), f2);
        this.a(cAN.mpw.eGU(), f2);
        this.a(cAN.mpv.eGT(), f2);
        this.a(cAN.mpv.eGU(), f2);
    }

    public float eHC() {
        return cAN.mpp.eGT().cbM();
    }

    public void jC(boolean bl) {
        if (!this.cdn()) {
            return;
        }
        cAN.mps.eGT().dO(bl);
    }

    public boolean eHD() {
        return cAN.mps.eGT().cbN();
    }

    public void jD(boolean bl) {
        if (!this.cdn()) {
            return;
        }
        cAN.mpp.eGS().dO(bl);
        cAN.mpp.eGT().dO(bl);
        cAN.mpp.eGU().dO(bl);
        cAN.mpr.eGT().dO(bl);
        cAN.mpr.eGU().dO(bl);
        cAN.mpq.eGU().dO(bl);
        cAN.mpu.eGT().dO(bl);
        cAN.mpu.eGU().dO(bl);
        cAN.mpt.eGT().dO(bl);
        cAN.mpt.eGU().dO(bl);
        cAN.mpw.eGT().dO(bl);
        cAN.mpw.eGU().dO(bl);
        cAN.mpv.eGT().dO(bl);
        cAN.mpv.eGU().dO(bl);
    }

    public boolean eHE() {
        return cAN.mpp.eGS().cbN();
    }

    @Override
    public agw_1 a(agd_1 agd_12, int n, int n2, int n3) {
        agw_1 agw_12;
        ahz_1 ahz_12;
        agu_1 agu_12;
        if (!this.cdn()) {
            return null;
        }
        if (agd_12 == null) {
            return null;
        }
        long l = ahk_2.hT(agd_12.bwC());
        cAN cAN2 = cAN.nN(l);
        if (cAN2 == null || cAN2.eGU() == null) {
            cAN2 = cAN.mpq;
        }
        if (!(agu_12 = cAN2.eGU()).cbO()) {
            return null;
        }
        try {
            ahz_12 = agu_12.cbI().hE(agd_12.bwC());
        }
        catch (IOException iOException) {
            dQs.debug((Object)("Impossible de charger le son d'id " + agd_12.bwC()));
            return null;
        }
        if (ahz_12 == null) {
            dQs.debug((Object)("Impossible de charger le son d'id " + agd_12.bwC()));
            return null;
        }
        try {
            int n4 = aie_0.cfn().bmC().n(n, n2, n3);
            agw_12 = agu_12.a(ahz_12, agd_12.bwE(), 1.0f, new aha_2(n, n2, n3, false, n4), agd_12.bwI(), agd_12.bwF(), agd_12.bwH(), agd_12.bwJ(), agd_12.bwG(), true, false, false, 200.0f, agd_12.bwC(), -1L);
        }
        catch (Exception exception) {
            dQs.debug((Object)"Exception lev\u00e9e lors de la cr\u00e9ation d'une source positionn\u00e9e", (Throwable)exception);
            return null;
        }
        return agw_12;
    }

    @Override
    public void a(agm_1 agm_12) {
        if (agm_12 == null) {
            dQs.warn((Object)"setListener(null), ne devrait pas arriver");
        }
        if (!this.cdn()) {
            return;
        }
        super.a(agm_12);
        cAN.mpo.eGU().a(agm_12);
        cAN.mpp.eGU().a(agm_12);
        cAN.mpq.eGU().a(agm_12);
        cAN.mpr.eGU().a(agm_12);
        cAN.mpu.eGU().a(agm_12);
        cAN.mpt.eGU().a(agm_12);
        cAN.mpv.eGU().a(agm_12);
        cAN.mpw.eGU().a(agm_12);
        cAN.mpp.eGT().a(agm_12);
        cAN.mpr.eGT().a(agm_12);
        cAN.mpu.eGT().a(agm_12);
        cAN.mpt.eGT().a(agm_12);
        cAN.mpv.eGT().a(agm_12);
        cAN.mpw.eGT().a(agm_12);
    }

    public void oV(String string) {
        if (!this.cdn()) {
            return;
        }
        aqr_2 aqr_22 = new aqr_2();
        aqs_2 aqs_22 = new aqs_2();
        aqr_22.ex(string);
        aqr_22.a(aqs_22, new ape_1[0]);
        aqr_22.close();
        apd_1 apd_12 = aqs_22.ez("reverbs");
        this.mtl = agr_1.g(apd_12);
    }

    @Override
    protected agr_1 yn(int n) {
        return (agr_1)this.mtl.get(n);
    }

    @Override
    protected void yo(int n) {
        cAN.mpo.eGU().ya(n);
        cAN.mpp.eGT().ya(n);
        cAN.mpp.eGU().ya(n);
        cAN.mpq.eGU().ya(n);
        cAN.mpr.eGT().ya(n);
        cAN.mpr.eGU().ya(n);
        cAN.mpt.eGT().ya(n);
        cAN.mpt.eGU().ya(n);
        cAN.mpu.eGT().ya(n);
        cAN.mpw.eGT().ya(n);
        cAN.mpw.eGU().ya(n);
    }

    public void oW(String string) {
        if (!this.cdn()) {
            return;
        }
        aqr_2 aqr_22 = new aqr_2();
        aqs_2 aqs_22 = new aqs_2();
        aqr_22.ex(string);
        aqr_22.a(aqs_22, new ape_1[0]);
        aqr_22.close();
        apd_1 apd_12 = aqs_22.ez("lowpasses");
        this.mtm = agq_1.g(apd_12);
        this.yk(0);
    }

    @Override
    protected agq_1 ym(int n) {
        if (this.mtm == null || this.mtm.size() == 0) {
            return agq_1.dML;
        }
        return (agq_1)this.mtm.get(n);
    }

    public void eHF() {
        try {
            String string = auc_0.kG("rollOffPresetFile");
            cAY.eHc().oX(string);
        }
        catch (Exception exception) {
            dQs.error((Object)"impossible d'initialiser WakfuSoundManager.ROLLOFF_PRESET_FILE", (Throwable)exception);
        }
    }

    public void oX(String string) {
        if (!this.cdn()) {
            return;
        }
        aqr_2 aqr_22 = new aqr_2();
        aqs_2 aqs_22 = new aqs_2();
        aqr_22.ex(string);
        aqr_22.a(aqs_22, new ape_1[0]);
        aqr_22.close();
        apd_1 apd_12 = aqs_22.ez("rollOffs");
        this.mtn = agz_1.j(apd_12);
    }

    @Override
    public agz_1 yl(int n) {
        if (this.mtn == null || this.mtn.bTR() == 0) {
            return agz_1.dNB;
        }
        agz_1 agz_12 = this.mtn.vK(n);
        if (agz_12 != null) {
            return agz_12;
        }
        return this.mtn.vU(0);
    }

    public void oY(String string) {
        if (!this.cdn()) {
            return;
        }
        this.msQ.oR(string);
    }

    public void eHG() {
        if (!this.cdn()) {
            return;
        }
        this.msQ.aUI();
    }

    public void oZ(String string) {
        if (!this.cdn()) {
            return;
        }
        this.msR.oR(string);
    }

    public void pa(String string) {
        if (!this.cdn()) {
            return;
        }
        this.msS.oR(string);
    }

    public void eHH() {
        if (!this.cdn()) {
            return;
        }
        this.msR.aUI();
    }

    public void eHI() {
        if (!this.cdn()) {
            return;
        }
        this.msS.aUI();
    }

    public void a(cCs cCs2) {
        if (this.msO && !this.msW) {
            this.msP.a(cCs2);
        }
    }

    public void a(long l, cBj cBj2, agn_1 agn_12) {
        if (this.msO && !this.msW) {
            this.msP.a(l, agn_12, cBj2);
        }
    }

    public void nT(long l) {
        this.msP.nT(l);
    }

    @Override
    protected boolean cdC() {
        return true;
    }

    public void a(cBp cBp2) {
        this.msP.c(cBp2);
    }

    public void b(cBp cBp2) {
        this.msP.d(cBp2);
    }

    public cBn eHJ() {
        return this.msP;
    }

    @NotNull
    public cAM eHK() {
        if (this.cdv()) {
            return cAM.mpj;
        }
        return new cAM(this.cdy());
    }

    @NotNull
    public List<cAM> eHL() {
        List<String> list = this.cdw();
        if (this.msJ != null && Objects.equals(this.msI, list)) {
            return this.msJ;
        }
        this.msI = list;
        ArrayList<cAM> arrayList = new ArrayList<cAM>((list != null ? list.size() : 0) + 1);
        arrayList.add(cAM.mpj);
        if (list != null) {
            list.forEach(string -> arrayList.add(new cAM((String)string)));
        }
        this.msJ = arrayList;
        return arrayList;
    }

    @Override
    public String[] bxk() {
        return msH;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        switch (string) {
            case "debugEnabled": {
                return true;
            }
            case "selectedDevice": {
                return this.eHK();
            }
            case "devicesAvailables": {
                return this.eHL();
            }
        }
        return null;
    }

    static /* synthetic */ Logger aGh() {
        return dQs;
    }

    static /* synthetic */ Logger aGi() {
        return dQs;
    }

    static /* synthetic */ Logger aGj() {
        return dQs;
    }

    static /* synthetic */ Logger aGR() {
        return dQs;
    }

    static /* synthetic */ Logger aGS() {
        return dQs;
    }

    static /* synthetic */ Logger dof() {
        return dQs;
    }
}

