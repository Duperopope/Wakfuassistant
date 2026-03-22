/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.set.hash.TLongHashSet
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.set.hash.TLongHashSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public class bEf
implements fgc {
    public static final String jMl = "itemRefId";
    public static final String jMm = "uId";
    public static final String jMn = "isEnabled";
    public static final String jMo = "isActive";
    public static final String jMp = "quantity";
    public static final String jMq = "quantityText";
    public static final String jMr = "description";
    public static final String jMs = "levelDescription";
    public static final String jMt = "iconUrl";
    public static final String jMu = "baseIconUrl";
    public static final String jMv = "iconBigUrl";
    public static final String jMw = "movable";
    public static final String jMx = "usableInFight";
    public static final String jMy = "backgroundStyle";
    public static final String jMz = "isEquiped";
    public static final String jMA = "isEquippedByCompanion";
    public static final String jMB = "isCurrentlyEquipped";
    public static final String jMC = "isInInventoryOrEquipment";
    public static final String jMD = "isInInventory";
    public static final String jME = "usedInCurrentRecipe";
    public static final String jMF = "deletable";
    public static final String jMG = "usable";
    public static final String jMH = "usableNow";
    public static final String jMI = "clickDescription";
    public static final String jMJ = "isEmptySlot";
    public static final String jMK = "hasPet";
    public static final String jML = "hasXp";
    public static final String jMM = "currentXpPercentage";
    public static final String jMN = "currentXpDescription";
    public static final String jMO = "currentXpLevel";
    public static final String jMP = "isRefItem";
    public static final String jMQ = "isSortable";
    public static final String jMR = "isItemSetMergeable";
    public static final String jMS = "isLevelValid";
    public static final String jMT = "canMergeItemSet";
    public static final String jMU = "hasInvalidActions";
    public static final String jMV = "invalidActionsDescription";
    public static final String jMW = "companionLevel";
    public static final String jMX = "setItems";
    public static final String jMY = "hasMimiSymbic";
    public static final String jMZ = "canFullRegenWith";
    public static final String jNa = "themeItemBorderUrl";
    public static final String jNb = "themeItemBorderStyle";
    public static final String jNc = "themeItemDisabledBorderStyle";
    public static final String jNd = "isValidForCurrentMode";
    public static final String jNe = "recyclingResult";
    public static final String jNf = "identificationNeeded";
    public static final String jNg = "slotsIdentificationNeeded";
    public static final String jNh = "darkened";
    public static final String jNi = "hasShards";
    public static final String jNj = "hasVariableElements";
    public static final String jNk = "hasVariableMasteries";
    public static final String jNl = "isLocked";
    public static final String jNm = "tabbedContainerSize";
    public static final String[] jNn = new String[]{"itemRefId", "isActive", "quantity", "levelDescription", "movable", "usableInFight", "backgroundStyle", "isEquiped", "usedInCurrentRecipe", "deletable", "usable", "usableNow", "clickDescription", "isEmptySlot", "hasXp", "currentXpPercentage", "currentXpDescription", "currentXpLevel", "hasPet", "isRefItem", "canMergeItemSet", "companionLevel", "setItems", "hasMimiSymbic", "isValidForCurrentMode", "recyclingResult", "identificationNeeded", "slotsIdentificationNeeded", "hasVariableElements", "hasShards", "quantityText", "themeItemBorderUrl", "themeItemBorderStyle", "themeItemDisabledBorderStyle", "darkened", "isLevelValid", "hasVariableMasteries", "isEquippedByCompanion"};
    protected static final Logger jNo = Logger.getLogger(bEf.class);
    private final String[] jNp = new String[]{"itemPopupDetail"};
    private final TLongObjectHashMap<ber_0> jNq = new TLongObjectHashMap();
    private final TLongObjectHashMap<ArrayList<String>> jNr = new TLongObjectHashMap();
    private final TLongObjectHashMap<ArrayList<String>> jNs = new TLongObjectHashMap();
    private final TLongObjectHashMap<ArrayList<String>> jNt = new TLongObjectHashMap();
    private final TLongObjectHashMap<ArrayList<String>> jNu = new TLongObjectHashMap();
    private final TLongHashSet jNv = new TLongHashSet();
    private static final int jNw = 330;
    private static final int jNx = 106;
    private static final int jNy = 24;
    private static final int jNz = 35;
    private static final int jNA = 288;
    private static final int jNB = 309;

    public bEf() {
        ewo_0.oBF.a((ewr_02, object) -> {
            if (ewr_02 != ewr_0.oDI) {
                return;
            }
            this.dRV();
        });
    }

    @Override
    public String[] bxk() {
        return jNn;
    }

    @Override
    public Object a(ffV ffV2, String string) {
        bgt_0 bgt_02;
        bgt_0 bgt_03 = bgt_02 = cvu_2.eUm() != null ? cvu_2.eUm() : aue_0.cVJ().cVK();
        if (string.equals(jMP)) {
            return false;
        }
        if (string.equals(jMp)) {
            return ffV2.bfd();
        }
        if (string.equals(jMq)) {
            return bEf.Gp(ffV2.bfd());
        }
        if (string.equals(jMl)) {
            return "(" + ffV2.avr() + ")";
        }
        if (string.equals(jMr)) {
            String string2 = ffV2.dOg().getDescription();
            if (string2 == null || string2.isEmpty()) {
                return null;
            }
            return "\"" + string2 + "\"";
        }
        if (string.equals("level")) {
            return ffV2.cmL();
        }
        if (string.equals(jMs)) {
            boolean bl = bEf.aG(ffV2);
            ahv_2 ahv_22 = new ahv_2();
            if (!bl) {
                ahv_22.ceC().ih("ff4a4a");
            }
            ahv_22.c(aum_0.cWf().c("levelShort.custom", ffV2.cmL()));
            if (!bl) {
                ahv_22.ceD();
            }
            return ahv_22.ceL();
        }
        if (string.equals(jMn)) {
            return true;
        }
        if (string.equals(jMo)) {
            return ffV2.apo();
        }
        if (string.equals(jMy)) {
            return bEf.az(ffV2);
        }
        if (string.equals(jMt)) {
            return this.ax(ffV2);
        }
        if (string.equals(jMu)) {
            return this.ay(ffV2);
        }
        if (string.equals(jMv)) {
            Object t = fcI.ag(bgt_02.Xi(), ffV2.LV());
            if (t != null) {
                return auc_0.cVq().zz(((exP)t).aWO() == 1 ? ffV2.cpf() : ffV2.aVt());
            }
            return auc_0.cVq().zz(bgt_02.aWO() == 1 ? ffV2.cpf() : ffV2.aVt());
        }
        if (string.equals(jMw)) {
            return this.an(ffV2) && !bEf.aq(ffV2) && !bEf.ap(ffV2) && !((bgv_2)ffV2.dOg()).dUs() && !cwl_1.bL(ffV2);
        }
        if (string.equals(jMx)) {
            return ffV2.beB();
        }
        if (string.equals(jMD)) {
            return fcI.ac(bgt_02.Xi(), ffV2.LV()) != null;
        }
        if (string.equals(jMz)) {
            return fcI.af(bgt_02.Xi(), ffV2.LV()) != null;
        }
        if (string.equals(jMA)) {
            return bEf.a(bgt_02, ffV2);
        }
        if (string.equals(jMB)) {
            fhk fhk2 = bgt_02.dmL();
            if (fhk2 == null) {
                return false;
            }
            for (ffS ffS2 : ffV2.dOg().dGh().fZq()) {
                Long l = fhk2.t(ffS2);
                if (l == null || l.longValue() != ffV2.LV()) continue;
                return true;
            }
            return bEf.a(bgt_02, ffV2);
        }
        if (string.equals(jMC)) {
            return fcI.ag(bgt_02.Xi(), ffV2.LV()) != null || bEf.a(bgt_02, ffV2);
        }
        if (string.equals(jME)) {
            return ((bgv_2)ffV2.dOg()).dUs();
        }
        if (string.equals(jMF)) {
            ang_2 ang_22 = ffV2.dOg().a(ffj_0.sgj);
            bgt_0 bgt_04 = (bgt_0)fcI.ac(bgt_02.Xi(), ffV2.LV());
            if (bgt_04 == null) {
                return false;
            }
            return !bEf.aq(ffV2) && !bEf.ap(ffV2) && !((bgv_2)ffV2.dOg()).dUs() && (ang_22 == null || ang_22.b(bgt_04, bgt_04.aZw(), ffV2, bgt_04.fgg()));
        }
        if (string.equals(jMG)) {
            bfc_1 bfc_12 = (bfc_1)ffV2.dOg().fUZ();
            boolean bl = bfc_12 != null && bfc_12.bDA();
            return bfc_12 == null && ffV2.fAu() || bl;
        }
        if (string.equals(jMH)) {
            return bEf.aB(ffV2);
        }
        if (string.equals("boundDescription")) {
            if (!ffV2.adZ()) {
                return null;
            }
            if (ffV2.fWm()) {
                return aum_0.cWf().c(ffV2.fUY().fXu().fXx() ? "item.bound.character" : "item.bound", new Object[0]);
            }
            ahv_2 ahv_23 = new ahv_2().ceC().e(awx_2.dnJ).c(aum_0.cWf().c(ffV2.fUY().fXu().clY(), new Object[0]));
            return ahv_23.ceL();
        }
        if (string.equals(jMJ)) {
            return false;
        }
        if (string.equals(jMI)) {
            String string3;
            boolean bl;
            ahv_2 ahv_24 = new ahv_2();
            if (aue_0.cVJ().c(cwe_1.eVh())) {
                return aum_0.cWf().c("clickToSell", new Object[0]);
            }
            Boolean bl2 = (Boolean)this.a(ffV2, jMG);
            if (bl2.booleanValue()) {
                bl = bEf.aB(ffV2);
                if (!bl) {
                    ahv_24.ceC().ih("ff0000");
                }
                ahv_24.c(aum_0.cWf().c("leftClickToUse", new Object[0]));
                if (!bl) {
                    ahv_24.ceD();
                }
            }
            if (ffV2.dOg().fbT()) {
                if (bl2.booleanValue()) {
                    ahv_24.ceH();
                }
                if (!(bl = bEf.aD(ffV2))) {
                    ahv_24.ceC().ih("ff0000");
                }
                ahv_24.c(aum_0.cWf().c("leftClickToEquip", new Object[0]));
                if (!bl) {
                    ahv_24.ceD();
                }
            }
            if (ffV2.adO()) {
                ahv_24.ceH();
                ahv_24.c(aum_0.cWf().c("rightClickToManagePet", new Object[0]));
                if (ffV2.ead().geQ()) {
                    ahv_24.ceH();
                    ahv_24.ceC().ih("ff0000");
                    ahv_24.c(aum_0.cWf().c("pet.sleeping", new Object[0]));
                    ahv_24.ceD();
                }
            }
            return !(string3 = ahv_24.ceL()).isEmpty() ? string3 : null;
        }
        if (string.equals("effect") || string.equals("shortEffectDetails")) {
            return this.at(ffV2);
        }
        if (string.equals("criticalEffectDetails")) {
            return this.au(ffV2);
        }
        if (string.equals("allCharacteristics")) {
            ArrayList<String> arrayList = new ArrayList<String>();
            ArrayList<String> arrayList2 = this.aw(ffV2);
            if (!arrayList2.isEmpty()) {
                arrayList.addAll(arrayList2);
            }
            return arrayList.isEmpty() ? null : arrayList;
        }
        if (string.equals("effectAndCaracteristic")) {
            Object object;
            Object object2;
            ArrayList<Object> arrayList = new ArrayList<Object>();
            ArrayList<String> arrayList3 = this.at(ffV2);
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                arrayList.add(aum_0.cWf().c("effectOnUse", new Object[0]));
                object2 = arrayList3.iterator();
                while (object2.hasNext()) {
                    object = (String)object2.next();
                    arrayList.add(object);
                }
            }
            if (!((ArrayList)(object2 = this.aw(ffV2))).isEmpty()) {
                arrayList.add(aum_0.cWf().c("effectOnEquip", new Object[0]));
                object = ((ArrayList)object2).iterator();
                while (object.hasNext()) {
                    String string4 = (String)object.next();
                    arrayList.add(string4);
                }
            }
            return !arrayList.isEmpty() ? arrayList : null;
        }
        if (string.equals("hasCaracteristic")) {
            ArrayList<String> arrayList = this.av(ffV2);
            return arrayList != null && !arrayList.isEmpty();
        }
        if (string.equals("caracteristic")) {
            ArrayList<String> arrayList = new ArrayList<String>();
            ArrayList<String> arrayList4 = this.av(ffV2);
            if (!arrayList4.isEmpty()) {
                for (String string5 : arrayList4) {
                    arrayList.add(string5);
                }
            }
            return arrayList.isEmpty() ? null : arrayList;
        }
        if (string.equals(jML)) {
            return ffV2.pe();
        }
        if (string.equals(jMM)) {
            if (!ffV2.pe()) {
                return Float.valueOf(0.0f);
            }
            return Float.valueOf(ffV2.fVV().fZG());
        }
        if (string.equals(jMO)) {
            if (!ffV2.pe()) {
                return (short)0;
            }
            return ffV2.fVV().cmL();
        }
        if (string.equals(jMN)) {
            if (!ffV2.pe()) {
                return null;
            }
            fij_0 fij_02 = ffV2.fVV();
            return aum_0.cWf().c("xpRatio", fij_02.dnH().cT(fij_02.pf()), fij_02.dnH().N(fij_02.cmL()));
        }
        if (string.equals(jMK)) {
            return ffV2.adO();
        }
        if (string.equals(jMP)) {
            return false;
        }
        if (string.equals(jMQ)) {
            return bgt_02.dno().td(ffV2.LV()) != null;
        }
        if (string.equals(jMR)) {
            short s = ffV2.dOg().dpq();
            bEq bEq2 = bEr.dSi().bW(s);
            return bEq2 != null && fgn_0.d(bEq2);
        }
        if (string.equals(jMT)) {
            short s = ffV2.dOg().dpq();
            bEq bEq3 = bEr.dSi().bW(s);
            if (bEq3 == null) {
                return false;
            }
            if (!fgn_0.d(bEq3)) {
                return false;
            }
            return ewo_0.oBF.k(ewr_0.oDJ) && fgn_0.a(bgt_02, bEq3);
        }
        if (string.equals("shards")) {
            return this.as(ffV2);
        }
        if (string.equals(jNi)) {
            return ffV2.dXg();
        }
        if (string.equals(jMU)) {
            return this.ao(ffV2);
        }
        if (string.equals(jMV)) {
            return this.ar(ffV2);
        }
        if (string.equals(jMX)) {
            fhz fhz2 = ffV2.fWy();
            if (fhz2 == null) {
                return null;
            }
            return fhz2.fba();
        }
        if (string.equals(jMW)) {
            fgX fgX2 = ffV2.fWw();
            return fgX2 == null ? null : aum_0.cWf().c(jMW, mz_1.aVX.cR(fgX2.pf()));
        }
        if (string.equals(jMY)) {
            return ffV2.fUX() != 0;
        }
        if (string.equals(jMZ)) {
            Object t = fcI.ac(bgt_02.Xi(), ffV2.LV());
            if (t == null) {
                return false;
            }
            ang_2 ang_23 = ffV2.dOg().a(ffj_0.sgc);
            boolean bl = ang_23 != null && ang_23.b(t, t, ffV2, ((exP)t).bdV());
            boolean bl3 = t.dlK() == null || t.dlK().dGp() == etw_0.rqT;
            boolean bl4 = ffV2.cmL() <= ((exP)t).cmL() && bl;
            return bl3 && bl4;
        }
        if (string.equals(jNa)) {
            return ffV2.dwg().aKJ();
        }
        if (string.equals(jNb)) {
            return ffV2.dwg().fWN();
        }
        if (string.equals(jNc)) {
            return ffV2.dwg().fWQ();
        }
        if (string.equals(jNj)) {
            return ffV2.dOg().fYA();
        }
        if (string.equals(jNk)) {
            return ffV2.dOg().fYB();
        }
        if (string.equals(jNd)) {
            bga_2 bga_22 = cvo_2.eUK().eUL();
            if (bga_22 == null) {
                return false;
            }
            return bga_22.aX(ffV2);
        }
        if (string.equals(jMS)) {
            return bEf.aG(ffV2);
        }
        if (string.equals(jNe)) {
            bgt_0 bgt_05 = (bgt_0)fcI.ah(aue_0.cVJ().cVO().xl(), ffV2.LV());
            if (bgt_05 == null) {
                return null;
            }
            fhA fhA2 = fhB.f(ffV2, bgt_05);
            ahv_2 ahv_25 = new ahv_2();
            if (fhA2 == fhA.soW) {
                return ahv_25.ih(awx_2.dnI.bQk()).ceu().c(aum_0.cWf().c("recycling.error.item.not.recyclable", new Object[0])).cev().ceL();
            }
            boolean bl = ffV2.fWs();
            Optional<Bu<Integer, Float>> optional = fhB.cP(ffV2);
            optional.ifPresent(bu -> {
                if (bl) {
                    ahv_25.ceu();
                }
                ahv_25.ei(GC.a(((Float)bu.aHI()).floatValue(), 2));
                if (bl) {
                    ahv_25.cev();
                }
                ahv_25.c(" x ");
                ahv_25.a(auc_0.cVq().a((fjm)bgt_05, (Integer)bu.getFirst()), 24, 24, null);
                ahv_25.c(" ").c(aum_0.cWf().a(15, (long)((Integer)bu.getFirst()).intValue(), new Object[0]));
            });
            if (fhA2 == fhA.soX) {
                ahv_25.ceH().ih(awx_2.dnI.bQk()).ceu().c(aum_0.cWf().c("recycling.error.item.slotted", new Object[0])).cev().ceD();
            }
            if (bl) {
                ahv_25.ceH().ih(awx_2.dnL.bQk()).ceu().c(aum_0.cWf().c("recycling.bonus.item.not.identified", new Object[0])).cev().ceD();
            }
            return ahv_25.ceL();
        }
        if (string.equals(jNf)) {
            return ffV2.fWs() || ffV2.fWt();
        }
        if (string.equals(jNg)) {
            return ffV2.fWs();
        }
        if (jNh.equals(string)) {
            return this.jNv.contains(ffV2.LV());
        }
        if ("isLearnt".equals(string)) {
            return bEf.am(ffV2).orElse(false);
        }
        if (string.equals(jNl)) {
            return bdq_0.dRC().ab(ffV2);
        }
        if ("marketAveragePrice".equals(string)) {
            Long l = bgn_1.dUk().bc(ffV2);
            return beg_1.z(l);
        }
        if (string.equals(jNm)) {
            ArrayList arrayList = (ArrayList)ffV2.eu("allCharacteristics");
            int n = 0;
            if (arrayList != null) {
                awx_1 awx_12 = fyw_0.gqw().gqB().uG("fontDefault14");
                for (String string6 : arrayList) {
                    fgh_2 fgh_22 = new fgh_2();
                    fgh_22.tZ(string6);
                    int n2 = 0;
                    for (fgk_2 fgk_22 : fgh_22) {
                        switch (fgk_22.gzE()) {
                            case dSC: {
                                fgm_1 fgm_12 = (fgm_1)fgk_22;
                                n2 += awx_12.gj(fgm_12.getText());
                                break;
                            }
                            case dSD: {
                                fgl_2 fgl_22 = (fgl_2)fgk_22;
                                n2 += fgl_22.getWidth();
                            }
                        }
                    }
                    n += n2 / 288 + 1;
                }
            }
            int n3 = 35 + n * 24;
            n3 = GC.a(n3, 106, 330);
            return "309," + n3;
        }
        if (jMm.equals(string)) {
            return ffV2.LV();
        }
        return ((bef_0)((Object)ffV2.dOg())).eu(string);
    }

    @NotNull
    public static String Gp(int n) {
        return "\u00d7" + aum_0.cWf().cQ(n);
    }

    public static boolean a(bgt_0 bgt_02, ffV ffV2) {
        return bej_1.b(bgt_02, ffV2) != null;
    }

    public static boolean al(ffV ffV2) {
        long l = aue_0.cVJ().cVO().xl();
        bgt_0 bgt_02 = Optional.ofNullable(fcI.ac(l, ffV2.LV())).orElse(bvz_0.dLl());
        if (bgt_02 == null) {
            return false;
        }
        fhc_0 fhc_02 = ffV2.dOg();
        ang_2 ang_22 = fhc_02.a(ffj_0.sgc);
        if (!fhc_02.fAu()) {
            return false;
        }
        return ang_22 == null || ang_22.b(bgt_02, bgt_02.aZw(), fhc_02, bgt_02.fgg());
    }

    public static Optional<Boolean> am(ffV ffV2) {
        Optional<bgf_1> optional = beg_1.t((bgv_2)ffV2.dOg());
        if (optional.isEmpty()) {
            return Optional.empty();
        }
        bgf_1 bgf_12 = optional.get();
        bgt_0 bgt_02 = (bgt_0)fcI.ac(aue_0.cVJ().cVO().xl(), ffV2.LV());
        if (bgt_02 == null) {
            bgt_0 bgt_03 = bvz_0.dLl();
            return Optional.of(bgf_12.c(bgt_03, ffV2));
        }
        return Optional.of(bgf_12.c(bgt_02, ffV2));
    }

    private boolean an(ffV ffV2) {
        if (!aue_0.cVJ().c(cww_1.nSJ)) {
            return true;
        }
        if (!fji.de(ffV2)) {
            return false;
        }
        ffV ffV3 = cww_1.nSJ.eVV().dXJ();
        ffV ffV4 = cww_1.nSJ.eVV().dXK();
        return !ffV2.equals(ffV3) && !ffV2.equals(ffV4);
    }

    private boolean ao(ffV ffV2) {
        ffj_0[] ffj_0Array;
        bgt_0 bgt_02 = cvo_2.daL();
        bgt_0 bgt_03 = (bgt_0)fcI.ag(bgt_02.Xi(), ffV2.LV());
        if (bgt_03 == null) {
            bgt_03 = aue_0.cVJ().cVK();
        }
        for (ffj_0 ffj_02 : ffj_0Array = new ffj_0[]{ffj_0.sgj, ffj_0.sgf, ffj_0.sgg}) {
            ang_2 ang_22 = ffV2.dOg().a(ffj_02);
            if (ang_22 == null || ang_22.b(bgt_03, null, null, bgt_03.dmQ())) continue;
            return true;
        }
        return false;
    }

    public static boolean ap(ffV ffV2) {
        if (!aue_0.cVJ().c(cvr_1.eTM())) {
            return false;
        }
        fhc_0 fhc_02 = ffV2.dOg();
        bgt_0 bgt_02 = (bgt_0)fcI.ag(aue_0.cVJ().cVK().Xi(), ffV2.LV());
        if (bgt_02 == null) {
            return false;
        }
        if (fhc_02.a(ffj_0.sgf) != null && !fhc_02.a(ffj_0.sgf).b(bgt_02, -1, fhc_02, bgt_02.fgg())) {
            return true;
        }
        boolean bl = false;
        for (short s : exb_0.oTk) {
            if (!ffV2.fWi().p(bew_1.dSk().Gy(s))) continue;
            bl = true;
            break;
        }
        return !bl || cvr_1.eTM().or(ffV2.LV());
    }

    public static boolean aq(ffV ffV2) {
        return aue_0.cVJ().c(cxu_2.eXE()) && (!cxu_2.eXE().bW(ffV2) || cxu_2.eXE().or(ffV2.LV()));
    }

    private String ar(ffV ffV2) {
        bgt_0 bgt_02 = cvo_2.daL();
        bgt_0 bgt_03 = (bgt_0)fcI.ag(bgt_02.Xi(), ffV2.LV());
        if (bgt_03 == null) {
            return "";
        }
        ffj_0[] ffj_0Array = new ffj_0[]{ffj_0.sgj, ffj_0.sgf, ffj_0.sgg};
        ahv_2 ahv_22 = new ahv_2();
        boolean bl = true;
        for (ffj_0 ffj_02 : ffj_0Array) {
            ang_2 ang_22 = ffV2.dOg().a(ffj_02);
            if (ang_22 != null && !ang_22.b(bgt_03, null, null, bgt_03.dmQ())) {
                bl = this.a(ahv_22, bl, ffj_02);
                continue;
            }
            if (!ffV2.fWm() || ffj_02 != ffj_0.sgf) continue;
            bl = this.a(ahv_22, bl, ffj_02);
        }
        return ahv_22.ceL();
    }

    private boolean a(ahv_2 ahv_22, boolean bl, ffj_0 ffj_02) {
        if (bl) {
            bl = false;
        } else {
            ahv_22.ceH();
        }
        ahv_22.c(aum_0.cWf().c("actionsOnItem.invalid." + ffj_02.name(), new Object[0]));
        return bl;
    }

    public ber_0 as(ffV ffV2) {
        ber_0 ber_02 = (ber_0)this.jNq.get(ffV2.LV());
        if (ber_02 == null) {
            ber_0 ber_03 = new ber_0(ffV2);
            if (ffV2.LV() != 0L) {
                this.jNq.put(ffV2.LV(), (Object)ber_03);
            }
            return ber_03;
        }
        return ber_02;
    }

    private static ArrayList<String> a(ffV ffV2, TLongObjectHashMap<ArrayList<String>> tLongObjectHashMap, eLN eLN2) {
        ArrayList<String> arrayList = (ArrayList<String>)tLongObjectHashMap.get(ffV2.LV());
        if (arrayList == null || ffV2.LV() == 0L) {
            arrayList = beg_1.a(eLN2, ffV2.dOg(), ffV2);
            tLongObjectHashMap.put(ffV2.LV(), arrayList);
        }
        return arrayList.isEmpty() ? null : arrayList;
    }

    private ArrayList<String> at(ffV ffV2) {
        return bEf.a(ffV2, this.jNt, eLN.qJo);
    }

    private ArrayList<String> au(ffV ffV2) {
        return bEf.a(ffV2, this.jNu, eLN.qJp);
    }

    private ArrayList<String> av(ffV ffV2) {
        ArrayList<String> arrayList = (ArrayList<String>)this.jNs.get(ffV2.LV());
        if (arrayList == null || ffV2 instanceof ffT || ffV2.LV() == 0L) {
            arrayList = beg_1.b(ffV2.dOg(), ffV2);
            this.jNs.put(ffV2.LV(), arrayList);
        }
        return arrayList;
    }

    private ArrayList<String> aw(ffV ffV2) {
        ArrayList<String> arrayList = (ArrayList<String>)this.jNr.get(ffV2.LV());
        if (arrayList == null || ffV2.LV() == 0L) {
            arrayList = beg_1.a(ffV2.dOg(), ffV2);
            this.jNr.put(ffV2.LV(), arrayList);
        }
        return arrayList;
    }

    @Override
    public String ax(ffV ffV2) {
        bgt_0 bgt_02 = cvo_2.daL();
        bgt_0 bgt_03 = (bgt_0)fcI.ag(bgt_02.Xi(), ffV2.LV());
        bgt_0 bgt_04 = bgt_03 != null ? bgt_03 : aue_0.cVJ().cVK();
        return auc_0.cVq().a((fjm)bgt_04, ffV2);
    }

    public String ay(ffV ffV2) {
        bgt_0 bgt_02 = cvo_2.daL();
        bgt_0 bgt_03 = (bgt_0)fcI.ag(bgt_02.Xi(), ffV2.LV());
        bgt_0 bgt_04 = bgt_03 != null ? bgt_03 : aue_0.cVJ().cVK();
        return auc_0.cVq().a((fjm)bgt_04, ffV2);
    }

    public static String az(ffV ffV2) {
        return bEf.b(ffV2, "inventoryDialog");
    }

    public static String b(ffV ffV2, String string) {
        ffV ffV3 = (ffV)fse_1.gFu().aW("itemDetail", string);
        if (ffV3 != null && ffV2.LV() == 0L && ffV3.LV() == 0L ? ffV2.avr() == ffV3.avr() : ffV3 != null && ffV2.LV() == ffV3.LV()) {
            return beh_1.jNF.getStyle();
        }
        if (ffV2.adO() && ffV2.ead().geQ()) {
            return beh_1.jNE.getStyle();
        }
        if (!bEf.aA(ffV2)) {
            return beh_1.jNG.getStyle();
        }
        return beh_1.jNH.getStyle();
    }

    public static boolean aA(ffV ffV2) {
        if (ffV2.dOg().dGh().fZq().length > 0) {
            return bEf.aD(ffV2);
        }
        return !ffV2.isUsable() || bEf.aB(ffV2);
    }

    public static boolean aB(ffV ffV2) {
        bkb_0 bkb_02;
        bgt_0 bgt_02 = (bgt_0)fcI.ac(aue_0.cVJ().cVK().Xi(), ffV2.LV());
        if (bgt_02 == null) {
            return false;
        }
        bgt_0 bgt_03 = bvz_0.dLl();
        if (bgt_03 == null || bgt_03.doP()) {
            return false;
        }
        fhc_0 fhc_02 = ffV2.dOg();
        bfc_1 bfc_12 = (bfc_1)fhc_02.fUZ();
        if (bfc_12 != null) {
            if (!bfc_12.bDA()) {
                return false;
            }
            if (!bfc_12.aR(ffV2)) {
                return false;
            }
            if (bfc_12.dTl() == fgM.skr && (bgt_03.dpM() || bgt_03.dkC() != fpu_0.sRd)) {
                return false;
            }
        }
        if ((bkb_02 = bgt_03.dps()) != null) {
            if (bkb_02.dsm() == 19) {
                return !cwl_1.bK(ffV2);
            }
            if (bfc_12 == null || !bfc_12.fXr()) {
                return false;
            }
        }
        if (ffV2.fWi().aIi() == 218 || ffV2.fWi().aIi() == 399) {
            return true;
        }
        if (bgt_02.dno().x(ffV2) == null) {
            return false;
        }
        bsj_0 bsj_02 = bgt_02.dkZ();
        if (bsj_02 != null) {
            if (!bEf.a(ffV2.dOg(), bgt_02, bsj_02, ffV2.LV())) {
                return false;
            }
        } else {
            ang_2 ang_22 = fhc_02.a(ffj_0.sgc);
            if (!ffV2.fAu() || ang_22 != null && !ang_22.b(bgt_02, bgt_02.aZw(), ffV2, bgt_02.fgg())) {
                return false;
            }
        }
        if (bfc_12 instanceof bfs_1) {
            return true;
        }
        if (bfc_12 instanceof bfm_0) {
            return true;
        }
        if (bfc_12 instanceof bfp_1) {
            int n;
            short s = ((bfp_1)bfc_12).cqz();
            eki_0 eki_02 = bgt_02.dpK();
            return eki_02.tX(n = ((bfp_1)bfc_12).cms()) && eki_02.PG(n) >= s;
        }
        return !bEf.aC(ffV2) || ffV2.cmL() <= bgt_02.cmL();
    }

    public static boolean a(fhc_0 fhc_02, bgy bgy2, bsj_0 bsj_02, long l) {
        TA tA = bsj_02.bbh().baf();
        ang_2 ang_22 = fhc_02.a(bsj_02.dGp() == etw_0.rqT ? ffj_0.sgc : ffj_0.sgd);
        return !(tA.bhE() && tA.bhF() != bgy2.Sn() || fhc_02.fbT() && bgy2.dnP().B(l) == null || !fhc_02.beB() && bsj_02.dGp() != etw_0.rqT || ang_22 != null && !ang_22.b(bgy2, bgy2.aZw(), fhc_02, bgy2.fgg()));
    }

    private static boolean aC(ffV ffV2) {
        fhc_0 fhc_02 = ffV2.dOg();
        if (fhc_02 == null) {
            return true;
        }
        return !fhc_02.c(fgg_0.sij);
    }

    private static boolean aD(ffV ffV2) {
        ffS[] ffSArray;
        Object object;
        assert (ffV2.dOg().fbT()) : "On appelle isEquipmentEquipable avec un item qui n'est pas un equipment : " + ffV2.getName();
        if (ffV2.fWt()) {
            return false;
        }
        bgt_0 bgt_02 = cvu_2.eUm();
        if (bgt_02 == null) {
            object = cvu_2.eUn();
            bhx_0 bhx_02 = cvu_2.eUo();
            if (object != null && bhx_02 != null) {
                ffS[] ffSArray2 = ffV2.fWi().fZq();
                bgt_0 bgt_03 = aue_0.cVJ().cVK();
                if (bgt_03 == null) {
                    return false;
                }
                for (ffS ffS2 : ffSArray2) {
                    if (!eJW.a((exP)bgt_03, (exP)bhx_02, ffV2, ffS2.shb, true).isEmpty()) continue;
                    return true;
                }
                return false;
            }
            bgt_02 = aue_0.cVJ().cVK();
        }
        object = bgt_02.dmL();
        boolean bl = ((fhk)object).bt(ffV2);
        for (ffS ffS3 : ffSArray = ffV2.fWi().fZq()) {
            if (!fgt.a((exP)bgt_02, (fhk)object, ffV2, ffS3, bgt_02.bdV(), !bl)) continue;
            return true;
        }
        return false;
    }

    private static exP aE(ffV ffV2) {
        bgt_0 bgt_02 = (bgt_0)fcI.ag(aue_0.cVJ().cVK().Xi(), ffV2.LV());
        if (bgt_02 != null && bgt_02.jC(ffV2.LV()) != null) {
            return bgt_02;
        }
        return bEf.aF(ffV2);
    }

    private static exP aF(ffV ffV2) {
        long l = aue_0.cVJ().cVO().xl();
        List<eJS> list = eJN.qAF.pP(l);
        bgy bgy2 = null;
        for (eJS eJS2 : list) {
            if (!eJS2.dme().f(ffV2)) continue;
            bgl_0 bgl_02 = cts_1.MC(eJS2.aWP());
            if (bgl_02 == null) {
                bgy2 = cts_1.n(eJS2);
                break;
            }
            bgy2 = bgl_02.dcP() != null ? bgl_02.dcP() : cts_1.n(eJS2);
            break;
        }
        return bgy2;
    }

    private static boolean aG(ffV ffV2) {
        Object object;
        bgt_0 bgt_02 = cvu_2.eUm();
        if (bgt_02 == null) {
            object = cvu_2.eUn();
            if (object != null) {
                return eJW.b((eJS)object, ffV2);
            }
            bgt_02 = aue_0.cVJ().cVK();
        }
        if (((fhc_0)(object = ffV2.dOg())).dGh().fZq().length > 0) {
            ffS[] ffSArray;
            fhk fhk2 = bgt_02.dmL();
            for (ffS ffS2 : ffSArray = ffV2.fWi().fZq()) {
                if (!fgt.a((exP)bgt_02, fhk2, ffV2, ffS2)) continue;
                return true;
            }
            return false;
        }
        if (((fhc_0)object).fUZ() instanceof bfp_1) {
            short s = ((bfp_1)((fhc_0)object).fUZ()).cqz();
            eki_0 eki_02 = bgt_02.dpK();
            return eki_02.PG(((bfp_1)((fhc_0)object).fUZ()).cms()) >= s;
        }
        return ((fhc_0)object).cmL() <= bgt_02.cmL();
    }

    @Override
    public String aH(ffV ffV2) {
        fhc_0 fhc_02 = ffV2.dOg();
        return fhc_02 != null ? fhc_02.getName() : "<undefined name>";
    }

    @Override
    public String aI(ffV ffV2) {
        fhc_0 fhc_02 = ffV2.dOg();
        return fhc_02 != null ? fhc_02.dah() : "<undefined name>";
    }

    @Override
    public String aJ(ffV ffV2) {
        fhc_0 fhc_02 = ffV2.dOg();
        return fhc_02 != null ? fhc_02.getDescription() : "<undefined desc>";
    }

    @Override
    public void aK(ffV ffV2) {
        ArrayList<fsf_1> arrayList = new ArrayList<fsf_1>();
        for (String string : this.jNp) {
            fsf_1 fsf_12 = fse_1.gFu().getProperty(string);
            if (fsf_12 == null || fsf_12.getValue() != ffV2 || fsf_12.gFF()) continue;
            arrayList.add(fsf_12);
        }
        int n = arrayList.size();
        for (int i = 0; i < n; ++i) {
            fse_1.gFu().c((fsf_1)arrayList.get(i));
        }
    }

    private void dRV() {
        this.jNr.clear();
        this.jNq.clear();
        this.jNt.clear();
        this.jNu.clear();
        this.jNs.clear();
    }

    @Override
    public void aL(ffV ffV2) {
        this.jNv.remove(ffV2.LV());
        this.jNq.remove(ffV2.LV());
        this.jNs.remove(ffV2.LV());
        this.jNr.remove(ffV2.LV());
        this.jNt.remove(ffV2.LV());
        this.jNu.remove(ffV2.LV());
        bef_0 bef_02 = (bef_0)((Object)ffV2.dOg());
        if (bef_02 != null) {
            bef_02.dSz().bYg();
        }
        try {
            fse_1.gFu().a((aef_2)ffV2, "isEquipable", "requirement", "effect", "caracteristic", jMz, jMB, jMD, "effectAndCaracteristic", "shards");
        }
        catch (Exception exception) {
            jNo.error((Object)"Exception levee", (Throwable)exception);
        }
    }

    @Override
    public void c(ffV ffV2, boolean bl) {
        if (bl) {
            this.jNv.add(ffV2.LV());
        } else {
            this.jNv.remove(ffV2.LV());
        }
    }

    @Override
    public void dRW() {
        this.jNv.clear();
    }
}

