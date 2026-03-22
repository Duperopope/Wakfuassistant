/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eRO
 */
public abstract class ero_0
extends QD<enk_0, eNl> {
    private static final int riC = 2040;
    private int riD = euj_1.fKH();
    private byte riE = (byte)-1;
    private int mfB = -1;
    private QD riF;
    private boolean riG = false;
    tz_0 riH = tz_0.biL();
    long riI = -1L;
    private boolean riJ = false;
    private ese_0 riK = new ese_0();
    private boolean riL = false;
    protected boolean rdU = false;

    public short fHf() {
        int n;
        if (this.bbg() != null && (n = ((enq_0)this.bbg()).Oh()) != -1) {
            return (short)n;
        }
        if (this.bbf() == null) {
            return 0;
        }
        return ((eNl)this.bbf()).cmL();
    }

    public void mh(boolean bl) {
        this.riL = bl;
    }

    public void fHg() {
        this.riG = true;
    }

    public void mi(boolean bl) {
        this.riJ = bl;
    }

    public boolean fHh() {
        return this.riJ;
    }

    @Override
    public List<qu_0> a(enk_0 enk_02, anu_1 anu_12, qm_0<enk_0> qm_02, int n, int n2, short s) {
        return this.riK.a(enk_02, anu_12, qm_02, n, n2, s);
    }

    @Override
    public void aVH() {
        super.aVH();
        this.aQL = 0;
        this.riH = tz_0.biL();
        this.riJ = false;
        this.riK = null;
        aau_2.Z(this);
    }

    public boolean fHi() {
        return this.riL;
    }

    public boolean a(eNi eNi2) {
        if (this.bgC == null) {
            return false;
        }
        return ((enk_0)this.bgC).a(eNi2);
    }

    public void d(QD qD, boolean bl) {
        if (this.fAF() || this.riG) {
            return;
        }
        this.riG = true;
        if (this.bgJ != null && this.bgJ.bad() != null && !bl) {
            this.bgJ.bad().b(this);
        }
        this.mfB = qD != null ? ((ero_0)qD).fHn() : -1;
        if (this.bgJ != null && this.bgJ.bad() != null && bl) {
            this.bgJ.bad().d(this);
        }
    }

    public void mj(boolean bl) {
        if (this.fAF()) {
            return;
        }
        if (this.bgJ != null && this.bgJ.bad() != null && !bl) {
            this.bgJ.bad().c(this);
        }
    }

    private boolean fAF() {
        enq_0 enq_02 = (enq_0)this.bbg();
        if (enq_02 != null && enq_02.fBl()) {
            return true;
        }
        return this.bgC != null && ((enk_0)this.bgC).fAF();
    }

    public void mk(boolean bl) {
        this.riG = bl;
    }

    public boolean fCB() {
        return this.riG;
    }

    @Override
    public void bbK() {
        if (this.bbm() == null && this.bbg() != null && ((enq_0)this.bbg()).fBh() != null) {
            this.g(((enq_0)this.bbg()).fBh());
        }
        super.bbK();
    }

    @Override
    public void bbP() {
        this.mi(true);
        super.bbP();
    }

    @Override
    public final void n(QD qD) {
        this.E(qD);
        enq_0 enq_02 = (enq_0)this.bbg();
        this.fHj();
        if (enq_02 == null || !enq_02.fBj()) {
            return;
        }
        this.a(enq_02);
    }

    private void fHj() {
        qr_0 qr_02 = this.bbg();
        if (!(qr_02 instanceof enq_0)) {
            return;
        }
        List<enw_0> list = ((enq_0)qr_02).aYR();
        if (list == null || list.isEmpty()) {
            return;
        }
        for (enw_0 enw_02 : list) {
            try {
                enw_02.f(this);
            }
            catch (Exception exception) {
                bgA.error((Object)"Exception levee", (Throwable)exception);
            }
        }
    }

    @Override
    private void a(enq_0 enq_02) {
        switch (enq_02.fBk()) {
            case qYm: {
                this.oB(enq_02.Ol());
                break;
            }
            case qYn: {
                this.oB(Math.max(this.getValue() * enq_02.Ol() / 100, 1));
            }
        }
    }

    public void E(QD qD) {
    }

    @Override
    protected void bbL() {
        super.bbL();
        qr_0 qr_02 = this.bbg();
        if (!(qr_02 instanceof enq_0)) {
            return;
        }
        List<enw_0> list = ((enq_0)qr_02).aYR();
        if (list == null || list.isEmpty()) {
            return;
        }
        for (enw_0 enw_02 : list) {
            try {
                enw_02.e(this);
            }
            catch (Exception exception) {
                bgA.error((Object)"Exception levee", (Throwable)exception);
            }
        }
    }

    @Override
    public final void a(QD qD, boolean bl) {
        try {
            this.c(qD, bl);
        }
        catch (Exception exception) {
            bgA.error((Object)("Exception lors de l'execution d'un effet " + (this.bgC != null ? ((enk_0)this.bgC).aZH() : this.d())), (Throwable)exception);
        }
        this.rdU = true;
        if (!this.riG) {
            try {
                this.d(qD, bl);
            }
            catch (Exception exception) {
                bgA.error((Object)"Exception levee lors de la notification de l'execution", (Throwable)exception);
            }
        }
        this.riG = false;
        super.a(qD, bl);
    }

    protected abstract void c(QD var1, boolean var2);

    @Override
    public boolean aZE() {
        return super.aZE() || this.bgC != null && ((enk_0)this.bgC).a(eNi.qWt);
    }

    @Override
    public boolean M(byte by) {
        boolean bl = false;
        try {
            byte by2;
            bl |= super.M(by);
            if (this.bgJ == null || !(this.bgJ instanceof ent_0)) {
                return bl;
            }
            switch (by) {
                case 3: {
                    by2 = 31;
                    break;
                }
                case 1: {
                    by2 = 11;
                    break;
                }
                case 2: {
                    by2 = 21;
                    break;
                }
                case 4: {
                    by2 = 41;
                    break;
                }
                case 6: {
                    by2 = 61;
                    break;
                }
                default: {
                    bgA.error((Object)("Pas de type de trigger global correspondant " + by));
                    return bl;
                }
            }
            Iterator<qu_0> iterator = this.bgJ.bae().l(this.bbc());
            while (iterator.hasNext()) {
                qu_0 qu_02 = iterator.next();
                bl |= qu_02.a(this.bbx(), this, by2);
            }
        }
        catch (Exception exception) {
            bgA.error((Object)"Exception catch\u00e9e : ", (Throwable)exception);
        }
        return bl;
    }

    @Override
    @Nullable
    protected qu_0 l(QD qD) {
        if (qD == null || this.bgC == null) {
            return this.bgF;
        }
        QC qC = ((enk_0)this.bgC).aZY();
        try {
            switch (qC) {
                case bgq: {
                    bgA.error((Object)("Pas de type de cibles sp\u00e9cifi\u00e9e pour un effet d\u00e9clench\u00e9, on retrourne la cible originale, id : " + ((enk_0)this.bgC).aZH()));
                    return this.bgF;
                }
                case bgr: {
                    return this.bgF;
                }
                case bgs: {
                    return this.bbq().bci();
                }
                case bgt: {
                    return this.bgE;
                }
                case bgu: {
                    return qD.bbc();
                }
                case bgv: {
                    return qD.bbd();
                }
            }
            bgA.error((Object)("Type de cible d'effet declench\u00e9 inconnue " + String.valueOf(qC)));
            return this.bgF;
        }
        catch (Exception exception) {
            bgA.error((Object)("Erreur lors de la r\u00e9cup\u00e9ration du triggering target sur l'effet " + ((enk_0)this.bgC).aZH()), (Throwable)exception);
            return null;
        }
    }

    @Override
    @Nullable
    protected qu_0 m(QD qD) {
        if (this.bgC == null || qD == null) {
            return this.bgE;
        }
        QA qA = ((enk_0)this.bgC).aZZ();
        if (qA == null) {
            return this.bgE;
        }
        try {
            switch (qA) {
                case bga: {
                    bgA.error((Object)("Pas de type de caster sp\u00e9cifi\u00e9 pour un effet d\u00e9clench\u00e9, on retourne la cible originale, id : " + ((enk_0)this.bgC).aZH()));
                    return this.bgE;
                }
                case bgb: {
                    return this.bgE;
                }
                case bgc: {
                    return this.bbq().bci();
                }
                case bgd: {
                    return this.bgF;
                }
                case bge: {
                    return qD.bbc();
                }
                case bgf: {
                    return qD.bbd();
                }
            }
            bgA.error((Object)("Type de cible d'effet declench\u00e9 inconnue " + String.valueOf(qA)));
            return this.bgE;
        }
        catch (Exception exception) {
            bgA.error((Object)("Erreur lors de la r\u00e9cup\u00e9ration du triggering caster sur l'effet " + ((enk_0)this.bgC).aZH()), (Throwable)exception);
            return null;
        }
    }

    @Override
    protected boolean bca() {
        boolean bl = super.bca();
        if (this.bgF != null && !this.bgF.baM() && this.bgF.baK() && this.bgF.baN()) {
            this.bgF.aT(true);
            bl = true;
            this.bgF.d(this.bgE);
            if (this.bgF != null) {
                this.bgF.aT(false);
            }
        }
        if (this.bgF != null && this.bgF.baI() && this.bgF.baE() && this.bgF.baN()) {
            this.bgF.aT(true);
            bl = true;
            this.bgF.c(this.bgE);
            if (this.bgF != null) {
                this.bgF.aT(false);
            }
        }
        return bl;
    }

    protected Long fGq() {
        if (this.bgC != null) {
            if (((enk_0)this.bgC).aZW() && this.bgE != null) {
                return this.bgE.Sn();
            }
            if (((enk_0)this.bgC).aZX() && this.bgF != null) {
                return this.bgF.Sn();
            }
        }
        if (this.bgF != null) {
            return this.bgF.Sn();
        }
        if (this.bgE != null) {
            return this.bgE.Sn();
        }
        return null;
    }

    @Override
    public void bbT() {
        if (this.bgD == null) {
            return;
        }
        if (this.bgC == null) {
            return;
        }
        if (((enk_0)this.bgC).aZG() != 2) {
            return;
        }
        if (this.bgJ.baf() == null) {
            return;
        }
        if (!this.fHk()) {
            return;
        }
        eNs eNs2 = (eNs)this.bgC;
        this.bgJ.baf().a(new Ub(this, this.fGq()), eNs2.ej(this.fHf()));
    }

    private boolean fHk() {
        if (this.fGq() == null) {
            bgA.error((Object)("[DESIGN EFFECT] Pas de point d'attache dans la timeline (#" + this.LV() + " " + this.bbN() + ")"));
            return false;
        }
        return true;
    }

    @Override
    public void bbU() {
        if (this.bgC == null || ((enk_0)this.bgC).aZG() != 2 || this.bgJ.baf() == null) {
            return;
        }
        eNs eNs2 = (eNs)this.bgC;
        this.a(eNs2.ei(this.fHf()));
    }

    public void fHl() {
        if (!this.bbX()) {
            this.bbU();
            return;
        }
        eNs eNs2 = (eNs)this.bgC;
        Ua ua = eNs2.ei(this.fHf());
        int n = ua.biS() - eNs2.ej(this.fHf()).biS();
        if (ua.biM()) {
            ++n;
        }
        ua.pC(n);
        this.a(ua);
    }

    @Override
    protected void a(Ua ua) {
        if (ua.biT()) {
            return;
        }
        if (!this.fHk()) {
            return;
        }
        TA tA = this.bgJ.baf();
        this.bgV = tA.bhP();
        this.riH = tA.a(new Uc(this, this.fGq()), ua);
    }

    @Override
    public tz_0 bbW() {
        return this.riH;
    }

    public long fGm() {
        if (this.bgC != null && ((enk_0)this.bgC).aZG() == 1 && this.riI < 0L) {
            this.riI = ((end_0)this.bba()).ek(this.fHf());
        }
        return this.riI;
    }

    public void qx(long l) {
        this.riI = l;
    }

    @Override
    public boolean Ty() {
        if (this.bhb) {
            return false;
        }
        if (this.bbY()) {
            return true;
        }
        if (this.bgC != null) {
            switch (((enk_0)this.bgC).aZG()) {
                case 2: {
                    eNs eNs2 = (eNs)this.bgC;
                    Ua ua = eNs2.ei(this.fHf());
                    return ua != null && !ua.biT();
                }
                case 1: {
                    end_0 end_02 = (end_0)((Object)this.bgC);
                    return end_02.ek(this.fHf()) > 0;
                }
                case 0: {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean fGo() {
        return this.bba() == null || ((enk_0)this.bba()).aZG() == 1;
    }

    @Override
    public boolean bbY() {
        if (this.bgC == null) {
            return false;
        }
        short s = this.fHf();
        switch (((enk_0)this.bgC).aZG()) {
            case 2: {
                eNs eNs2 = (eNs)this.bgC;
                Ua ua = eNs2.ei(s);
                return ua != null && ua.biS() < 0;
            }
            case 1: {
                end_0 end_02 = (end_0)((Object)this.bgC);
                return end_02.ek(s) < 0;
            }
            case 0: {
                return true;
            }
        }
        return true;
    }

    @Override
    public boolean bbX() {
        if (this.bgC == null) {
            return false;
        }
        if (this.bgD == null) {
            return false;
        }
        if (((enk_0)this.bgC).aZG() != 2) {
            return false;
        }
        return !((eNs)this.bgC).ej(this.fHf()).biT();
    }

    public eNd dTh() {
        return null;
    }

    @Override
    public void bbz() {
        eNd eNd2 = this.dTh();
        if (eNd2 == null) {
            eNd2 = this.fHm();
        }
        if (eNd2 == null) {
            return;
        }
        this.oC(eNd2.fAY());
    }

    protected eNd fHm() {
        if (this.bbf() == null) {
            return null;
        }
        int n = ((eNl)this.bbf()).bab();
        if (n == 11) {
            return ((fqE)this.bbf()).dTh();
        }
        return null;
    }

    public int fHn() {
        return this.riD;
    }

    public boolean fHo() {
        return this.rdU;
    }

    public int ezb() {
        return this.mfB;
    }

    @Override
    public boolean bbI() {
        if (this.bgC != null && !((enk_0)this.bgC).fAu() && !this.bce() && this.bgF != null && this.bgF.baI()) {
            return false;
        }
        if (this.fCv()) {
            return false;
        }
        if (this.bgF != null && !this.bgF.bay()) {
            return false;
        }
        if (this.bgC == null) {
            return true;
        }
        if (!this.fHq()) {
            return false;
        }
        enq_0 enq_02 = (enq_0)this.bbg();
        if (!(enq_02 != null && enq_02.fBg() || this.K(null))) {
            return false;
        }
        if (this.bbJ()) {
            return false;
        }
        short s = this.fHf();
        boolean bl = true;
        if (this.bbg() == null || !((enq_0)this.bbg()).fBf()) {
            bl = ve_0.pV(100) <= VJ.bt(((enk_0)this.bgC).eb(s));
        }
        return bl;
    }

    @Override
    protected boolean bbJ() {
        enq_0 enq_02 = (enq_0)this.bbg();
        return enq_02 != null && enq_02.bbJ();
    }

    protected boolean fCv() {
        return false;
    }

    protected boolean fHp() {
        if (this.bgD instanceof fqU && ((fqU)this.bgD).gjJ() == exe_0.pcX) {
            return false;
        }
        return this.bgF != null && this.bgF.a(exe_1.rEw);
    }

    private boolean fHq() {
        short s = this.fHf();
        int n = ((enk_0)this.bgC).fAv();
        int n2 = ((enk_0)this.bgC).fAw();
        return s >= n && s <= n2;
    }

    @Override
    public boolean i(QD qD) {
        if (!this.bce() && this.bgF != null && this.bgF.baI()) {
            return false;
        }
        if (this.bgC == null) {
            return true;
        }
        if (!this.K(qD)) {
            return false;
        }
        if (!this.fHq()) {
            return false;
        }
        short s = this.fHf();
        return ve_0.pV(100) <= VJ.bt(((enk_0)this.bgC).eb(s));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    boolean K(QD qD) {
        boolean bl;
        qu_0 qu_02 = this.aZQ() ? this.m(qD) : this.bgE;
        qu_0 qu_03 = this.aZQ() ? this.l(qD) : this.bgF;
        this.riF = qD;
        try {
            bl = ((enk_0)this.bgC).fAx() == null || ((enk_0)this.bgC).fAx().b(qu_02, qu_03 == null ? this.bgG : qu_03, this, this.bgJ);
        }
        catch (Exception exception) {
            bgA.error((Object)"Exception levee", (Throwable)exception);
            bl = false;
        }
        finally {
            this.riF = null;
        }
        return bl;
    }

    public QD fHr() {
        return this.riF;
    }

    @Override
    protected boolean bce() {
        if (this.a(eNi.qWC)) {
            return true;
        }
        if (this.fHs()) {
            return true;
        }
        return this.bbw() != null && this.bbw().get(1010);
    }

    private boolean fHs() {
        eNl eNl2 = (eNl)this.bbf();
        if (eNl2 == null) {
            return false;
        }
        int n = eNl2.bab();
        if (n == 25) {
            return ((fqE)eNl2).axA() == 2040;
        }
        return false;
    }

    public byte cXt() {
        return this.riE;
    }

    public void fh(byte by) {
        this.riE = by;
    }

    @Override
    public Qj bcd() {
        return eng_0.fBz();
    }

    @Override
    public ia_2 QH() {
        return ia_2.Pr().G(this.riJ).eB(this.riE).a(iw_1.OU().ai(this.riH.OO()).eA(this.riH.biN()).F(this.riH.biM())).aj(this.riI).H(this.rdU).Px();
    }

    @Override
    protected void f(ia_2 ia_22) {
        this.riJ = ia_22.Pi();
        this.riE = GC.ct(ia_22.Pk());
        iw_1 iw_12 = ia_22.Pm();
        this.riH = new tz_0(iw_12.OO(), GC.cu(iw_12.OQ()), iw_12.OS());
        this.riI = ia_22.Pp();
        this.rdU = ia_22.MB();
    }

    private void G(int n, long l) {
        switch (n) {
            case 11: 
            case 25: {
                int n2 = fqE.uC(l);
                short s = fqE.uD(l);
                fqE fqE2 = fqF.giR().i(n2, s);
                this.a(fqE2);
                break;
            }
            case 1: {
                if (this.bbf() != null) break;
                boolean bl = this.a(this.bbd(), l);
                if (!bl) {
                    bl = this.a(this.bbc(), l);
                }
                if (!bl) {
                    bl = this.qy(l);
                }
                if (bl) break;
                bgA.error((Object)("Impossible de cr\u00e9er un \u00e9tat en tant que container d'un effet, id unique du container : " + l));
                break;
            }
            case 3: {
                if (this.bgJ != null && this.bgJ.bai() != null) {
                    eSS eSS2 = (eSS)this.bgJ.bai().do(l);
                    if (eSS2 != null) {
                        this.a(eSS2);
                        break;
                    }
                    qq_0 qq_02 = this.bgJ.bad();
                    if (!(qq_02 instanceof qp_0)) {
                        bgA.error((Object)("Area with id " + l + " not found, and the effect execution listener does not allow for rebinding : " + qq_02.getClass().getSimpleName()));
                        break;
                    }
                    qp_0 qp_02 = (qp_0)((Object)qq_02);
                    qp_02.a(new esl_0(this, this.bgJ, l));
                    break;
                }
                bgA.error((Object)"contexte non ou mal initialis\u00e9");
                break;
            }
            case 12: {
                ffV ffV2 = fgD.fXh().Ve((int)l);
                if (ffV2 != null) {
                    this.a(ffV2);
                    break;
                }
                bgA.error((Object)("item par d\u00e9faut inconnu, referenceId = " + l));
                break;
            }
            case 14: {
                bgA.info((Object)"On ne devrait pas s\u00e9rialiser les effets des sets");
                break;
            }
            case 31: {
                bgA.info((Object)"On ne devrait pas s\u00e9rialiser les effets des sacs");
                break;
            }
            case 19: {
                break;
            }
            case 21: {
                this.a(ewc_1.a(l, (enk_0)this.bba()));
                break;
            }
            case 28: {
                this.a(enb_0.qOR);
                break;
            }
            case 32: {
                this.a(enb_0.qOT);
                break;
            }
            case 30: {
                this.a(enb_0.qOS);
                break;
            }
            case 36: {
                int n3 = enp_0.qu(l);
                short s = enp_0.qv(l);
                Object t = eHJ.qsV.Py(n3);
                if (t == null) break;
                this.a(new eHH((ehw_0)t, s));
                break;
            }
            case 26: 
            case 29: 
            case 33: {
                enm_0 enm_02 = new enm_0();
                enm_02.RR(n).qt(l);
                this.a(enm_02.fBe());
            }
        }
    }

    @Override
    protected void f(int n, long l) {
        this.G(n, l);
    }

    @Override
    protected void h(QD<enk_0, eNl> qD) {
        super.h(qD);
        this.riE = ((ero_0)qD).cXt();
        this.riH = qD.bbW();
        this.riL = ((ero_0)qD).riL;
    }

    private boolean qy(long l) {
        fqU fqU2 = fqX.gjM().Zt((int)l);
        if (fqU2 == null) {
            return false;
        }
        this.bgD = fqU2.cm(fqU.YZ((int)l));
        return true;
    }

    public boolean a(qu_0 qu_02, long l) {
        if (qu_02 == null) {
            return false;
        }
        QE qE = qu_02.baz();
        if (qE == null) {
            return false;
        }
        for (QD qD : qE) {
            if (qD.d() != enf_0.qPC.d()) continue;
            fqU fqU2 = ((erh_0)qD).fGk();
            if (fqU2 == null) {
                bgA.error((Object)("Un StateRunningEffect avec un etat inexistant ??? re.getId() = " + qD.d()));
                continue;
            }
            if ((long)fqU2.caO() != l) continue;
            this.a(fqU2);
            return true;
        }
        return false;
    }

    public boolean fHt() {
        enk_0 enk_02 = (enk_0)this.bba();
        if (enk_02 == null) {
            return false;
        }
        eNl eNl2 = (eNl)this.bbf();
        if (eNl2 == null) {
            return false;
        }
        int n = eNl2.bab();
        if (n != 12 && n != 14 && n != 31) {
            return false;
        }
        return !enk_02.fAt();
    }

    @Override
    public boolean o(QD qD) {
        try {
            return qD != null && qD.getValue() == this.getValue() && (qD.bbe() == null || qD.bbe().equals(this.bbe())) && qD.bbc() == this.bbc() && qD.bbf() == this.bbf() && qD.bba() == this.bba() && qD.bbW() == this.bbW() && qD.d() == this.d() && qD.bbi() == this.bbi();
        }
        catch (Exception exception) {
            bgA.warn((Object)adu_1.a(exception));
            return false;
        }
    }

    public boolean fCn() {
        if (this.fAF()) {
            return false;
        }
        if (this.bgJ instanceof ent_0) {
            ent_0 ent_02 = (ent_0)this.bgJ;
            etu_0 etu_02 = ent_02.fBq();
            if (etu_02.dGp() == etw_0.rqT) {
                return true;
            }
            if (etu_02.dGp() == etw_0.rqX) {
                return false;
            }
        }
        return this.aZQ() || this.bbX() || this.riJ;
    }

    public boolean fHu() {
        if (this.fAF()) {
            return false;
        }
        if (this.Ty() && !this.fHt()) {
            return true;
        }
        return this.riJ;
    }

    @Override
    protected void bbk() {
        this.bgO = this.bgC != null && ((enk_0)this.bgC).aZV() >= 0 ? (int)((float)((enk_0)this.bgC).aZV() + (float)this.fHf() * ((enk_0)this.bgC).cxm()) : -1;
    }

    public boolean fHv() {
        return this.bgD != null && ((eNl)this.bgD).bab() == 19;
    }

    public boolean fHw() {
        return this.bgD != null && ((eNl)this.bgD).bab() == 36;
    }

    public boolean fHx() {
        return this.bgD != null && ((eNl)this.bgD).bab() == 25;
    }

    public boolean cwJ() {
        return this.bgD != null && ((eNl)this.bgD).bab() == 32;
    }

    public boolean fHy() {
        return this.bgD != null && ((eNl)this.bgD).bab() == 28;
    }

    public boolean fHz() {
        return this.bgD != null && ((eNl)this.bgD).bab() == 34;
    }

    public boolean fHA() {
        if (this.bbf() == null) {
            return false;
        }
        if (!(this.bbf() instanceof fqU)) {
            return false;
        }
        return ((fqU)this.bbf()).cwt();
    }

    public boolean aZA() {
        if (this.bgC == null) {
            return false;
        }
        return ((enk_0)this.bgC).aZA();
    }

    protected QD L(QD qD) {
        QD qD2 = qD != null ? qD : (this.bbg() != null ? ((enq_0)this.bbg()).fBh() : null);
        return qD2;
    }

    public void fHB() {
        if (this.bbq() == null && !this.bbj()) {
            this.aZp();
        }
    }

    @Override
    public final short bbH() {
        ent_0 ent_02;
        if (this.bgJ instanceof ent_0 && (ent_02 = (ent_0)this.bgJ).fBr()) {
            return 2000;
        }
        return super.bbH();
    }

    @Override
    protected void c(io_1 io_12) {
        qr_0 qr_02 = this.bbg();
        if (!(qr_02 instanceof enq_0)) {
            super.c(io_12);
            return;
        }
        enq_0 enq_02 = (enq_0)qr_02;
        io_12.d(enq_02.fBn());
    }

    @Override
    protected void g(im_1 im_12) {
        if (!im_12.QM()) {
            super.g(im_12);
            return;
        }
        enq_0 enq_02 = (enq_0)this.bbg();
        if (enq_02 == null) {
            enq_02 = new enq_0();
        }
        enq_02.f(im_12.QN());
        this.a((qr_0)enq_02.fBm());
    }
}

