Picked up JAVA_TOOL_OPTIONS: 
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  GC
 *  PV
 *  QA
 *  QC
 *  QE
 *  Qj
 *  Qm
 *  Qo
 *  Qp
 *  Qq
 *  Qr
 *  Qu
 *  TA
 *  TO
 *  TZ
 *  Ua
 *  Ub
 *  Uc
 *  VE
 *  VJ
 *  aAu
 *  aDU
 *  anU
 *  eHH
 *  eHJ
 *  eHW
 *  eND
 *  eNG
 *  eNb
 *  eNd
 *  eNf
 *  eNi
 *  eNk
 *  eNl
 *  eNm
 *  eNp
 *  eNq
 *  eNs
 *  eNt
 *  eNw
 *  eRP
 *  eRh
 *  eSE
 *  eSS
 *  eSl
 *  eTU
 *  eTW
 *  eUj
 *  eWC
 *  eXe
 *  exE
 *  ffV
 *  fgD
 *  fqE
 *  fqF
 *  fqU
 *  fqX
 *  iA
 *  iM
 *  iO
 *  iw
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.Nullable;

public abstract class eRO
extends QD<eNk, eNl> {
    private static final int riC = 2040;
    private int riD = eUj.fKH();
    private byte riE = (byte)-1;
    private int mfB = -1;
    private QD riF;
    private boolean riG = false;
    TZ riH = TZ.biL();
    long riI = -1L;
    private boolean riJ = false;
    private eSE riK = new eSE();
    private boolean riL = false;
    protected boolean rdU = false;

    public short fHf() {
        int n;
        if (this.bbg() != null && (n = ((eNq)this.bbg()).Oh()) != -1) {
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
    public List<Qu> a(eNk eNk2, anU anU2, Qm<eNk> qm, int n, int n2, short s) {
        return this.riK.a(eNk2, anU2, qm, n, n2, s);
    }

    @Override
    public void aVH() {
        super.aVH();
        this.aQL = 0;
        this.riH = TZ.biL();
        this.riJ = false;
        this.riK = null;
        aAu.Z((Object)this);
    }

    public boolean fHi() {
        return this.riL;
    }

    public boolean a(eNi eNi2) {
        if (this.bgC == null) {
            return false;
        }
        return ((eNk)this.bgC).a(eNi2);
    }

    public void d(QD qD, boolean bl) {
        if (this.fAF() || this.riG) {
            return;
        }
        this.riG = true;
        if (this.bgJ != null && this.bgJ.bad() != null && !bl) {
            this.bgJ.bad().b((QD)this);
        }
        this.mfB = qD != null ? ((eRO)qD).fHn() : -1;
        if (this.bgJ != null && this.bgJ.bad() != null && bl) {
            this.bgJ.bad().d((QD)this);
        }
    }

    public void mj(boolean bl) {
        if (this.fAF()) {
            return;
        }
        if (this.bgJ != null && this.bgJ.bad() != null && !bl) {
            this.bgJ.bad().c((QD)this);
        }
    }

    private boolean fAF() {
        eNq eNq2 = (eNq)this.bbg();
        if (eNq2 != null && eNq2.fBl()) {
            return true;
        }
        return this.bgC != null && ((eNk)this.bgC).fAF();
    }

    public void mk(boolean bl) {
        this.riG = bl;
    }

    public boolean fCB() {
        return this.riG;
    }

    @Override
    public void bbK() {
        if (this.bbm() == null && this.bbg() != null && ((eNq)this.bbg()).fBh() != null) {
            this.g(((eNq)this.bbg()).fBh());
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
        eNq eNq2 = (eNq)this.bbg();
        this.fHj();
        if (eNq2 == null || !eNq2.fBj()) {
            return;
        }
        this.a(eNq2);
    }

    private void fHj() {
        Qr qr = this.bbg();
        if (!(qr instanceof eNq)) {
            return;
        }
        List list = ((eNq)qr).aYR();
        if (list == null || list.isEmpty()) {
            return;
        }
        for (eNw eNw2 : list) {
            try {
                eNw2.f(this);
            }
            catch (Exception exception) {
                bgA.error((Object)"Exception levee", (Throwable)exception);
            }
        }
    }

    @Override
    private void a(eNq eNq2) {
        switch (eRP.riM[eNq2.fBk().ordinal()]) {
            case 1: {
                this.oB(eNq2.Ol());
                break;
            }
            case 2: {
                this.oB(Math.max(this.getValue() * eNq2.Ol() / 100, 1));
            }
        }
    }

    public void E(QD qD) {
    }

    @Override
    protected void bbL() {
        super.bbL();
        Qr qr = this.bbg();
        if (!(qr instanceof eNq)) {
            return;
        }
        List list = ((eNq)qr).aYR();
        if (list == null || list.isEmpty()) {
            return;
        }
        for (eNw eNw2 : list) {
            try {
                eNw2.e(this);
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
            bgA.error((Object)("Exception lors de l'execution d'un effet " + (this.bgC != null ? ((eNk)this.bgC).aZH() : this.d())), (Throwable)exception);
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
        return super.aZE() || this.bgC != null && ((eNk)this.bgC).a(eNi.qWt);
    }

    @Override
    public boolean M(byte by) {
        boolean bl = false;
        try {
            byte by2;
            bl |= super.M(by);
            if (this.bgJ == null || !(this.bgJ instanceof eNt)) {
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
            Iterator iterator = this.bgJ.bae().l((anU)this.bbc());
            while (iterator.hasNext()) {
                Qu qu = (Qu)iterator.next();
                bl |= qu.a(this.bbx(), (Object)this, by2);
            }
        }
        catch (Exception exception) {
            bgA.error((Object)"Exception catch\u00e9e : ", (Throwable)exception);
        }
        return bl;
    }

    @Override
    @Nullable
    protected Qu l(QD qD) {
        if (qD == null || this.bgC == null) {
            return this.bgF;
        }
        QC qC = ((eNk)this.bgC).aZY();
        try {
            switch (eRP.riN[qC.ordinal()]) {
                case 1: {
                    bgA.error((Object)("Pas de type de cibles sp\u00e9cifi\u00e9e pour un effet d\u00e9clench\u00e9, on retrourne la cible originale, id : " + ((eNk)this.bgC).aZH()));
                    return this.bgF;
                }
                case 2: {
                    return this.bgF;
                }
                case 3: {
                    return this.bbq().bci();
                }
                case 4: {
                    return this.bgE;
                }
                case 5: {
                    return qD.bbc();
                }
                case 6: {
                    return qD.bbd();
                }
            }
            bgA.error((Object)("Type de cible d'effet declench\u00e9 inconnue " + String.valueOf(qC)));
            return this.bgF;
        }
        catch (Exception exception) {
            bgA.error((Object)("Erreur lors de la r\u00e9cup\u00e9ration du triggering target sur l'effet " + ((eNk)this.bgC).aZH()), (Throwable)exception);
            return null;
        }
    }

    @Override
    @Nullable
    protected Qu m(QD qD) {
        if (this.bgC == null || qD == null) {
            return this.bgE;
        }
        QA qA = ((eNk)this.bgC).aZZ();
        if (qA == null) {
            return this.bgE;
        }
        try {
            switch (eRP.riO[qA.ordinal()]) {
                case 1: {
                    bgA.error((Object)("Pas de type de caster sp\u00e9cifi\u00e9 pour un effet d\u00e9clench\u00e9, on retourne la cible originale, id : " + ((eNk)this.bgC).aZH()));
                    return this.bgE;
                }
                case 2: {
                    return this.bgE;
                }
                case 3: {
                    return this.bbq().bci();
                }
                case 4: {
                    return this.bgF;
                }
                case 5: {
                    return qD.bbc();
                }
                case 6: {
                    return qD.bbd();
                }
            }
            bgA.error((Object)("Type de cible d'effet declench\u00e9 inconnue " + String.valueOf(qA)));
            return this.bgE;
        }
        catch (Exception exception) {
            bgA.error((Object)("Erreur lors de la r\u00e9cup\u00e9ration du triggering caster sur l'effet " + ((eNk)this.bgC).aZH()), (Throwable)exception);
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
            if (((eNk)this.bgC).aZW() && this.bgE != null) {
                return this.bgE.Sn();
            }
            if (((eNk)this.bgC).aZX() && this.bgF != null) {
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
        if (((eNk)this.bgC).aZG() != 2) {
            return;
        }
        if (this.bgJ.baf() == null) {
            return;
        }
        if (!this.fHk()) {
            return;
        }
        eNs eNs2 = (eNs)this.bgC;
        this.bgJ.baf().a((TO)new Ub((QD)this, this.fGq().longValue()), eNs2.ej(this.fHf()));
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
        if (this.bgC == null || ((eNk)this.bgC).aZG() != 2 || this.bgJ.baf() == null) {
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
        this.riH = tA.a((TO)new Uc((QD)this, this.fGq().longValue()), ua);
    }

    @Override
    public TZ bbW() {
        return this.riH;
    }

    public long fGm() {
        if (this.bgC != null && ((eNk)this.bgC).aZG() == 1 && this.riI < 0L) {
            this.riI = ((eND)this.bba()).ek(this.fHf());
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
            switch (((eNk)this.bgC).aZG()) {
                case 2: {
                    eNs eNs2 = (eNs)this.bgC;
                    Ua ua = eNs2.ei(this.fHf());
                    return ua != null && !ua.biT();
                }
                case 1: {
                    eND eND2 = (eND)this.bgC;
                    return eND2.ek(this.fHf()) > 0;
                }
                case 0: {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean fGo() {
        return this.bba() == null || ((eNk)this.bba()).aZG() == 1;
    }

    @Override
    public boolean bbY() {
        if (this.bgC == null) {
            return false;
        }
        short s = this.fHf();
        switch (((eNk)this.bgC).aZG()) {
            case 2: {
                eNs eNs2 = (eNs)this.bgC;
                Ua ua = eNs2.ei(s);
                return ua != null && ua.biS() < 0;
            }
            case 1: {
                eND eND2 = (eND)this.bgC;
                return eND2.ek(s) < 0;
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
        if (((eNk)this.bgC).aZG() != 2) {
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
        if (this.bgC != null && !((eNk)this.bgC).fAu() && !this.bce() && this.bgF != null && this.bgF.baI()) {
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
        eNq eNq2 = (eNq)this.bbg();
        if (!(eNq2 != null && eNq2.fBg() || this.K(null))) {
            return false;
        }
        if (this.bbJ()) {
            return false;
        }
        short s = this.fHf();
        boolean bl = true;
        if (this.bbg() == null || !((eNq)this.bbg()).fBf()) {
            bl = VE.pV((int)100) <= VJ.bt((float)((eNk)this.bgC).eb(s));
        }
        return bl;
    }

    @Override
    protected boolean bbJ() {
        eNq eNq2 = (eNq)this.bbg();
        return eNq2 != null && eNq2.bbJ();
    }

    protected boolean fCv() {
        return false;
    }

    protected boolean fHp() {
        if (this.bgD instanceof fqU && ((fqU)this.bgD).gjJ() == exE.pcX) {
            return false;
        }
        return this.bgF != null && this.bgF.a((PV)eXe.rEw);
    }

    private boolean fHq() {
        short s = this.fHf();
        int n = ((eNk)this.bgC).fAv();
        int n2 = ((eNk)this.bgC).fAw();
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
        return VE.pV((int)100) <= VJ.bt((float)((eNk)this.bgC).eb(s));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    boolean K(QD qD) {
        boolean bl;
        Qu qu = this.aZQ() ? this.m(qD) : this.bgE;
        Qu qu2 = this.aZQ() ? this.l(qD) : this.bgF;
        this.riF = qD;
        try {
            bl = ((eNk)this.bgC).fAx() == null || ((eNk)this.bgC).fAx().b((Object)qu, qu2 == null ? this.bgG : qu2, (Object)this, (Object)this.bgJ);
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
        return eNG.fBz();
    }

    @Override
    public iA QH() {
        return iA.Pr().G(this.riJ).eB((int)this.riE).a(iw.OU().ai(this.riH.OO()).eA((int)this.riH.biN()).F(this.riH.biM())).aj(this.riI).H(this.rdU).Px();
    }

    @Override
    protected void f(iA iA2) {
        this.riJ = iA2.Pi();
        this.riE = GC.ct((long)iA2.Pk());
        iw iw2 = iA2.Pm();
        this.riH = new TZ(iw2.OO(), GC.cu((long)iw2.OQ()), iw2.OS());
        this.riI = iA2.Pp();
        this.rdU = iA2.MB();
    }

    private void G(int n, long l) {
        switch (n) {
            case 11: 
            case 25: {
                int n2 = fqE.uC((long)l);
                short s = fqE.uD((long)l);
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
                    Qq qq = this.bgJ.bad();
                    if (!(qq instanceof Qp)) {
                        bgA.error((Object)("Area with id " + l + " not found, and the effect execution listener does not allow for rebinding : " + qq.getClass().getSimpleName()));
                        break;
                    }
                    Qp qp = (Qp)qq;
                    qp.a((Qo)new eSl((QD)this, this.bgJ, l));
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
                this.a(eWC.a((long)l, (eNk)((eNk)this.bba())));
                break;
            }
            case 28: {
                this.a(eNb.qOR);
                break;
            }
            case 32: {
                this.a(eNb.qOT);
                break;
            }
            case 30: {
                this.a(eNb.qOS);
                break;
            }
            case 36: {
                int n3 = eNp.qu((long)l);
                short s = eNp.qv((long)l);
                eHW eHW2 = eHJ.qsV.Py(n3);
                if (eHW2 == null) break;
                this.a(new eHH(eHW2, s));
                break;
            }
            case 26: 
            case 29: 
            case 33: {
                eNm eNm2 = new eNm();
                eNm2.RR(n).qt(l);
                this.a(eNm2.fBe());
            }
        }
    }

    @Override
    protected void f(int n, long l) {
        this.G(n, l);
    }

    @Override
    protected void h(QD<eNk, eNl> qD) {
        super.h(qD);
        this.riE = ((eRO)qD).cXt();
        this.riH = qD.bbW();
        this.riL = ((eRO)qD).riL;
    }

    private boolean qy(long l) {
        fqU fqU2 = fqX.gjM().Zt((int)l);
        if (fqU2 == null) {
            return false;
        }
        this.bgD = fqU2.cm(fqU.YZ((int)((int)l)));
        return true;
    }

    public boolean a(Qu qu, long l) {
        if (qu == null) {
            return false;
        }
        QE qE = qu.baz();
        if (qE == null) {
            return false;
        }
        for (QD qD : qE) {
            if (qD.d() != eNf.qPC.d()) continue;
            fqU fqU2 = ((eRh)qD).fGk();
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
        eNk eNk2 = (eNk)this.bba();
        if (eNk2 == null) {
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
        return !eNk2.fAt();
    }

    @Override
    public boolean o(QD qD) {
        try {
            return qD != null && qD.getValue() == this.getValue() && (qD.bbe() == null || qD.bbe().equals((Object)this.bbe())) && qD.bbc() == this.bbc() && qD.bbf() == this.bbf() && qD.bba() == this.bba() && qD.bbW() == this.bbW() && qD.d() == this.d() && qD.bbi() == this.bbi();
        }
        catch (Exception exception) {
            bgA.warn((Object)aDU.a((Throwable)exception));
            return false;
        }
    }

    public boolean fCn() {
        if (this.fAF()) {
            return false;
        }
        if (this.bgJ instanceof eNt) {
            eNt eNt2 = (eNt)this.bgJ;
            eTU eTU2 = eNt2.fBq();
            if (eTU2.dGp() == eTW.rqT) {
                return true;
            }
            if (eTU2.dGp() == eTW.rqX) {
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
        this.bgO = this.bgC != null && ((eNk)this.bgC).aZV() >= 0 ? (int)((float)((eNk)this.bgC).aZV() + (float)this.fHf() * ((eNk)this.bgC).cxm()) : -1;
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
        return ((eNk)this.bgC).aZA();
    }

    protected QD L(QD qD) {
        QD qD2 = qD != null ? qD : (this.bbg() != null ? ((eNq)this.bbg()).fBh() : null);
        return qD2;
    }

    public void fHB() {
        if (this.bbq() == null && !this.bbj()) {
            this.aZp();
        }
    }

    @Override
    public final short bbH() {
        eNt eNt2;
        if (this.bgJ instanceof eNt && (eNt2 = (eNt)this.bgJ).fBr()) {
            return 2000;
        }
        return super.bbH();
    }

    @Override
    protected void c(iO iO2) {
        Qr qr = this.bbg();
        if (!(qr instanceof eNq)) {
            super.c(iO2);
            return;
        }
        eNq eNq2 = (eNq)qr;
        iO2.d(eNq2.fBn());
    }

    @Override
    protected void g(iM iM2) {
        if (!iM2.QM()) {
            super.g(iM2);
            return;
        }
        eNq eNq2 = (eNq)this.bbg();
        if (eNq2 == null) {
            eNq2 = new eNq();
        }
        eNq2.f(iM2.QN());
        this.a((Qr)eNq2.fBm());
    }
}

