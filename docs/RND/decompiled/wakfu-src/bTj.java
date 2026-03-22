/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  gnu.trove.list.array.TIntArrayList
 *  org.apache.commons.lang3.ArrayUtils
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import com.google.common.collect.Lists;
import gnu.trove.list.array.TIntArrayList;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import org.apache.commons.lang3.ArrayUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class bTj
extends bSZ
implements fgK,
fpa {
    private static final bTj lnc = new bTj();
    private bJr lnd;
    public static bbr_2 lne;
    private ZC lnf;
    private bso_2 lng = null;
    private bJr lnh;
    private final ArrayList<bkq_0> lni = new ArrayList();

    public static bTj eno() {
        return lnc;
    }

    protected bTj() {
    }

    @Override
    public void a(bjw_0 bjw_02) {
        bjy_0 bjy_02 = bjy_0.HK(bjw_02.d());
        if (bjy_02 == bjy_0.kmN) {
            bTl.lnl.Ck(-1);
            bJr bJr2 = (bJr)bjw_02.doW();
            if (this.lnd != bJr2) {
                this.h(bJr2);
            }
        }
    }

    @Override
    public Object eu(String string) {
        if (string.equals("animation")) {
            if (this.lnd == null) {
                return null;
            }
            return this.a(this.ctn(), bkr_0.kny);
        }
        if (string.equals("animName")) {
            return bkr_0.kny.bkI();
        }
        if (string.equals("currentProtector")) {
            return this.lnd;
        }
        if (string.equals("challengeInventory")) {
            return this.lnd.eau();
        }
        if (string.equals("climateInventory")) {
            return this.a(this.lnd.eax(), false);
        }
        if (string.equals("challengeObjInventory")) {
            return this.lnd.ear();
        }
        if (string.equals("climateObjInventory")) {
            return this.lnd.eax();
        }
        if (string.equals("baseChallenges")) {
            TIntArrayList tIntArrayList = this.lnd.eaA();
            if (tIntArrayList.size() == 0) {
                return null;
            }
            ArrayList<bfM> arrayList = new ArrayList<bfM>();
            int n = tIntArrayList.size();
            for (int i = 0; i < n; ++i) {
                bfM bfM2 = bgk.hZN.Cx(tIntArrayList.get(i));
                if (bfM2 == null) continue;
                arrayList.add(bfM2);
            }
            return arrayList;
        }
        if (string.equals("hasMoneyBaseChallenges")) {
            TIntArrayList tIntArrayList = this.lnd.eaA();
            int n = tIntArrayList.size();
            for (int i = 0; i < n; ++i) {
                int n2 = tIntArrayList.get(i);
                if (!ArrayUtils.contains((int[])ewb_0.oIf, (int)n2)) continue;
                return true;
            }
            return false;
        }
        if (string.equals("availableChallenges")) {
            bfM bfM3;
            int n;
            TIntArrayList tIntArrayList = this.lnd.eaA();
            fiH<bfY> fiH2 = this.lnd.eaI();
            TIntArrayList tIntArrayList2 = this.lnd.eaz();
            if (tIntArrayList.size() + tIntArrayList2.size() == 0) {
                return null;
            }
            ArrayList<bfM> arrayList = new ArrayList<bfM>();
            int n3 = tIntArrayList.size();
            for (n = 0; n < n3; ++n) {
                bfM3 = bgk.hZN.Cx(tIntArrayList.get(n));
                bfY bfY2 = fiH2.Wa(tIntArrayList.get(n));
                if (bfM3 == null || bfY2 == null || bfY2.bdo() != null && !bfY2.bdo().b(this.lnd, null, null, null)) continue;
                arrayList.add(bfM3);
            }
            n3 = tIntArrayList2.size();
            for (n = 0; n < n3; ++n) {
                bfM3 = bgk.hZN.Cx(tIntArrayList2.get(n));
                if (bfM3 == null) continue;
                arrayList.add(bfM3);
            }
            return arrayList;
        }
        if (string.equals("numAvailableChallenges")) {
            return this.lnd.eaA().size() + this.lnd.eaz().size();
        }
        if (string.equals("numBoughtChallenges")) {
            return this.lnd.eaz().size();
        }
        if (string.equals("boughtChallenges")) {
            this.lni.clear();
            TIntArrayList tIntArrayList = this.lnd.eaz();
            if (tIntArrayList.size() == 0) {
                return null;
            }
            bkm_0 bkm_02 = this.lnd.ear();
            if (bkm_02 == null) {
                return null;
            }
            int n = tIntArrayList.size();
            for (int i = 0; i < n; ++i) {
                int n4 = tIntArrayList.getQuick(i);
                bkn_0 bkn_02 = bkm_02.HL(n4);
                if (bkn_02 == null) continue;
                this.lni.add(bkn_02.ebj());
            }
            return this.lni;
        }
        if (string.equals("boughtClimates")) {
            return this.a(this.lnd.eax(), true);
        }
        if (string.equals("walletHandler")) {
            if (this.lnd == null || this.lnd.eav() == null) {
                return null;
            }
            bJI bJI2 = (bJI)this.lnd.eav();
            return bJI2.f(this.doD());
        }
        if (string.equals("tax")) {
            return this.b(frk.sXG);
        }
        if (string.equals("nation")) {
            return this.lng;
        }
        if (string.equals("job")) {
            return aum_0.cWf().a(90, (long)this.ctn(), new Object[0]);
        }
        if (string.equals("sex")) {
            return aum_0.cWf().a(91, (long)this.ctn(), new Object[0]);
        }
        if (string.equals("height")) {
            return aum_0.cWf().a(92, (long)this.ctn(), new Object[0]);
        }
        if (string.equals("weight")) {
            return aum_0.cWf().a(93, (long)this.ctn(), new Object[0]);
        }
        if (string.equals("customDescription")) {
            if (!aum_0.cWf().e(94, this.ctn())) {
                return null;
            }
            String string2 = aum_0.cWf().a(94, (long)this.ctn(), new Object[0]);
            return string2.split("\n");
        }
        if (string.equals("numSecrets")) {
            if (this.lnd == null) {
                return "";
            }
            int n = 0;
            Iterator<bJC> iterator = this.lnd.eaG();
            while (iterator.hasNext()) {
                iterator.next();
                ++n;
            }
            return n;
        }
        if (string.equals("secrets")) {
            if (this.lnd == null) {
                return null;
            }
            ArrayList<bTi> arrayList = new ArrayList<bTi>();
            Iterator<bJC> iterator = this.lnd.eaG();
            while (iterator.hasNext()) {
                bJC bJC2 = iterator.next();
                arrayList.add(new bTi(bJC2));
            }
            return arrayList;
        }
        if (string.equals("unlockedSecrets")) {
            if (this.lnd == null) {
                return "";
            }
            int n = 0;
            int n5 = 0;
            bcd_2 bcd_22 = aue_0.cVJ().cVK().dpy();
            Iterator<bJC> iterator = this.lnd.eaG();
            while (iterator.hasNext()) {
                bJC bJC3 = iterator.next();
                ++n5;
                if (bcd_22.ob(bJC3.ctD()) && !bcd_22.oc(bJC3.ctD())) continue;
                ++n;
            }
            return n + "/" + n5;
        }
        if (string.equals("territoryName")) {
            String string3;
            bJK bJK2 = (bJK)this.lnd.gfS();
            if (aum_0.cWf().e(66, bJK2.d()) && (string3 = aum_0.cWf().a(66, (long)bJK2.d(), new Object[0])) != null && string3.length() > 0) {
                return string3;
            }
            return null;
        }
        if (string.equals("buffTitle")) {
            return aum_0.cWf().c("protector.buffs.mdc.title", new Object[0]);
        }
        if (string.equals("buffTooltip")) {
            return aum_0.cWf().c("protector.buffs.mdc.explaination", new Object[0]);
        }
        if (string.equals("unsatisfiedRegionalState")) {
            if (boa_2.ehn().ehh() < 1) {
                return null;
            }
            return this.g(fpb.sNo);
        }
        if (string.equals("halfSatisfiedRegionalState")) {
            if (boa_2.ehn().ehh() < 2) {
                return null;
            }
            return this.g(fpb.sNp);
        }
        if (string.equals("satisfiedRegionalState")) {
            if (boa_2.ehn().ehh() < 1) {
                return null;
            }
            return this.g(fpb.sNq);
        }
        if (string.equals("unsatisfiedGlobalState")) {
            if (boa_2.ehn().ehh() < 1) {
                return null;
            }
            return this.f(fpb.sNo);
        }
        if (string.equals("halfSatisfiedGlobalState")) {
            if (boa_2.ehn().ehh() < 2) {
                return null;
            }
            return this.f(fpb.sNp);
        }
        if (string.equals("satisfiedGlobalState")) {
            if (boa_2.ehn().ehh() < 1) {
                return null;
            }
            return this.f(fpb.sNq);
        }
        if (string.equals("unsatisfiedStateIcon")) {
            int n = this.e(fpb.sNo);
            if (n == -1) {
                return null;
            }
            bmq_0 bmq_02 = (bmq_0)fqX.gjM().Zr(n);
            return bmq_02.byf();
        }
        if (string.equals("halfSatisfiedStateIcon")) {
            int n = this.e(fpb.sNp);
            if (n == -1) {
                return null;
            }
            bmq_0 bmq_03 = (bmq_0)fqX.gjM().Zr(n);
            return bmq_03.byf();
        }
        if (string.equals("satisfiedStateIcon")) {
            int n = this.e(fpb.sNq);
            if (n == -1) {
                return null;
            }
            bmq_0 bmq_04 = (bmq_0)fqX.gjM().Zr(n);
            return bmq_04.byf();
        }
        if (string.equals("globalStateIcon")) {
            return auc_0.cVq().a("protectorBuffsIconsPath", "defaultIconPath", -1);
        }
        if (string.equals("buffList")) {
            return Lists.newArrayList((Object[])new bTc[]{new bTc(fpb.sNo, this.lnd), new bTc(fpb.sNp, this.lnd), new bTc(fpb.sNq, this.lnd)});
        }
        if (string.equals("zoology")) {
            return this.lnd.eaH().eaN();
        }
        if (string.equals("territoryRecommendedLevel")) {
            bJK bJK3 = this.eaX();
            if (bJK3 == null) {
                return null;
            }
            short s = bJK3.aVf();
            short s2 = bJK3.aVe();
            if (s != -1 && s2 != -1) {
                return Bz.a(aum_0.cWf().c("recommended.level", s, s2), new Object[0]);
            }
            return Bz.a(aum_0.cWf().c("recommended.level", 1, 5), new Object[0]);
        }
        return super.eu(string);
    }

    private int e(fpb fpb2) {
        switch (fpb2) {
            case sNo: {
                return 1917;
            }
            case sNq: {
                return 1916;
            }
            case sNp: {
                return 1915;
            }
        }
        return -1;
    }

    private String f(fpb fpb2) {
        ArrayList<String> arrayList = new ArrayList<String>();
        axb_2 axb_22 = fpb2.aJr() <= this.lnd.eaF().aJr() ? awx_2.dnF : awx_2.dnS;
        String string = new ahv_2().ceC().ih(axb_22.bQk()).c(bTc.d(fpb2)).ceD().ceL();
        arrayList.add(string);
        ahv_2 ahv_22 = new ahv_2();
        int n = arrayList.size();
        for (int i = 0; i < n; ++i) {
            String string2 = (String)arrayList.get(i);
            if (i != 0) {
                ahv_22.ceH();
            }
            ahv_22.c(string2);
        }
        return ahv_22.ceL();
    }

    private Object g(fpb fpb2) {
        int n = this.e(fpb2);
        if (n == -1) {
            return null;
        }
        axb_2 axb_22 = fpb2.aJr() <= this.lnd.eaF().aJr() ? awx_2.dnF : awx_2.dnS;
        bmq_0 bmq_02 = (bmq_0)fqX.gjM().Zr(n);
        ArrayList<String> arrayList = new ArrayList<String>();
        for (String string : eLL.a(new eMk(bmq_02, eLN.qJn))) {
            arrayList.add(new ahv_2().ceC().ih(axb_22.bQk()).c(string).ceD().ceL());
        }
        if (arrayList.isEmpty()) {
            arrayList.add(aum_0.cWf().c("protector.noBuff", new Object[0]));
        }
        return arrayList;
    }

    public void dhE() {
        int n = this.lni.size();
        for (int i = 0; i < n; ++i) {
            this.lni.get(i).dhE();
        }
    }

    @Override
    public int ctn() {
        return this.lnd != null ? this.lnd.d() : -1;
    }

    @Override
    public void a(foP foP2, fjo_0 fjo_02) {
        if (foP2 != this.lnd) {
            return;
        }
        this.lng = new bso_2(fjo_02.Xt());
        fse_1.gFu().a((aef_2)this, "nation");
        if (aue_0.cVJ().c(cxf_1.eXs())) {
            aue_0.cVJ().b(cxf_1.eXs());
        }
    }

    private static bbr_2 a(bJr bJr2, frk frk2) {
        EnumMap<frk, frj> enumMap = bJr2.eaD();
        return new bbr_2(enumMap.get((Object)frk2));
    }

    public bbr_2 b(frk frk2) {
        switch (frk2) {
            case sXG: {
                if (lne == null) {
                    lne = bTj.a(this.lnd, frk2);
                }
                return lne;
            }
        }
        return null;
    }

    public bJr doD() {
        return this.lnd;
    }

    public bJr enp() {
        return this.lnh;
    }

    public void clean() {
        if (this.lnf != null) {
            this.lnf.bpI();
            this.lnf = null;
        }
    }

    public void h(bJr bJr2) {
        fpg fpg2;
        if (this.lnd == bJr2) {
            return;
        }
        if (this.lnh != null) {
            frn.sXO.b(this.lnh);
            this.lnh = null;
        }
        if (this.lnd != null) {
            fpg2 = this.lnd.eav();
            if (fpg2 != null) {
                fpg2.a((fgK)null);
            }
            bgt_0 bgt_02 = aue_0.cVJ().cVK();
            if (this.lnd == null || bgt_02 != null && !bgt_02.dnx().equals(bgt_02.dnw())) {
                frn.sXO.b(this.lnd);
            } else {
                this.lnh = this.lnd;
            }
            this.clean();
        }
        fse_1.gFu().f("wakfuEcosystemEnabled", false);
        this.lnd = bJr2;
        if (this.lnf != null) {
            this.lnf.bpI();
            this.lnf = null;
        }
        lne = null;
        if (this.lnd != null) {
            frn.sXO.a(this.lnd);
            fpg2 = this.lnd.eav();
            if (fpg2 != null) {
                fpg2.a(this);
            }
            this.lng = new bso_2(this.lnd.gfR().Xt());
            fse_1.gFu().f("protector", this);
        } else {
            cxe_1.eXq().eXr();
            this.lng = null;
        }
        this.enk();
    }

    public static String a(int n, int n2, int n3, Object ... objectArray) {
        int n4 = n * 10000000 + n2 * 10000 + n3;
        String string = aum_0.cWf().a(49, (long)n4, objectArray == null ? new String[]{} : objectArray);
        return aum_0.cWf().e(49, n4) ? string : null;
    }

    private ArrayList<bkq_0> a(bkm_0 bkm_02, boolean bl) {
        if (bkm_02 == null || bkm_02.aVo() == 0) {
            return null;
        }
        ArrayList<bkq_0> arrayList = new ArrayList<bkq_0>(bkm_02.aVo());
        for (ffh_0 ffh_02 : bkm_02) {
            bkn_0 bkn_02 = (bkn_0)ffh_02;
            if (bkn_02 == null || bkn_02.aOY() != bl) continue;
            arrayList.add(((bkn_0)ffh_02).ebj());
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return arrayList;
    }

    @Override
    public void a(fgj_0 fgj_02, long l) {
        fse_1.gFu().a((aef_2)this, "walletHandler");
        if (this.lnd == null || this.lnd.eav() == null) {
            return;
        }
        bJI bJI2 = (bJI)this.lnd.eav();
        bTr bTr2 = bJI2.f(this.doD());
        bTr2.dqL();
    }

    @Override
    @Nullable
    public ZC a(int n, @NotNull bkr_0 bkr_02) {
        if (this.lnf == null) {
            this.lnf = bTf.Jw(n);
        }
        if (this.lnf != null) {
            bTf.a(this.lnf, bkr_02);
        }
        return this.lnf;
    }

    @Override
    @Nullable
    public bJK eaX() {
        if (this.lnd == null) {
            return null;
        }
        return (bJK)this.lnd.gfS();
    }

    @Override
    public boolean enj() {
        return false;
    }
}

