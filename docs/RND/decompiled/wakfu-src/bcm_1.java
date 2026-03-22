/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.list.array.TIntArrayList;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bcM
 */
public class bcm_1 {
    private static final Logger hIJ = Logger.getLogger(bcm_1.class);
    public static final bcm_1 hIK = new bcm_1();
    private final aaq_1<bcl_2> hIL = new aaq_1();
    private final aaq_1<bcq_1> hIM = new aaq_1();
    private final aaq_1<TIntObjectHashMap<bcc_2>> hIN = new aaq_1();
    private final aaq_1<TIntObjectHashMap<bci_1>> hIO = new aaq_1();
    private final aaq_1<TIntObjectHashMap<bcy_1>> hIP = new aaq_1();
    private final HashMap<Integer, Integer> hIQ = new HashMap();
    private boolean hIR = true;
    private int hIS;
    private static final byte hIT = 18;
    private static final String hIU = "fontDefault12BoldBordered";
    private static final String hIV = "fontTitle15Bordered";
    private static final int hIW = 270;
    private static final int hIX = 263;
    private static final int hIY = 19;
    private static final int hIZ = 8;
    private static final int hJa = 10;
    private static final int hJb = 10;
    private static final int hJc = 8;
    public static final int hJd = 55;
    public static final int hJe = 28;
    public static final int hJf = 400;

    private bcm_1() {
    }

    public void b(long l, bcd_2 bcd_22) {
        this.hIL.a(l, new bcl_2(l, bcd_22));
        this.hIM.a(l, new bcq_1(l, bcd_22));
    }

    private bcc_2 a(long l, bcj_1 bcj_12) {
        TIntObjectHashMap tIntObjectHashMap = this.hIN.hd(l);
        if (tIntObjectHashMap == null) {
            tIntObjectHashMap = new TIntObjectHashMap();
            this.hIN.a(l, (TIntObjectHashMap<bcc_2>)tIntObjectHashMap);
        }
        bcc_2 bcc_22 = new bcc_2(l, bcj_12);
        tIntObjectHashMap.put(bcj_12.d(), (Object)bcc_22);
        return bcc_22;
    }

    public bcc_2 s(long l, int n) {
        TIntObjectHashMap<bcc_2> tIntObjectHashMap = this.hIN.hd(l);
        if (tIntObjectHashMap == null) {
            return null;
        }
        return (bcc_2)tIntObjectHashMap.get(n);
    }

    private bci_1 a(long l, int n, int n2, int n3, int n4, String string) {
        TIntObjectHashMap tIntObjectHashMap = this.hIO.hd(l);
        if (tIntObjectHashMap == null) {
            tIntObjectHashMap = new TIntObjectHashMap();
            this.hIO.a(l, (TIntObjectHashMap<bci_1>)tIntObjectHashMap);
        }
        bci_1 bci_12 = new bci_1(l, n, n2, n3, string, n4);
        tIntObjectHashMap.put(n, (Object)bci_12);
        bbu_2 bbu_22 = bbw_2.hCq.je(l).AZ(n);
        ArrayList<bcj_1> arrayList = bbu_22.dau();
        int n5 = arrayList.size();
        for (int i = 0; i < n5; ++i) {
            this.a(l, arrayList.get(i));
        }
        return bci_12;
    }

    public bci_1 t(long l, int n) {
        TIntObjectHashMap<bci_1> tIntObjectHashMap = this.hIO.hd(l);
        if (tIntObjectHashMap == null) {
            return null;
        }
        bci_1 bci_12 = (bci_1)tIntObjectHashMap.get(n);
        if (bci_12 == null) {
            hIJ.warn((Object)("On essaye de r\u00e9cup\u00e9rer un achievement qui n'existe pas : id=" + n), (Throwable)new Exception(""));
        }
        return bci_12;
    }

    bck_2 jj(long l) {
        TIntObjectHashMap tIntObjectHashMap = this.hIP.hd(l);
        if (tIntObjectHashMap == null) {
            tIntObjectHashMap = new TIntObjectHashMap();
            this.hIP.a(l, (TIntObjectHashMap<bcy_1>)tIntObjectHashMap);
        }
        bck_2 bck_22 = new bck_2(l);
        tIntObjectHashMap.put(bck_22.d(), (Object)bck_22);
        return bck_22;
    }

