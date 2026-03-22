/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.StringUtils
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

/*
 * Renamed from cRT
 */
public abstract class crt_2 {
    protected final crv_2 nDX = new crv_2();
    protected cru_2 nDY;

    protected static void e(List<ZH> list, int n) {
        int n2 = list.size();
        for (int i = 0; i < n2; ++i) {
            if (!(list.get(i) instanceof bdj_2)) continue;
            bdj_2 bdj_22 = (bdj_2)list.get(i);
            bgy bgy2 = bdj_22.dcP();
            if (bgy2.a(exe_1.rEh)) {
                bgy2 = bgy2.djY();
            }
            if (bgy2 == null || bgy2.bqo() != n) continue;
            cya_1.eYj().cn(bgy2);
            break;
        }
    }

    protected void a(aam_0 aam_02, acd_1 acd_12, bsj_0 bsj_02) {
        Object object;
        Object object2;
        boolean bl = false;
        QR qR = bsj_02.bai();
        boolean bl2 = bsj_02.bag().R(acd_12.getX(), acd_12.getY());
        if (qR != null && (object2 = qR.bdh()) != null && !object2.isEmpty()) {
            object = aue_0.cVJ().cVK();
            Iterator<QQ> iterator = object2.iterator();
            while (iterator.hasNext()) {
                bbq bbq2;
                boolean bl3;
                boolean bl4;
                QQ qQ = iterator.next();
                if (!(qQ instanceof WO) || qQ.aeV() == etm_0.rnA.aHp() && object != qQ.bci() || qQ.a(etl_0.rnc) && ((bgy)object).bcP() != qQ.bcP() || qQ.a(etl_0.rng)) continue;
                boolean bl5 = bl4 = bl2 && qQ instanceof bay_0 && !((bay_0)qQ).cyi();
                if (qQ instanceof bbq && (bl3 = bsj_02.a(bbq2 = (bbq)qQ)) || !bl4 && (qQ.bcC() != acd_12.getX() || qQ.bcD() != acd_12.getY())) continue;
                this.nDX.a((WO)((Object)qQ));
                bl = true;
                break;
            }
        }
        if (bl) {
            object2 = agi.b(aam_02, acd_12.getX(), acd_12.getY(), acd_12.bdi());
            this.nDX.qu(GC.A(((acb_1)object2).aPY));
            this.nDX.qv(GC.A(((acb_1)object2).aPZ));
            object = new dci_0(this.nDX, 0);
            ((dci_0)object).at(this.nDX.bne(), null);
            cxq_1.eWO().a((dci_0)object);
            this.nDX.jX(StringUtils.isNotBlank((CharSequence)this.nDX.bne()));
        } else if (this.nDX.brO()) {
            cxq_1.eWO().a(this.nDX);
            this.nDX.jX(StringUtils.isNotBlank((CharSequence)this.nDX.bne()));
        }
    }

    protected acd_1 a(int n, int n2, boolean bl, boolean bl2, bsj_0 bsj_02) {
        ArrayList<acd_1> arrayList;
        if (this.nDY == null && bsj_02 != null) {
            this.nDY = new cru_2(bsj_02.d());
        }
        if ((arrayList = aeO.a(aie_0.cfn().bmC(), n, n2, bl, bl2, this.nDY)) == null || arrayList.isEmpty()) {
            return null;
        }
        Object object = arrayList.iterator();
        while (object.hasNext()) {
            acd_1 acd_12 = object.next();
            if (!agx_0.bze().d(acd_12)) continue;
            return acd_12;
        }
        if (bsj_02 != null && (object = bsj_02.bag()) != null) {
            for (acd_1 acd_13 : arrayList) {
                if (!((rh_0)object).j(acd_13.getX(), acd_13.getY(), acd_13.bdi())) continue;
                return acd_13;
            }
        }
        return arrayList.get(0);
    }

    protected static void r(bsj_0 bsj_02) {
        if (bsj_02 != null) {
            bgt_0 bgt_02 = aue_0.cVJ().cVK();
            if (bgt_02.a(ezj_0.ptz)) {
                return;
            }
            boolean bl = !crt_2.eNp();
            aJL.et(bl);
            ((bsg_1)aie_0.cfn().bmH()).a((afe)bsn_1.liN, bl);
        }
    }

