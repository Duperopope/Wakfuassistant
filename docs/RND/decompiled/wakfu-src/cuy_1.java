/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from cUY
 */
public class cuy_1
implements adi_1 {
    private static final Logger nOp = Logger.getLogger(cuy_1.class);
    private static final cuy_1 nOq = new cuy_1();
    private alx_2 ikv;
    private final HashSet<Integer> nOr = new HashSet();
    private final fez_1 nOs = new fez_1();
    @Nullable
    private Integer nOt;

    public static cuy_1 eTo() {
        return nOq;
    }

    public cuy_1() {
        this.nOs.z(string -> {
            List list = (List)fse_1.gFu().vY("guideCategories");
            boolean bl = !BH.aU(string);
            for (boq_2 boq_22 : list) {
                if (bl) {
                    boq_22.fm(false);
                }
                fse_1.gFu().a((aef_2)boq_22, "guides", "collapsed");
            }
        });
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 19049: {
                dae_0 dae_02 = (dae_0)aam_22;
                bor_2 bor_22 = (bor_2)dae_02.bCv();
                cuy_1.b(bor_22);
                this.c(bor_22);
                return false;
            }
        }
        return true;
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (bl) {
            return;
        }
        this.ikv = string -> {
            if (string.equals("guideListDialog")) {
                aue_0.cVJ().b(nOq);
            }
        };
        fyw_0.gqw().a(this.ikv);
        ccj_2.g("guideListDialog", 32768L);
        fyw_0.gqw().d("wakfu.guideList", ceq_2.class);
        fyw_0.gqw().d("wakfu.guidePopup", cer_1.class);
        fse_1.gFu().f("guideListFilter", this.nOs);
        cuy_1.eTp();
        if (this.nOt != null) {
            this.Nc(this.nOt);
            this.nOt = null;
        }
        cAY.eHc().nP(600012L);
    }

    private static void eTp() {
        Optional optional = bbs_2.a(eva_1.owD);
        if (optional.isEmpty()) {
            return;
        }
        ArrayList<boq_2> arrayList = cuy_1.a((frq_0)optional.get());
        arrayList.sort(Comparator.comparingInt(boq_2::wp));
        for (boq_2 boq_22 : arrayList) {
            boq_22.egP();
        }
        fse_1.gFu().f("guideCategories", arrayList);
        cuy_1.a(arrayList, (frq_0)optional.get());
    }

    private static ArrayList<boq_2> a(frq_0 frq_02) {
        HashMap<Integer, boq_2> hashMap = new HashMap<Integer, boq_2>();
        for (int n : frq_02.gkw()) {
            aef_2 aef_22;
            ang_2 ang_22;
            bom_2 bom_22;
            Optional<bom_2> optional = bop_2.egN().Iy(n);
            if (optional.isEmpty() || (bom_22 = optional.get()).egL().isEmpty() || (ang_22 = bom_22.egK()) != null && ((aef_22 = aue_0.cVJ().cVK()) == null || !ang_22.b(aef_22, aef_22, null, ((exP)((Object)aef_22)).bdV()))) continue;
            aef_22 = new bor_2(bom_22);
            ((bor_2)aef_22).ik(frq_02.gkx().contains(n));
            boq_2 boq_22 = hashMap.getOrDefault(bom_22.cjd(), cuy_1.Nb(bom_22.cjd()));
            if (boq_22 == null) {
                nOp.warn((Object)("[GUIDE] No category found for id=" + bom_22.cjd()));
                continue;
            }
            boq_22.a((bor_2)aef_22);
            hashMap.putIfAbsent(bom_22.cjd(), boq_22);
        }
        return new ArrayList<boq_2>(hashMap.values());
    }

    private static void a(ArrayList<boq_2> arrayList, frq_0 frq_02) {
        if (arrayList.isEmpty()) {
            return;
        }
        boolean bl = cuy_1.b(arrayList, frq_02);
        if (bl) {
            return;
        }
        cuy_1.W(arrayList);
    }

    private static boolean b(ArrayList<boq_2> arrayList, frq_0 frq_02) {
        int n = ((bsg_1)aie_0.cfn().bmH()).d(bsn_1.lky);
        if (n <= 0) {
            return false;
        }
        if (!frq_02.gkw().contains(n)) {
            return false;
        }
        for (boq_2 boq_22 : arrayList) {
            Optional<bor_2> optional = boq_22.egQ().stream().filter(bor_22 -> bor_22.d() == n).findFirst();
            if (!optional.isPresent()) continue;
            boq_22.fm(false);
            cuy_1.b(optional.get());
            return true;
        }
        return false;
    }

    private static void W(ArrayList<boq_2> arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        boq_2 boq_22 = arrayList.get(0);
        if (boq_22.egQ().isEmpty()) {
            return;
        }
        boq_22.fm(false);
        cuy_1.b(boq_22.egQ().get(0));
    }

    private static void b(bor_2 bor_22) {
        bor_2 bor_23 = (bor_2)fse_1.gFu().aW("guideViewPopup", "guideListDialog");
        if (bor_23 != null) {
            bor_23.setSelected(false);
        }
        bor_22.setSelected(true);
        fse_1.gFu().b("guideViewPopup", bor_22, "guideListDialog");
        ((bsg_1)aie_0.cfn().bmH()).a((afe)bsn_1.lky, bor_22.d());
    }

    private static boq_2 Nb(int n) {
        Optional<bon_2> optional = bop_2.egN().Ix(n);
        return optional.map(boq_2::new).orElse(null);
    }

    private void c(bor_2 bor_22) {
        if (!bor_22.egS()) {
            return;
        }
        this.nOr.add(bor_22.d());
        bor_22.ik(false);
        int n = bor_22.cjd();
        List list = (List)fse_1.gFu().vY("guideCategories");
        if (list == null) {
            return;
        }
        for (boq_2 boq_22 : list) {
            if (boq_22.d() != n) continue;
            fse_1.gFu().a((aef_2)boq_22, "unread");
            break;
        }
    }

    private void Nc(int n) {
        List list = (List)fse_1.gFu().vY("guideCategories");
        for (boq_2 boq_22 : list) {
            for (bor_2 bor_22 : boq_22.egQ()) {
                if (bor_22.d() != n) continue;
                cuy_1.b(bor_22);
                this.c(bor_22);
                return;
            }
        }
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (bl) {
            return;
        }
        if (!this.nOr.isEmpty()) {
            bol_2.f(this.nOr);
            this.nOr.clear();
        }
        cAY.eHc().nP(600013L);
        fyw_0.gqw().b(this.ikv);
        fyw_0.gqw().tl("guideListDialog");
        fse_1.gFu().f("guideCategories", (Object)null);
        fse_1.gFu().f("guideListFilter", (Object)null);
        fyw_0.gqw().tc("wakfu.guideList");
        if (!fyw_0.gqw().to("guidePopupDialog")) {
            fyw_0.gqw().tc("wakfu.guidePopup");
        }
    }

    public void Nd(int n) {
        this.nOt = n;
        aue_0.cVJ().a(this);
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }
}