    bch_2 a(long l, bcc_1 bcc_12, bch_2 bch_22) {
        Object object;
        Object object2;
        Object object3;
        int n = bch_22 == null ? bcc_12.d() : bch_22.dce();
        TIntObjectHashMap tIntObjectHashMap = this.hIP.hd(l);
        if (tIntObjectHashMap == null) {
            tIntObjectHashMap = new TIntObjectHashMap();
            this.hIP.a(l, (TIntObjectHashMap<bcy_1>)tIntObjectHashMap);
        }
        bch_2 bch_23 = new bch_2(l, bcc_12, n);
        tIntObjectHashMap.put(bcc_12.d(), (Object)bch_23);
        ArrayList<bbu_2> arrayList = bcc_12.aYz();
        if (arrayList != null) {
            object3 = arrayList.iterator();
            while (object3.hasNext()) {
                object2 = (bbu_2)object3.next();
                object = this.a(l, ((bbu_2)object2).d(), bch_23.dce(), bch_23.d(), ((bbu_2)object2).aVt(), bch_23.getName());
                bch_23.a((bci_1)object);
                if (bch_22 == null) continue;
                bch_22.a((bci_1)object);
            }
        }
        if ((object3 = bcc_12.getChildren()) != null) {
            object2 = ((ArrayList)object3).iterator();
            while (object2.hasNext()) {
                object = (bcc_1)object2.next();
                bch_2 bch_24 = this.a(l, (bcc_1)object, bch_23);
                bch_23.a(bch_24);
            }
        }
        return bch_23;
    }

    bch_2 b(long l, bcc_1 bcc_12, bch_2 bch_22) {
        Object object;
        Object object2;
        Object object3;
        int n = bch_22 == null ? bcc_12.d() : bch_22.dce();
        TIntObjectHashMap tIntObjectHashMap = this.hIP.hd(l);
        if (tIntObjectHashMap == null) {
            tIntObjectHashMap = new TIntObjectHashMap();
            this.hIP.a(l, (TIntObjectHashMap<bcy_1>)tIntObjectHashMap);
        }
        bch_2 bch_23 = new bch_2(l, bcc_12, n);
        tIntObjectHashMap.put(bcc_12.d(), (Object)bch_23);
        ArrayList<bbu_2> arrayList = bcc_12.aYz();
        if (arrayList != null) {
            object3 = arrayList.iterator();
            while (object3.hasNext()) {
                object2 = (bbu_2)object3.next();
                object = this.a(l, ((bbu_2)object2).d(), bch_23.dce(), bch_23.d(), ((bbu_2)object2).aVt(), bch_23.getName());
                bch_23.a((bci_1)object);
            }
        }
        if ((object3 = bcc_12.getChildren()) != null) {
            object2 = (bcy_1)tIntObjectHashMap.get(n);
            object = ((ArrayList)object3).iterator();
            while (object.hasNext()) {
                bcc_1 bcc_13 = (bcc_1)object.next();
                bch_2 bch_24 = this.b(l, bcc_13, bch_23);
                ((bcy_1)object2).a(bch_24);
            }
        }
        return bch_23;
    }

    public bcy_1 u(long l, int n) {
        TIntObjectHashMap<bcy_1> tIntObjectHashMap = this.hIP.hd(l);
        if (tIntObjectHashMap == null) {
            return null;
        }
        bcy_1 bcy_12 = (bcy_1)tIntObjectHashMap.get(n);
        if (bcy_12 == null) {
            hIJ.warn((Object)("On essaye de r\u00e9cup\u00e9rer une categorie qui n'existe pas : id=" + n), (Throwable)new Exception());
        }
        return bcy_12;
    }

    public bcq_1 jk(long l) {
        return this.hIM.hd(l);
    }

    public bcl_2 jl(long l) {
        return this.hIL.hd(l);
    }

    public bcu_2 v(long l, int n) {
        return this.w(l, n) ? (bcu_2)this.hIM.hd(l) : (bcu_2)this.hIL.hd(l);
    }

    public boolean w(long l, int n) {
        TIntObjectHashMap<bci_1> tIntObjectHashMap = this.hIO.hd(l);
        if (tIntObjectHashMap == null) {
            return false;
        }
        bci_1 bci_12 = (bci_1)tIntObjectHashMap.get(n);
        if (bci_12 == null) {
            return false;
        }
        bcq_1 bcq_12 = this.hIM.hd(l);
        return bcq_12 != null && bcq_12.Bk(bci_12.dce()) != null;
    }

    public void n(long l, long l2) {
        bcj_1 bcj_12 = bcb_1.hDb.AN(this.hIS);
        if (bcj_12 == null) {
            return;
        }
        if (bcj_12.jf(l2)) {
            this.a(l, this.hIS, l2);
        }
    }

    public void a(long l, int n, long l2) {
        if (this.Bp(n)) {
            return;
        }
        int n2 = this.hIS;
        this.hIS = n;
        bcj_1 bcj_12 = bcb_1.hDb.AN(this.hIS);
        if (bcj_12 == null || !bcj_12.daW()) {
            if (bif_2.Hc(7)) {
                bif_2.dYO().dYQ();
            }
            this.hIS = -1;
            this.x(l, n2);
            return;
        }
        akr_0 akr_02 = bcj_12.jg(l2);
        if (akr_02 == null) {
            hIJ.error((Object)("Compass update requested but no valid instance, objectiveId : " + n + ", instanceId : " + l2));
            return;
        }
        bif_2.dYO().a(7, (float)akr_02.cjB(), (float)akr_02.cjC(), (float)akr_02.cjD(), akr_02.cjE(), (Object)bcj_12, aum_0.cWf().a(64, (long)n, new Object[0]), true);
        this.x(l, n2);
        this.x(l, this.hIS);
    }