    protected static void s(bsj_0 bsj_02) {
        if (bsj_02 != null) {
            bgt_0 bgt_02 = aue_0.cVJ().cVK();
            if (bgt_02.a(ezj_0.ptz)) {
                return;
            }
            boolean bl = !crt_2.eNo();
            aJL.es(bl);
            ((bsg_1)aie_0.cfn().bmH()).a((afe)bsn_1.liM, bl);
        }
    }

    public static void jW(boolean bl) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02 == null) {
            return;
        }
        int n = bgt_02.dmW();
        if (n <= 0) {
            return;
        }
        crt_2.d(bl, n);
    }

    private static void d(boolean bl, int n) {
        ArrayList arrayList = new ArrayList(500);
        adn_0.bvh().f(arrayList);
        ZM.bqw().f(arrayList);
        afh_0.bxU().f(arrayList);
        bLe.ecw().f(arrayList);
        bsU.dHk().Ft(n).dGs().forEach(bgy2 -> {
            if (bgy2.dkO() && !arrayList.contains(bgy2.ddI())) {
                arrayList.add(bgy2.ddI());
            }
        });
        int n2 = arrayList.size();
        for (int i = 0; i < n2; ++i) {
            ZC zC = (ZC)arrayList.get(i);
            if (zC.bqo() != n) continue;
            crt_2.e((ZC)arrayList.get(i), bl);
        }
    }

    private static void e(ZC zC, boolean bl) {
        if (zC instanceof bdj_2) {
            crt_2.n(((bdj_2)zC).dcP(), bl);
            return;
        }
        crt_2.f(zC, bl);
    }

    public static void n(bgy bgy2, boolean bl) {
        bdj_2 bdj_22 = bgy2.ddI();
        if (bgy2.cyi()) {
            if (bgy2.dkj()) {
                bdj_22.bR(bl ? 0.2f : 0.4f);
            }
        } else {
            crt_2.f(bdj_22, bl);
        }
    }

    private static void f(ZC zC, boolean bl) {
        if (bl) {
            zC.bR(0.5f);
        } else {
            zC.bR(zC.bqk());
            zC.bqj();
        }
    }

    public static void c(bsj_0 bsj_02, bgy bgy2) {
        if (bsj_02 == null || bgy2.bqo() != bsj_02.d()) {
            return;
        }
        crt_2.n(bgy2, crt_2.eNp());
    }

    public static void a(bsj_0 bsj_02, ZC zC) {
        if (bsj_02 == null || zC.bqo() != bsj_02.d()) {
            return;
        }
        crt_2.e(zC, crt_2.eNp());
    }

    public static boolean eNo() {
        return ((bsg_1)aie_0.cfn().bmH()).a(bsn_1.liM);
    }

    public static boolean eNp() {
        return ((bsg_1)aie_0.cfn().bmH()).a(bsn_1.liN);
    }

    public static boolean eNq() {
        return ((bsg_1)aie_0.cfn().bmH()).a(bsn_1.liX);
    }

    protected void eNr() {
        if (this.nDX.brO()) {
            dch_0 dch_02 = new dch_0(this.nDX);
            aaw_1.bUq().h(dch_02);
            this.nDX.jX(false);
        }
    }

    public static boolean a(int n, int n2, bsj_0 bsj_02) {
        cru_2 cru_22 = new cru_2(bsj_02.d());
        ArrayList<acd_1> arrayList = aeO.a(aie_0.cfn().bmC(), n, n2, !crt_2.eNp(), false, cru_22);
        if (arrayList == null || arrayList.isEmpty()) {
            return false;
        }
        rh_0 rh_02 = bsj_02.bag();
        acd_1 acd_12 = arrayList.get(0);
        int n3 = acd_12.getX();
        int n4 = acd_12.getY();
        if (n3 < rh_02.bgm()) {
            return false;
        }
        if (n3 > rh_02.bgo()) {
            return false;
        }
        if (n4 < rh_02.bgn()) {
            return false;
        }
        return n4 <= rh_02.bgp();
    }

    protected static void eNs() {
        bsg_1 bsg_12 = (bsg_1)aie_0.cfn().bmH();
        aKj aKj2 = aKj.aP((byte)bsg_12.d(bsn_1.ljc));
        if (aKj2 == null) {
            bsg_12.a((afe)bsn_1.ljc, aKj.edx.aJr());
            return;
        }
        aKj aKj3 = aKj2.ciB();
        bsg_12.a((afe)bsn_1.ljc, aKj3.aJr());
    }
}

