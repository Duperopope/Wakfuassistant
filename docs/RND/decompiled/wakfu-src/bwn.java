/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.apache.commons.lang3.ArrayUtils
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import lombok.Generated;
import org.apache.commons.lang3.ArrayUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class bwn
extends bwq {
    public static final String jxj = "itemCategoriesList";
    public static final String jxk = "formattedItemAmount";
    public static final String jxl = "splitByEquipmentPosition";
    public static final String jxm = "displayOtherHeroesItems";
    public static final String jxn = "selectedEquipmentSlot";
    public static final String jxo = "selectedEquipmentSlotName";
    public static final String jxp = "selectedEquipmentSlotIcon";
    public static final String jxq = "currentEquipmentSheetView";
    public static final String jxr = "actorDescriptorLibrary";
    public static final String jxs = "actorAnimationName";
    public static final String jxt = "actorScale";
    public static final String jxu = "filters";
    private static final String[] jxv = (String[])ArrayUtils.addAll((Object[])bwq.jxX, (Object[])new String[]{"itemCategoriesList", "formattedItemAmount", "splitByEquipmentPosition", "displayOtherHeroesItems", "selectedEquipmentSlot", "selectedEquipmentSlotName", "selectedEquipmentSlotIcon", "currentEquipmentSheetView", "actorDescriptorLibrary", "actorAnimationName", "actorScale", "filters"});
    private static final String jxw = "downscaling";
    private static final float jxx = 2.5f;
    private final bwi jxy;
    private bnx_1 ixo;
    @NotNull
    private bgq_1 jxz;
    @Nullable
    private bgp_1 jxA = null;
    private final bwm jxB;
    private boolean izP = false;
    private boolean jxC;
    private boolean jxD;
    private final Map<Long, bwl> jxE = new LinkedHashMap<Long, bwl>();
    private final Map<Byte, bwl> jxF = new LinkedHashMap<Byte, bwl>();
    private final Map<Byte, Map<Long, bwl>> jxG = new LinkedHashMap<Byte, Map<Long, bwl>>();
    private final List<bug_0<ffV>> jxH = new ArrayList<bug_0<ffV>>();
    @NotNull
    private fhw_0 jxI = fhw_0.sqL;

    public bwn(bwi bwi2, @NotNull bgq_1 bgq_12, @Nullable bwn bwn2) {
        this.jxy = bwi2;
        this.ixo = bwi2.dmc() ? new bnx_1(bwi2.dLD(), ((bgw_1)bgq_12).dTV()) : null;
        this.jxz = bgq_12;
        if (bwn2 != null) {
            this.jxH.addAll(bwn2.jxH);
        }
        this.jxB = new bwm(Collections.unmodifiableList(this.jxH));
        this.jxC = ((bsg_1)aie_0.cfn().bmH()).a(bsn_1.lkE);
        this.jxD = ((bsg_1)aie_0.cfn().bmH()).a(bsn_1.lkF);
        bwn.dLI();
    }

    private void u(String ... stringArray) {
        fse_1.gFu().a((aef_2)this, stringArray);
    }

    private static void dLI() {
        fhs_2 fhs_22 = fyw_0.gqw().gqC().uR("heroBuildDialog");
        if (fhs_22 == null) {
            return;
        }
        fhv_1 fhv_12 = fhs_22.uH("currentCharacterDisplay");
        if (!(fhv_12 instanceof fax_1)) {
            return;
        }
        fax_1 fax_12 = (fax_1)fhv_12;
        fax_12.setDirection(abi_1.wG((int)fax_12.getDirection()).wI((int)0).dzy);
    }

    public void a(@NotNull bgw_1 bgw_12) {
        this.jxz = bgw_12;
        this.dLK();
        this.ixo = this.jxy.dmc() ? new bnx_1(this.jxy.dLD(), ((bgw_1)this.jxz).dTV()) : null;
        this.u(jxq, jxr, jxs, jxt);
        this.dLL();
    }

    public void hi(boolean bl) {
        this.jxC = bl;
        this.u(jxj, jxk);
        ((bsg_1)aie_0.cfn().bmH()).a((afe)bsn_1.lkE, this.jxC);
    }

    public void hj(boolean bl) {
        this.jxD = bl;
        this.u(jxj, jxk);
        ((bsg_1)aie_0.cfn().bmH()).a((afe)bsn_1.lkF, this.jxD);
    }

    @Override
    protected int deP() {
        return 0;
    }

    @Override
    protected String dbi() {
        return jxw;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        switch (string) {
            case "itemCategoriesList": {
                return this.dLJ();
            }
            case "formattedItemAmount": {
                int n = 0;
                for (bwl bwl2 : this.dLJ()) {
                    n += bwl2.dLF().size();
                }
                return "(" + n + ")";
            }
            case "splitByEquipmentPosition": {
                return this.jxC;
            }
            case "displayOtherHeroesItems": {
                return this.jxD;
            }
            case "selectedEquipmentSlot": {
                return this.jxA;
            }
            case "selectedEquipmentSlotName": {
                return this.jxA != null ? aum_0.cWf().c(this.jxA.dTQ().shc, new Object[0]) : aum_0.cWf().c("equipments", new Object[0]);
            }
            case "selectedEquipmentSlotIcon": {
                if (this.jxA == null) {
                    return null;
                }
                return auc_0.cVq().aZ(this.jxA.dTQ().fVM());
            }
            case "currentEquipmentSheetView": {
                return this.jxz;
            }
            case "actorDescriptorLibrary": {
                if (this.jxy.dmc()) {
                    return this.ixo.getAnimatedElement();
                }
                return ((bgy)this.jxy.dcP()).ddI();
            }
            case "actorAnimationName": {
                if (this.jxy.aXd()) {
                    return "AnimStatique-UI";
                }
                ffV ffV2 = ((bgw_1)this.jxz).dTV().a(this.jxy.dLD().dnP(), ffS.sgQ);
                if (ffV2 != null) {
                    return "AnimStatique03-Boucle-" + btq_1.d(ffV2.fWi());
                }
                return "AnimStatique-UI";
            }
            case "actorScale": {
                short s = ((exP)this.jxy.dcP()).bcN();
                if (s <= 6) {
                    return Float.valueOf(2.5f);
                }
                return Float.valueOf(15.0f / (float)s);
            }
            case "filters": {
                return this.jxB;
            }
        }
        return super.eu(string);
    }

    public void v(Collection<bgl_0> collection) {
        Object object;
        HashMap hashMap = new HashMap();
        this.jxE.forEach((l, bwl2) -> hashMap.put(l, bwl2.dbK()));
        HashMap hashMap2 = new HashMap();
        this.jxF.forEach((by, bwl2) -> hashMap2.put(by, bwl2.dbK()));
        HashMap hashMap3 = new HashMap();
        this.jxG.forEach((by, map2) -> map2.forEach((l, bwl2) -> hashMap3.put(Bu.a(by, l), bwl2.dbK())));
        this.jxE.clear();
        this.jxF.clear();
        this.jxG.clear();
        for (ffS object2 : ffS.sha) {
            this.jxF.put(object2.shb, new bwl(object2));
            this.jxG.put(object2.shb, new LinkedHashMap());
        }
        if (collection.isEmpty()) {
            object = aue_0.cVJ().cVK();
            if (object != null) {
                this.a(((exP)object).Sn(), ((bgt_0)object).getName(), this.A((bgt_0)object));
            }
        } else {
            for (bgl_0 bgl_02 : bwn.w(collection)) {
                bgt_0 bgt_02 = (bgt_0)bgl_02.dcP();
                this.a(bgt_02.Sn(), bgt_02.getName(), this.A(bgt_02));
            }
        }
        if (this.jxy.aXd()) {
            object = this.jxy.dLE();
            this.a(((eJS)object).Sn(), blq_1.j((eJS)object), bwn.l((eJS)object));
        }
        this.jxF.values().removeIf(bwl2 -> bwl2.dLF().isEmpty());
        this.jxE.forEach((l, bwl2) -> bwl2.fm(hashMap.getOrDefault(l, false)));
        this.jxF.forEach((by, bwl2) -> bwl2.fm(hashMap2.getOrDefault(by, false)));
        this.jxG.forEach((by, map2) -> map2.forEach((l, bwl2) -> bwl2.fm(hashMap3.getOrDefault(Bu.a(by, l), false))));
        this.u(jxj, jxk);
    }

    private static Collection<bgl_0> w(Collection<bgl_0> collection) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02 == null) {
            return collection;
        }
        Optional<bgl_0> optional = collection.stream().filter(bgl_02 -> bgl_02.Sn() == bgt_02.Sn()).findFirst();
        if (optional.isEmpty()) {
            return collection;
        }
        ArrayList<bgl_0> arrayList = new ArrayList<bgl_0>(collection);
        if (arrayList.remove(optional.get())) {
            arrayList.add(0, optional.get());
        }
        return arrayList;
    }

    private void a(long l, String string, List<ffV> list) {
        List<ffV> list2 = this.T(list);
        this.U(list2);
        bwl bwl2 = new bwl(string);
        bwl2.S(list2);
        this.jxE.put(l, bwl2);
        this.b(l, string, list2);
    }

    private List<ffV> A(bgt_0 bgt_02) {
        fhe fhe2 = bgt_02.dnP();
        if (fhe2 == null || bgt_02.Sn() != this.jxy.Sn()) {
            return List.of(bgt_02.dno().dRx());
        }
        ArrayList<ffV> arrayList = new ArrayList<ffV>();
        HashSet<Long> hashSet = new HashSet<Long>();
        for (ffV ffV2 : bgt_02.dno().dRx()) {
            if (hashSet.contains(ffV2.LV())) continue;
            arrayList.add(ffV2);
            hashSet.add(ffV2.LV());
        }
        for (ffV ffV3 : fhe2.fXE().values()) {
            if (hashSet.contains(ffV3.LV())) continue;
            arrayList.add(ffV3);
            hashSet.add(ffV3.LV());
        }
        return arrayList;
    }

    private static List<ffV> l(eJS eJS2) {
        ArrayList<ffV> arrayList = new ArrayList<ffV>();
        eJS2.dme().forEach(arrayList::add);
        return arrayList;
    }

    public void b(ffV ffV2, ffS ffS2) {
        if (this.ixo == null) {
            return;
        }
        this.ixo.d(ffV2, ffS2.shb);
        this.ixo.deS();
    }

    public void e(ffS ffS2) {
        if (this.ixo == null) {
            return;
        }
        this.ixo.cB(ffS2.shb);
        this.ixo.deS();
    }

    private void b(long l2, String string, List<ffV> list) {
        for (ffV ffV2 : list) {
            for (ffS ffS2 : ffV2.dOg().dGh().fZq()) {
                this.jxF.get(ffS2.aJr()).T(ffV2);
                this.jxG.get(ffS2.aJr()).computeIfAbsent(l2, l -> new bwl(string)).T(ffV2);
            }
        }
    }

    private List<ffV> T(List<ffV> list) {
        return list.stream().filter(ffV2 -> !(ffV2 instanceof ffu_0)).filter(ffV2 -> ffV2.dOg().fYw()).filter(this::I).collect(Collectors.toList());
    }

    private void U(List<ffV> list) {
        list.sort(this.jxI.dcC().thenComparingInt(ffV::avr).thenComparingLong(ffV::LV));
    }

    private boolean I(ffV ffV2) {
        for (bug_0<ffV> bug_02 : this.jxH) {
            if (bug_02.ah(ffV2)) continue;
            return false;
        }
        return true;
    }

    private Collection<bwl> dLJ() {
        if (this.jxA == null) {
            if (this.jxC) {
                return this.jxF.values();
            }
            return this.jxE.values();
        }
        if (this.jxD) {
            return this.jxG.get(this.jxA.dTQ().aJr()).values();
        }
        bwl bwl2 = this.jxG.get(this.jxA.dTQ().aJr()).get(this.jxy.Sn());
        return bwl2 == null ? Collections.emptyList() : List.of(bwl2);
    }

    public void a(@Nullable bgp_1 bgp_12) {
        if (this.jxA != null) {
            this.jxA.setSelected(false);
            fse_1.gFu().a((aef_2)this.jxA, this.jxA.bxk());
        }
        if (bgp_12 != null && this.jxA == bgp_12) {
            this.jxA = null;
            this.u(jxj, jxk, jxn, jxo, jxp);
            return;
        }
        this.jxA = bgp_12;
        if (this.jxA != null) {
            this.jxA.setSelected(true);
            fse_1.gFu().a((aef_2)this.jxA, this.jxA.bxk());
        }
        this.u(jxj, jxk, jxn, jxo, jxp);
    }

    private void dLK() {
        if (this.jxA != null) {
            this.jxA = this.jxz.g(this.jxA.dTQ());
            this.jxA.setSelected(true);
            this.u(jxn, jxo, jxp);
        }
    }

    private void dLL() {
        this.dLJ().forEach(bwl2 -> bwl2.dLF().forEach(ffV::bYg));
    }

    public void d(bug_0<ffV> bug_02) {
        this.jxH.removeIf(bug_03 -> bug_03.dcz() == bug_02.dcz());
        if (bug_02.isValid()) {
            this.jxH.add(bug_02);
        }
        this.v(cts_1.ePJ().valueCollection());
        fse_1.gFu().a((aef_2)this.jxB, this.jxB.bxk());
        if (bug_02.dcz() == buh_0.jou && bug_02 instanceof bww) {
            ((bsg_1)aie_0.cfn().bmH()).a((afe)bsn_1.lkG, ((bww)bug_02).dMv());
        }
    }

    public <T extends bug_0<ffV>> Optional<T> b(buh_0 buh_02) {
        for (bug_0<ffV> bug_02 : this.jxH) {
            if (bug_02.dcz() != buh_02) continue;
            return Optional.of(bug_02);
        }
        return Optional.empty();
    }

    public void b(fhw_0 fhw_02) {
        this.jxI = fhw_02;
        this.v(cts_1.ePJ().valueCollection());
    }

    public void dLM() {
        this.jxz.dTT();
    }

    public void onDragItem(ffV ffV2) {
        if (ffV2 == null) {
            return;
        }
        @NotNull Object[] objectArray = ffV2.fWi().fZq();
        if (objectArray.length == 0) {
            this.izP = false;
            return;
        }
        this.izP = true;
        for (bgp_1 bgp_12 : this.jxz.dTS().values()) {
            bgp_12.gz(ArrayUtils.contains((Object[])objectArray, (Object)bgp_12.dTQ()));
            fse_1.gFu().a((aef_2)bgp_12, "additionalBorder");
        }
    }

    public void dLN() {
        if (!this.izP) {
            return;
        }
        for (bgp_1 bgp_12 : this.jxz.dTS().values()) {
            bgp_12.gz(false);
            fse_1.gFu().a((aef_2)bgp_12, "additionalBorder");
        }
        this.izP = false;
    }

    @Override
    public String[] bxk() {
        return jxv;
    }

    @NotNull
    @Generated
    public bgq_1 dLO() {
        return this.jxz;
    }
}

