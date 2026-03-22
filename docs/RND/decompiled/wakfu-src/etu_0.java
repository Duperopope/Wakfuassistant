/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.procedure.TIntObjectProcedure
 *  gnu.trove.set.hash.TIntHashSet
 *  org.jetbrains.annotations.NotNull
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.procedure.TIntObjectProcedure;
import gnu.trove.set.hash.TIntHashSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from eTU
 */
public abstract class etu_0<F extends exP>
extends euq_0<F>
implements Uh {
    protected static final euh_1 rqE = new euh_1();
    public static final boolean rqF = false;
    protected qq_0 rqG = rqE;
    public static final byte rqH = 0;
    public static final byte rqI = 1;
    public static final byte rqJ = 2;
    public static final byte rqK = 3;
    protected etw_0 jiq;
    private final TLongObjectHashMap<qu_0> rqL = new TLongObjectHashMap();
    private final eul_1 rqM = new eul_1(this);
    private final eue_1 rqN = new eue_1(this);
    private final eud_1 rqO = new eud_1(this);
    protected byte rqP;
    protected eSM rqQ;

    private boolean d(exP exP2, exP exP3) {
        return this.aS(exP2) != this.aS(exP3);
    }

    public boolean dGP() {
        return this.jiq == etw_0.rqW;
    }

    public qq_0 bad() {
        return this.rqG;
    }

    public void au(acd_1 acd_12) {
    }

    public acd_1 fJy() {
        return null;
    }

    public qy_0 bak() {
        return null;
    }

    public int a(fhu fhu2, fhx fhx2, boolean bl, boolean bl2) {
        return 0;
    }

    public void a(eSS eSS2) {
        if (!(eSS2 instanceof eza_0)) {
            return;
        }
        eza_0 eza_02 = (eza_0)((Object)eSS2);
        boolean bl = eza_02.buW();
        if (!bl) {
            return;
        }
        if (eza_02.fgZ() != null) {
            eza_02.fgZ().djX();
        }
    }

    public qx_0 bal() {
        return null;
    }

    public void a(fhx fhx2, int n, short s) {
    }

    public boolean a(int n, qu_0 qu_02, qu_0 qu_03, acd_1 acd_12, eNl eNl2) {
        return false;
    }

    @Override
    public boolean qF(long l) {
        return this.rqL.contains(l);
    }

    public void qG(long l) {
        this.rqL.remove(l);
    }

    @Override
    public qu_0 qH(long l) {
        return (qu_0)this.rqL.get(l);
    }

    @Override
    public Iterator<qu_0> fJz() {
        Object[] objectArray = new qu_0[this.rqL.size()];
        this.rqL.values(objectArray);
        return new azh_1<Object>(objectArray, false);
    }

    public void t(qu_0 qu_02) {
        this.rqL.put(qu_02.Sn(), (Object)qu_02);
    }

    public int fJA() {
        return this.rqL.size();
    }

    public boolean fJB() {
        return this.rrD.fKT();
    }

    public boolean fJC() {
        return this.rrD.fKU();
    }

    protected etu_0(int n, eUw eUw2, rh_0 rh_02) {
        super(n, eUw2, rh_02);
        this.jiq = etw_0.rqV;
    }

    public void b(F f2, abi_1 abi_12) {
        ((exP)f2).a(abi_12);
    }

    @Override
    public ewk_1 dHf() {
        return this.rry;
    }

    @Override
    public etw_0 dGp() {
        return this.jiq;
    }

    public void a(etw_0 etw_02) {
        this.jiq = etw_02;
    }

    public void start() {
        this.dHf().start();
        this.fJH();
    }

    private void fJD() {
        TIntObjectHashMap tIntObjectHashMap = new TIntObjectHashMap();
        TIntHashSet tIntHashSet = this.i((TIntObjectHashMap<List<enk_0>>)tIntObjectHashMap);
        this.a((TIntObjectHashMap<List<enk_0>>)tIntObjectHashMap, tIntHashSet);
        this.h((TIntObjectHashMap<List<enk_0>>)tIntObjectHashMap);
    }

    private void h(TIntObjectHashMap<List<enk_0>> tIntObjectHashMap) {
        tIntObjectHashMap.forEachEntry((TIntObjectProcedure)new etv_0(this));
    }

    private void a(TIntObjectHashMap<List<enk_0>> tIntObjectHashMap, TIntHashSet tIntHashSet) {
        Collection collection = this.fKf();
        for (exP exP2 : collection) {
            enk_0 enk_02;
            eyp eyp2;
            byte by = exP2.bcP();
            if (tIntHashSet.contains((int)by) || !((eyp2 = exP2.doV()) instanceof eyi) || (enk_02 = ewc_1.rBP.SM(((eyi)eyp2).csc())) == null) continue;
            ArrayList<enk_0> arrayList = (ArrayList<enk_0>)tIntObjectHashMap.get((int)by);
            if (arrayList == null) {
                arrayList = new ArrayList<enk_0>();
                tIntObjectHashMap.put((int)by, arrayList);
            }
            arrayList.add(enk_02);
        }
    }

    private TIntHashSet i(TIntObjectHashMap<List<enk_0>> tIntObjectHashMap) {
        TIntHashSet tIntHashSet = new TIntHashSet();
        Collection collection = this.fKd();
        for (exP exP2 : collection) {
            byte by = exP2.bcP();
            List list = (List)tIntObjectHashMap.get((int)by);
            if (list != null) continue;
            tIntObjectHashMap.put((int)by, new ArrayList<enk_0>(ewc_1.rBP.fOj()));
            tIntHashSet.add((int)by);
        }
        return tIntHashSet;
    }

    public boolean Sv(int n) {
        this.jiq = etw_0.rqT;
        this.Fr(n);
        return true;
    }

    public boolean fJE() {
        this.jiq = etw_0.rqU;
        this.fJD();
        this.dGT();
        this.dHf().bhI();
        this.dHf().dIC();
        return true;
    }

    @Override
    public boolean qI(long l) {
        Object f2 = this.qJ(l);
        if (f2 != null) {
            ((exP)f2).aZh();
        }
        return super.qI(l);
    }

    @Override
    public boolean aD(F f2) {
        boolean bl = super.aD(f2);
        if (bl) {
            this.bf(f2);
        }
        return bl;
    }

    @Override
    public void C(F f2) {
        if (!((exP)f2).a(exe_1.rFi)) {
            this.dHf().rd(((exP)f2).Sn());
        }
        super.C(f2);
    }

    @Override
    public boolean aE(F f2) {
        boolean bl = super.aE(f2);
        if (bl) {
            this.be(f2);
        }
        ((exP)f2).fgJ();
        return bl;
    }

    public fqH a(exP exP2, ffV ffV2, fqE fqE2, acd_1 acd_12) {
        return this.rqO.a(exP2, ffV2, fqE2, acd_12);
    }

    public fqH a(exP exP2, ffV ffV2, acd_1 acd_12, boolean bl) {
        return this.rqN.a(exP2, ffV2, acd_12, bl);
    }

    public fqH a(exP exP2, fqE fqE2, acd_1 acd_12, boolean bl) {
        return this.rqM.a(exP2, fqE2, acd_12, bl);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public fqH b(exP exP2, @NotNull fqE<?> fqE2, acd_1 acd_12, boolean bl) {
        fqH fqH2;
        this.rqM.fMA();
        try {
            fqH2 = this.rqM.a(exP2, fqE2, acd_12, bl);
        }
        catch (Exception exception) {
            rrm.error((Object)("Failed to process cast validity for spell " + fqE2.axA() + " by fighter " + String.valueOf(exP2)), (Throwable)exception);
            fqH fqH3 = fqH.sVr;
            return fqH3;
        }
        finally {
            this.rqM.fMB();
        }
        return fqH2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public fqH a(exP exP2, fqE fqE2, acd_1 acd_12, boolean bl, eue_0 eue_02) {
        fqH fqH2;
        this.rqM.a(eue_02);
        try {
            fqH2 = this.rqM.a(exP2, fqE2, acd_12, bl);
        }
        catch (Exception exception) {
            rrm.error((Object)"Exception levee", (Throwable)exception);
            fqH fqH3 = fqH.sVr;
            return fqH3;
        }
        finally {
            this.rqM.a(new eue_0());
        }
        return fqH2;
    }

    public abstract qg_0<enk_0> bac();

    @Override
    public void fJF() {
        super.fJF();
        ent_0 ent_02 = new ent_0(this, this.bac());
        ent_02.lT(this.fJG());
        this.bgJ = ent_02;
    }

    private boolean fJG() {
        Collection collection = this.fKf();
        for (exP exP2 : collection) {
            if (exP2.aWP() != 4378) continue;
            return true;
        }
        return false;
    }

    @Override
    public void aF(F f2) {
        ArrayList<QQ> arrayList = new ArrayList<QQ>();
        for (QQ qQ : this.rrA.bdh()) {
            if (qQ.aeV() != etm_0.rnq.aHp() || qQ.bci() != f2 || ((eSV)qQ).fIO()) continue;
            arrayList.add(qQ);
        }
        for (QQ qQ : arrayList) {
            this.rrA.b(qQ);
        }
    }

    public void fJH() {
        this.dHf().bhH();
        this.rrz.a(true, true);
    }

    protected abstract void Fr(int var1);

    public abstract void dGS();

    public void dGT() {
        this.dHf().bhH();
        if (!this.rrA.d(this.rqQ)) {
            this.rrA.a(this.rqQ);
        }
    }

    @Override
    public void chN() {
        this.jiq = etw_0.rqW;
        super.chN();
    }

    @Override
    public void dGU() {
        super.dGU();
    }

    @Override
    public void B(F f2) {
        ((exP)f2).fgl();
        switch (this.jiq.ordinal()) {
            case 1: 
            case 3: 
            case 5: {
                if (!((exP)f2).a(exe_1.rFi)) {
                    this.dHf().a(((exP)f2).Sn(), true, this.aH(f2));
                }
                if (this.jiq != etw_0.rqT) break;
                this.dHf().bhH();
                break;
            }
            case 2: {
                if (((exP)f2).a(exe_1.rFi)) break;
                this.dHf().a(((exP)f2).Sn(), true, this.aH(f2));
            }
        }
        super.B(f2);
    }

    private int aG(F f2) {
        tw_0 tw_02 = ((exP)f2).eyB();
        if (tw_02 == null) {
            return 1;
        }
        return tw_02.bho();
    }

    private tw_0 aH(F f2) {
        tw_0 tw_02 = ((exP)f2).eyB();
        if (tw_02 != null) {
            return tw_02;
        }
        tw_0 tw_03 = new tw_0(this.aG(f2), Tx.bsO);
        ewk_1 ewk_12 = this.dHf();
        if (ewk_12.bhE()) {
            tw_03.el(ewk_12.bhF());
        }
        return tw_03;
    }

    @Override
    public void A(F f2) {
        ers_0 ers_02 = ((exP)f2).doc();
        for (exP exP2 : this.fKc()) {
            if (exP2.doc() != null) {
                exP2.doc().a((qu_0)f2, true, true, true);
            }
            if (ers_02 == null) continue;
            ers_02.a(exP2, true, true, false);
        }
        if (((exP)f2).fha()) {
            ((exP)f2).djX();
        }
        if (this.bai() != null) {
            this.bai().l((qu_0)f2);
        }
    }

    @Override
    public void z(@NotNull F f2) {
        if (((exP)f2).fhm().get(1)) {
            return;
        }
        if (((exP)f2).a(exe_1.rDF)) {
            ((exP)f2).e(exx_2.rGj).aYP();
        }
        if (((exP)f2).a(exe_1.rDI)) {
            ((exP)f2).e(exx_2.rGk).aYP();
        }
        ((exP)f2).fgh().gjg();
        super.z(f2);
    }

    @Override
    public void y(@NotNull F f2) {
        if (((exP)f2).fhm().get(2)) {
            return;
        }
        if (((exP)f2).a(exe_1.rDF)) {
            ((exP)f2).e(exx_2.rGj).aYP();
        } else {
            ((exP)f2).e(exx_2.rGj).aYO();
        }
        ((exP)f2).e(exx_2.rGk).aYO();
        if (((exP)f2).a(exe_1.rDI)) {
            ((exP)f2).e(exx_2.rGk).aYP();
        }
        super.y(f2);
    }

    @Override
    public void dGY() {
        this.rrz.a(false, true);
    }

    @Override
    public void a(tx_0 tx_02) {
        this.dGS();
    }

    @Override
    public void a(Uf uf) {
        this.dGU();
    }

    @Override
    public void a(Ue ue) {
        this.dHd();
    }

    @Override
    public void a(TW tW) {
        this.qS(tW.OO());
    }

    @Override
    public void a(ty_0 ty_02) {
        this.qT(ty_02.OO());
    }

    @Override
    public void a(TU tU) {
        this.qU(tU.OO());
    }

    @Override
    public void fh(long l) {
    }

    @Override
    public void a(Ub ub) {
        QD qD = ub.biU();
        ub.biV();
        if (qD != null) {
            qD.bbK();
        }
    }

    @Override
    public void a(Uc uc) {
        QD qD = uc.biU();
        if (qD != null) {
            qD.bbO();
        }
    }

    @Override
    public void a(TT tT) {
        tT.biH().a((anu_1)this.qJ(tT.biI()));
    }

    public short e(short s, byte by) {
        Collection collection = by != -1 ? this.rrw.a(evb_0.fNn(), evb_0.c(evb_0.fJ((byte)1), evb_0.fJ((byte)2)), evb_0.fK(by)) : this.rrw.a(evb_0.fNn(), evb_0.c(evb_0.fJ((byte)1), evb_0.fJ((byte)2)));
        short s2 = 0;
        if (s == -1) {
            return (short)collection.size();
        }
        for (exP exP2 : collection) {
            if (exP2.aWP() != s) continue;
            s2 = (short)(s2 + 1);
        }
        return s2;
    }

    public eSM fhK() {
        return this.rqQ;
    }

    public void a(eSM eSM2) {
        this.rqQ = eSM2;
    }

    public abstract void x(F var1);

    public void a(eNl eNl2, exP exP2) {
        if (eNl2 != null) {
            this.a(eNl2.fvT(), exP2);
        }
    }

    public void a(short s, exP exP2) {
        if (exP2 == null) {
            return;
        }
        byte by = exP2.bcP();
        for (exP exP3 : this.rrw.a(evb_0.fNn(), evb_0.a(evb_0.fK(by)))) {
            exP3.a(exP2, s);
        }
    }

    public void l(ero_0 ero_02) {
        if (ero_02.bba() != null && ((enk_0)ero_02.bba()).aZG() != 2) {
            return;
        }
        if (ero_02.bbf() != null) {
            short s = ((eNl)ero_02.bbf()).fvT();
            short s2 = ((eNl)ero_02.bbf()).fvU();
            short s3 = ((eNl)ero_02.bbf()).fvV();
            qu_0 qu_02 = ero_02.bbc();
            if (((eNl)ero_02.bbf()).bab() == 3) {
                qu_02 = ((QQ)ero_02.bbf()).bci();
            }
            qu_0 qu_03 = ero_02.bbd();
            if (qu_02 != null && qu_03 != null && qu_02 instanceof exP && qu_03 instanceof exP) {
                exP exP2 = (exP)qu_02;
                boolean bl = false;
                if (this.d(exP2, (exP)qu_03)) {
                    if (s3 == 0) {
                        bl = true;
                    }
                } else if (s2 == 0) {
                    bl = true;
                }
                ewy_2 ewy_22 = (ewy_2)((Object)qu_03);
                ewy_2 ewy_23 = (ewy_2)((Object)qu_02);
                if (!bl) {
                    if (ewy_22 != ewy_23) {
                        ewy_22.a(ewy_23, s);
                    }
                } else {
                    for (exP exP3 : this.fKc()) {
                        if (!this.d(exP2, exP3)) continue;
                        exP3.b(ewy_23, (short)(s * 10));
                    }
                }
            }
        }
    }

    protected abstract void k(rj_0 var1);

    @Override
    protected void fJI() {
        if (this.rqQ != null) {
            this.rrA.b(this.rqQ);
            this.rrA.c(this.rqQ);
            this.rqQ.aZp();
            this.rqQ = null;
        }
        super.fJI();
    }

    @Override
    public /* synthetic */ TA baf() {
        return this.dHf();
    }
}

