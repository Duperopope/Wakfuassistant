/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 *  it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.procedure.TObjectProcedure;
import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from cUs
 */
public class cus_2
implements adi_1,
bex_0 {
    protected static final Logger nLY = Logger.getLogger(cus_2.class);
    private static final cus_2 nLZ = new cus_2();
    private alx_2 ikv;
    private fhs_2 nKe;
    private bsa_0 nMa;
    private bzD nMb;
    private final ArrayList<bsu_0> nMc = new ArrayList();
    private final List<bsz_1> nMd = new ArrayList<bsz_1>();
    final List<bsy_0> nMe = new ArrayList<bsy_0>();
    private final rz_0 nMf = rH -> {
        if (this.nMb == null) {
            return;
        }
        if (rH.Sn() != this.nMb.Sn()) {
            return;
        }
        if (rH.isUsable()) {
            return;
        }
        aue_0.cVJ().b(this);
    };
    private boolean nMg;
    private bgt_0 nMh;

    public static cus_2 eRQ() {
        return nLZ;
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (!bl) {
            aue_0.cVJ().b(czi_2.eYU());
            this.ikv = new cut_2(this);
            fyw_0.gqw().a(this.ikv);
            this.nKe = ccj_2.pd("exchangeMachineDialog").getElementMap();
            this.nMh = aue_0.cVJ().cVK();
            this.eRR();
            cAY.eHc().nP(600012L);
            fse_1.gFu().b("characterSheet", cts_1.ePJ().get(this.nMh.Sn()), "exchangeMachineDialog");
            if (!fyw_0.gqw().tb("wakfu.exchangeMachine")) {
                fyw_0.gqw().d("wakfu.exchangeMachine", cee_1.class);
            }
            bey_0.dTc().a(this);
        }
    }

    private void eRR() {
        this.nMd.clear();
        List list = (List)fse_1.gFu().vY("heroesParty");
        HashSet<bgv_2> hashSet = new HashSet<bgv_2>();
        for (aef_2 aef_22 : this.nMc) {
            aef_22.dFR().forEach(bmj_22 -> hashSet.add(bmj_22.duo()));
        }
        for (aef_2 aef_22 : list) {
            this.nMd.add(this.a((bgt_0)aef_22, hashSet));
        }
        fse_1.gFu().a((aef_2)this.nMa, "accountWideCurrencies");
        fse_1.gFu().a("exchangeMachineCurrencies", this.nMd, "exchangeMachineDialog", true);
    }

    private bsz_1 a(bgt_0 bgt_02, HashSet<bgv_2> hashSet) {
        ffV[] ffVArray = bgt_02.dno().dRx();
        fec_0 fec_02 = (fec_0)bgt_02.a(fez_0.sep);
        if (!bgt_02.dmc()) {
            this.nMe.clear();
        }
        Optional optional = evx_2.feo().b(bgt_02.aZj(), eva_1.owu);
        ArrayList<bsy_0> arrayList = new ArrayList<bsy_0>();
        for (bgv_2 bgv_22 : hashSet) {
            ffm ffm2 = fec_02.UB(bgv_22.d());
            if (ffm2 != null) {
                arrayList.add(new bsy_0(bgv_22, ffm2.bfd()));
            }
            if (optional.isPresent() && ((feb_0)optional.get()).Qe(bgv_22.d()) != 0 && !bgt_02.dmc()) {
                this.nMe.add(new bsy_0(bgv_22, ((feb_0)optional.get()).Qe(bgv_22.d())));
            }
            Int2IntOpenHashMap int2IntOpenHashMap = new Int2IntOpenHashMap();
            for (ffV ffV2 : ffVArray) {
                if (bgv_22.d() != ffV2.dOg().d()) continue;
                int2IntOpenHashMap.merge(ffV2.avr(), (int)ffV2.bfd(), Integer::sum);
            }
            int2IntOpenHashMap.forEach((n, n2) -> arrayList.add(new bsy_0((bgv_2)bEm.dSb().Vd(n), n2)));
        }
        return new bsz_1(bgt_02, arrayList);
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            this.nKe = null;
            this.nMa.dGe();
            this.nMa = null;
            if (this.nMb != null) {
                this.nMb.b(this.nMf);
            }
            this.nMb = null;
            this.ak(null);
            fyw_0.gqw().b(this.ikv);
            fyw_0.gqw().tl("exchangeMachineDialog");
            fse_1.gFu().vX("exchangeMachine");
            fse_1.gFu().vX("selectedExchange");
            cAY.eHc().nP(600013L);
            if (!aue_0.cVJ().c(ctu_2.nJd) && !fyw_0.gqw().to("ladderRewardsDialog")) {
                fyw_0.gqw().tc("wakfu.exchangeMachine");
            }
            bey_0.dTc().b(this);
            aue_0.cVJ().a(czi_2.eYU());
        }
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 16902: {
                return !this.nMg;
            }
            case 17579: {
                cus_2.a((dbj)aam_22, this.nMa.dGf(), this.nMa.dGg(), this.nMh);
                return false;
            }
            case 19166: {
                dae_0 dae_02 = (dae_0)aam_22;
                bgt_0 bgt_02 = (bgt_0)dae_02.bCv();
                this.aj(bgt_02);
                return false;
            }
        }
        return true;
    }

    public void ai(@Nullable bgt_0 bgt_02) {
        if (bgt_02 == null || this.nMh == null || bgt_02.Sn() != this.nMh.Sn()) {
            return;
        }
        this.aj(aue_0.cVJ().cVK());
    }

    public void aj(bgt_0 bgt_02) {
        if (!aue_0.cVJ().c(nLZ)) {
            return;
        }
        if (bgt_02.Sn() == this.nMh.Sn()) {
            return;
        }
        this.nMa.dGe();
        this.ak(bgt_02);
        this.nMa.dGb();
        this.nMa.v(this.nMh);
        fse_1.gFu().a("characterSheet", (Object)this.nMh, "exchangeMachineDialog", true);
    }

    public static void a(@NotNull dbj dbj2, long l, int n, @NotNull bgt_0 bgt_02) {
        short s = dbj2.bfd();
        if (s < 1) {
            return;
        }
        fdt_0 fdt_02 = dbj2.faF().dFX();
        int n2 = fdt_02.d();
        if (!cus_2.a(fdt_02, s, bgt_02)) {
            aPd.e("inventory.error.lackItem", new Object[0]);
            return;
        }
        cki_0 cki_02 = new cki_0(l, n2, n, s, bgt_02.Sn());
        aue_0.cVJ().etu().d(cki_02);
    }

    private static boolean a(@Nullable fdt_0 fdt_02, short s, @NotNull bgt_0 bgt_02) {
        boolean bl;
        if (fdt_02 == null) {
            return true;
        }
        ang_2 ang_22 = fdt_02.bdo();
        if (ang_22 != null && !ang_22.b(bgt_02, nLZ, fdt_02, bgt_02.bdV())) {
            return false;
        }
        boolean bl2 = bl = !fdt_02.a((n, s2) -> {
            if (bgt_02.dno().UN(n) >= s2 * s) {
                return true;
            }
            Optional optional = evx_2.feo().b(bgt_02.aZj(), eva_1.owu);
            if (optional.isPresent() && ((feb_0)optional.get()).Qe(n) >= s2) {
                return true;
            }
            fec_0 fec_02 = (fec_0)bgt_02.a(fez_0.sep);
            ffm ffm2 = fec_02.UB(n);
            return ffm2 != null && ffm2.bfd() >= s2 * s;
        });
        if (bl) {
            return false;
        }
        if (bgt_02.cWp().exS() < (long)fdt_02.fTy() * (long)s) {
            return false;
        }
        return bgt_02.ffF().gbc() >= (long)fdt_02.cnp() * (long)s;
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }

    public void a(bzD bzD2) {
        if (this.nMb != null) {
            this.nMb.b(this.nMf);
        }
        this.nMb = bzD2;
        this.nMb.a(this.nMf);
        this.a(bzD2.Sn(), bzD2.getName(), bzD2.getDescription(), bzD2.dOP(), true, true);
    }

    private void a(long l, String string, String string2, fds_0 fds_02, boolean bl, boolean bl2) {
        this.ak(aue_0.cVJ().cVK());
        int n = fds_02.d();
        this.nMc.clear();
        fds_02.W((TObjectProcedure<fdt_0>)((TObjectProcedure)fdt_02 -> {
            this.nMc.add(new bsu_0((fdt_0)fdt_02));
            return true;
        }));
        ewV ewV2 = fds_02.fTv();
        this.nMa = new bsa_0(l, string, string2, bl, n, this.nMc, ewV2);
        this.nMa.v(this.nMh);
        this.nMg = bl2;
        fse_1.gFu().f("exchangeMachine", this.nMa);
        aue_0.cVJ().a(this);
    }

    private void b(bmv_1 bmv_12) {
        fdf_1 fdf_12 = (fdf_1)this.nKe.uH("recipeList");
        fcv_1 fcv_12 = fdf_12.getRenderables().get(fdf_12.getItemIndex(bmv_12));
        fbz_2 fbz_22 = (fbz_2)fcv_12.getInnerElementMap().uH("ingredientList");
        for (Object object : fbz_22.getItems()) {
            bmj_2 bmj_22 = (bmj_2)object;
            if (bmj_22.dxj()) continue;
            fbt_1 fbt_12 = (fbt_1)fbz_22.getRenderableByOffset(fbz_22.getItemIndex(bmj_22)).getInnerElementMap().uH("icon");
            awx_2 awx_22 = new awx_2(1.0f, 0.5f, 0.5f, 1.0f);
            axb_2 axb_22 = fbt_12.getModulationColor();
            fsa_2 fsa_22 = new fsa_2(awx_22, axb_22, fbt_12, 0, 250, 3, abn.cdr);
            fbt_12.a(fsa_22);
        }
    }

    public void a(bDs bDs2) {
        if (bDs2.Sn() == this.nMa.dGf()) {
            aue_0.cVJ().b(this);
        }
    }

    public void pathStarted(ads_0 ads_02, anp_2 anp_22) {
        aue_0.cVJ().b(ctg_1.eQG());
    }

    public void ak(bgt_0 bgt_02) {
        this.nMh = bgt_02;
    }

    public bgt_0 eRS() {
        return this.nMh;
    }

    public List<bsy_0> eRT() {
        return Collections.unmodifiableList(this.nMe);
    }

    @Override
    public void d(@Nullable Sl sl) {
        this.eRR();
    }
}