    private void x(long l, int n) {
        TIntObjectHashMap<bcc_2> tIntObjectHashMap = this.hIN.hd(l);
        if (tIntObjectHashMap == null) {
            return;
        }
        bcc_2 bcc_22 = (bcc_2)tIntObjectHashMap.get(n);
        if (bcc_22 != null) {
            fse_1.gFu().a((aef_2)bcc_22, "isCompassed");
        }
    }

    public boolean Bp(int n) {
        return bif_2.Hc(7) && this.Bq(n);
    }

    public boolean Bq(int n) {
        return this.hIS == n;
    }

    @Nullable
    public bch_2 a(long l, @NotNull bci_1 bci_12) {
        LW<Object> lW = new LW<Object>(null);
        this.hIP.hd(l).forEachValue(bcy_12 -> {
            if (!(bcy_12 instanceof bch_2)) {
                return true;
            }
            bch_2 bch_22 = (bch_2)bcy_12;
            if (bch_22.d(bci_12)) {
                int n = bch_22.dbk();
                if (lW.aTx() == null || n < ((bch_2)lW.aTx()).dbk()) {
                    lW.v(bch_22);
                }
            }
            return true;
        });
        return lW.aTx();
    }

    public void bmX() {
        this.hIO.clear();
        this.hIP.clear();
        this.hIN.clear();
        this.hIS = -1;
        this.hIL.clear();
        this.hIM.clear();
    }

    public HashMap<Integer, Integer> dcu() {
        if (this.hIR || this.hIQ.isEmpty()) {
            this.dcw();
            this.hIR = false;
        }
        return this.hIQ;
    }

    public void dcv() {
        this.hIR = true;
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        long l = bgt_02.Sn();
        TIntArrayList tIntArrayList = bbw_2.hCq.je(l).aYv();
        for (int i = 0; i < tIntArrayList.size(); ++i) {
            fse_1.gFu().a((aef_2)this.t(l, tIntArrayList.get(i)), "heightDisplayed");
        }
    }

    private void dcw() {
        int n;
        int n2;
        this.hIQ.clear();
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        long l = bgt_02.Sn();
        TIntArrayList tIntArrayList = bbw_2.hCq.je(l).aYv();
        int n3 = 0;
        awx_1 awx_12 = fyw_0.gqw().gqB().uG(hIU);
        awx_1 awx_13 = fyw_0.gqw().gqB().uG(hIV);
        for (int i = 0; i < tIntArrayList.size(); ++i) {
            bbu_2 bbu_22;
            n2 = 0;
            n = 0;
            TIntObjectHashMap<bci_1> tIntObjectHashMap = this.hIO.hd(l);
            bci_1 bci_12 = (bci_1)tIntObjectHashMap.get(tIntArrayList.get(i));
            if (bci_12 == null || (bbu_22 = bci_12.daS()) == null) continue;
            ArrayList<bcj_1> arrayList = bbu_22.dau();
            if (arrayList != null) {
                String object = aum_0.cWf().a(62, (long)bbu_22.d(), new Object[0]);
                n3 += awx_13.i(object, 263);
                for (bcj_1 bcj_12 : arrayList) {
                    if (!bbv_2.a(bcj_12, bgt_02)) continue;
                    Object object2 = aum_0.cWf().a(64, (long)bcj_12.d(), new Object[0]);
                    if (!evm_2.c(aue_0.cVJ().cVO().cWq(), evm_2.osZ)) {
                        object2 = (String)object2 + " (" + bcj_12.d() + ")";
                    }
                    int n4 = awx_12.i((String)object2, 270);
                    n2 += n4;
                    if (n4 != 1 || !bcj_12.daW()) continue;
                    n += 8;
                }
            }
            this.hIQ.put(tIntArrayList.get(i), n += n2 * 18);
        }
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        n2 = this.hIQ.size();
        n = 8 * n2 + n3 * 19;
        int n5 = ((bsg_1)aie_0.cfn().bmH()).d(bsn_1.lkY);
        int n6 = (n5 - 10 * (n2 - 1) - 10 * n2 - n) / n2;
        int n7 = 0;
        for (Map.Entry entry : this.hIQ.entrySet()) {
            if (entry != null && (Integer)entry.getValue() > n6) {
                arrayList.add((Integer)entry.getKey());
                continue;
            }
            if (entry == null || (Integer)entry.getValue() >= n6) continue;
            n7 += n6 - (Integer)entry.getValue();
        }
        for (int i = 0; i < arrayList.size(); ++i) {
            int n8;
            int n9 = this.hIQ.get(arrayList.get(i)) - n6;
            if (n9 < n7 / (n8 = arrayList.size() - i)) {
                n7 -= n9;
                continue;
            }
            this.hIQ.replace((Integer)arrayList.get(i), n6 + n7 / n8);
            n7 -= n7 / n8;
        }
    }
}

