/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Unmodifiable
 */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Unmodifiable;

/*
 * Renamed from cUS
 */
public class cus_1
implements adi_1 {
    private static final cus_1 nNY = new cus_1();
    private static final Logger nNZ = Logger.getLogger(cus_1.class);
    private alx_2 ikv;
    private bus_0 nOa;

    private cus_1() {
    }

    public static cus_1 eTb() {
        return nNY;
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }

    @Override
    public boolean b(aam_2 aam_22) {
        if (aam_22.d() == 17415) {
            String string = ((dae_0)aam_22).bCt();
            this.nOa.mq(BH.aT(string));
            return false;
        }
        return true;
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (!bl) {
            bus_0 bus_02;
            this.ikv = string -> {
                if (string.equals("furnitureListDialog")) {
                    aue_0.cVJ().b(cus_1.eTb());
                }
            };
            fyw_0.gqw().a(this.ikv);
            fyw_0.gqw().d("wakfu.furniture", cen_1.class);
            ccj_2.g("furnitureListDialog", 32768L);
            bgt_0 bgt_02 = aue_0.cVJ().cVK();
            if (bgt_02 == null) {
                nNZ.error((Object)"[Furniture] Unable to get local player. View will be empty by default");
                fse_1.gFu().b("furniture", new bus_0(), "furnitureListDialog");
                return;
            }
            Optional<fnu> optional = cus_1.eTc();
            this.nOa = bus_02 = optional.map(fnu2 -> new bus_0(cus_1.a(fnu2))).orElseGet(bus_0::new);
            fse_1.gFu().b("furnitureCategories", bus_02, "furnitureListDialog");
            cAY.eHc().nP(600012L);
        }
    }

    private static Optional<fnu> eTc() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02 == null) {
            nNZ.error((Object)"[Furniture] Unable to get local player. View will be empty by default");
            return Optional.empty();
        }
        return evx_2.feo().b(bgt_02.aZj(), eva_1.owB);
    }

    private static @Unmodifiable List<buw_0> ay(List<Integer> list) {
        return list.stream().map(cus_1::ar).filter(Objects::nonNull).sorted(Comparator.comparing(buw_0::getName)).toList();
    }

    private static buw_0 ar(Integer n) {
        bgv_2 bgv_22 = (bgv_2)bEm.dSb().Vd(n);
        if (bgv_22 == null) {
            return null;
        }
        return new buw_0(bgv_22);
    }

    private static List<bur_0> a(fnu fnu2) {
        HashMap hashMap = new HashMap();
        fnu2.gev().forEach(n2 -> {
            int n3 = fdb.fSX().Ug((int)n2);
            hashMap.computeIfAbsent(buv_0.dIZ().T(n3).aHp(), n -> new ArrayList()).add(n2);
        });
        ArrayList<bur_0> arrayList = new ArrayList<bur_0>();
        for (Map.Entry entry : hashMap.entrySet()) {
            bur_0 bur_02 = new bur_0(buv_0.dIZ().T((Integer)entry.getKey()), cus_1.ay((List)entry.getValue()));
            arrayList.add(bur_02);
        }
        arrayList.sort(Comparator.comparingInt(bur_0::cnG));
        if (!arrayList.isEmpty()) {
            ((bur_0)arrayList.get(0)).fm(false);
        }
        return arrayList;
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (bl) {
            return;
        }
        cAY.eHc().nP(600013L);
        fyw_0.gqw().b(this.ikv);
        fyw_0.gqw().tl("furnitureListDialog");
        fyw_0.gqw().tc("wakfu.furniture");
        fse_1.gFu().f("furnitureCategories", (Object)null);
    }

    public void g(Set<Integer> set) {
        for (Integer n : set) {
            int n2 = fdb.fSX().Ug(n);
            Optional<bur_0> optional = this.Na(n2);
            optional.ifPresentOrElse(bur_02 -> bur_02.a(cus_1.ar(n)), () -> this.b(n, n2));
        }
    }

    private void b(Integer n, int n2) {
        buu_0 buu_02 = buv_0.dIZ().T(n2);
        buw_0 buw_02 = cus_1.ar(n);
        if (buw_02 == null) {
            return;
        }
        ArrayList<buw_0> arrayList = new ArrayList<buw_0>();
        arrayList.add(buw_02);
        bur_0 bur_02 = new bur_0(buu_02, arrayList);
        this.nOa.a(bur_02);
    }

    private Optional<bur_0> Na(int n) {
        for (bur_0 bur_02 : this.nOa.dIW()) {
            if (bur_02.dIV().aHp() != n) continue;
            return Optional.of(bur_02);
        }
        return Optional.empty();
    }
}

