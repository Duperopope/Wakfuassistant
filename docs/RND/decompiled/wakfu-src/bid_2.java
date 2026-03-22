/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.CacheBuilder
 *  com.google.common.cache.CacheLoader
 *  com.google.common.cache.LoadingCache
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.list.array.TLongArrayList
 *  gnu.trove.map.hash.TByteObjectHashMap
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.list.array.TLongArrayList;
import gnu.trove.map.hash.TByteObjectHashMap;
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.map.hash.TLongObjectHashMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bID
 */
public class bid_2
implements aeh_2 {
    private static final Logger kgM = Logger.getLogger(bid_2.class);
    private static final float[] kgN = new float[]{1.0f, 1.0f, 1.0f, 1.0f};
    public static final String kgO = "points";
    public static final String kgP = "compass";
    private bRn kgQ = new bRn();
    protected final aah_1<TLongObjectHashMap<fsn_1>> kgR = new aah_1();
    protected final ArrayList<fsn_1> kgS = new ArrayList();
    protected final aah_1<TLongObjectHashMap<fsn_1>> kgT = new aah_1();
    protected final ArrayList<fsn_1> kgU = new ArrayList();
    protected final TLongObjectHashMap<fsn_1> kgV = new TLongObjectHashMap();
    private final TByteObjectHashMap<ArrayList<fsn_1>> kgW = new TByteObjectHashMap();
    private final ajp_0 kgX = new ajp_0();
    private biu_2 kgY = biu_2.kgA;
    private fbb_2 kfX;
    private final TLongArrayList kgZ = new TLongArrayList();
    private static final LoadingCache<String, byte[]> kha = CacheBuilder.newBuilder().expireAfterAccess(30L, TimeUnit.SECONDS).build((CacheLoader)new bie_2());

    @Override
    public String[] bxk() {
        return dGM;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (string.equals(kgP)) {
            return this.kgU;
        }
        if (string.equals(kgO)) {
            return this.kgS;
        }
        return null;
    }

    public void a(fbb_2 fbb_22) {
        this.kfX = fbb_22;
        if (this.kfX != null) {
            TLongObjectIterator tLongObjectIterator = this.kgV.iterator();
            while (tLongObjectIterator.hasNext()) {
                tLongObjectIterator.advance();
                this.kfX.e((fsn_1)tLongObjectIterator.value());
            }
        }
    }

    public void dYy() {
        this.dYC();
        cav_2 cav_22 = caf_2.lFq.eqP();
        ArrayList<fsn_1> arrayList = new ArrayList<fsn_1>();
        this.kgW.put(bRr.lad.aFW(), arrayList);
        biy_2.a(cav_22, arrayList);
        this.dYB();
    }

    public biu_2 dYz() {
        return this.kgY;
    }

    public void a(biu_2 biu_22) {
        this.kgY = biu_22;
    }

    private void lx(long l) {
        byte[] byArray;
        String string;
        if (!this.kgZ.contains(l)) {
            this.kgZ.add(l);
        }
        try {
            string = String.format(auc_0.cVq().bS("mapsPoiPath"), l);
        }
        catch (fu_0 fu_02) {
            kgM.error((Object)"Probl\u00e8me lors de la lecture de mapsPoiPath");
            return;
        }
        try {
            byArray = (byte[])kha.get((Object)string);
        }
        catch (ExecutionException executionException) {
            kgM.error((Object)("Unable to load map (" + string + ") in CACHE"), (Throwable)executionException);
            return;
        }
        if (byArray == null) {
            kgM.error((Object)("Unable to load map (" + string + ")"));
            return;
        }
        try {
            this.kgX.b(apl_1.dw(byArray), false);
        }
        catch (IOException iOException) {
            kgM.error((Object)("Unable to load land marks from " + string), (Throwable)iOException);
            return;
        }
    }

    void c(TLongArrayList tLongArrayList) {
        this.dYC();
        int n = tLongArrayList.size();
        for (int i = 0; i < n; ++i) {
            this.lx(tLongArrayList.get(i));
        }
        this.dYB();
    }

    public TLongArrayList dYA() {
        return this.kgZ;
    }

    private String a(String string, CharSequence charSequence) {
        return string.replace("[default]", charSequence);
    }

    private ads a(adr adr2) {
        ArrayList<ads> arrayList = adr2.cjB;
        if (arrayList == null) {
            return null;
        }
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        int n = arrayList.size();
        for (int i = 0; i < n; ++i) {
            ads ads2 = arrayList.get(i);
            if (ads2.bfe != null && !ads2.bfe.b(bgt_02, null, null, bgt_02.bdV())) continue;
            return ads2;
        }
        return null;
    }

    private void dYB() {
        try {
            this.dYD();
            int n = this.kgZ.size();
            for (int i = 0; i < n; ++i) {
                this.ly(this.kgZ.get(i));
            }
            this.dYE();
        }
        catch (Exception exception) {
            kgM.error((Object)"Exception levee", (Throwable)exception);
        }
    }

    public void dYC() {
        this.dYK();
        this.kgW.clear();
        this.kgX.clear();
        this.kgZ.clear();
    }

    private void dYD() {
        TIntObjectIterator tIntObjectIterator = this.kgX.buB().iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            this.b((adr)tIntObjectIterator.value());
        }
    }

    private void b(adr adr2) {
        ads ads2 = this.a(adr2);
        if (ads2 == null) {
            return;
        }
        int n = bid_2.c(adr2);
        if (n > 0) {
            return;
        }
        fsn_1 fsn_12 = adr2.cjy == bRs.lap.aJr() ? this.a(adr2, ads2) : (adr2.cjy == bRs.laq.aJr() ? this.b(adr2, ads2) : (adr2.cjy == bRs.lar.aJr() ? this.d(adr2, ads2) : (adr2.cjy == bRs.las.aJr() ? this.c(adr2, ads2) : null)));
        if (fsn_12 == null) {
            return;
        }
        if (n == 0) {
            fsn_12.c(bit_2.kgx);
        }
    }

    private long aqZ() {
        if (this.kgZ.isEmpty()) {
            return -1L;
        }
        return this.kgZ.get(0);
    }

    private fsn_1 a(adr adr2, ads ads2) {
        fso_1 fso_12;
        fso_1 fso_13 = bit_2.kgh.GZ(ads2.cjC);
        ArrayList<fsn_1> arrayList = this.j(adr2.asf, true);
        fso_1 fso_14 = fso_12 = ads2.cjC == 46 ? fso_13 : null;
        if (fso_13 == null) {
            return null;
        }
        fsn_1 fsn_12 = new fsn_1(adr2.bap, adr2.baq, adr2.ban, this.aqZ(), aum_0.cWf().a(35, (long)ads2.o, new Object[0]), adr2, fso_13, fso_12, kgN, false, false);
        arrayList.add(fsn_12);
        return fsn_12;
    }

    private fsn_1 b(adr adr2, ads ads2) {
        adq adq2 = this.kgX.if(adr2.cjz);
        if (adq2 == null) {
            return null;
        }
        bCA bCA2 = (bCA)bcw_0.dQn().a(adq2.aXv, adq2.aXy, adq2.ayE);
        if (bCA2 == null) {
            return null;
        }
        fso_1 fso_12 = bit_2.kgh.GZ(ads2.cjC == -1 ? adq2.cjs : ads2.cjC);
        if (fso_12 == null) {
            return null;
        }
        ArrayList<fsn_1> arrayList = this.j(bcy_0.bT(adq2.aXy).dQo().aFW(), true);
        String string = this.a(aum_0.cWf().a(35, (long)ads2.o, new Object[0]), bCA2.getName());
        fsn_1 fsn_12 = new fsn_1(adr2.bap, adr2.baq, adr2.ban, this.aqZ(), string, adq2, fso_12, kgN);
        arrayList.add(fsn_12);
        bCA2.aZp();
        return fsn_12;
    }

    private fsn_1 c(adr adr2, ads ads2) {
        bJr bJr2 = (bJr)bjx_0.klY.Ym(adr2.cjz);
        if (bJr2 == null) {
            bJr2 = bjx_0.klY.HC(adr2.cjz);
        }
        if (bJr2 == null) {
            return null;
        }
        ahv_2 ahv_22 = new ahv_2();
        bJu.a(ahv_22, bJr2);
        String string = this.a(aum_0.cWf().a(35, (long)ads2.o, new Object[0]), ahv_22.ceL());
        fso_1 fso_12 = bit_2.kgh.GZ(ads2.cjC == -1 ? bRr.laj.aFW() : ads2.cjC);
        if (fso_12 == null) {
            return null;
        }
        ArrayList<fsn_1> arrayList = this.j(bRr.laj.aFW(), true);
        fsn_1 fsn_12 = new fsn_1(adr2.bap, adr2.baq, adr2.ban, this.aqZ(), string, adr2, fso_12, kgN);
        arrayList.add(fsn_12);
        return fsn_12;
    }

    @Nullable
    private fsn_1 d(adr adr2, ads ads2) {
        String string;
        eIb eIb2 = eId.quO.PN(adr2.cjz);
        if (eIb2 == null) {
            return null;
        }
        int n = fig_0.ssF.VZ(eIb2.d());
        if (fig_0.ssF.Qh(n)) {
            return null;
        }
        ahv_2 ahv_22 = new ahv_2();
        ahv_22.c(aum_0.cWf().a(137, (long)eIb2.d(), new Object[0]));
        ahv_22.ceH().c(aum_0.cWf().c("required.level.custom", eIb2.aVf()));
        if (n != -1 && !(string = boe.a(aue_0.cVJ().cVK(), n)).isEmpty()) {
            ahv_22.ceH().c(string);
        }
        string = this.a(aum_0.cWf().a(35, (long)ads2.o, new Object[0]), ahv_22.ceL());
        fso_1 fso_12 = bit_2.kgh.GZ(ads2.cjC == -1 ? bRr.lak.aFW() : ads2.cjC);
        if (fso_12 == null) {
            return null;
        }
        ArrayList<fsn_1> arrayList = this.j(bRr.lak.aFW(), true);
        fsn_1 fsn_12 = new fsn_1(adr2.bap, adr2.baq, adr2.ban, this.aqZ(), string, adr2, fso_12, kgN);
        fsn_12.pt(aie_0.cfo().cVK().dnG() < eIb2.aVf());
        arrayList.add(fsn_12);
        return fsn_12;
    }

    private static int c(adr adr2) {
        if (adr2.cjw > 1) {
            return 1;
        }
        if (adr2.cjw == 1 && adr2.cjx > 91) {
            return 1;
        }
        if (adr2.cjw == 1 && adr2.cjx == 91) {
            return 0;
        }
        return -1;
    }

    private void L(ArrayList<adq> arrayList) {
        bcw_0 bcw_02 = bcw_0.dQn();
        int n = arrayList.size();
        for (int i = 0; i < n; ++i) {
            fso_1 fso_12;
            adq adq2 = arrayList.get(i);
            bCA bCA2 = (bCA)bcw_02.a(adq2.aXv, adq2.aXy, adq2.ayE);
            if (bCA2 == null || (fso_12 = bit_2.kgh.GZ(adq2.cjs)) == null) continue;
            ArrayList<fsn_1> arrayList2 = this.j(bcy_0.bT(adq2.aXy).dQo().aFW(), true);
            arrayList2.add(new fsn_1(bCA2.bcC(), bCA2.bcD(), bCA2.bcE(), this.aqZ(), bCA2.getName(), adq2, fso_12, kgN));
            bCA2.aZp();
        }
    }

    private void ly(long l) {
        TIntObjectIterator tIntObjectIterator = bRq.ekK().me(l).iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            this.b((bRp)tIntObjectIterator.value(), false);
        }
    }

    public void a(bRr bRr2) {
        bRo bRo2 = this.kgQ.cK(bRr2.aFW());
        if (bRo2 == null) {
            return;
        }
        ArrayList<fsn_1> arrayList = this.j(bRo2.aJr(), false);
        if (arrayList == null) {
            return;
        }
        for (fsn_1 fsn_12 : this.kgY.aa(arrayList)) {
            this.kgY.a(fsn_12);
            if (bRo2.f(fsn_12)) {
                this.e(fsn_12);
                continue;
            }
            this.d(fsn_12);
        }
    }

    public void dYE() {
        for (bRr bRr2 : bRr.values()) {
            this.a(bRr2);
        }
    }

    private void d(fsn_1 fsn_12) {
        if (this.kgV.remove((long)fsn_12.getValue().hashCode()) != null && this.kfX != null) {
            this.kfX.d(fsn_12);
        }
    }

    private void e(fsn_1 fsn_12) {
        if (this.kgV.put((long)fsn_12.getValue().hashCode(), (Object)fsn_12) == null && this.kfX != null) {
            this.kfX.e(fsn_12);
        }
    }

    private boolean dYF() {
        return !this.kgW.isEmpty();
    }

    private ArrayList<fsn_1> j(byte by, boolean bl) {
        ArrayList arrayList = (ArrayList)this.kgW.get(by);
        if (bl && arrayList == null) {
            arrayList = new ArrayList();
            this.kgW.put(by, arrayList);
        }
        return arrayList;
    }

    public void dYG() {
        try {
            this.kgQ.dYG();
            this.dYE();
        }
        catch (Exception exception) {
            kgM.error((Object)"Exception levee", (Throwable)exception);
        }
    }

    public void dYH() {
        this.kgQ.dYH();
        this.dYE();
    }

    public void dYI() {
        this.kgQ.ekG();
        this.dYE();
    }

    public void a(bRn bRn2) {
        this.kgQ = bRn2;
        this.dYE();
    }

    public bRn dYJ() {
        return this.kgQ;
    }

    public void hP(boolean bl) {
        this.kgQ.ekI().forEach(bRo2 -> this.a(bRo2.aJr(), bl, true));
    }

    public void k(byte by, boolean bl) {
        this.a(by, bl, true);
    }

    public void a(byte by, boolean bl, boolean bl2) {
        this.kgQ.b(by, bl, bl2);
        this.dYE();
    }

    public void b(bRr bRr2) {
        Object object;
        ArrayList<fsn_1> arrayList = this.j(bRr2.aFW(), false);
        if (arrayList == null) {
            return;
        }
        int n = arrayList.size();
        for (int i = 0; i < n; ++i) {
            object = arrayList.remove(0);
            this.d((fsn_1)object);
        }
        TIntObjectHashMap<adr> tIntObjectHashMap = this.kgX.buB();
        TIntObjectIterator tIntObjectIterator = tIntObjectHashMap.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            object = (adr)tIntObjectIterator.value();
            if (((adr)object).asf != bRr2.aFW()) continue;
            this.b((adr)object);
        }
        this.a(bRr2);
    }

    public void a(bRp bRp2, boolean bl) {
        if (bRp2 == null) {
            return;
        }
        ArrayList<fsn_1> arrayList = this.j(bRr.lac.aFW(), false);
        if (arrayList == null) {
            return;
        }
        int n = arrayList.size();
        for (int i = 0; i < n; ++i) {
            fsn_1 fsn_12 = arrayList.get(i);
            if (fsn_12.getValue() != bRp2) continue;
            arrayList.remove(i);
            this.d(fsn_12);
            break;
        }
        if (bl) {
            this.dYE();
        }
    }

    public void a(bRp bRp2) {
        this.b(bRp2, true);
        if (!this.kgQ.cK(bRr.lac.aFW()).f(null)) {
            this.a(bRr.lac.aFW(), true, false);
        }
    }

    private void b(bRp bRp2, boolean bl) {
        if (bRp2 == null) {
            return;
        }
        fso_1 fso_12 = bit_2.kgh.GZ(bRp2.aVt());
        if (fso_12 == null) {
            return;
        }
        ArrayList<fsn_1> arrayList = this.j(bRr.lac.aFW(), true);
        arrayList.add(new fsn_1(bRp2.getX(), bRp2.getY(), bRp2.NN(), this.aqZ(), bRp2.hF(), bRp2, fso_12, bit_2.kgn, kgN, true, true));
        if (bl) {
            this.dYE();
        }
    }

    public bRp aa(int n, int n2, int n3) {
        return this.b(n, n2, 0, n3, aum_0.cWf().c("desc.landMark.personalNote", new Object[0]));
    }

    public bRp b(int n, int n2, int n3, int n4, String string) {
        return this.a(n, n2, n3, n4, string, false);
    }

    public bRp a(int n, int n2, int n3, int n4, String string, boolean bl) {
        bRp bRp2 = bRq.ekK().a(n, n2, n3, string, n4, bl);
        this.a(bRp2);
        return bRp2;
    }

    public bRp B(int n, int n2, int n3, int n4) {
        return this.b(n, n2, n3, n4, aum_0.cWf().c("desc.landMark.personalNote", new Object[0]));
    }

    public void b(bRp bRp2) {
        if (!bRq.ekK().d(bRp2)) {
            return;
        }
        this.a(bRp2, true);
    }

    public void c(bRp bRp2) {
        ArrayList<fsn_1> arrayList = this.j(bRr.lac.aFW(), false);
        if (arrayList == null) {
            return;
        }
        for (int i = arrayList.size() - 1; i >= 0; --i) {
            fsn_1 fsn_12 = arrayList.get(i);
            if (bRp2 != fsn_12.getValue()) continue;
            fsn_12.setName(bRp2.hF());
        }
    }

    public void a(long l, int n, float f2, float f3, float f4, String string, Object object, fso_1 fso_12, String string2, float[] fArray, long l2) {
        fsn_1 fsn_12;
        if (fso_12 == null) {
            return;
        }
        TLongObjectHashMap tLongObjectHashMap = this.kgR.vK(n);
        if (tLongObjectHashMap == null) {
            tLongObjectHashMap = new TLongObjectHashMap();
            this.kgR.b(n, (TLongObjectHashMap<fsn_1>)tLongObjectHashMap);
        }
        if ((fsn_12 = (fsn_1)tLongObjectHashMap.get(l)) != null) {
            fsn_12.O(f2, f3, f4);
            fsn_12.a(fso_12);
            fsn_12.q(fArray);
            fsn_12.setParticlePath(string2);
        } else {
            tLongObjectHashMap.put(l, (Object)new fsn_1(f2, f3, f4, l2, string, object, fso_12, string2, fArray));
        }
        this.dYL();
    }

    public void a(long l, int n, float f2, float f3, float f4, long l2, String string, Object object, fso_1 fso_12, float[] fArray) {
        fsn_1 fsn_12;
        if (fso_12 == null) {
            return;
        }
        TLongObjectHashMap tLongObjectHashMap = this.kgT.vK(n);
        if (tLongObjectHashMap == null) {
            tLongObjectHashMap = new TLongObjectHashMap();
            this.kgT.b(n, (TLongObjectHashMap<fsn_1>)tLongObjectHashMap);
        }
        if ((fsn_12 = (fsn_1)tLongObjectHashMap.get(l)) != null) {
            fsn_12.O(f2, f3, f4);
            fsn_12.a(fso_12);
            fsn_12.q(fArray);
        } else {
            tLongObjectHashMap.put(l, (Object)new fsn_1(f2, f3, f4, l2, string, object, fso_12, fArray));
        }
        this.dYM();
    }

    public void a(float f2, float f3, float f4, long l, String string, Object object, fso_1 fso_12, float[] fArray) {
        TLongObjectHashMap<fsn_1> tLongObjectHashMap = this.kgT.vK(5);
        if (tLongObjectHashMap != null) {
            tLongObjectHashMap.clear();
        }
        this.a(0L, 5, f2, f3, f4, l, string, object, fso_12, fArray);
    }

    protected fsn_1 dYj() {
        TLongObjectHashMap<fsn_1> tLongObjectHashMap = this.kgT.vK(5);
        if (tLongObjectHashMap == null) {
            return null;
        }
        return (fsn_1)tLongObjectHashMap.get(0L);
    }

    void a(long l, int n, float f2, float f3, float f4, long l2) {
        if (this.a(l, n, f2, f3, f4, l2, this.kgR)) {
            this.dYL();
        }
        if (this.a(l, n, f2, f3, f4, l2, this.kgT)) {
            this.dYM();
        }
    }

    private boolean a(long l, int n, float f2, float f3, float f4, long l2, aah_1<TLongObjectHashMap<fsn_1>> aah_12) {
        TLongObjectHashMap<fsn_1> tLongObjectHashMap = aah_12.vK(n);
        if (tLongObjectHashMap == null) {
            return false;
        }
        fsn_1 fsn_12 = (fsn_1)tLongObjectHashMap.get(l);
        if (fsn_12 != null) {
            fsn_12.O(f2, f3, f4);
            fsn_12.fK(l2);
            return true;
        }
        return false;
    }

    public void k(int n, long l) {
        TLongObjectHashMap<fsn_1> tLongObjectHashMap = this.kgR.vK(n);
        if (tLongObjectHashMap == null) {
            return;
        }
        if (tLongObjectHashMap.remove(l) != null) {
            this.dYL();
        }
    }

    public void w(int n, long l) {
        TLongObjectHashMap<fsn_1> tLongObjectHashMap = this.kgT.vK(n);
        if (tLongObjectHashMap == null) {
            return;
        }
        if (tLongObjectHashMap.remove(l) != null) {
            this.dYM();
        }
    }

    public void dYk() {
        TLongObjectHashMap<fsn_1> tLongObjectHashMap = this.kgT.vK(5);
        if (tLongObjectHashMap == null) {
            return;
        }
        if (tLongObjectHashMap.remove(0L) != null) {
            this.dYM();
        }
    }

    public void lz(long l) {
        fsn_1 fsn_12 = (fsn_1)this.kgV.remove(l);
        this.d(fsn_12);
    }

    public void dYK() {
        if (this.kfX != null) {
            this.kfX.gto();
        }
        this.kgV.clear();
    }

    private void dYL() {
        this.kgS.clear();
        int n = this.kgR.bTR();
        for (int i = 0; i < n; ++i) {
            TLongObjectHashMap<fsn_1> tLongObjectHashMap = this.kgR.vU(i);
            TLongObjectIterator tLongObjectIterator = tLongObjectHashMap.iterator();
            while (tLongObjectIterator.hasNext()) {
                tLongObjectIterator.advance();
                this.kgS.add((fsn_1)tLongObjectIterator.value());
            }
        }
        fse_1.gFu().a((aef_2)this, kgO);
    }

    private void dYM() {
        this.kgU.clear();
        int n = this.kgT.bTR();
        for (int i = 0; i < n; ++i) {
            TLongObjectHashMap<fsn_1> tLongObjectHashMap = this.kgT.vU(i);
            TLongObjectIterator tLongObjectIterator = tLongObjectHashMap.iterator();
            while (tLongObjectIterator.hasNext()) {
                tLongObjectIterator.advance();
                this.kgU.add((fsn_1)tLongObjectIterator.value());
            }
        }
        fse_1.gFu().a((aef_2)this, kgP);
    }

    public void Hb(int n) {
        if (this.kgR.wp(n) != null) {
            this.dYL();
        }
    }

    public void removeAll() {
        int n;
        if (this.kgR != null) {
            n = this.kgR.bTR();
            this.kgR.clear();
            this.kgS.clear();
            kgM.info((Object)("Nettoyage des points contenus dans la map (" + this.kgR.bTR() + " restants sur " + n + ")"));
        }
        if (this.kgT != null) {
            n = this.kgT.bTR();
            this.kgT.clear();
            this.kgU.clear();
            kgM.info((Object)("Nettoyage des points contenus dans la map (" + this.kgT.bTR() + " restants sur " + n + ")"));
        }
        kgM.info((Object)"Nettoyage de la boussole contenue dans la map");
        if (this.kgV != null) {
            n = this.kgV.size();
            this.kgV.clear();
            if (this.kfX != null) {
                this.kfX.gto();
            }
            kgM.info((Object)("Nettoyage des rep\u00e8res contenus dans la map (" + this.kgV.size() + " restants sur " + n + ")"));
        }
    }
}

