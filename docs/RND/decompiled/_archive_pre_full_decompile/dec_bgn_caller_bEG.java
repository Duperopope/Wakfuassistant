/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.iterator.TLongObjectIterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class bEG
implements aEH {
    private static final Logger jPx = Logger.getLogger(bEG.class);
    public static final String jPy = "name";
    public static final String jPz = "nameWithRarity";
    public static final String jPA = "description";
    public static final String jPB = "type";
    public static final String jPC = "itemTypeColor";
    public static final String jPD = "isRefItem";
    public static final String jPE = "set";
    public static final String jPF = "setHasBonus";
    public static final String jPG = "isEquiped";
    public static final String jPH = "isEquipableType";
    public static final String jPI = "isEquipable";
    public static final String jPJ = "isPreviewable";
    public static final String jPK = "isInInventory";
    public static final String jPL = "level";
    public static final String jPM = "levelDescription";
    public static final String jPN = "shortenedLevelDesc";
    public static final String jPO = "effect";
    public static final String jPP = "allCharacteristics";
    public static final String jPQ = "effectAndCaracteristic";
    public static final String jPR = "effectDetails";
    public static final String jPS = "completeEffectUse";
    public static final String jPT = "criticalEffectDetails";
    public static final String jPU = "shortEffectDetails";
    public static final String jPV = "hasCaracteristic";
    public static final String jPW = "caracteristic";
    public static final String jPX = "requirement";
    public static final String jPY = "useRequirement";
    public static final String jPZ = "craftRequirement";
    public static final String jQa = "conditionDescription";
    public static final String jQb = "iconUrl";
    public static final String jQc = "baseIconUrl";
    public static final String jQd = "iconBigUrl";
    public static final String jQe = "iconTypeUrl";
    public static final String jQf = "ap";
    public static final String jQg = "apDesc";
    public static final String jQh = "range";
    public static final String jQi = "areaOfEffectIconURL";
    public static final String jQj = "isActionLinked";
    public static final String jQk = "ingredients";
    public static final String jQl = "storingCapacity";
    public static final String jQm = "craftMovable";
    public static final String jQn = "isRelic";
    public static final String jQo = "isRelic2";
    public static final String jQp = "isCraftable";
    public static final String jQq = "isUsedInCraft";
    public static final String jQr = "craftsUsedIntoDescription";
    public static final String jQs = "hasCraftsUsingItem";
    public static final String jQt = "hasCraftsProducingItem";
    public static final String jQu = "hasXp";
    public static final String jQv = "shards";
    public static final String jQw = "itemUseStyle";
    public static final String jQx = "itemUseDescription";
    public static final String jQy = "hasHealEffect";
    public static final String jQz = "canBeEquiped";
    public static final String jQA = "boundDescription";
    public static final String jQB = "dropQuantity";
    public static final String jQC = "themeItemBorderUrl";
    public static final String jQD = "themeItemBorderStyle";
    public static final String jQE = "themeItemHoverBorderStyle";
    public static final String jQF = "themeItemPressedBorderStyle";
    public static final String jQG = "themeItemDisabledBorderStyle";
    public static final String jQH = "isBlindBox";
    public static final String jQI = "blindBoxLootList";
    public static final String jQJ = "rarityText";
    public static final String jQK = "rawRarityText";
    public static final String jQL = "rarityColor";
    public static final String jQM = "hasBrightBackground";
    public static final String jQN = "rarityContainer";
    public static final String jQO = "marketAveragePrice";
    public static final String jQP = "isLearnt";
    public static final String jQQ = "hasLearnAction";
    public static final String jQR = "sublimationColorPattern";
    public static final String jQS = "sublimationColorPatternSize";
    public static final String jQT = "effectLabel";
    public static final String jQU = "requirementsLabel";
    public static final String jQV = "utilizationLabel";
    public static final String jQW = "rarityBackgroundUrl";
    public static final String jQX = "isInEncyclopedia";
    public static final String[] jQY = new String[]{"name", "description", "type", "level", "effect", "effectAndCaracteristic", "criticalEffectDetails", "shortEffectDetails", "caracteristic", "requirement", "iconUrl", "iconBigUrl", "ap", "range", "areaOfEffectIconURL", "set", "isEquiped", "isInInventory", "isEquipable", "isPreviewable", "ingredients", "storingCapacity", "conditionDescription", "craftMovable", "isRelic", "isRelic2", "isCraftable", "shards", "itemUseStyle", "canBeEquiped", "itemUseDescription", "dropQuantity", "isBlindBox", "blindBoxLootList", "rarityText", "hasLearnAction", "isLearnt", "themeItemBorderUrl", "themeItemBorderStyle", "themeItemHoverBorderStyle", "themeItemPressedBorderStyle", "themeItemDisabledBorderStyle", "isInEncyclopedia"};
    private final fhC jQZ;
    private ArrayList<String> jRa = null;
    private ArrayList<String> jRb = null;
    private String jRc = null;
    private ArrayList<String> jRd = null;
    private ArrayList<String> jRe = null;
    private ArrayList<ffT> jRf = null;
    private bER jRg;

    @Override
    public String[] bxk() {
        return jQY;
    }

    public bEG(fhC fhC2) {
        this.jQZ = fhC2;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(jPD)) {
            return true;
        }
        if (string.equals(jPy)) {
            return this.jQZ.getName();
        }
        if (string.equals(jPz)) {
            return new aHV().ceC().ih(bEo.e(this.jQZ.dwg())).c(this.jQZ.getName()).ceD().ceL();
        }
        if (string.equals(jPC)) {
            return this.jQZ.fYr().getColor().toString();
        }
        if (string.equals(jPA)) {
            String string2 = this.jQZ.getDescription();
            if (string2 == null || string2.length() == 0) {
                return null;
            }
            return "\"" + string2 + "\"";
        }
        if (string.equals(jPB)) {
            String string3 = bEw.dSk().Gy(this.jQZ.dGh().aIi()).getName();
            boolean bl = false;
            String string4 = string3;
            return string4.length() == 0 ? null : "[" + string4 + "]";
        }
        if (string.equals(jPL)) {
            return this.jQZ.cmL();
        }
        if (string.equals(jPM)) {
            bgT bgT2 = cVO.daL();
            if (bgT2 == null) {
                return aUM.cWf().c("levelShort.custom", this.jQZ.cmL());
            }
            ffQ ffQ2 = ffQ.fVK();
            if (ffQ2 == null) {
                return aUM.cWf().c("levelShort.custom", this.jQZ.cmL());
            }
            aHV aHV2 = new aHV();
            boolean bl = true;
            if (this.jQZ.dGh().fZq().length == 0) {
                if (this.jQZ.fUZ() instanceof bFP) {
                    short s = ((bFP)this.jQZ.fUZ()).cqz();
                    eKI eKI2 = bgT2.dpK();
                    bl = eKI2.PG(((bFP)this.jQZ.fUZ()).cms()) >= s;
                }
            } else {
                ffS[] ffSArray;
                bl = false;
                bgT bgT3 = aUE.cVJ().cVK();
                fhk fhk2 = bgT3.dmL();
                for (ffS ffS2 : ffSArray = this.jQZ.dGh().fZq()) {
                    if (!fgt.a((exP)bgT3, fhk2, this.jQZ, ffS2)) continue;
                    bl = true;
                }
            }
            if (!bl) {
                aHV2.ceC().ih(awX.dnJ.bQk());
            }
            aHV2.c(aUM.cWf().c("levelShort.custom", this.jQZ.cmL()));
            if (!bl) {
                aHV2.ceD();
            }
            return aHV2.ceL();
        }
        if (string.equals(jPN)) {
            return aUM.cWf().c("levelShort.custom", this.jQZ.cmL());
        }
        if (string.equals(jPH)) {
            return this.dSE();
        }
        if (string.equals(jPI)) {
            return this.dSD();
        }
        if (string.equals(jPJ)) {
            return bjf.b(this.jQZ);
        }
        if (string.equals(jPG)) {
            bgT bgT4 = cVO.daL();
            fhk fhk3 = bgT4.dmL();
            int n = -1;
            for (Long l : fhk3.fUd().values()) {
                ffV ffV2;
                Optional<ffV> optional = bgT4.dnP().B(l);
                if (optional.isEmpty() || (ffV2 = optional.get()).dOg().d() != this.jQZ.d()) continue;
                return true;
            }
            return false;
        }
        if (string.equals(jPK)) {
            bgT bgT5 = cVO.daL();
            TLongObjectIterator<ffs> tLongObjectIterator = bgT5.dno().fVg();
            while (tLongObjectIterator.hasNext()) {
                tLongObjectIterator.advance();
                ffs ffs2 = (ffs)tLongObjectIterator.value();
                if (!ffs2.pb(this.jQZ.d())) continue;
                return true;
            }
            return false;
        }
        if (string.equals(jPE)) {
            short s = this.jQZ.dpq();
            if (s != 0) {
                return bEr.dSi().bW(s);
            }
            return null;
        }
        if (string.equals(jPF)) {
            short s = this.jQZ.dpq();
            if (s == 0) {
                return false;
            }
            bEq bEq2 = bEr.dSi().bW(s);
            if (bEq2 == null) {
                return false;
            }
            return bEq2.fVs();
        }
        if (string.equals(jQg)) {
            byte by = this.jQZ.fYi();
            if (by > 0) {
                return "<b color=\"00afea\">" + this.jQZ.fYi() + " " + aUM.cWf().c("APShort", new Object[0]) + "</b>";
            }
            return null;
        }
        if (string.equals(jQf)) {
            return this.jQZ.fYi();
        }
        if (string.equals(jQh)) {
            int n = this.jQZ.cpn();
            int n2 = this.jQZ.cpo();
            if (n == 0 && n2 == 0) {
                return null;
            }
            if (n == n2) {
                return n;
            }
            return n + "-" + n2;
        }
        if (string.equalsIgnoreCase(jQi)) {
            return this.dSF();
        }
        if (string.equals(jPV)) {
            return !this.dSI().isEmpty();
        }
        if (string.equals(jPW)) {
            ArrayList<String> arrayList = new ArrayList<String>();
            ArrayList<String> arrayList2 = this.dSI();
            if (!arrayList2.isEmpty()) {
                arrayList.add(aUM.cWf().c("effectOnEquip", new Object[0]));
                for (String string5 : arrayList2) {
                    arrayList.add(string5);
                }
            }
            return arrayList.isEmpty() ? null : arrayList;
        }
        if (string.equals(jPO)) {
            ArrayList<String> arrayList = this.dSG();
            return arrayList.isEmpty() ? null : arrayList;
        }
        if (string.equals(jPQ)) {
            return this.aO(null);
        }
        if (string.equals(jPR)) {
            return bEG.a(eLN.qJo, this.jQZ, null);
        }
        if (string.equals(jPU)) {
            return bEG.a(eLN.qJo, this.jQZ, null);
        }
        if (string.equals(jPT)) {
            if (this.jRb == null) {
                this.jRb = bEG.a(eLN.qJp, this.jQZ, null);
            }
            return !this.jRb.isEmpty() ? this.jRb : null;
        }
        if (string.equals(jPS)) {
            ArrayList<String> arrayList;
            ArrayList<String> arrayList3;
            ArrayList<Object> arrayList4 = new ArrayList<Object>();
            if (this.jQZ.fYi() > 0) {
                arrayList4.add(aUM.cWf().c("cost", new Object[0]) + " : " + String.valueOf(this.eu(jQf)) + " " + bEG.j(eXx.rGj));
            }
            if (this.eu(jQh) != null) {
                arrayList4.add(aUM.cWf().c(jQh, new Object[0]) + " : " + String.valueOf(this.eu(jQh)) + " " + bEG.j(eXx.rGq));
            }
            if ((arrayList3 = bEG.a(eLN.qJo, this.jQZ, null)) != null && !arrayList3.isEmpty()) {
                arrayList4.add(aUM.cWf().c("normal", new Object[0]) + " : ");
                arrayList4.addAll(arrayList3);
            }
            if ((arrayList = bEG.a(eLN.qJp, this.jQZ, null)) != null && !arrayList.isEmpty()) {
                arrayList4.add(aUM.cWf().c("critical", new Object[0]) + " : ");
                arrayList4.addAll(arrayList);
            }
            return arrayList4;
        }
        if (string.equals(jPX)) {
            String string6;
            StringBuilder stringBuilder = new StringBuilder();
            ang ang2 = this.jQZ.a(ffJ.sge);
            bgT bgT6 = cVO.daL();
            if (ang2 != null && (string6 = eLP.b(ang2)).length() > 0) {
                if (ang2.b(bgT6, this, null, bgT6.fgg())) {
                    stringBuilder.append(string6);
                } else {
                    stringBuilder.append("<text color=\"cc4444\">").append(string6).append("</text>");
                }
            }
            return stringBuilder.toString();
        }
        if (string.equals(jPY)) {
            String string7;
            Object object;
            Object object2;
            boolean bl = true;
            bgT bgT7 = cVO.daL();
            aHV aHV3 = new aHV();
            ang ang3 = bgT7.dkZ() == null || bgT7.dkZ().dGp() == eTW.rqT ? this.jQZ.a(ffJ.sgc) : this.jQZ.a(ffJ.sgd);
            if (ang3 != null) {
                object2 = eLP.b(ang3);
                if (ang3.b(bgT7, this, null, null)) {
                    aHV3.c((CharSequence)object2);
                } else {
                    aHV3.ceC().ih("cc4444").c((CharSequence)object2).ceD();
                }
                bl = false;
            }
            ang3 = null;
            object2 = this.jQZ.fUZ();
            if (object2 != null) {
                ang3 = ((fgL)object2).bdo();
            }
            if (ang3 != null) {
                if (!bl) {
                    aHV3.ceH();
                }
                object = eLP.b(ang3);
                if (ang3.b(bgT7, this, null, null)) {
                    aHV3.c((CharSequence)object);
                } else {
                    aHV3.ceC().ih("cc4444").c((CharSequence)object).ceD();
                }
                bl = false;
            }
            if ((object = (bFc)this.jQZ.fUZ()) != null && object instanceof bFP) {
                if (!bl) {
                    aHV3.ceH();
                }
                short s = ((bFP)object).cqz();
                int n = ((bFP)object).cms();
                String string8 = aUM.cWf().a(43, (long)n, new Object[0]);
                String string9 = aUM.cWf().c("craft.neededAtLevel", string8, s);
                aHV3.c(string9);
                bl = false;
            }
            if (object != null && (string7 = ((bFc)object).dTj()) != null) {
                aHV3.ceC().ih("cc4444").c(string7).ceD();
            }
            return aHV3.ceL();
        }
        if (string.equals(jQa)) {
            String string10;
            bFc bFc2;
            bgT bgT8 = cVO.daL();
            ArrayList<String> arrayList = new ArrayList<String>();
            ang ang4 = this.jQZ.a(ffJ.sge);
            if (ang4 != null) {
                this.a(ang4, arrayList, bgT8.fgg());
            }
            if ((ang4 = bgT8.dkZ() == null || bgT8.dkZ().dGp() == eTW.rqT ? this.jQZ.a(ffJ.sgc) : this.jQZ.a(ffJ.sgd)) != null) {
                this.a(ang4, arrayList, null);
            }
            ang4 = null;
            fgL fgL2 = this.jQZ.fUZ();
            if (fgL2 != null) {
                ang4 = fgL2.bdo();
            }
            if (ang4 != null) {
                this.a(ang4, arrayList, null);
            }
            if ((bFc2 = (bFc)this.jQZ.fUZ()) != null && bFc2 instanceof bFP) {
                short s = ((bFP)bFc2).cqz();
                int n = ((bFP)bFc2).cms();
                eKI eKI3 = bgT8.dpK();
                boolean bl = eKI3.tX(n) && eKI3.PG(n) >= s;
                String string11 = aUM.cWf().a(43, (long)n, new Object[0]);
                String string12 = aUM.cWf().c("craft.neededAtLevel", string11, s);
                if (!bl) {
                    string12 = String.format("<text color=\"%s\">%s</text>", "cc4444", string12);
                }
                arrayList.add(string12);
            }
            if (bFc2 != null && (string10 = bFc2.dTj()) != null) {
                arrayList.add(String.format("<text color=\"%s\">%s</text>", "cc4444", string10));
            }
            return arrayList;
        }
        if (string.equals(jQb) || string.equals(jQc)) {
            return aUC.cVq().a((fjm)cVO.daL(), this.jQZ);
        }
        if (string.equals(jQd)) {
            bgT bgT9 = cVO.daL();
            return aUC.cVq().zz(bgT9 != null && bgT9.aWO() == 1 ? this.jQZ.cpf() : this.jQZ.aVt());
        }
        if (string.equals(jQj)) {
            return this.jQZ.fUZ() != null;
        }
        if (string.equals(jQl)) {
            return ffN.sgo.UW(this.jQZ.d());
        }
        if (string.equals(jPZ)) {
            aHV aHV4 = new aHV();
            ang ang5 = this.jQZ.a(ffJ.sgh);
            if (ang5 != null) {
                bgT bgT10 = cVO.daL();
                String string13 = eLP.b(ang5);
                if (ang5.b(bgT10, this, null, bgT10.fgg())) {
                    aHV4.c(string13);
                } else {
                    aHV4.ceC().ih("cc4444").c(string13).ceD();
                }
            }
            return aHV4.ceL();
        }
        if (!string.equals(jQk)) {
            if (string.equals(jQm)) {
                return this.jQZ.dUt();
            }
            if (string.equals(jQn)) {
                return this.jQZ.dwg() == fgj.siF;
            }
            if (string.equals(jQo)) {
                return this.jQZ.dwg() == fgj.siH;
            }
            if (string.equals(jQp)) {
                return this.dSC();
            }
            if (string.equals(jQq)) {
                return !bmI.iDE.a(this.jQZ.d(), baJ.hzf.cZr()).isEmpty();
            }
            if (string.equals(jQs)) {
                eKI eKI4 = baJ.hzf.cZr();
                ArrayList<Integer> arrayList = new ArrayList<Integer>(bmI.iDE.a(this.jQZ.d(), eKI4));
                arrayList.sort(Integer::compareTo);
                Iterator iterator = arrayList.iterator();
                while (iterator.hasNext()) {
                    int n = (Integer)iterator.next();
                    if (!eKI4.tX(n)) continue;
                    return true;
                }
                return false;
            }
            if (string.equals(jQt)) {
                int n = this.jQZ.d();
                bEI bEI2 = new bEI(n);
                eKQ.qEb.q(bEI2);
                return bEI2.jRk;
            }
            if (string.equals(jQr)) {
                eKI eKI5 = baJ.hzf.cZr();
                ArrayList<Integer> arrayList = new ArrayList<Integer>(bmI.iDE.a(this.jQZ.d(), eKI5));
                arrayList.sort(Integer::compareTo);
                if (arrayList.isEmpty()) {
                    return null;
                }
                aHV aHV5 = new aHV();
                aHV5.c(aUM.cWf().c("crafts.item.isUsedIn", new Object[0])).ceH();
                int n = arrayList.size();
                for (int i = 0; i < n; ++i) {
                    int n3;
                    boolean bl;
                    if (i != 0) {
                        aHV5.c(", ");
                    }
                    if (!(bl = eKI5.tX(n3 = ((Integer)arrayList.get(i)).intValue()))) {
                        aHV5.ceC().ih(awX.dnJ.bQk());
                    }
                    aHV5.c(aUM.cWf().a(43, (long)n3, new Object[0]));
                    if (bl) continue;
                    aHV5.ceD();
                }
                return aHV5.toString();
            }
            if (string.equals(jQu)) {
                return false;
            }
            if (string.equals(jQv)) {
                return this.dSB();
            }
            if (string.equals(jQw)) {
                bGV bGV2 = (bGV)this.jQZ;
                return bGV2.dUr().getStyle();
            }
            if (string.equals(jQx)) {
                bGV bGV3 = (bGV)this.jQZ;
                return aUM.cWf().c(bGV3.dUr().clY(), new Object[0]);
            }
            if (string.equals(jQy)) {
                return this.jQZ.fYz();
            }
            if (string.equals(jQA)) {
                if (this.jQZ.fVc() == fgW.smf) {
                    return null;
                }
                return aUM.cWf().c(this.jQZ.fVc().clY(), new Object[0]);
            }
            if (string.equals(jQz)) {
                return this.jQZ.dUw();
            }
            if (string.equals(jQH)) {
                return this.jQZ.fUZ() != null && this.jQZ.fUZ().dTl() == fgM.skG;
            }
            if (string.equals(jQI)) {
                bFq bFq2;
                if (this.jRf == null && this.jQZ.fUZ() != null && this.jQZ.fUZ().dTl() == fgM.skG && (bFq2 = (bFq)this.jQZ.fUZ()).dTq()) {
                    this.jRf = cSw.Ms(bFq2.dTp());
                }
                return this.jRf;
            }
            if (string.equals(jQC)) {
                return this.jQZ.dwg().aKJ();
            }
            if (string.equals(jQD)) {
                return this.jQZ.dwg().fWN();
            }
            if (string.equals(jQE)) {
                return this.jQZ.dwg().fWO();
            }
            if (string.equals(jQF)) {
                return this.jQZ.dwg().fWP();
            }
            if (string.equals(jQG)) {
                return this.jQZ.dwg().fWQ();
            }
            if (string.equals(jQJ)) {
                return new aHV().ceC().ih(bEo.e(this.jQZ.dwg())).c(aUM.cWf().c("item.rarity." + this.jQZ.dwg().name(), new Object[0])).ceD().ceL();
            }
            if (string.equals(jQK)) {
                return aUM.cWf().c("item.rarity." + this.jQZ.dwg().name(), new Object[0]);
            }
            if (string.equals(jQe)) {
                String string14 = aUC.cVq().aZ(this.jQZ.dGh().aIi());
                if ((string14 == null || string14.isEmpty()) && this.jQZ.dGh().fZm() != null) {
                    return aUC.cVq().aZ(this.jQZ.dGh().fZm().aIi());
                }
                return string14;
            }
        }
        if (string.equals(jQO)) {
            Long l = bGN.dUk().GC(this.jQZ.d());
            return bEG.z(l);
        }
        if (string.equals(jQR)) {
            if (this.jQZ.dCC() == null) {
                return null;
            }
            return Stream.of(this.jQZ.dCC().fZe()).map(rd -> bES.a(rd, false)).toList();
        }
        if (string.equals(jQS)) {
            if (this.jQZ.dCC() == null) {
                return 0;
            }
            if (this.jQZ.dCC().fZe() == null) {
                return 0;
            }
            return this.jQZ.dCC().fZe().length;
        }
        if (jQQ.equals(string)) {
            return bEG.t((bGV)this.jQZ).isPresent();
        }
        if (jQP.equals(string)) {
            return bEG.u((bGV)this.jQZ).orElse(false);
        }
        if (jQW.equals(string)) {
            return this.dSA();
        }
        if (jQL.equals(string)) {
            return bEo.d(this.jQZ.dwg());
        }
        if (jQN.equals(string)) {
            switch (this.jQZ.dwg()) {
                case siA: {
                    return "labelItemRarityOld";
                }
                case siB: {
                    return "labelItemRarityCommon";
                }
                case siC: {
                    return "labelItemRarityRare";
                }
                case siD: {
                    return "labelItemRarityMythic";
                }
                case siE: {
                    return "labelItemRarityLegendary";
                }
                case siF: {
                    return "labelItemRarityRelic";
                }
                case siG: {
                    return "labelItemRarityMemory";
                }
                case siH: {
                    return "labelItemRarityEpic";
                }
                case siI: {
                    return "labelItemRarityAdmin";
                }
            }
        }
        if (jQM.equals(string)) {
            return this.jQZ.dwg() == fgj.siE || this.jQZ.dwg() == fgj.siB;
        }
        if (jQT.equals(string)) {
            return aUM.cWf().c("effects", new Object[0]).toUpperCase();
        }
        if (jQU.equals(string)) {
            return aUM.cWf().c("requirements", new Object[0]).toUpperCase();
        }
        if (jQV.equals(string)) {
            return aUM.cWf().c("utilization", new Object[0]).toUpperCase();
        }
        if (jQX.equals(string)) {
            return bpm.dCG().Fa(this.jQZ.d());
        }
        return null;
    }

    private String dSA() {
        switch (this.jQZ.dwg()) {
            case siA: {
                return "itemTooltipOld";
            }
            case siB: {
                return "itemTooltipCommon";
            }
            case siC: {
                return "itemTooltipRare";
            }
            case siD: {
                return "itemTooltipMythic";
            }
            case siE: {
                return "itemTooltipLegendary";
            }
            case siF: {
                return "itemTooltipRelic";
            }
            case siG: {
                return "itemTooltipMemory";
            }
            case siH: {
                return "itemTooltipEpic";
            }
            case siI: {
                return "itemTooltipAdmin";
            }
        }
        return "itemTooltipCommon";
    }

    @NotNull
    public static Optional<bGf> t(@NotNull bGV bGV2) {
        fgL fgL2 = bGV2.fUZ();
        if (!(fgL2 instanceof bGf)) {
            return Optional.empty();
        }
        bGf bGf2 = (bGf)((Object)fgL2);
        if (fgM.slb.contains(fgL2.dTl())) {
            return Optional.empty();
        }
        return Optional.of(bGf2);
    }

    public static boolean f(fhC fhC2) {
        bgT bgT2 = (bgT)fcI.sh(aUE.cVJ().cVK().Xi());
        if (bgT2 == null) {
            return false;
        }
        ang ang2 = fhC2.a(ffJ.sgc);
        if (!fhC2.fAu()) {
            return false;
        }
        return ang2 == null || ang2.b(bgT2, bgT2.aZw(), fhC2, bgT2.fgg());
    }

    public static Optional<Boolean> u(bGV bGV2) {
        Optional<bGf> optional = bEG.t(bGV2);
        if (optional.isEmpty()) {
            return Optional.empty();
        }
        bgT bgT2 = (bgT)fcI.sh(aUE.cVJ().cVO().xl());
        return Optional.of(optional.get().a(bgT2, bGV2));
    }

    /*
     * WARNING - void declaration
     */
    private void a(ang ang2, ArrayList<String> arrayList, Object object) {
        String string = eLP.b(ang2);
        if (string.length() <= 0) {
            return;
        }
        String[] stringArray = BH.a(string, '\n');
        bgT bgT2 = cVO.daL();
        for (String string2 : stringArray) {
            void object2;
            if (!ang2.b(bgT2, this, null, object)) {
                String string3 = "<text color=\"cc4444\">" + string2 + "</text>";
            }
            arrayList.add((String)object2);
        }
    }

    private bER dSB() {
        if (this.jRg == null) {
            this.jRg = new bER(this.jQZ);
        }
        return this.jRg;
    }

    public ArrayList<String> aO(ffV ffV2) {
        Object object;
        Object object2;
        ArrayList<String> arrayList = new ArrayList<String>();
        ArrayList<String> arrayList2 = bEG.a(eLN.qJo, this.jQZ, ffV2);
        if (!arrayList2.isEmpty()) {
            arrayList.add(aUM.cWf().c("effectOnUse", new Object[0]));
            object2 = arrayList2.iterator();
            while (object2.hasNext()) {
                object = (String)object2.next();
                arrayList.add((String)object);
            }
        }
        if (!((ArrayList)(object2 = bEG.a(this.jQZ, ffV2))).isEmpty()) {
            arrayList.add(aUM.cWf().c("effectOnEquip", new Object[0]));
            object = ((ArrayList)object2).iterator();
            while (object.hasNext()) {
                String string = (String)object.next();
                arrayList.add(string);
            }
        }
        return arrayList.isEmpty() ? null : arrayList;
    }

    private boolean dSC() {
        return ((bEm)fgD.fXh()).Gs(this.jQZ.d());
    }

    public boolean dSD() {
        if (this.jQZ.dGh().fZq().length > 0) {
            TLongObjectIterator<ffs> tLongObjectIterator = aUE.cVJ().cVK().dno().fVg();
            while (tLongObjectIterator.hasNext()) {
                tLongObjectIterator.advance();
                ffs ffs2 = (ffs)tLongObjectIterator.value();
                if (!ffs2.pb(this.jQZ.d())) continue;
                ang ang2 = this.jQZ.a(ffJ.sge);
                if (ang2 != null && !ang2.b(aUE.cVJ().cVK(), this, null, aUE.cVJ().cVK().fgg())) break;
                return true;
            }
        }
        return false;
    }

    public boolean dSE() {
        return this.jQZ.dGh().fZq().length > 0;
    }

    public String dSF() {
        if (this.jRc == null) {
            Object object;
            Iterator<eNk> iterator = this.jQZ.fYj();
            ArrayList<aoh> arrayList = new ArrayList<aoh>();
            this.jRc = "";
            while (iterator.hasNext()) {
                object = iterator.next();
                if (!object.fAt()) continue;
                arrayList.add(object.aZS());
            }
            if (!arrayList.isEmpty()) {
                object = aoi.m(arrayList);
                String string = ((aoh)object).bEq().toString();
                if (string.equals("SPECIAL")) {
                    return "";
                }
                try {
                    string = String.format(aUC.cVq().bS("areasIconsPath"), string);
                    this.jRc = fTy.b(string, -1, -1, null);
                }
                catch (Fu fu) {
                    jPx.error((Object)fu);
                }
            }
        }
        return this.jRc;
    }

    public ArrayList<String> dSG() {
        if (this.jRa == null) {
            this.jRa = bEG.a(eLN.qJo, this.jQZ, null);
        }
        return this.jRa;
    }

    public ArrayList<String> dSH() {
        if (this.jRb == null) {
            this.jRb = bEG.a(eLN.qJp, this.jQZ, null);
        }
        return this.jRb;
    }

    public static ArrayList<String> a(eLN eLN2, fhC fhC2, @Nullable ffV ffV2) {
        switch (eLN2) {
            case qJp: {
                return bEG.a(eMa.qMl, fhC2, ffV2);
            }
        }
        return bEG.a(eMa.qMk, fhC2, ffV2);
    }

    private static ArrayList<String> a(eMa eMa2, fhC fhC2, ffV ffV2) {
        bgT bgT2 = cVO.daL();
        eMf eMf2 = new eMf(fhC2, ffV2, eMa2);
        return eMf2.fzQ();
    }

    public ArrayList<String> dSI() {
        if (this.jRd == null) {
            this.jRd = bEG.b(this.jQZ, null);
        }
        return this.jRd;
    }

    public static ArrayList<String> a(fhC fhC2, @Nullable ffV ffV2) {
        eMf eMf2 = new eMf(fhC2, ffV2, eMa.qMj);
        ArrayList<String> arrayList = eMf2.fzQ();
        if (ffV2 != null && ffV2.dXg()) {
            arrayList.addAll(bEG.aP(ffV2));
        }
        return arrayList;
    }

    @NotNull
    public static List<String> aP(@NotNull ffV ffV2) {
        return new eMi(ffV2.eAZ(), ffV2.dOg().dGh().fZq()).fAi();
    }

    public static ArrayList<String> b(fhC fhC2, @Nullable ffV ffV2) {
        eMf eMf2 = new eMf(fhC2, ffV2, eMa.qMj);
        return eMf2.fzQ();
    }

    public static ArrayList<String> a(fhC fhC2, @Nullable ffV ffV2, short s) {
        eMf eMf2 = new eMf(fhC2, ffV2, s, eMa.qMj);
        return eMf2.fzQ();
    }

    public void bYg() {
        bEq bEq2;
        this.jRe = null;
        this.jRd = null;
        this.jRa = null;
        this.jRb = null;
        if (this.jQZ.dpq() != 0 && (bEq2 = bEr.dSi().bW(this.jQZ.dpq())) != null) {
            bEq2.bYg();
        }
    }

    public fhC dOg() {
        return this.jQZ;
    }

    public fgj dwg() {
        return this.jQZ.dwg();
    }

    public static String z(@Nullable Long l) {
        return aUM.cWf().c("market.item.average.price.suffix", l != null && l > 0L ? l : -1L);
    }

    private static String j(eXx eXx2) {
        try {
            return aUK.hrk.a(BK.avt, eXx2.name(), null, 22, 22);
        }
        catch (Fu fu) {
            jPx.warn((Object)("Icon not found for " + eXx2.name()), (Throwable)fu);
            return null;
        }
    }
}
