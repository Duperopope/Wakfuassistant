/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 *  gnu.trove.map.hash.TLongByteHashMap
 *  gnu.trove.set.hash.TByteHashSet
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import com.ankamagames.framework.graphics.engine.material.Material;
import gnu.trove.list.array.TIntArrayList;
import gnu.trove.map.hash.TLongByteHashMap;
import gnu.trove.set.hash.TByteHashSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bsI
 */
public class bsi_0
implements QT,
qq_0,
qv_0,
adi_0,
ano_2<qu_0>,
bsS {
    private static final Logger jij = Logger.getLogger(bsi_0.class);
    private final qm_0 jik;
    private final List<bgy> jil = new ArrayList<bgy>();
    private final List<bgy> jim = new ArrayList<bgy>();
    private final bbh jin;
    private final TLongByteHashMap jio = new TLongByteHashMap();
    @NotNull
    private final eUw jip;
    private int o = -1;
    private etw_0 jiq;
    private int jir = 0;
    private ArrayList<azx_1<Short, Short>> jis = new ArrayList();
    private ags_0 jit = new bsh_0();
    private rh_0 cts;
    private bgy jiu;
    private bgy jiv;
    private long jiw;
    private long jix;
    private final List<Long> jiy = new ArrayList<Long>();
    private final List<Long> jiz = new ArrayList<Long>();
    private short jiA;
    private final uw_0 jiB;
    private TByteHashSet jiC;
    private TByteHashSet jiD;
    @Nullable
    private fik_2 jiE;
    private final aVa jiF = new aVa();

    public void O(List<Long> list) {
        this.jiy.addAll(list);
    }

    public void P(List<Long> list) {
        this.jiz.addAll(list);
    }

    public boolean kn(long l) {
        return this.jiy.contains(l);
    }

    public boolean ko(long l) {
        return this.jiz.contains(l);
    }

    public bsi_0(@NotNull eUw eUw2, long l) {
        this(eUw2, l, null, null);
    }

    public bsi_0(@NotNull eUw eUw2, long l, TByteHashSet tByteHashSet, TByteHashSet tByteHashSet2) {
        this.jip = eUw2;
        this.jik = new bar_2(this);
        this.jin = new bbh(this, this.jik);
        this.jiB = ue_0.bjV().bjm();
        this.jiB.cH(l);
        this.jiC = tByteHashSet != null ? tByteHashSet : new TByteHashSet();
        this.jiD = tByteHashSet2 != null ? tByteHashSet2 : new TByteHashSet();
    }

    public void h(byte by, boolean bl) {
        if (bl) {
            this.jiC.add(by);
        } else {
            this.jiC.remove(by);
        }
    }

    public boolean bG(byte by) {
        return this.jiC.contains(by);
    }

    public void dGm() {
        this.jiC.clear();
    }

    public void i(byte by, boolean bl) {
        if (bl) {
            this.jiD.add(by);
        } else {
            this.jiD.remove(by);
        }
    }

    public boolean bH(byte by) {
        return this.jiD.contains(by);
    }

    public void dGn() {
        this.jiD.clear();
    }

    public void f(byte by, long l) {
        bgy bgy2 = bgg_0.dlO().ju(l);
        if (bgy2 == null) {
            this.jio.put(l, by);
            return;
        }
        this.a(bgy2, by);
    }

    public void a(bgy bgy2, byte by) {
        if (!this.jil.contains(bgy2)) {
            this.jil.add(bgy2);
            this.jio.put(bgy2.Sn(), by);
            bgy2.dkX();
            bgy2.fgl();
            aJP.cig().a(bgy2, this.o);
            if (bgy2.doE()) {
                this.jim.add(bgy2);
            }
            bgy2.f(this);
            bgy2.ddI().a(this);
        } else {
            jij.error((Object)("Ajout multiple du fighter " + String.valueOf(bgy2) + " au combat externe ID=" + this.d()));
        }
    }

    @Override
    public int d() {
        return this.o;
    }

    @Override
    @NotNull
    public eUw dGo() {
        return this.jip;
    }

    @Override
    public etw_0 dGp() {
        return this.jiq;
    }

    public void a(etw_0 etw_02) {
        this.jiq = etw_02;
        if (etw_02 == etw_0.rqU) {
            this.dGq();
        }
    }

    private void dGq() {
        if (this.jiE != null) {
            fiq_2.gCw().f(this.jiE);
        }
        this.jiE = null;
    }

    public euf_0 b(bgy bgy2, byte by) {
        if (bgy2.djT()) {
            return euf_0.rxj;
        }
        if (bgy2.doP()) {
            return euf_0.rxl;
        }
        if (by < 0 || by >= this.jip.fJZ()) {
            return euf_0.rxm;
        }
        if (!eug_0.a(this, bgy2)) {
            return euf_0.rxE;
        }
        bzq_2 bzq_22 = bzp_2.eqt().mA(bgy2.aqZ());
        if (bzq_22.eqw() && !this.c(bgy2, by)) {
            return euf_0.rxE;
        }
        if (!eug_0.a(this, bgy2, by)) {
            return euf_0.rxr;
        }
        if (!eug_0.a(this, bgy2, by)) {
            return euf_0.rxq;
        }
        if (!eug_0.b(this, bgy2, by)) {
            return euf_0.rxq;
        }
        euf_0 euf_02 = eug_0.c(this, bgy2, by);
        if (euf_02 != euf_0.rxi) {
            return euf_02;
        }
        if (by == 0 && this.jip.fLc()) {
            return euf_0.rxi;
        }
        Collection<bgy> collection = this.bL(by);
        int n = collection.size();
        byte by2 = bgy2.aFW();
        if (by2 == 0 || by2 == 5 ? n > this.jip.fKa() : n > this.jip.fKb()) {
            return euf_0.rxk;
        }
        return euf_0.rxi;
    }

    private boolean c(bgy bgy3, byte by) {
        Optional<fpv> optional = cux_0.mjE.eDE();
        if (optional.isEmpty()) {
            return false;
        }
        fpv fpv2 = optional.get();
        int n = bgy3.Xt();
        TIntArrayList tIntArrayList = fpv2.ggK();
        Predicate<bgy> predicate = bgy2 -> bgy2.i(ezj_0.puz);
        boolean bl = this.bK(by).stream().anyMatch(predicate.or(bgy2 -> tIntArrayList.contains(bgy2.Xt())));
        if (bl && tIntArrayList.contains(n)) {
            return false;
        }
        TIntArrayList tIntArrayList2 = fpv2.ggL();
        Predicate<bgy> predicate2 = bgy2 -> bgy2.i(ezj_0.puA);
        boolean bl2 = this.bK(by).stream().anyMatch(predicate2.or(bgy2 -> tIntArrayList2.contains(bgy2.Xt())));
        return !bl2 || !tIntArrayList2.contains(n);
    }

    @Override
    public byte kp(long l) {
        if (this.jio.contains(l)) {
            return this.jio.get(l);
        }
        return -1;
    }

    @Override
    public byte dGr() {
        return this.jio.get(this.jiw);
    }

    @Override
    public rh_0 bag() {
        return this.cts;
    }

    @Override
    public qm_0 bbh() {
        return this.jik;
    }

    @Override
    public QR bai() {
        return this.jin;
    }

    public void d(rh_0 rh_02) {
        this.cts = rh_02;
    }

    public void lK(int n) {
        this.o = n;
        this.jiF.k(this);
    }

    public void aQ(bgy bgy2) {
        if (!this.jio.containsKey(bgy2.Sn())) {
            jij.warn((Object)String.format("[FIGHT_REFACTOR]Tentative de spawn du fighter %d sans connaitre sa team", bgy2.Sn()));
            return;
        }
        byte by = this.jio.get(bgy2.Sn());
        this.a(bgy2, by);
        boolean bl = false;
        if (this.jiv == null && this.jix == bgy2.Sn()) {
            this.jiv = bgy2;
            bl = true;
        }
        if (this.jiu == null && this.jiw == bgy2.Sn()) {
            this.jiu = bgy2;
            bl = true;
        }
        if (bl && this.jiu != null && this.jiv != null) {
            aJP.cig().a(this);
        }
    }

    public void a(ZH zH, boolean bl, boolean bl2) {
        block3: {
            Iterator<bgy> iterator;
            block2: {
                iterator = this.dGs().iterator();
                if (!bl) break block2;
                if (!czn_2.eZd()) break block3;
                while (iterator.hasNext()) {
                    bgy bgy2 = iterator.next();
                    Material material = bsi_0.bI(bgy2.bcP());
                    bgy2.ddI().b(material);
                    material.bsI();
                }
                break block3;
            }
            while (iterator.hasNext()) {
                bdj_2 bdj_22 = iterator.next().ddI();
                bdj_22.bpV();
            }
        }
    }

    @Override
    public Collection<bgy> dGs() {
        return Collections.unmodifiableCollection(this.jil);
    }

    protected static Material bI(byte by) {
        Material material = (Material)Material.daL.bSK();
        switch (by) {
            case 0: {
                material.x(0.5f, 0.0f, 0.0f);
                break;
            }
            case 1: {
                material.x(0.0f, 0.0f, 0.5f);
                break;
            }
            default: {
                if (by > 7) {
                    material.x(1.0f, 1.0f, 1.0f);
                    jij.error((Object)("team id : " + by + " > 7"));
                    break;
                }
                material.x(by, by, by);
            }
        }
        return material;
    }

    @Override
    public Collection<bgy> bJ(byte by) {
        ArrayList<bgy> arrayList = new ArrayList<bgy>();
        for (bgy bgy2 : this.jil) {
            if (this.jio.get(bgy2.Sn()) != by || !bgy2.baH() || bgy2.a(exe_1.rFi)) continue;
            arrayList.add(bgy2);
        }
        return arrayList;
    }

    public boolean dGt() {
        for (bgy bgy2 : this.dGs()) {
            this.aR(bgy2);
        }
        return true;
    }

    private boolean aR(bgy bgy2) {
        bdj_2 bdj_22 = bgy2.ddI();
        bdj_22.b(this);
        return true;
    }

    public void dGu() {
        for (bgy bgy2 : this.dGs()) {
            this.aU(bgy2);
        }
    }

    @Override
    public void e(QD qD) {
        if (!qD.Ty()) {
            return;
        }
        if (qD.bbd() != null) {
            if (qD.bbd() instanceof bgy) {
                ((bgy)qD.bbd()).ddI().b((ero_0)qD, false);
            }
        } else if (qD.bbc() != null && qD.bbc() instanceof bgy) {
            ((bgy)qD.bbc()).ddI().b((ero_0)qD, true);
        }
    }

    @Override
    public void f(QQ qQ) {
        aJP.cig().a(this, qQ);
    }

    @Override
    public void b(QD qD) {
        if (qD.bbd() != null) {
            if (qD.bbd() instanceof bgy) {
                ((bgy)qD.bbd()).ddI().c((ero_0)qD, false);
            }
        } else if (qD.bbc() != null && qD.bbc() instanceof bgy) {
            ((bgy)qD.bbc()).ddI().c((ero_0)qD, true);
        }
    }

    @Override
    public void a(QQ qQ, anu_1 anu_12) {
    }

    @Override
    public void d(QD qD) {
        this.b(qD);
    }

    @Override
    public void b(QQ qQ, anu_1 anu_12) {
    }

    @Override
    public void f(QD qD) {
        if (!qD.Ty()) {
            return;
        }
        if (qD.bbd() != null) {
            if (qD.bbd() instanceof bgy) {
                ((bgy)qD.bbd()).ddI().a((ero_0)qD, false);
            }
        } else if (qD.bbc() != null && qD.bbc() instanceof bgy) {
            ((bgy)qD.bbc()).ddI().a((ero_0)qD, true);
        }
    }

    @Override
    public void g(QQ qQ) {
        aJP.cig().c(this, qQ);
    }

    @Override
    public void h(QQ qQ) {
    }

    @Override
    public void c(QQ qQ, anu_1 anu_12) {
    }

    @Override
    public void i(QQ qQ) {
        aJP.cig().b(this, qQ);
    }

    public void a(eSS eSS2) {
        if (eSS2 == null) {
            return;
        }
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

    @Override
    public qu_0 dg(long l) {
        QQ qQ = null;
        if (this.jin != null) {
            qQ = this.jin.do(l);
        }
        if (qQ != null) {
            return qQ;
        }
        for (bgy bgy2 : this.jil) {
            if (bgy2.Sn() != l) continue;
            return bgy2;
        }
        return null;
    }

    @Override
    public long bam() {
        throw new UnsupportedOperationException("On ne doit pas cr\u00e9er de nouvelles ID ici");
    }

    public void dGv() {
        while (!this.jil.isEmpty()) {
            this.aS(this.jil.get(0));
        }
        this.dGq();
        if (this.jit != null) {
            acq_0.cge.b((acv_0)((Object)this.jit));
            this.jit = null;
        }
    }

    private void aS(bgy bgy2) {
        try {
            this.aT(bgy2);
        }
        catch (Exception exception) {
            jij.error((Object)("Erreur au retrait d'un personnage depuis une ExternalFightInfo " + adu_1.a(exception, 10)));
        }
        finally {
            bgy2.f((bsi_0)null);
        }
    }

    public void aT(bgy bgy2) {
        if (!this.jil.remove(bgy2)) {
            return;
        }
        if (this.jiu != null && this.jiu.Sn() == bgy2.Sn()) {
            this.jiu = null;
        } else if (this.jiv != null && this.jiv.Sn() == bgy2.Sn()) {
            this.jiv = null;
        }
        aJP.cig().b(bgy2, this.o);
        this.aU(bgy2);
        bgy2.N((byte)-1);
    }

    public void aU(bgy bgy2) {
        this.aR(bgy2);
        bgy2.ddI().bqj();
    }

    @Override
    public void chN() {
        this.dGu();
        aJP.cig();
        aJP.e(this);
        ArrayList<bgy> arrayList = new ArrayList<bgy>(this.dGs());
        for (bgy qu_02 : arrayList) {
            try {
                this.aV(qu_02);
            }
            catch (Exception exception) {
                jij.error((Object)"Exception levee", (Throwable)exception);
            }
        }
        for (QQ qQ : this.bai().bdh()) {
            this.g(qQ);
        }
        if (this.jit != null) {
            acq_0.cge.b((acv_0)((Object)this.jit));
        }
        for (bgy bgy2 : this.jim) {
            bgg_0.dlO().av(bgy2);
        }
        this.jio.clear();
        this.jil.clear();
        this.jim.clear();
    }

    public Iterator<qu_0> dGw() {
        return new azj_1<qu_0>((Iterator<qu_0>)this.jil.iterator(), (Iterator<qu_0>)this.jin.bde().iterator());
    }

    @Override
    public Collection<bgy> bK(byte by) {
        ArrayList<bgy> arrayList = new ArrayList<bgy>();
        for (bgy bgy2 : this.jil) {
            if (this.jio.get(bgy2.Sn()) == by) continue;
            arrayList.add(bgy2);
        }
        return arrayList;
    }

    @Override
    public bgy kq(long l) {
        for (bgy bgy2 : this.jil) {
            if (bgy2.Sn() != l) continue;
            return bgy2;
        }
        return null;
    }

    @Override
    public Collection<bgy> bL(byte by) {
        ArrayList<bgy> arrayList = new ArrayList<bgy>();
        for (bgy bgy2 : this.jil) {
            if (this.jio.get(bgy2.Sn()) != by) continue;
            arrayList.add(bgy2);
        }
        return arrayList;
    }

    @Override
    public boolean u(QQ qQ) {
        return qQ.aeV() != etm_0.rnt.aHp() && qQ.aeV() != etm_0.rnu.aHp() && qQ.aeV() != etm_0.rnA.aHp() && qQ.aeV() != etm_0.rnr.aHp();
    }

    @Override
    public ags_0 dGx() {
        return this.jit;
    }

    @Override
    public Iterator<qu_0> ban() {
        return this.dGw();
    }

    @Override
    public long bhF() {
        return 0L;
    }

    @Override
    public aVa dGy() {
        return this.jiF;
    }

    @Override
    public List<qu_0> a(acd_1 acd_12) {
        return this.b(acd_12.getX(), acd_12.getY(), acd_12.bdi());
    }

    @Override
    public List<qu_0> b(int n, int n2, int n3) {
        ArrayList<qu_0> arrayList = new ArrayList<qu_0>();
        Iterator<qu_0> iterator = this.ban();
        while (iterator.hasNext()) {
            qu_0 qu_02 = iterator.next();
            if (amf_1.a(qu_02, n, n2) != 0) continue;
            arrayList.add(qu_02);
        }
        return arrayList;
    }

    public void aV(bgy bgy2) {
        this.aT(bgy2);
        bgy2.f((bsi_0)null);
        bgy2.dlj();
        bgy2.dkY();
        aJP.cig().b(bgy2, this.d());
    }

    public void bGY() {
        ++this.jir;
    }

    public void bsI() {
        bsS bsS2;
        --this.jir;
        if (this.jir == 0 && (bsS2 = bsU.dHk().Ft(this.d())) instanceof bsi_0) {
            this.chN();
            bsU.dHk().r(this);
        }
    }

    public void b(fik_2 fik_22) {
        if (fik_22 == this.jiE) {
            this.jiE = null;
        }
    }

    public int dGz() {
        return this.jil.size() + this.jin.bdg();
    }

    public ArrayList<azx_1<Short, Short>> dGA() {
        return this.jis;
    }

    public bgy dGB() {
        return this.jiu;
    }

    public void aW(bgy bgy2) {
        this.jiu = bgy2;
    }

    public bgy dGC() {
        return this.jiv;
    }

    public void aX(bgy bgy2) {
        this.jiv = bgy2;
    }

    public void F(ArrayList<azx_1<Short, Short>> arrayList) {
        this.jis = arrayList;
    }

    public void c(fik_2 fik_22) {
        this.dGq();
        this.jiE = fik_22;
    }

    public void kr(long l) {
        this.jiw = l;
    }

    public void ks(long l) {
        this.jix = l;
    }

    public void bK(short s) {
        this.jiA = s;
    }

    public short dGD() {
        return this.jiA;
    }

    public void kt(long l) {
        this.jiB.cH(l);
    }

    public uz_0 dGE() {
        uw_0 uw_02 = ue_0.bjV().bjm();
        uw_0 uw_03 = ue_0.bjV().bjm();
        Long l = this.jip.fKX();
        if (l == null) {
            int n = ewo_0.oBF.i(ewr_0.oDR);
            uw_03.cH(this.jiB.bjB() + (long)n);
        } else {
            uw_03.cH(this.jiB.bjB() + l);
        }
        return uw_02.l(uw_03);
    }

    public String dGF() {
        uw_0 uw_02 = ue_0.bjV().bjm();
        uw_02.cH(ue_0.bjV().bji());
        uz_0 uz_02 = this.jiB.l(uw_02);
        StringBuilder stringBuilder = new StringBuilder();
        if (uz_02.bjE() > 0) {
            stringBuilder.append(String.format("%d:%02d:%02d", uz_02.bjE(), uz_02.bjF(), uz_02.bjH()));
        } else {
            stringBuilder.append(String.format("%02d:%02d", uz_02.bjF(), uz_02.bjH()));
        }
        return stringBuilder.toString();
    }

    @Override
    public /* synthetic */ euf_0 a(euc_1 euc_12, byte by) {
        return this.b((bgy)euc_12, by);
    }

    @Override
    public /* synthetic */ euc_1 ku(long l) {
        return this.kq(l);
    }
}

