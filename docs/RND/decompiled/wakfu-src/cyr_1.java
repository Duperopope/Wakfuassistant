/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from cYr
 */
public class cyr_1
implements adi_1 {
    protected static final Logger nYm = Logger.getLogger(cyr_1.class);
    private static final cyr_1 nYn = new cyr_1();
    private bni_2 nYo;
    private alx_2 ikv;

    public static cyr_1 eXT() {
        return nYn;
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (bl) {
            return;
        }
        this.ikv = string -> {
            if (!string.equals("steleDialog")) {
                return;
            }
            if (aue_0.cVJ().c(cyr_1.eXT())) {
                aue_0.cVJ().b(cyr_1.eXT());
            }
        };
        fyw_0.gqw().a(this.ikv);
        fyw_0.gqw().d("wakfu.stele", chh_2.class);
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        bgt_0 bgt_02;
        if (bl) {
            return;
        }
        fyw_0.gqw().tc("wakfu.stele");
        fyw_0.gqw().b(this.ikv);
        if (fyw_0.gqw().to("steleDialog")) {
            fyw_0.gqw().tl("steleDialog");
        }
        if ((bgt_02 = aue_0.cVJ().cVK()).fhv() == 34) {
            bgt_02.i(false, true);
        }
        fse_1.gFu().vX("stele");
    }

    public void a(bbl_2 bbl_22, zu_2 zu_22) {
        List<bng_2> list = this.d(bbl_22.dPQ(), zu_22);
        fdK fdK2 = bbl_22.dPQ();
        List<bnf_2> list2 = this.c(fdK2, zu_22);
        this.nYo = cyr_1.a(bbl_22, fdK2, list, list2);
        this.nYo.efE();
        if (!fyw_0.gqw().to("steleDialog")) {
            ccj_2.g("steleDialog", 16L);
        }
        fse_1.gFu().b("stele", this.nYo, "steleDialog");
    }

    public void b(fdK fdK2, zu_2 zu_22) {
        List<bng_2> list = this.d(fdK2, zu_22);
        List<bnf_2> list2 = this.c(fdK2, zu_22);
        this.nYo = cyr_1.a(null, fdK2, list, list2);
        if (!fyw_0.gqw().to("steleDialog")) {
            ccj_2.g("steleDialog", 16L);
        }
        fse_1.gFu().b("stele", this.nYo, "steleDialog");
    }

    @NotNull
    private static bni_2 a(bbl_2 bbl_22, fdK fdK2, List<bng_2> list, List<bnf_2> list2) {
        return new bni_2(fdK2, bbl_22, list, list2);
    }

    private List<bnf_2> c(fdK fdK2, zu_2 zu_22) {
        ArrayList<bnf_2> arrayList = new ArrayList<bnf_2>();
        for (fdM fdM2 : fdK2.dPN()) {
            bmq_0 bmq_02 = (bmq_0)fqX.gjM().Zr(fdM2.LR());
            if (bmq_02 == null) {
                nYm.debug((Object)("[STELE] Invalid state " + fdM2.LR() + " for stele " + fdK2.d()));
                continue;
            }
            bnf_2 bnf_22 = new bnf_2(fdM2.d(), fdM2.aXY(), bmq_02);
            if (zu_22.ayU().contains(fdM2.d())) {
                bnf_22.setSelected(true);
            }
            arrayList.add(bnf_22);
        }
        arrayList.sort(Comparator.comparingInt(bnf_2::aXY).thenComparingInt(bnf_2::efs));
        return arrayList;
    }

    private List<bng_2> d(fdK fdK2, zu_2 zu_22) {
        ArrayList<bng_2> arrayList = new ArrayList<bng_2>();
        int n = bnd_1.a(fdK2, zu_22);
        for (zq_2 zq_22 : zu_22.ayR()) {
            ArrayList<bnh_2> arrayList2 = new ArrayList<bnh_2>();
            ArrayList<bnh_2> arrayList3 = new ArrayList<bnh_2>();
            for (zy_2 zy_22 : zq_22.ayk()) {
                this.f(zy_22).ifPresentOrElse(arrayList2::add, () -> nYm.error((Object)("[STELE] Unknown static reward item " + zy_22.azv() + " in stele " + fdK2.d())));
            }
            for (zy_2 zy_23 : zq_22.ayn()) {
                this.f(zy_23).ifPresentOrElse(arrayList3::add, () -> nYm.error((Object)("[STELE] Unknown dynamic reward item " + zy_23.azv() + " in stele " + fdK2.d())));
            }
            Optional<fdq_0> optional = fdK2.fUb().stream().filter(fdq_02 -> fdq_02.d() == zq_22.ayj()).findFirst();
            if (optional.isEmpty()) {
                nYm.error((Object)("[STELE] Unable to find reward tier" + zq_22.ayj() + "in stele definition while creating views. Skipping"));
                continue;
            }
            fdq_0 fdq_03 = (fdq_0)optional.get();
            int n2 = fdq_03.cxS();
            arrayList.add(new bng_2(zq_22.ayj(), n >= zq_22.ayr(), zq_22.ayr(), arrayList2, arrayList3, n2));
        }
        return arrayList;
    }

    private Optional<bnh_2> f(zy_2 zy_22) {
        ffV ffV2 = bEm.dSb().Ve(zy_22.azv());
        if (ffV2 == null) {
            return Optional.empty();
        }
        bnh_2 bnh_22 = new bnh_2(zy_22.azt(), ffV2, zy_22.oP());
        if (zy_22.getEnabled()) {
            bnh_22.setSelected(true);
        }
        return Optional.of(bnh_22);
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 18626: {
                this.eXU();
                return false;
            }
            case 19703: {
                dce_0 dce_02 = (dce_0)aam_22;
                bnf_2 bnf_22 = dce_02.fcc();
                this.nYo.a(bnf_22, dce_02.bqr());
                this.nYo.efE();
                return false;
            }
            case 17442: {
                dcf_0 dcf_02 = (dcf_0)aam_22;
                bnh_2 bnh_22 = dcf_02.fcd();
                this.nYo.b(bnh_22);
                this.nYo.efE();
                return false;
            }
        }
        return true;
    }

    private void eXU() {
        long l = this.nYo.efA();
        List<Integer> list = this.nYo.efB();
        List<Integer> list2 = this.nYo.efu();
        bgt_0 bgt_02 = bvz_0.dLl();
        if (bgt_02 == null) {
            return;
        }
        if (!this.nYo.ab(list)) {
            return;
        }
        if (!this.nYo.K(bgt_02)) {
            return;
        }
        aue_0.cVJ().etu().d(new cny_0(l, list, list2));
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }
}

