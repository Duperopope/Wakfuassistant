/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.log4j.Logger;

public class bQP
implements aeh_2,
faf_0 {
    private static final Logger kXq = Logger.getLogger(bQP.class);
    public static final String kXr = "categories";
    public static final String kXs = "selectedCategory";
    public static final String kXt = "sidoaText";
    public static final String kXu = "isDirty";
    public static final String kXv = "quotation";
    public static final String kXw = "totalPrice";
    public static final String kXx = "resources";
    public static final String kXy = "resourcesCost";
    public static final String kXz = "usedSidoas";
    public static final String[] kXA = new String[]{"categories", "selectedCategory", "sidoaText", "isDirty", "quotation", "totalPrice", "resources", "resourcesCost", "usedSidoas"};
    private final TIntObjectHashMap<bQK> kXB = new TIntObjectHashMap();
    final ArrayList<bQE> kXC = new ArrayList();
    private byte kXD;
    private boolean dGB;
    private final fsm_0 kXE;

    @Override
    public String[] bxk() {
        return kXA;
    }

    public bQP(fsm_0 fsm_02) {
        this.kXE = fsm_02;
        this.ekb();
        this.eka();
        this.kXD = (byte)bQV.kXM.d();
    }

    private bQK a(bQV bQV2) {
        byte by = (byte)bQV2.d();
        bQK bQK2 = (bQK)this.kXB.get((int)by);
        if (bQK2 == null) {
            bQK2 = new bQK(bQV2);
            this.kXB.put((int)by, (Object)bQK2);
        }
        return bQK2;
    }

    private void eka() {
        bQK bQK2 = this.a(bQV.kXL);
        fbw_0.rSQ.S(new bQQ(this, bQK2));
    }

    private void ekb() {
        bQK bQK2 = this.a(bQV.kXM);
        bQK bQK3 = this.a(bQV.kXN);
        bQK bQK4 = this.a(bQV.kXO);
        for (fby_0 fby_02 : fbw_0.rSQ.fSo()) {
            if (!fby_02.cow()) continue;
            switch (exb_0.b(fby_02)) {
                case 1: {
                    bQP.a(fby_02, bQV.kXM, bQK2);
                    break;
                }
                case 2: {
                    bQP.a(fby_02, bQV.kXN, bQK3);
                    break;
                }
                case 3: {
                    bQP.a(fby_02, bQV.kXO, bQK4);
                    break;
                }
            }
        }
    }

    static void a(fbz_0 fbz_02, bQV bQV2, bQK bQK2) {
        bRf bRf2 = bRb.kYS.b(fbz_02);
        int n = fbz_02.fSs();
        bQN bQN2 = bQK2.Ja(n);
        if (bQN2 == null) {
            bQN2 = new bQN(bQV2, n);
            bQK2.a(bQN2);
        }
        bQN2.a(bRf2);
    }

    @Override
    public Object eu(String string) {
        if (string.equals(kXr)) {
            ArrayList<bQK> arrayList = new ArrayList<bQK>();
            Object[] objectArray = this.kXB.values();
            for (int i = 0; i < objectArray.length; ++i) {
                arrayList.add((bQK)objectArray[i]);
            }
            arrayList.sort(new bQR(this));
            return arrayList;
        }
        if (string.equals(kXs)) {
            return this.kXB.get((int)this.kXD);
        }
        if (string.equals(kXt)) {
            return this.kXE.glv() + "/" + this.kXE.fRn();
        }
        if (string.equals(kXu)) {
            return this.dGB;
        }
        if (string.equals(kXv)) {
            return this.ekd();
        }
        if (string.equals(kXw)) {
            return aum_0.cWf().cQ(this.kXE.glq());
        }
        if (string.equals(kXz)) {
            return this.kXE.glt();
        }
        if (string.equals(kXx)) {
            return aum_0.cWf().cQ(this.kXE.eAn());
        }
        if (string.equals(kXy)) {
            return aum_0.cWf().cQ(this.kXE.glw());
        }
        return null;
    }

    public int ekc() {
        return this.kXC.size();
    }

    public ArrayList<bQE> ekd() {
        return new ArrayList<bQE>(this.kXC);
    }

    public boolean a(bQE bQE2) {
        if (this.kXC.size() >= 50) {
            return false;
        }
        if (bQE2.ejH() instanceof civ_1) {
            this.a((civ_1)bQE2.ejH());
        }
        this.kXC.add(bQE2);
        this.dGB = true;
        return true;
    }

    private void a(civ_1 civ_12) {
        Iterator<bQE> iterator = this.kXC.iterator();
        while (iterator.hasNext()) {
            bQE bQE2 = iterator.next();
            ciy_1 ciy_12 = bQE2.ejH();
            if (!(ciy_12 instanceof civ_1)) continue;
            fsG fsG2 = (fsG)((civ_1)ciy_12).eLi();
            fsG fsG3 = (fsG)civ_12.eLi();
            if (fsG2.glm() != fsG3.glm() || fsG2.gln() != fsG3.gln()) continue;
            iterator.remove();
        }
    }

    public void b(bQE bQE2) {
        this.kXC.remove(bQE2);
        this.dGB = !this.kXC.isEmpty();
        fse_1.gFu().a((aef_2)this, kXA);
    }

    public bQE b(ciy_1 ciy_12) {
        Object t = ciy_12.eLi();
        return this.a(t.Lx(), t.ekj());
    }

    public bQE a(long l, fsc_0 fsc_02) {
        int n = this.kXC.size();
        for (int i = 0; i < n; ++i) {
            bQE bQE2 = this.kXC.get(i);
            Object t = bQE2.ejH().eLi();
            if (t.Lx() != l || t.ekj() != fsc_02) continue;
            return bQE2;
        }
        return null;
    }

    public int cq(short s) {
        int n = 0;
        for (bQE bQE2 : this.kXC) {
            bRf bRf2 = bQE2.ejG();
            if (!(bRf2 instanceof bRd) || ((bRd)bRf2).ekA().aIi() != s) continue;
            ++n;
        }
        return n;
    }

    public fsc_0 eke() {
        for (bQV bQV2 : bQV.values()) {
            if (bQV2.d() != this.kXD) continue;
            return bQV2.ekj();
        }
        return null;
    }

    public byte ekf() {
        return this.kXD;
    }

    public void cI(byte by) {
        this.kXD = by;
        fse_1.gFu().a((aef_2)this, kXs);
    }

    public void ekg() {
        fse_1.gFu().a((aef_2)this, kXA);
    }

    public fsm_0 ekh() {
        return this.kXE;
    }

    public boolean isDirty() {
        return this.dGB;
    }

    public void clear() {
        this.eki();
        this.kXD = (byte)-1;
        this.kXB.clear();
    }

    public void eki() {
        this.kXC.clear();
        this.dGB = false;
        fse_1.gFu().a((aef_2)this, kXA);
    }

    public boolean b(bRf bRf2) {
        bQK bQK2 = (bQK)this.kXB.get(bRf2.ekB().d());
        if (bQK2 == null) {
            return true;
        }
        bQN bQN2 = (bQN)bQK2.kXf.get(((fbz_0)bRf2.ekD()).fSs());
        if (bQN2 == null) {
            return true;
        }
        ArrayList<aef_2> arrayList = bQN2.kXo;
        if (arrayList == null) {
            return true;
        }
        for (aef_2 aef_22 : arrayList) {
            if (!(bRf2 instanceof bRh) || !(aef_22 instanceof bRh)) continue;
            fcb_0 fcb_02 = (fcb_0)((bRh)aef_22).ekD();
            fcb_0 fcb_03 = (fcb_0)((bRh)bRf2).ekD();
            if (fcb_02.fRN() != fcb_03.fRN()) continue;
            return ((bRh)aef_22).ein();
        }
        return true;
    }

    public void a(fsm_0 fsm_02) {
        this.kXB.forEachValue((TObjectProcedure)new bQS(this, fsm_02));
    }

    boolean cr(short s) {
        fcb_0 fcb_02 = fbw_0.rSQ.eH(s);
        if (fcb_02 == null) {
            return false;
        }
        return exb_0.oTr.contains(fcb_02.fSs());
    }

    @Override
    public void Jb(int n) {
        fse_1.gFu().a((aef_2)this, kXx);
    }
}

