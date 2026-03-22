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
    private final TLongObjectHashMap<bER> jNq = new TLongObjectHashMap();
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
        ewo.oBF.a((ewr2, object) -> {
            if (ewr2 != ewr.oDI) {
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
        bgT bgT2;
        bgT bgT3 = bgT2 = cVu.eUm() != null ? cVu.eUm() : aUE.cVJ().cVK();
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
            aHV aHV2 = new aHV();
            if (!bl) {
                aHV2.ceC().ih("ff4a4a");
            }
            aHV2.c(aUM.cWf().c("levelShort.custom", ffV2.cmL()));
            if (!bl) {
                aHV2.ceD();
            }
            return aHV2.ceL();
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
            Object t = fcI.ag(bgT2.Xi(), ffV2.LV());
            if (t != null) {
                return aUC.cVq().zz(((exP)t).aWO() == 1 ? ffV2.cpf() : ffV2.aVt());
            }
            return aUC.cVq().zz(bgT2.aWO() == 1 ? ffV2.cpf() : ffV2.aVt());
        }
        if (string.equals(jMw)) {
            return this.an(ffV2) && !bEf.aq(ffV2) && !bEf.ap(ffV2) && !((bGV)ffV2.dOg()).dUs() && !cWl.bL(ffV2);
        }
        if (string.equals(jMx)) {
            return ffV2.beB();
        }
        if (string.equals(jMD)) {
            return fcI.ac(bgT2.Xi(), ffV2.LV()) != null;
        }
        if (string.equals(jMz)) {
            return fcI.af(bgT2.Xi(), ffV2.LV()) != null;
        }
        if (string.equals(jMA)) {
            return bEf.a(bgT2, ffV2);
        }
        if (string.equals(jMB)) {
            fhk fhk2 = bgT2.dmL();
            if (fhk2 == null) {
                return false;
            }
            for (ffS ffS2 : ffV2.dOg().dGh().fZq()) {
                Long l = fhk2.t(ffS2);
                if (l == null || l.longValue() != ffV2.LV()) continue;
                return true;
            }
            return bEf.a(bgT2, ffV2);
        }
        if (string.equals(jMC)) {
            return fcI.ag(bgT2.Xi(), ffV2.LV()) != null || bEf.a(bgT2, ffV2);
        }
        if (string.equals(jME)) {
            return ((bGV)ffV2.dOg()).dUs();
        }
        if (string.equals(jMF)) {
            ang ang2 = ffV2.dOg().a(ffJ.sgj);
            bgT bgT4 = (bgT)fcI.ac(bgT2.Xi(), ffV2.LV());
            if (bgT4 == null) {
                return false;
            }
            return !bEf.aq(ffV2) && !bEf.ap(ffV2) && !((bGV)ffV2.dOg()).dUs() && (ang2 == null || ang2.b(bgT4, bgT4.aZw(), ffV2, bgT4.fgg()));
        }
        if (string.equals(jMG)) {
            bFc bFc2 = (bFc)ffV2.dOg().fUZ();
            boolean bl = bFc2 != null && bFc2.bDA();
            return bFc2 == null && ffV2.fAu() || bl;
        }
        if (string.equals(jMH)) {
            return bEf.aB(ffV2);
        }
        if (string.equals("boundDescription")) {
            if (!ffV2.adZ()) {
                return null;
            }
            if (ffV2.fWm()) {
                return aUM.cWf().c(ffV2.fUY().fXu().fXx() ? "item.bound.character" : "item.bound", new Object[0]);
            }
            aHV aHV3 = new aHV().ceC().e(awX.dnJ).c(aUM.cWf().c(ffV2.fUY().fXu().clY(), new Object[0]));
            return aHV3.ceL();
        }
        if (string.equals(jMJ)) {
            return false;
        }
        if (string.equals(jMI)) {
            String string3;
            boolean bl;
            aHV aHV4 = new aHV();
            if (aUE.cVJ().c(cWe.eVh())) {
                return aUM.cWf().c("clickToSell", new Object[0]);
            }
            Boolean bl2 = (Boolean)this.a(ffV2, jMG);
            if (bl2.booleanValue()) {
                bl = bEf.aB(ffV2);
                if (!bl) {
                    aHV4.ceC().ih("ff0000");
                }
                aHV4.c(aUM.cWf().c("leftClickToUse", new Object[0]));
                if (!bl) {
                    aHV4.ceD();
                }
            }
            if (ffV2.dOg().fbT()) {
                if (bl2.booleanValue()) {
                    aHV4.ceH();
                }
                if (!(bl = bEf.aD(ffV2))) {
                    aHV4.ceC().ih("ff0000");
                }
                aHV4.c(aUM.cWf().c("leftClickToEquip", new Object[0]));
                if (!bl) {
                    aHV4.ceD();
                }
            }
            if (ffV2.adO()) {
                aHV4.ceH();
                aHV4.c(aUM.cWf().c("rightClickToManagePet", new Object[0]));
                if (ffV2.ead().geQ()) {
                    aHV4.ceH();
                    aHV4.ceC().ih("ff0000");
                    aHV4.c(aUM.cWf().c("pet.sleeping", new Object[0]));
                    aHV4.ceD();
                }
            }
            return !(string3 = aHV4.ceL()).isEmpty() ? string3 : null;
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
                arrayList.add(aUM.cWf().c("effectOnUse", new Object[0]));
                object2 = arrayList3.iterator();
                while (object2.hasNext()) {
                    object = (String)object2.next();
                    arrayList.add(object);
                }
            }
            if (!((ArrayList)(object2 = this.aw(ffV2))).isEmpty()) {
                arrayList.add(aUM.cWf().c("effectOnEquip", new Object[0]));
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
            fij fij2 = ffV2.fVV();
            return aUM.cWf().c("xpRatio", fij2.dnH().cT(fij2.pf()), fij2.dnH().N(fij2.cmL()));
        }
        if (string.equals(jMK)) {
            return ffV2.adO();
        }
        if (string.equals(jMP)) {
            return false;
        }
        if (string.equals(jMQ)) {
            return bgT2.dno().td(ffV2.LV()) != null;
        }
        if (string.equals(jMR)) {
            short s = ffV2.dOg().dpq();
            bEq bEq2 = bEr.dSi().bW(s);
            return bEq2 != null && fgn.d(bEq2);
        }
        if (string.equals(jMT)) {
            short s = ffV2.dOg().dpq();
            bEq bEq3 = bEr.dSi().bW(s);
            if (bEq3 == null) {
                return false;
            }
            if (!fgn.d(bEq3)) {
                return false;
            }
            return ewo.oBF.k(ewr.oDJ) && fgn.a(bgT2, bEq3);
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
            return fgX2 == null ? null : aUM.cWf().c(jMW, Mz.aVX.cR(fgX2.pf()));
        }
        if (string.equals(jMY)) {
            return ffV2.fUX() != 0;
        }
        if (string.equals(jMZ)) {
            Object t = fcI.ac(bgT2.Xi(), ffV2.LV());
            if (t == null) {
                return false;
            }
            ang ang3 = ffV2.dOg().a(ffJ.sgc);
            boolean bl = ang3 != null && ang3.b(t, t, ffV2, ((exP)t).bdV());
            boolean bl3 = t.dlK() == null || t.dlK().dGp() == eTW.rqT;
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
            bGA bGA2 = cVO.eUK().eUL();
            if (bGA2 == null) {
                return false;
            }
            return bGA2.aX(ffV2);
        }
        if (string.equals(jMS)) {
            return bEf.aG(ffV2);
        }
        if (string.equals(jNe)) {
            bgT bgT5 = (bgT)fcI.ah(aUE.cVJ().cVO().xl(), ffV2.LV());
            if (bgT5 == null) {
                return null;
            }
            fhA fhA2 = fhB.f(ffV2, bgT5);
            aHV aHV5 = new aHV();
            if (fhA2 == fhA.soW) {
                return aHV5.ih(awX.dnI.bQk()).ceu().c(aUM.cWf().c("recycling.error.item.not.recyclable", new Object[0])).cev().ceL();
            }
            boolean bl = ffV2.fWs();
            Optional<Bu<Integer, Float>> optional = fhB.cP(ffV2);
            optional.ifPresent(bu -> {
                if (bl) {
                    aHV5.ceu();
                }
                aHV5.ei(GC.a(((Float)bu.aHI()).floatValue(), 2));
                if (bl) {
                    aHV5.cev();
                }
                aHV5.c(" x ");
                aHV5.a(aUC.cVq().a((fjm)bgT5, (Integer)bu.getFirst()), 24, 24, null);
                aHV5.c(" ").c(aUM.cWf().a(15, (long)((Integer)bu.getFirst()).intValue(), new Object[0]));
            });
            if (fhA2 == fhA.soX) {
                aHV5.ceH().ih(awX.dnI.bQk()).ceu().c(aUM.cWf().c("recycling.error.item.slotted", new Object[0])).cev().ceD();
            }
            if (bl) {
                aHV5.ceH().ih(awX.dnL.bQk()).ceu().c(aUM.cWf().c("recycling.bonus.item.not.identified", new Object[0])).cev().ceD();
            }
            return aHV5.ceL();
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
            return bDQ.dRC().ab(ffV2);
        }
        if ("marketAveragePrice".equals(string)) {
            Long l = bGN.dUk().bc(ffV2);
            return bEG.z(l);
        }
        if (string.equals(jNm)) {
            ArrayList arrayList = (ArrayList)ffV2.eu("allCharacteristics");
            int n = 0;
            if (arrayList != null) {
                awx awx2 = fyw.gqw().gqB().uG("fontDefault14");
                for (String string6 : arrayList) {
                    fGH fGH2 = new fGH();
                    fGH2.tZ(string6);
                    int n2 = 0;
                    for (fGK fGK2 : fGH2) {
                        switch (fGK2.gzE()) {
                            case dSC: {
                                fGM fGM2 = (fGM)fGK2;
                                n2 += awx2.gj(fGM2.getText());
                                break;
                            }
                            case dSD: {
                                fGL fGL2 = (fGL)fGK2;
                                n2 += fGL2.getWidth();
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
        return ((bEF)((Object)ffV2.dOg())).eu(string);
    }

    @NotNull
    public static String Gp(int n) {
        return "\u00d7" + aUM.cWf().cQ(n);
    }

    public static boolean a(bgT bgT2, ffV ffV2) {
        return bEj.b(bgT2, ffV2) != null;
    }

    public static boolean al(ffV ffV2) {
        long l = aUE.cVJ().cVO().xl();
        bgT bgT2 = Optional.ofNullable(fcI.ac(l, ffV2.LV())).orElse(bvZ.dLl());
        if (bgT2 == null) {
            return false;
        }
        fhC fhC2 = ffV2.dOg();
        ang ang2 = fhC2.a(ffJ.sgc);
        if (!fhC2.fAu()) {
            return false;
        }
        return ang2 == null || ang2.b(bgT2, bgT2.aZw(), fhC2, bgT2.fgg());
    }

    public static Optional<Boolean> am(ffV ffV2) {
        Optional<bGf> optional = bEG.t((bGV)ffV2.dOg());
        if (optional.isEmpty()) {
            return Optional.empty();
        }
        bGf bGf2 = optional.get();
        bgT bgT2 = (bgT)fcI.ac(aUE.cVJ().cVO().xl(), ffV2.LV());
        if (bgT2 == null) {
            bgT bgT3 = bvZ.dLl();
            return Optional.of(bGf2.c(bgT3, ffV2));
        }
        return Optional.of(bGf2.c(bgT2, ffV2));
    }

    private boolean an(ffV ffV2) {
        if (!aUE.cVJ().c(cWw.nSJ)) {
            return true;
        }
        if (!fji.de(ffV2)) {
            return false;
        }
        ffV ffV3 = cWw.nSJ.eVV().dXJ();
        ffV ffV4 = cWw.nSJ.eVV().dXK();
        return !ffV2.equals(ffV3) && !ffV2.equals(ffV4);
    }

    private boolean ao(ffV ffV2) {
        ffJ[] ffJArray;
        bgT bgT2 = cVO.daL();
        bgT bgT3 = (bgT)fcI.ag(bgT2.Xi(), ffV2.LV());
        if (bgT3 == null) {
            bgT3 = aUE.cVJ().cVK();
        }
        for (ffJ ffJ2 : ffJArray = new ffJ[]{ffJ.sgj, ffJ.sgf, ffJ.sgg}) {
            ang ang2 = ffV2.dOg().a(ffJ2);
            if (ang2 == null || ang2.b(bgT3, null, null, bgT3.dmQ())) continue;
            return true;
        }
        return false;
    }

    public static boolean ap(ffV ffV2) {
        if (!aUE.cVJ().c(cVr.eTM())) {
            return false;
        }
        fhC fhC2 = ffV2.dOg();
        bgT bgT2 = (bgT)fcI.ag(aUE.cVJ().cVK().Xi(), ffV2.LV());
        if (bgT2 == null) {
            return false;
        }
        if (fhC2.a(ffJ.sgf) != null && !fhC2.a(ffJ.sgf).b(bgT2, -1, fhC2, bgT2.fgg())) {
            return true;
        }
        boolean bl = false;
        for (short s : exb.oTk) {
            if (!ffV2.fWi().p(bEw.dSk().Gy(s))) continue;
            bl = true;
            break;
        }
        return !bl || cVr.eTM().or(ffV2.LV());
    }

    public static boolean aq(ffV ffV2) {
        return aUE.cVJ().c(cXU.eXE()) && (!cXU.eXE().bW(ffV2) || cXU.eXE().or(ffV2.LV()));
    }

    private String ar(ffV ffV2) {
        bgT bgT2 = cVO.daL();
        bgT bgT3 = (bgT)fcI.ag(bgT2.Xi(), ffV2.LV());
        if (bgT3 == null) {
            return "";
        }
        ffJ[] ffJArray = new ffJ[]{ffJ.sgj, ffJ.sgf, ffJ.sgg};
        aHV aHV2 = new aHV();
        boolean bl = true;
        for (ffJ ffJ2 : ffJArray) {
            ang ang2 = ffV2.dOg().a(ffJ2);
            if (ang2 != null && !ang2.b(bgT3, null, null, bgT3.dmQ())) {
                bl = this.a(aHV2, bl, ffJ2);
                continue;
            }
            if (!ffV2.fWm() || ffJ2 != ffJ.sgf) continue;
            bl = this.a(aHV2, bl, ffJ2);
        }
        return aHV2.ceL();
    }

    private boolean a(aHV aHV2, boolean bl, ffJ ffJ2) {
        if (bl) {
            bl = false;
        } else {
            aHV2.ceH();
        }
        aHV2.c(aUM.cWf().c("actionsOnItem.invalid." + ffJ2.name(), new Object[0]));
        return bl;
    }

    public bER as(ffV ffV2) {
        bER bER2 = (bER)this.jNq.get(ffV2.LV());
        if (bER2 == null) {
            bER bER3 = new bER(ffV2);
            if (ffV2.LV() != 0L) {
                this.jNq.put(ffV2.LV(), (Object)bER3);
            }
            return bER3;
        }
        return bER2;
    }

    private static ArrayList<String> a(ffV ffV2, TLongObjectHashMap<ArrayList<String>> tLongObjectHashMap, eLN eLN2) {
        ArrayList<String> arrayList = (ArrayList<String>)tLongObjectHashMap.get(ffV2.LV());
        if (arrayList == null || ffV2.LV() == 0L) {
            arrayList = bEG.a(eLN2, ffV2.dOg(), ffV2);
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
            arrayList = bEG.b(ffV2.dOg(), ffV2);
            this.jNs.put(ffV2.LV(), arrayList);
        }
        return arrayList;
    }

    private ArrayList<String> aw(ffV ffV2) {
        ArrayList<String> arrayList = (ArrayList<String>)this.jNr.get(ffV2.LV());
        if (arrayList == null || ffV2.LV() == 0L) {
            arrayList = bEG.a(ffV2.dOg(), ffV2);
            this.jNr.put(ffV2.LV(), arrayList);
        }
        return arrayList;
    }

    @Override
    public String ax(ffV ffV2) {
        bgT bgT2 = cVO.daL();
        bgT bgT3 = (bgT)fcI.ag(bgT2.Xi(), ffV2.LV());
        bgT bgT4 = bgT3 != null ? bgT3 : aUE.cVJ().cVK();
        return aUC.cVq().a((fjm)bgT4, ffV2);
    }

    public String ay(ffV ffV2) {
        bgT bgT2 = cVO.daL();
        bgT bgT3 = (bgT)fcI.ag(bgT2.Xi(), ffV2.LV());
        bgT bgT4 = bgT3 != null ? bgT3 : aUE.cVJ().cVK();
        return aUC.cVq().a((fjm)bgT4, ffV2);
    }

    public static String az(ffV ffV2) {
        return bEf.b(ffV2, "inventoryDialog");
    }

    public static String b(ffV ffV2, String string) {
        ffV ffV3 = (ffV)fSe.gFu().aW("itemDetail", string);
        if (ffV3 != null && ffV2.LV() == 0L && ffV3.LV() == 0L ? ffV2.avr() == ffV3.avr() : ffV3 != null && ffV2.LV() == ffV3.LV()) {
            return bEh.jNF.getStyle();
        }
        if (ffV2.adO() && ffV2.ead().geQ()) {
            return bEh.jNE.getStyle();
        }
        if (!bEf.aA(ffV2)) {
            return bEh.jNG.getStyle();
        }
        return bEh.jNH.getStyle();
    }

    public static boolean aA(ffV ffV2) {
        if (ffV2.dOg().dGh().fZq().length > 0) {
            return bEf.aD(ffV2);
        }
        return !ffV2.isUsable() || bEf.aB(ffV2);
    }

    public static boolean aB(ffV ffV2) {
        bkb bkb2;
        bgT bgT2 = (bgT)fcI.ac(aUE.cVJ().cVK().Xi(), ffV2.LV());
        if (bgT2 == null) {
            return false;
        }
        bgT bgT3 = bvZ.dLl();
        if (bgT3 == null || bgT3.doP()) {
            return false;
        }
        fhC fhC2 = ffV2.dOg();
        bFc bFc2 = (bFc)fhC2.fUZ();
        if (bFc2 != null) {
            if (!bFc2.bDA()) {
                return false;
            }
            if (!bFc2.aR(ffV2)) {
                return false;
            }
            if (bFc2.dTl() == fgM.skr && (bgT3.dpM() || bgT3.dkC() != fpU.sRd)) {
                return false;
            }
        }
        if ((bkb2 = bgT3.dps()) != null) {
            if (bkb2.dsm() == 19) {
                return !cWl.bK(ffV2);
            }
            if (bFc2 == null || !bFc2.fXr()) {
                return false;
            }
        }
        if (ffV2.fWi().aIi() == 218 || ffV2.fWi().aIi() == 399) {
            return true;
        }
        if (bgT2.dno().x(ffV2) == null) {
            return false;
        }
        bsJ bsJ2 = bgT2.dkZ();
        if (bsJ2 != null) {
            if (!bEf.a(ffV2.dOg(), bgT2, bsJ2, ffV2.LV())) {
                return false;
            }
        } else {
            ang ang2 = fhC2.a(ffJ.sgc);
            if (!ffV2.fAu() || ang2 != null && !ang2.b(bgT2, bgT2.aZw(), ffV2, bgT2.fgg())) {
                return false;
            }
        }
        if (bFc2 instanceof bFS) {
            return true;
        }
        if (bFc2 instanceof bFm) {
            return true;
        }
        if (bFc2 instanceof bFP) {
            int n;
            short s = ((bFP)bFc2).cqz();
            eKI eKI2 = bgT2.dpK();
            return eKI2.tX(n = ((bFP)bFc2).cms()) && eKI2.PG(n) >= s;
        }
        return !bEf.aC(ffV2) || ffV2.cmL() <= bgT2.cmL();
    }

    public static boolean a(fhC fhC2, bgy bgy2, bsJ bsJ2, long l) {
        TA tA = bsJ2.bbh().baf();
        ang ang2 = fhC2.a(bsJ2.dGp() == eTW.rqT ? ffJ.sgc : ffJ.sgd);
        return !(tA.bhE() && tA.bhF() != bgy2.Sn() || fhC2.fbT() && bgy2.dnP().B(l) == null || !fhC2.beB() && bsJ2.dGp() != eTW.rqT || ang2 != null && !ang2.b(bgy2, bgy2.aZw(), fhC2, bgy2.fgg()));
    }

    private static boolean aC(ffV ffV2) {
        fhC fhC2 = ffV2.dOg();
        if (fhC2 == null) {
            return true;
        }
        return !fhC2.c(fgg.sij);
    }

    private static boolean aD(ffV ffV2) {
        ffS[] ffSArray;
        Object object;
        assert (ffV2.dOg().fbT()) : "On appelle isEquipmentEquipable avec un item qui n'est pas un equipment : " + ffV2.getName();
        if (ffV2.fWt()) {
            return false;
        }
        bgT bgT2 = cVu.eUm();
        if (bgT2 == null) {
            object = cVu.eUn();
            bhx bhx2 = cVu.eUo();
            if (object != null && bhx2 != null) {
                ffS[] ffSArray2 = ffV2.fWi().fZq();
                bgT bgT3 = aUE.cVJ().cVK();
                if (bgT3 == null) {
                    return false;
                }
                for (ffS ffS2 : ffSArray2) {
                    if (!eJW.a((exP)bgT3, (exP)bhx2, ffV2, ffS2.shb, true).isEmpty()) continue;
                    return true;
                }
                return false;
            }
            bgT2 = aUE.cVJ().cVK();
        }
        object = bgT2.dmL();
        boolean bl = ((fhk)object).bt(ffV2);
        for (ffS ffS3 : ffSArray = ffV2.fWi().fZq()) {
            if (!fgt.a((exP)bgT2, (fhk)object, ffV2, ffS3, bgT2.bdV(), !bl)) continue;
            return true;
        }
        return false;
    }

    private static exP aE(ffV ffV2) {
        bgT bgT2 = (bgT)fcI.ag(aUE.cVJ().cVK().Xi(), ffV2.LV());
        if (bgT2 != null && bgT2.jC(ffV2.LV()) != null) {
            return bgT2;
        }
        return bEf.aF(ffV2);
    }

    private static exP aF(ffV ffV2) {
        long l = aUE.cVJ().cVO().xl();
        List<eJS> list = eJN.qAF.pP(l);
        bgy bgy2 = null;
        for (eJS eJS2 : list) {
            if (!eJS2.dme().f(ffV2)) continue;
            bgL bgL2 = cTs.MC(eJS2.aWP());
            if (bgL2 == null) {
                bgy2 = cTs.n(eJS2);
                break;
            }
            bgy2 = bgL2.dcP() != null ? bgL2.dcP() : cTs.n(eJS2);
            break;
        }
        return bgy2;
    }

    private static boolean aG(ffV ffV2) {
        Object object;
        bgT bgT2 = cVu.eUm();
        if (bgT2 == null) {
            object = cVu.eUn();
            if (object != null) {
                return eJW.b((eJS)object, ffV2);
            }
            bgT2 = aUE.cVJ().cVK();
        }
        if (((fhC)(object = ffV2.dOg())).dGh().fZq().length > 0) {
            ffS[] ffSArray;
            fhk fhk2 = bgT2.dmL();
            for (ffS ffS2 : ffSArray = ffV2.fWi().fZq()) {
                if (!fgt.a((exP)bgT2, fhk2, ffV2, ffS2)) continue;
                return true;
            }
            return false;
        }
        if (((fhC)object).fUZ() instanceof bFP) {
            short s = ((bFP)((fhC)object).fUZ()).cqz();
            eKI eKI2 = bgT2.dpK();
            return eKI2.PG(((bFP)((fhC)object).fUZ()).cms()) >= s;
        }
        return ((fhC)object).cmL() <= bgT2.cmL();
    }

    @Override
    public String aH(ffV ffV2) {
        fhC fhC2 = ffV2.dOg();
        return fhC2 != null ? fhC2.getName() : "<undefined name>";
    }

    @Override
    public String aI(ffV ffV2) {
        fhC fhC2 = ffV2.dOg();
        return fhC2 != null ? fhC2.dah() : "<undefined name>";
    }

    @Override
    public String aJ(ffV ffV2) {
        fhC fhC2 = ffV2.dOg();
        return fhC2 != null ? fhC2.getDescription() : "<undefined desc>";
    }

    @Override
    public void aK(ffV ffV2) {
        ArrayList<fSf> arrayList = new ArrayList<fSf>();
        for (String string : this.jNp) {
            fSf fSf2 = fSe.gFu().getProperty(string);
            if (fSf2 == null || fSf2.getValue() != ffV2 || fSf2.gFF()) continue;
            arrayList.add(fSf2);
        }
        int n = arrayList.size();
        for (int i = 0; i < n; ++i) {
            fSe.gFu().c((fSf)arrayList.get(i));
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
        bEF bEF2 = (bEF)((Object)ffV2.dOg());
        if (bEF2 != null) {
            bEF2.dSz().bYg();
        }
        try {
            fSe.gFu().a((aEF)ffV2, "isEquipable", "requirement", "effect", "caracteristic", jMz, jMB, jMD, "effectAndCaracteristic", "shards");
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
