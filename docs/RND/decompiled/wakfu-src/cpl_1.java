/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from cPL
 */
public abstract class cpl_1
extends cpm_1 {
    public ArrayList<fka_1> eLu() {
        boolean bl;
        ArrayList<fka_1> arrayList = new ArrayList<fka_1>();
        bJr bJr2 = bTj.eno().doD();
        if (bJr2 == null) {
            return arrayList;
        }
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        fkc_0 fkc_02 = cpl_1.eLw();
        if (fkc_02 == fkc_0.sAo && bgt_02.ffF().gaX()) {
            return arrayList;
        }
        boolean bl2 = !this.euW().isEmpty();
        boolean bl3 = !this.euY().isEmpty();
        boolean bl4 = !this.euV().isEmpty();
        boolean bl5 = bl = !this.euX().isEmpty();
        if (fkc_02 == fkc_0.sAo) {
            if (this.euU()) {
                arrayList.add(new crx_1("6001020.xps"));
            }
        } else if (bl2 && bl3 || bl4 && bl || bl2 && bl || bl3 && bl4) {
            arrayList.add(new crx_1("800224.xps"));
        } else if (bl4) {
            arrayList.add(new crx_1("800193.xps"));
        } else if (bl) {
            arrayList.add(new crx_1("800194.xps"));
        } else if (bl2) {
            arrayList.add(new crx_1("800222.xps"));
        } else if (bl3) {
            arrayList.add(new crx_1("800223.xps"));
        }
        return arrayList;
    }

    @Override
    @Nullable
    public String eLv() {
        List<flv_0> list;
        List<flv_0> list2;
        List<flv_0> list3;
        List<flv_0> list4;
        bJr bJr2 = bTj.eno().doD();
        if (bJr2 == null) {
            return null;
        }
        fkc_0 fkc_02 = cpl_1.eLw();
        if (fkc_02 == fkc_0.sAo && aue_0.cVJ().cVK().ffF().gaX()) {
            return null;
        }
        ahv_2 ahv_22 = new ahv_2();
        boolean bl = this.euU();
        if (bl) {
            ahv_22.ceC().ih(nim);
            ahv_22.c("\n").c(aum_0.cWf().c("desc.mru.illegalAction", new Object[0]));
            ahv_22.ceD();
        }
        if (!(list4 = this.euV()).isEmpty()) {
            ahv_22.ceH().ceC().ih(nil);
            ahv_22.ceu().c(aum_0.cWf().c("nation.law.mru.good", new Object[0])).cev();
            ahv_22.ceD();
            cpl_1.a(ahv_22, list4, nil, bl);
        }
        if (!(list3 = this.euX()).isEmpty()) {
            ahv_22.ceH().ceC().ih(nim);
            ahv_22.ceu().c(aum_0.cWf().c("nation.law.mru.bad", new Object[0])).cev();
            ahv_22.ceD();
            cpl_1.a(ahv_22, list3, nim, bl);
        }
        if (!(list2 = this.euW()).isEmpty()) {
            ahv_22.ceH().ceC().ih("9ed34b");
            ahv_22.ceu().c(aum_0.cWf().c("nation.law.mru.probablyGood", new Object[0])).cev();
            ahv_22.ceD();
            cpl_1.a(ahv_22, list2, "9ed34b", bl);
        }
        if (!(list = this.euY()).isEmpty()) {
            ahv_22.ceH().ceC().ih("f48140");
            ahv_22.ceu().c(aum_0.cWf().c("nation.law.mru.probablyBad", new Object[0])).cev();
            ahv_22.ceD();
            cpl_1.a(ahv_22, list, "f48140", bl);
        }
        return ahv_22.bXe() > 0 ? ahv_22.ceL() : null;
    }

    public static void a(ahv_2 ahv_22, Iterable<flv_0> iterable, String string, boolean bl) {
        for (flv_0 flv_02 : iterable) {
            boolean bl2 = flv_02.csT() > 0;
            ahv_22.ceH().ceC();
            ahv_22.ih(string);
            ahv_22.c("    " + aum_0.cWf().a(97, (long)((int)flv_02.Sn()), new Object[0]));
            if (bl) {
                ahv_22.ceD();
                return;
            }
            ahv_22.ceu().c(" (" + (bl2 ? "+" : "") + flv_02.csU() + "%/" + (bl2 ? "+" : "") + flv_02.csT());
            try {
                ahv_22.c(fty_2.b(auk_0.zU(9), -1, -1, "north", "citizenScore") + ")");
            }
            catch (fu_0 fu_02) {
                nii.error((Object)"erreur au chargement de l'icon de citizen");
            }
            ahv_22.cev().ceD();
        }
    }

    protected boolean euU() {
        if (cpl_1.eLw() != fkc_0.sAo) {
            return false;
        }
        List<flv_0> list = this.euX();
        List<flv_0> list2 = this.euY();
        return !list.isEmpty() || !list2.isEmpty();
    }

    @Nullable
    public static fkc_0 eLw() {
        bJr bJr2 = bTj.eno().doD();
        if (bJr2 == null) {
            return null;
        }
        fjo_0 fjo_02 = bJr2.gfR();
        if (fjo_02 == fjo_0.sys) {
            return null;
        }
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        fjn_0 fjn_02 = bgt_02.ffF();
        return fjn_02.ems().gbD().WO(fjo_02.Xt());
    }

    private static boolean eLx() {
        bJr bJr2 = bTj.eno().doD();
        if (bJr2 == null) {
            return false;
        }
        return bJr2.dpu();
    }

    private List<flv_0> euV() {
        if (!cpl_1.eLx()) {
            return Collections.emptyList();
        }
        return flv_0.bl(this.euZ());
    }

    private List<flv_0> euW() {
        return flv_0.bl(this.eva());
    }

    private List<flv_0> euX() {
        if (!cpl_1.eLx()) {
            return Collections.emptyList();
        }
        return flv_0.bm(this.euZ());
    }

    private List<flv_0> euY() {
        return flv_0.bm(this.eva());
    }

    @Nullable
    public abstract List<flv_0> euZ();

    @Nullable
    public abstract List<flv_0> eva();

    public /* synthetic */ Iterable eLy() {
        return this.eLu();
    }
}

