/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongLongIterator
 *  gnu.trove.map.hash.TLongLongHashMap
 *  gnu.trove.procedure.TLongProcedure
 *  gnu.trove.set.hash.TLongHashSet
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.iterator.TLongLongIterator;
import gnu.trove.map.hash.TLongLongHashMap;
import gnu.trove.procedure.TLongProcedure;
import gnu.trove.set.hash.TLongHashSet;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eRS
 */
public class ers_0
extends QE
implements aao_2 {
    private static boolean riT = true;
    private static final TLongProcedure riU = new ert_0();
    private long riV = 10L;
    private final qu_0 riW;
    private final TLongLongHashMap riX = new TLongLongHashMap();
    private final TLongLongHashMap riY = new TLongLongHashMap();
    private final err_0 riZ = new err_0(this);
    private final TLongHashSet rja = new TLongHashSet();
    protected final QI rjb;

    public ers_0(qu_0 qu_02) {
        this.riW = qu_02;
        this.rjb = new eRU(this);
    }

    @Override
    public boolean b(aam_2 aam_22) {
        if (!(aam_22 instanceof aba_2)) {
            return false;
        }
        long l = this.riX.get(((aba_2)aam_22).bUx());
        if (l != 0L) {
            qm_0 qm_02;
            QD qD = (QD)this.bhi.get(l);
            if (qD != null && qD.d() == enf_0.qPC.d() && (qm_02 = qD.bbh()) instanceof ent_0) {
                return true;
            }
            this.o(l, true);
        }
        return true;
    }

    @Override
    public void clear() {
        this.riX.clear();
        this.riY.clear();
        super.clear();
    }

    @Override
    public void bch() {
        this.riX.forEachKey(riU);
        this.riX.clear();
        this.riY.clear();
        super.bch();
    }

    @Override
    public long Sn() {
        return this.riV;
    }

    @Override
    public void dC(long l) {
        this.riV = l;
    }

    @Override
    public qu_0 bci() {
        return this.riW;
    }

    public long M(QD qD) {
        QD qD2 = qD;
        if (this.qA(qD2.LV())) {
            long l = qD2.LV();
            return this.qz(l) - System.currentTimeMillis();
        }
        if (qD2 instanceof erh_0) {
            fqU fqU2 = ((erh_0)qD2).fGk();
            if (!fqU2.gjE()) {
                bhg.error((Object)("Le temps de fin pour un etat non infini n'est pas contenu dans la map des effets en cours : effect.uid=" + qD2.LV() + ", effect.id=" + qD2.d() + ", stateId=" + fqU2.gjy()));
            }
        } else {
            bhg.error((Object)("Le temps de fin n'est pas contenu dans la map des effets en cours : effect.uid=" + qD2.LV() + ", effect.id=" + qD2.d()));
        }
        return 0L;
    }

    @Override
    public void p(QD qD) {
        if (qD == null) {
            return;
        }
        ero_0 ero_02 = (ero_0)qD;
        if (ero_02.bbh() == null || !ero_02.Ty()) {
            return;
        }
        if (!ero_02.bbY() && ero_02.fGo()) {
            long l = ero_02.fGm();
            long l2 = abb_2.bUA().a(this, l, 0, 1L);
            super.p(ero_02);
            this.riX.put(l2, ero_02.LV());
            this.riY.put(ero_02.LV(), System.currentTimeMillis() + l);
        } else {
            super.p(ero_02);
        }
    }

    public void eer() {
        this.bch();
    }

    public byte[] ml(boolean bl) {
        return this.riZ.ml(bl);
    }

    public byte[] fHD() {
        return this.riZ.fHD();
    }

    long qz(long l) {
        return this.riY.get(l);
    }

    boolean qA(long l) {
        return this.riY.containsKey(l);
    }

    boolean fHE() {
        return this.riW instanceof exP && ((exP)this.riW).aFW() == 5;
    }

    public void a(byte[] byArray, qm_0 qm_02) {
        this.clear();
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        short s = byteBuffer.getShort();
        for (short s2 = 0; s2 < s; s2 = (short)(s2 + 1)) {
            QD qD = (QD)enf_0.fBb().pU(byteBuffer.getInt());
            if (qD == null) {
                bhg.error((Object)"Impossible d'instancier un runningEffect ");
            }
            byte[] byArray2 = new byte[byteBuffer.getShort()];
            byteBuffer.get(byArray2);
            if (qD == null) continue;
            if (qm_02 == null) {
                bhg.error((Object)"contexte null au moment de d\u00e9s\u00e9rialiser un effet");
            }
            ero_0 ero_02 = (ero_0)qD.b(qm_02);
            try {
                ero_02.dr(byArray2);
            }
            catch (Exception exception) {
                bhg.error((Object)("Exception during RunningEffect unserialize " + qD.d()), (Throwable)exception);
                this.fHF();
                break;
            }
            int n = byteBuffer.getInt();
            if (n != 0) {
                ero_02.qx(n);
            }
            this.p(ero_02);
        }
    }

    private void fHF() {
        this.d((QD<?, ?> qD) -> {
            Object FX = qD.bba();
            if (FX == null) {
                bhg.info((Object)qD.d());
            } else {
                bhg.info((Object)("Action Id " + qD.d() + ", EffectId " + FX.aZH()));
            }
        });
    }

    public boolean b(yu_1 yu_12) {
        return this.a(yu_12, true, false);
    }

    public boolean a(yu_1 yu_12, boolean bl, boolean bl2) {
        yu_12.alN.clear();
        this.d((QD<?, ?> qD) -> {
            if (!(qD instanceof erh_0)) {
                return;
            }
            erh_0 erh_02 = (erh_0)qD;
            fqU fqU2 = erh_02.fGk();
            if (bl && !fqU2.cwz()) {
                return;
            }
            if (bl2 && fqU2.cwz()) {
                return;
            }
            boolean bl3 = true;
            int n = 0;
            if (this.qA(qD.LV())) {
                long l = qD.LV();
                n = (int)(this.qz(l) - System.currentTimeMillis());
                if (n < 0 && fqU2.gjx() != -1 && fqU2.giB() != -1) {
                    bl3 = false;
                }
            } else if (fqU2.gjx() != -1000 && fqU2.giB() != -1) {
                bl3 = false;
            }
            if (bl3) {
                yw_1 yw_12 = new yw_1();
                yw_12.adP = qD.LV();
                yw_12.alQ = fqU2.gjy();
                yw_12.Xr = fqU2.cmL();
                yw_12.alR = n;
                yw_12.ajC = erh_02.MJ();
                yu_12.alN.add(yw_12);
            }
        });
        return true;
    }

    public static boolean a(yu_1 yu_12, qm_0<enk_0> qm_02, qu_0 qu_02) {
        for (yw_1 yw_12 : yu_12.alN) {
            QD qD = (QD)enf_0.fBb().pU(enf_0.qPC.d());
            if (qD == null) {
                bhg.error((Object)"On des\u00e9rialise un effet qui n'existe pas : RUNNING_STATE");
                return false;
            }
            erh_0 erh_02 = erh_0.a(qm_02, qu_02, null, fqU.ag(yw_12.alQ, yw_12.Xr));
            if (erh_02 == null) {
                bhg.error((Object)("Effect not unserialized because of an unknown state : " + yw_12.alQ));
                continue;
            }
            fqU fqU2 = erh_02.fGk();
            if (yw_12.alR <= 0 && fqU2.gjx() != -1000 && fqU2.giB() != -1) {
                erh_02.aZp();
                continue;
            }
            erh_02.di(yw_12.adP);
            erh_02.qx(yw_12.alR);
            erh_02.qw(yw_12.ajC);
            erh_02.f(qu_02);
            erh_02.b(enr_0.fBK());
            QD.baX();
            try {
                erh_02.bbK();
            }
            catch (StackOverflowError stackOverflowError) {
                bhg.error((Object)("Possible infinite loop on state effect execution : " + String.valueOf(fqU2)));
                bhg.error((Object)("Possible infinite loop, effects list : " + String.valueOf(yu_12.alN)));
                bhg.error((Object)("Possible infinite loop, effects already on manager : " + String.valueOf(qu_02.baz())));
                bhg.error((Object)"Possible infinite loop on effect execution", (Throwable)stackOverflowError);
            }
            qu_02.baz().p(erh_02);
            erh_02.bbF();
        }
        return true;
    }

    public void a(qu_0 qu_02, qm_0 qm_02) {
        ArrayList<ero_0> arrayList = new ArrayList<ero_0>();
        for (QD qD : this) {
            ero_0 ero_02 = (ero_0)qD;
            if (ero_02.fHo()) continue;
            ero_02.a(qm_02);
            arrayList.add(ero_02);
        }
        for (ero_0 ero_03 : arrayList) {
            if (ero_03.fGm() == 0L) continue;
            ero_03.f(qu_02);
            this.p(ero_03);
            QD.baX();
            ero_03.a(null, false);
        }
    }

    @Override
    public boolean q(QD qD) {
        return this.o(qD.LV(), true);
    }

    public boolean e(QD qD, boolean bl) {
        return this.o(qD.LV(), bl);
    }

    public boolean o(long l, boolean bl) {
        QD qD = (QD)this.bhi.get(l);
        if (qD != null && qD.d() == enf_0.qPC.d()) {
            this.a((erh_0)qD, bl);
            return true;
        }
        return this.dn(l);
    }

    private void d(List<erh_0> list, boolean bl) {
        for (erh_0 erh_02 : list) {
            this.a(erh_02, bl);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void a(erh_0 erh_02, boolean bl) {
        long l = erh_02.LV();
        if (this.rja.contains(l)) {
            fqU fqU2 = erh_02.fGk();
            bhg.warn((Object)("We are trying to remove a state that is already being removed " + l + ", refId " + (fqU2 != null ? fqU2.gjy() : (short)0)));
            return;
        }
        this.rja.add(l);
        try {
            erh_02.fGr();
            this.c(erh_02);
            if (bl) {
                this.dn(l);
            }
        }
        catch (Exception exception) {
            bhg.error((Object)"Exception levee", (Throwable)exception);
        }
        finally {
            this.rja.remove(l);
        }
    }

    private void c(erh_0 erh_02) {
        fqU fqU2 = erh_02.fGk();
        if (fqU2 == null) {
            bhg.warn((Object)"On veut retirer les effets d'un \u00e9tat inconnu");
            return;
        }
        QM qM = this.b(fqU2);
        ArrayList<QD> arrayList = new ArrayList<QD>();
        while (qM.hasNext()) {
            arrayList.add(qM.bcs());
        }
        for (QD qD : arrayList) {
            try {
                ero_0 ero_02 = (ero_0)qD;
                if (ero_02.d() == enf_0.qPC.d()) continue;
                if (erh_02.fHh()) {
                    ero_02.mi(true);
                }
                this.dn(ero_02.LV());
            }
            catch (Exception exception) {
                bhg.error((Object)("Exception lors du retrait des effets lies a l'etat " + fqU2.gjy()), (Throwable)exception);
            }
        }
    }

    @Override
    public void i(qu_0 qu_02) {
        this.a(qu_02, false);
    }

    public void a(qu_0 qu_02, boolean bl) {
        this.a(qu_02, bl, false, false);
    }

    public void a(qu_0 qu_02, boolean bl, boolean bl2, boolean bl3) {
        QN qN = this.h(qu_02);
        ArrayList<erh_0> arrayList = new ArrayList<erh_0>();
        while (qN.hasNext()) {
            fqU fqU2;
            ero_0 ero_02 = (ero_0)qN.bcs();
            if (bl2 && ero_02.a(eNi.qWw)) continue;
            if (bl3 && ero_02 instanceof erh_0 && (fqU2 = ((erh_0)ero_02).fGk()) != null && fqU2.gjF()) {
                ero_02.mi(true);
                arrayList.add((erh_0)ero_02);
                continue;
            }
            if (ero_02.d() == enf_0.qPC.d() || !ers_0.k(ero_02) || bl && (ero_02.bba() == null || ((enk_0)ero_02.bba()).aZG() != 2)) continue;
            qN.remove();
        }
        qN.aZp();
        this.aP(arrayList);
    }

    private void aP(List<erh_0> list) {
        this.d(list, true);
    }

    public void s(qu_0 qu_02) {
        QN qN = this.h(qu_02);
        ArrayList<erh_0> arrayList = new ArrayList<erh_0>();
        this.a(qN, true, arrayList);
        qN.aZp();
        this.aP(arrayList);
    }

    public void i(Qk qk) {
        this.a(qk, false);
    }

    @Override
    public void a(Qk qk, boolean bl) {
        QM qM = this.b(qk);
        ArrayList<erh_0> arrayList = new ArrayList<erh_0>();
        this.a(qM, arrayList);
        this.d(arrayList, bl);
    }

    public void g(ffV ffV2, boolean bl) {
        eRW eRW2 = new eRW(this, this.iterator(), ffV2);
        ArrayList<erh_0> arrayList = new ArrayList<erh_0>();
        this.a(eRW2, arrayList);
        this.d(arrayList, bl);
    }

    private void a(Iterator<QD> iterator, List<erh_0> list) {
        this.a(iterator, false, list);
    }

    private void a(Iterator<QD> iterator, boolean bl, List<erh_0> list) {
        ArrayList<QD> arrayList = new ArrayList<QD>();
        while (iterator.hasNext()) {
            arrayList.add(iterator.next());
        }
        this.a(arrayList, bl, list);
    }

    private void a(Iterable<QD> iterable, boolean bl, List<erh_0> list) {
        for (QD qD : iterable) {
            ero_0 ero_02 = (ero_0)qD;
            if (bl) {
                ero_02.mi(true);
            }
            if (ero_02.d() == enf_0.qPC.d()) {
                list.add((erh_0)ero_02);
                continue;
            }
            if (!ers_0.k(ero_02)) continue;
            this.dn(ero_02.LV());
        }
    }

    @Override
    public void a(Qk qk, boolean bl, boolean bl2) {
        QM qM = this.b(qk);
        ArrayList<erh_0> arrayList = new ArrayList<erh_0>();
        while (qM.hasNext()) {
            ero_0 ero_02 = (ero_0)qM.bcs();
            if (ero_02.d() == enf_0.qPC.d()) {
                ero_02.mi(bl2);
                arrayList.add((erh_0)ero_02);
                continue;
            }
            if (!ers_0.k(ero_02)) continue;
            ero_02.mi(bl2);
            qM.remove();
        }
        this.d(arrayList, bl);
    }

    @Override
    public QI bcj() {
        return this.rjb;
    }

    private static boolean k(ero_0 ero_02) {
        return ero_02.bbf() == null || ((eNl)ero_02.bbf()).bab() != 1;
    }

    public void Sd(int n) {
        Iterator<QD> iterator = this.iterator();
        while (iterator.hasNext()) {
            QD qD = iterator.next();
            if (qD.bbf() == null || qD.bbf().bab() != n || !this.N(qD)) continue;
            iterator.remove();
            this.r(qD);
        }
    }

    private boolean N(QD qD) {
        Object FX = qD.bba();
        if (!(FX instanceof enk_0)) {
            return false;
        }
        enk_0 enk_02 = (enk_0)FX;
        return enk_02.fAz().hasNext() || enk_02.fAA().hasNext();
    }

    public void Se(int n) {
        this.b(n, false, false);
    }

    public void b(int n, boolean bl, boolean bl2) {
        ArrayList arrayList = new ArrayList();
        for (Object object : this) {
            if (((QD)object).bbf() == null || ((QD)object).bbf().bab() != n || arrayList.contains(((QD)object).bbf())) continue;
            arrayList.add(((QD)object).bbf());
        }
        for (Object object : arrayList) {
            if (bl2) {
                this.a((Qk)object, bl, bl2);
                continue;
            }
            this.a((Qk)object, bl);
        }
    }

    public void d(exe_1 exe_12) {
        ArrayList arrayList = new ArrayList();
        this.d((QD<?, ?> qD) -> {
            ePE ePE2;
            if (qD instanceof ePE && (ePE2 = (ePE)qD).fED() == exe_12 && !arrayList.contains(ePE2.bbf())) {
                arrayList.add(ePE2.bbf());
            }
        });
        for (Qk qk : arrayList) {
            this.a(qk, true);
        }
    }

    public int Sf(int n) {
        LU lU = new LU(0);
        ArrayList<erh_0> arrayList = new ArrayList<erh_0>();
        this.d((QD<?, ?> qD) -> {
            erh_0 erh_02;
            fqU fqU2;
            if (qD instanceof erh_0 && (fqU2 = (erh_02 = (erh_0)qD).fGk()) != null && fqU2.gjy() == n) {
                arrayList.add(erh_02);
                lU.aTo();
            }
        });
        this.aP(arrayList);
        return lU.aTn();
    }

    public List<erh_0> fHG() {
        ArrayList<erh_0> arrayList = new ArrayList<erh_0>();
        this.d((QD<?, ?> qD) -> {
            if (qD.d() == enf_0.qPC.d()) {
                arrayList.add((erh_0)qD);
            }
        });
        return arrayList;
    }

    public erh_0 Sg(int n) {
        return this.a((QD<?, ?> qD) -> {
            if (qD.d() == enf_0.qPC.d() && ((erh_0)qD).fGk().gjy() == n) {
                return (erh_0)qD;
            }
            return null;
        });
    }

    @Nullable
    public QD c(eNi eNi2) {
        for (QD qD : this) {
            if (!((ero_0)qD).a(eNi2)) continue;
            return qD;
        }
        return null;
    }

    @Override
    public void r(QD qD) {
        super.r(qD);
        long l = qD.LV();
        TLongLongIterator tLongLongIterator = this.riX.iterator();
        while (tLongLongIterator.hasNext()) {
            tLongLongIterator.advance();
            long l2 = tLongLongIterator.key();
            if (tLongLongIterator.value() != l) continue;
            abb_2.bUA().hk(l2);
            tLongLongIterator.remove();
        }
        this.riY.remove(l);
    }
}

