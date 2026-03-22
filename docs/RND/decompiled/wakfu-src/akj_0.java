/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.procedure.TIntProcedure
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import gnu.trove.list.array.TIntArrayList;
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.procedure.TIntProcedure;
import gnu.trove.procedure.TObjectProcedure;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from aKJ
 */
public class akj_0
implements aKs {
    protected static final Logger efz = Logger.getLogger(akj_0.class);
    bsS efA;
    private long efB;
    private static final float[] efC = new float[]{1.0f, 1.0f, 1.0f, 0.9f};
    private static final String efD = "STATIC_EFFECT";
    private static final akj_0 efE = new akj_0();
    private final TLongObjectHashMap<TIntArrayList> efF = new TLongObjectHashMap();
    private static final TIntProcedure efG = new akk_0();
    private static int efH = 1;
    private final Stack<QQ> efI = new Stack();
    private final HashMap<QQ, aad_0> efJ = new HashMap();
    private final HashMap<QQ, ZC> efK = new HashMap();

    public static akj_0 ciY() {
        return efE;
    }

    private static int ciZ() {
        if (efH == Integer.MAX_VALUE) {
            return 1;
        }
        return efH++;
    }

    private akj_0() {
    }

    public void l(QQ qQ) {
        aad_0 aad_02;
        bby bby2 = ((bbC)((Object)qQ)).cZE();
        if (bby2.daa()) {
            this.c(qQ, bby2);
        }
        if (this.efF.containsKey(qQ.Sn())) {
            return;
        }
        if (bby2.cZN()) {
            try {
                this.b(qQ, bby2);
            }
            catch (NumberFormatException numberFormatException) {
                efz.error((Object)("Aps au format \u00e9trange : '" + bby2.cZO() + "' pour l'area " + bby2.dab() + "-" + bby2.Sn()));
                return;
            }
        }
        if ((aad_02 = this.a(qQ, bby2)) == null && !bby2.cZX()) {
            if (!bby2.cZU()) {
                return;
            }
            if (qQ.bcG() == null) {
                return;
            }
        }
        if (qQ.bcG() != null) {
            int n = qQ.bcC();
            int n2 = qQ.bcD();
            short s = qQ.bcE();
            qu_0 qu_02 = qQ.bci();
            Iterable<int[]> iterable = null;
            if (qQ instanceof etb_0) {
                iterable = ((etb_0)qQ).fIS();
                n = 0;
                n2 = 0;
            } else if (qu_02 != null) {
                iterable = qQ.bcG().b(n, n2, s, qQ.bcX(), qQ.bcY(), qQ.bcZ(), qQ.bcB());
                n = 0;
                n2 = 0;
            } else {
                iterable = qQ.bcG().bEm();
            }
            if (this.efA != null) {
                rh_0 rh_02 = this.efA.bag();
                if (iterable != null) {
                    for (int[] nArray : iterable) {
                        int n3;
                        int n4 = n + nArray[0];
                        if (!rh_02.T(n4, n3 = n2 + nArray[1])) continue;
                        short s2 = rh_02.Z(n4, n3);
                        if (aad_02 != null && !aad_02.F(n4, n3, s2)) {
                            aad_02.E(n4, n3, s2);
                        }
                        if (bby2.cZU()) {
                            this.a(bby2, n4, n3, s2);
                        }
                        if (!bby2.cZX()) continue;
                        long l = agx_0.E(n4, n3, s2);
                        aah_0.brY().a(l, 1.0f, 1.0f, 1.0f, 0.0f);
                    }
                }
            } else {
                for (int[] nArray : iterable) {
                    int n5 = n + nArray[0];
                    int n6 = n2 + nArray[1];
                    DisplayedScreenElement displayedScreenElement = aaa_0.brC().g(n5, n6, s, abd.ccZ);
                    if (displayedScreenElement == null) continue;
                    short s3 = displayedScreenElement.brk().bst();
                    if (aad_02 != null && !aad_02.F(n5, n6, s3)) {
                        aad_02.E(n5, n6, s3);
                    }
                    if (!bby2.cZU()) continue;
                    this.a(bby2, n5, n6, s3);
                }
            }
        } else {
            efz.error((Object)"area.getArea() is null");
        }
        if (aad_02 != null) {
            this.efJ.put(qQ, aad_02);
        }
    }

    @Nullable
    private aad_0 a(QQ qQ, bby bby2) {
        if (!bby2.cZY()) {
            return null;
        }
        if (this.efJ.containsKey(qQ)) {
            return null;
        }
        String string = null;
        try {
            string = auc_0.cVq().bS("highLightGfxPath") + bby2.cZZ() + ".tga";
        }
        catch (Exception exception) {
            efz.error((Object)"Exception during createElementSelection", (Throwable)exception);
        }
        if (string != null) {
            awk_1 awk_12 = aad_0.eb(string);
            return new aad_0(efD + akj_0.ciZ(), efC, awk_12, agb_0.cum);
        }
        efz.error((Object)"Chemin vers la source nulle");
        return null;
    }

    private void b(QQ qQ, bby bby2) {
        anz_1 anz_12;
        if (this.efF.contains(qQ.Sn())) {
            return;
        }
        int n = Integer.parseInt(bby2.cZO());
        if (bby2.cZQ()) {
            anz_12 = aue_0.cVJ().cVK();
            if (this.a(qQ, (bgt_0)anz_12)) {
                n = Integer.parseInt(bby2.cZP());
            } else if (this.b(qQ, (bgt_0)anz_12)) {
                n = Integer.parseInt(bby2.cZR());
            }
        }
        anz_12 = agY.bzw().bF(n, bby2.cZW());
        afW afW2 = bby2.cZT();
        if (afW2 != null) {
            ((FreeParticleSystem)anz_12).a(afW2);
        } else {
            ((FreeParticleSystem)anz_12).e(qQ.bcC(), qQ.bcD(), qQ.bcE());
        }
        this.a(bby2, (FreeParticleSystem)anz_12);
    }

    private boolean a(QQ qQ, bgt_0 bgt_02) {
        return qQ.bci() != null && qQ.bci() == bgt_02;
    }

    private boolean b(QQ qQ, bgt_0 bgt_02) {
        if (this.a(qQ, bgt_02)) {
            return false;
        }
        if (qQ instanceof bbi) {
            boolean bl = ((bbi)qQ).fIN() == 6;
            return bl && qQ.bcP() == bgt_02.bcP();
        }
        return false;
    }

    private void c(QQ qQ, bby bby2) {
        Object object;
        ZH zH;
        Object object2;
        if (this.efK.containsKey(qQ)) {
            return;
        }
        int n = qQ.bcC();
        int n2 = qQ.bcD();
        short s = qQ.bcE();
        qu_0 qu_02 = qQ.bci();
        boolean bl = qQ.aeV() == etm_0.rnz.aHp();
        boolean bl2 = qQ.aeV() == etm_0.rnE.aHp();
        boolean bl3 = bl || bl2;
        boolean bl4 = false;
        if (bl3 && qQ instanceof ado_0) {
            object2 = ((ado_0)((Object)qQ)).bvp();
            if (object2 != null) {
                zH = object2;
                bl4 = true;
            } else {
                zH = new ads_0(qQ.Sn(), n, n2, s);
            }
            zH.e(n, n2, s);
            object = (adj_0)zH;
            ((adj_0)object).pu(this.efA.d());
            ((ZH)object).aq(bby2.bpX());
            if (bl) {
                ((bbb_0)qQ).n((adj_0)object);
            } else if (bl2) {
                ((bax_0)qQ).n((adj_0)object);
            }
        } else {
            zH = new akl_0(this, qQ.Sn(), n, n2, s);
            zH.aq(bby2.bpX());
        }
        try {
            object2 = auc_0.cVq().bS("ANMInteractiveElementPath");
            object2 = String.format((String)object2, bby2.dab());
            zH.k((String)object2, true);
            if (bl2) {
                if (qu_02 instanceof bhJ) {
                    zH.a(arx_1.cTs, new bjc_1(((bhJ)qu_02).dph().sC()).dqY());
                } else if (qu_02 instanceof bhx_0) {
                    object = ((bhx_0)qu_02).doR();
                    ((bjf_2)object).p((TObjectProcedure<bji_2>)((TObjectProcedure)bji_22 -> {
                        if (bji_22.ipA == arx_1.cTs.bHJ()) {
                            bjk_2.a((adj_0)zH, bji_22);
                        }
                        return true;
                    }));
                }
            }
            zH.dP(fq_0.bJ(bby2.dab()));
        }
        catch (Exception exception) {
            efz.error((Object)"Failed to initialize an animated element", (Throwable)exception);
        }
        bby2.k(zH);
        this.efK.put(qQ, zH);
        if (bl3) {
            adn_0.bvh().g((adj_0)zH);
        } else {
            ZM.bqw().c(zH);
        }
        if (!bl4) {
            object2 = aue_0.cVJ().cVK().dmV();
            crt_2.a((bsj_0)object2, zH);
            zH.d(new akm_0(this, zH));
        }
    }

    private void a(bby bby2, int n, int n2, short s) {
        int n3;
        try {
            n3 = Integer.parseInt(bby2.cZV());
        }
        catch (NumberFormatException numberFormatException) {
            efz.error((Object)("Aps au format \u00e9trange : '" + bby2.cZV() + "' pour l'area " + bby2.dab() + "-" + bby2.Sn()));
            return;
        }
        FreeParticleSystem freeParticleSystem = agY.bzw().sk(n3);
        freeParticleSystem.e(n, n2, s);
        this.a(bby2, freeParticleSystem);
    }

    private void a(bby bby2, FreeParticleSystem freeParticleSystem) {
        if (freeParticleSystem == null) {
            return;
        }
        if (this.efA != null) {
            freeParticleSystem.pu(this.efA.d());
        }
        agZ.bzy().b(freeParticleSystem);
        TIntArrayList tIntArrayList = (TIntArrayList)this.efF.get(bby2.Sn());
        if (tIntArrayList == null) {
            tIntArrayList = new TIntArrayList();
            this.efF.put(bby2.Sn(), (Object)tIntArrayList);
        }
        tIntArrayList.add(freeParticleSystem.bLJ());
    }

    public void m(QQ qQ) {
        switch (etm_0.Sr(qQ.aeV())) {
            case rnu: 
            case rnE: 
            case rnz: {
                qm_0 qm_02 = qQ.bbh();
                if (!(qm_02 instanceof enu_0)) break;
                int n = ((enu_0)qm_02).bha();
                bsS bsS2 = bsU.dHk().Ft(n);
                if (bsS2 == null) break;
                aJP.cig().b(bsS2, qQ);
                break;
            }
        }
    }

    private ZC n(QQ qQ) {
        Set<QQ> set = this.efK.keySet();
        for (QQ qQ2 : set) {
            if (qQ2.Sn() != qQ.Sn()) continue;
            return this.efK.remove(qQ2);
        }
        return null;
    }

    public void o(QQ qQ) {
        long l;
        TIntArrayList tIntArrayList;
        aad_0 aad_02;
        if (qQ == null) {
            efz.warn((Object)"On veut supprimer une area null");
            return;
        }
        ZC zC = this.n(qQ);
        if (zC != null) {
            ZM.bqw().d(zC);
            zC.bpI();
        }
        if ((aad_02 = this.efJ.remove(qQ)) != null) {
            aad_02.bqC();
        }
        if ((tIntArrayList = (TIntArrayList)this.efF.remove(l = qQ.Sn())) != null) {
            tIntArrayList.forEach(efG);
        }
        for (QQ qQ2 : this.efI) {
            if (qQ2.Sn() != l) continue;
            this.efI.remove(qQ2);
            break;
        }
        this.p(qQ);
    }

    private void p(QQ qQ) {
        if (qQ.bcG() == null) {
            return;
        }
        int n = qQ.bcC();
        int n2 = qQ.bcD();
        short s = qQ.bcE();
        qu_0 qu_02 = qQ.bci();
        Iterable<int[]> iterable = null;
        if (qQ instanceof etb_0) {
            iterable = ((etb_0)qQ).fIS();
            n = 0;
            n2 = 0;
        } else if (qu_02 != null) {
            iterable = qQ.bcG().b(n, n2, s, qu_02.bcC(), qu_02.bcD(), qu_02.bcE(), qu_02.bcB());
            n = 0;
            n2 = 0;
        } else {
            iterable = qQ.bcG().bEm();
        }
        if (this.efA == null || iterable == null) {
            return;
        }
        rh_0 rh_02 = this.efA.bag();
        for (int[] nArray : iterable) {
            int n3 = n + nArray[0];
            int n4 = n2 + nArray[1];
            bby bby2 = ((bbC)((Object)qQ)).cZE();
            if (!rh_02.T(n3, n4) || !bby2.cZX()) continue;
            short s2 = rh_02.Z(n3, n4);
            long l = agx_0.E(n3, n4, s2);
            aah_0.brY().a(l, 1.0f, 1.0f, 1.0f, 1.0f);
        }
    }

    public void clear() {
        for (ZC object : this.efK.values()) {
            ZM.bqw().d(object);
            object.bpI();
        }
        this.efK.clear();
        for (aad_0 aad_02 : this.efJ.values()) {
            aad_02.bqC();
        }
        this.efJ.clear();
        Iterator<Object> iterator = this.efF.iterator();
        while (iterator.hasNext()) {
            iterator.advance();
            TIntArrayList tIntArrayList = (TIntArrayList)iterator.value();
            if (tIntArrayList == null) continue;
            tIntArrayList.forEach(efG);
        }
        this.efF.clear();
        this.efB = 0L;
    }

    @Override
    public void aPc() {
        while (!this.efI.empty()) {
            this.l(this.efI.pop());
        }
    }

    public void a(QQ qQ, bsS bsS2) {
        this.efI.push(qQ);
        this.efA = bsS2;
    }

    public bsS cja() {
        return this.efA;
    }

    public void ig(long l) {
        if (this.efA == null) {
            return;
        }
        bgy bgy2 = this.efA.kq(l);
        if (bgy2 == null) {
            return;
        }
        bgy bgy3 = bgy2.djY();
        QR qR = this.efA.bai();
        if (qR == null) {
            return;
        }
        long l2 = this.efA.bhF();
        if (l2 == 0L || l2 == -1L) {
            return;
        }
        List<QQ> list = qR.bdh().stream().filter(qQ -> qQ != null && qQ.bci() != null).toList();
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        long l3 = bgt_02.Sn();
        if (this.efB != 0L && this.efB != l3 || fcL.rUh.sw(l) != null) {
            list.stream().filter(qQ -> qQ.bci() != bgy3 || qQ.aeV() == etm_0.rnu.aHp()).forEach(this::q);
        }
        if (l3 == l && this.efA.bhF() == l) {
            return;
        }
        long l4 = bgy3.Sn();
        list.stream().filter(qQ -> qQ.bci().Sn() == l4 && (qQ.aeV() == etm_0.rnr.aHp() || qQ.aeV() == etm_0.rnA.aHp())).filter(qQ -> akj_0.c(qQ, bgt_02)).forEach(qQ -> this.a((QQ)qQ, this.efA));
        list.stream().filter(qQ -> qQ.bci().Sn() == l && qQ.aeV() == etm_0.rnu.aHp()).filter(qQ -> akj_0.c(qQ, bgt_02)).forEach(qQ -> this.a((QQ)qQ, this.efA));
        this.efB = l4;
        this.aPc();
    }

    private static boolean c(QQ qQ, bgt_0 bgt_02) {
        return !qQ.a(etl_0.rnc) || bgt_02.bcP() == qQ.bcP();
    }

    public void cjb() {
        if (this.efA == null) {
            return;
        }
        long l = this.efA.bhF();
        if (l == 0L) {
            return;
        }
        QR qR = this.efA.bai();
        if (qR == null) {
            return;
        }
        for (QQ qQ : qR.bdh()) {
            this.q(qQ);
        }
        this.efB = 0L;
    }

    private void q(QQ qQ) {
        boolean bl;
        if (qQ == null) {
            return;
        }
        qu_0 qu_02 = qQ.bci();
        if (qu_02 == null) {
            return;
        }
        boolean bl2 = qu_02 instanceof ezz && ((ezz)((Object)qu_02)).dlL() != null;
        boolean bl3 = bl = bl2 && ((ezz)((Object)qu_02)).dlL().Sn() == this.efB;
        if (qu_02.Sn() == this.efB || bl) {
            boolean bl4;
            boolean bl5 = qQ.aeV() == etm_0.rnr.aHp();
            boolean bl6 = bl4 = qQ.aeV() == etm_0.rnA.aHp();
            if (!bl5 && !bl4 && qQ.aeV() != etm_0.rnu.aHp()) {
                return;
            }
            if (bl5 || bl4) {
                this.efA.dGK().filter(bgy2 -> qu_02.Sn() != bgy2.Sn() && qu_02.Sn() != bgy2.djY().Sn()).ifPresent(bgy2 -> this.o(qQ));
            } else {
                this.o(qQ);
            }
        }
    }
}

