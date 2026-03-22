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

/*
 * Renamed from bEG
 */
public class beg_1
implements aeh_2 {
    private static final Logger jPx = Logger.getLogger(beg_1.class);
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
    private final fhc_0 jQZ;
    private ArrayList<String> jRa = null;
    private ArrayList<String> jRb = null;
    private String jRc = null;
    private ArrayList<String> jRd = null;
    private ArrayList<String> jRe = null;
    private ArrayList<ffT> jRf = null;
    private ber_0 jRg;

    @Override
    public String[] bxk() {
        return jQY;
    }

    public beg_1(fhc_0 fhc_02) {
        this.jQZ = fhc_02;
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
            return new ahv_2().ceC().ih(beo_0.e(this.jQZ.dwg())).c(this.jQZ.getName()).ceD().ceL();
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
            String string3 = bew_1.dSk().Gy(this.jQZ.dGh().aIi()).getName();
            boolean bl = false;
            String string4 = string3;
            return string4.length() == 0 ? null : "[" + string4 + "]";
        }
        if (string.equals(jPL)) {
            return this.jQZ.cmL();
        }
        if (string.equals(jPM)) {
            bgt_0 bgt_02 = cvo_2.daL();
            if (bgt_02 == null) {
                return aum_0.cWf().c("levelShort.custom", this.jQZ.cmL());
            }
            ffq_0 ffq_02 = ffq_0.fVK();
            if (ffq_02 == null) {
                return aum_0.cWf().c("levelShort.custom", this.jQZ.cmL());
            }
            ahv_2 ahv_22 = new ahv_2();
            boolean bl = true;
            if (this.jQZ.dGh().fZq().length == 0) {
                if (this.jQZ.fUZ() instanceof bfp_1) {
                    short s = ((bfp_1)this.jQZ.fUZ()).cqz();
                    eki_0 eki_02 = bgt_02.dpK();
                    bl = eki_02.PG(((bfp_1)this.jQZ.fUZ()).cms()) >= s;
                }
            } else {
                ffS[] ffSArray;
                bl = false;
                bgt_0 bgt_03 = aue_0.cVJ().cVK();
                fhk fhk2 = bgt_03.dmL();
                for (ffS ffS2 : ffSArray = this.jQZ.dGh().fZq()) {
                    if (!fgt.a((exP)bgt_03, fhk2, this.jQZ, ffS2)) continue;
                    bl = true;
                }
            }
            if (!bl) {
                ahv_22.ceC().ih(awx_2.dnJ.bQk());
            }
            ahv_22.c(aum_0.cWf().c("levelShort.custom", this.jQZ.cmL()));
            if (!bl) {
                ahv_22.ceD();
            }
            return ahv_22.ceL();
        }
        if (string.equals(jPN)) {
            return aum_0.cWf().c("levelShort.custom", this.jQZ.cmL());
        }
        if (string.equals(jPH)) {
            return this.dSE();
        }
        if (string.equals(jPI)) {
            return this.dSD();
        }
        if (string.equals(jPJ)) {
            return bjf_1.b(this.jQZ);
        }
        if (string.equals(jPG)) {
            bgt_0 bgt_04 = cvo_2.daL();
            fhk fhk3 = bgt_04.dmL();
            int n = -1;
            for (Long l : fhk3.fUd().values()) {
                ffV ffV2;
                Optional<ffV> optional = bgt_04.dnP().B(l);
                if (optional.isEmpty() || (ffV2 = optional.get()).dOg().d() != this.jQZ.d()) continue;
                return true;
            }
            return false;
        }
        if (string.equals(jPK)) {
            bgt_0 bgt_05 = cvo_2.daL();
            TLongObjectIterator<ffs_0> tLongObjectIterator = bgt_05.dno().fVg();
            while (tLongObjectIterator.hasNext()) {
                tLongObjectIterator.advance();
                ffs_0 ffs_02 = (ffs_0)tLongObjectIterator.value();
                if (!ffs_02.pb(this.jQZ.d())) continue;
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
                return "<b color=\"00afea\">" + this.jQZ.fYi() + " " + aum_0.cWf().c("APShort", new Object[0]) + "</b>";
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
                arrayList.add(aum_0.cWf().c("effectOnEquip", new Object[0]));
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
            return beg_1.a(eLN.qJo, this.jQZ, null);
        }
        if (string.equals(jPU)) {
            return beg_1.a(eLN.qJo, this.jQZ, null);
        }
        if (string.equals(jPT)) {
            if (this.jRb == null) {
                this.jRb = beg_1.a(eLN.qJp, this.jQZ, null);
            }
            return !this.jRb.isEmpty() ? this.jRb : null;
        }
        if (string.equals(jPS)) {
            ArrayList<String> arrayList;
            ArrayList<String> arrayList3;
            ArrayList<Object> arrayList4 = new ArrayList<Object>();
            if (this.jQZ.fYi() > 0) {
                arrayList4.add(aum_0.cWf().c("cost", new Object[0]) + " : " + String.valueOf(this.eu(jQf)) + " " + beg_1.j(exx_2.rGj));
            }
            if (this.eu(jQh) != null) {
                arrayList4.add(aum_0.cWf().c(jQh, new Object[0]) + " : " + String.valueOf(this.eu(jQh)) + " " + beg_1.j(exx_2.rGq));
            }
            if ((arrayList3 = beg_1.a(eLN.qJo, this.jQZ, null)) != null && !arrayList3.isEmpty()) {
                arrayList4.add(aum_0.cWf().c("normal", new Object[0]) + " : ");
                arrayList4.addAll(arrayList3);
            }
            if ((arrayList = beg_1.a(eLN.qJp, this.jQZ, null)) != null && !arrayList.isEmpty()) {
                arrayList4.add(aum_0.cWf().c("critical", new Object[0]) + " : ");
                arrayList4.addAll(arrayList);
            }
            return arrayList4;
        }
        if (string.equals(jPX)) {
            String string6;
            StringBuilder stringBuilder = new StringBuilder();
            ang_2 ang_22 = this.jQZ.a(ffj_0.sge);
            bgt_0 bgt_06 = cvo_2.daL();
            if (ang_22 != null && (string6 = eLP.b(ang_22)).length() > 0) {
                if (ang_22.b(bgt_06, this, null, bgt_06.fgg())) {
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
            bgt_0 bgt_07 = cvo_2.daL();
            ahv_2 ahv_23 = new ahv_2();
            ang_2 ang_23 = bgt_07.dkZ() == null || bgt_07.dkZ().dGp() == etw_0.rqT ? this.jQZ.a(ffj_0.sgc) : this.jQZ.a(ffj_0.sgd);
            if (ang_23 != null) {
                object2 = eLP.b(ang_23);
                if (ang_23.b(bgt_07, this, null, null)) {
                    ahv_23.c((CharSequence)object2);
                } else {
                    ahv_23.ceC().ih("cc4444").c((CharSequence)object2).ceD();
                }
                bl = false;
            }
            ang_23 = null;
            object2 = this.jQZ.fUZ();
            if (object2 != null) {
                ang_23 = ((fgl_0)object2).bdo();
            }
            if (ang_23 != null) {
                if (!bl) {
                    ahv_23.ceH();
                }
                object = eLP.b(ang_23);
                if (ang_23.b(bgt_07, this, null, null)) {
                    ahv_23.c((CharSequence)object);
                } else {
                    ahv_23.ceC().ih("cc4444").c((CharSequence)object).ceD();
                }
                bl = false;
            }
            if ((object = (bfc_1)this.jQZ.fUZ()) != null && object instanceof bfp_1) {
                if (!bl) {
                    ahv_23.ceH();
                }
                short s = ((bfp_1)object).cqz();
                int n = ((bfp_1)object).cms();
                String string8 = aum_0.cWf().a(43, (long)n, new Object[0]);
                String string9 = aum_0.cWf().c("craft.neededAtLevel", string8, s);
                ahv_23.c(string9);
                bl = false;
            }
            if (object != null && (string7 = ((bfc_1)object).dTj()) != null) {
                ahv_23.ceC().ih("cc4444").c(string7).ceD();
            }
            return ahv_23.ceL();
        }
        if (string.equals(jQa)) {
            String string10;
            bfc_1 bfc_12;
            bgt_0 bgt_08 = cvo_2.daL();
            ArrayList<String> arrayList = new ArrayList<String>();
            ang_2 ang_24 = this.jQZ.a(ffj_0.sge);
            if (ang_24 != null) {
                this.a(ang_24, arrayList, bgt_08.fgg());
            }
            if ((ang_24 = bgt_08.dkZ() == null || bgt_08.dkZ().dGp() == etw_0.rqT ? this.jQZ.a(ffj_0.sgc) : this.jQZ.a(ffj_0.sgd)) != null) {
                this.a(ang_24, arrayList, null);
            }
            ang_24 = null;
            fgl_0 fgl_02 = this.jQZ.fUZ();
            if (fgl_02 != null) {
                ang_24 = fgl_02.bdo();
            }
            if (ang_24 != null) {
                this.a(ang_24, arrayList, null);
            }
            if ((bfc_12 = (bfc_1)this.jQZ.fUZ()) != null && bfc_12 instanceof bfp_1) {
                short s = ((bfp_1)bfc_12).cqz();
                int n = ((bfp_1)bfc_12).cms();
                eki_0 eki_03 = bgt_08.dpK();
                boolean bl = eki_03.tX(n) && eki_03.PG(n) >= s;
                String string11 = aum_0.cWf().a(43, (long)n, new Object[0]);
                String string12 = aum_0.cWf().c("craft.neededAtLevel", string11, s);
                if (!bl) {
                    string12 = String.format("<text color=\"%s\">%s</text>", "cc4444", string12);
                }
                arrayList.add(string12);
            }
            if (bfc_12 != null && (string10 = bfc_12.dTj()) != null) {
                arrayList.add(String.format("<text color=\"%s\">%s</text>", "cc4444", string10));
            }
            return arrayList;
        }
        if (string.equals(jQb) || string.equals(jQc)) {
            return auc_0.cVq().a((fjm)cvo_2.daL(), this.jQZ);
        }
        if (string.equals(jQd)) {
            bgt_0 bgt_09 = cvo_2.daL();
            return auc_0.cVq().zz(bgt_09 != null && bgt_09.aWO() == 1 ? this.jQZ.cpf() : this.jQZ.aVt());
        }
        if (string.equals(jQj)) {
            return this.jQZ.fUZ() != null;
        }
        if (string.equals(jQl)) {
            return ffn_0.sgo.UW(this.jQZ.d());
        }
        if (string.equals(jPZ)) {
            ahv_2 ahv_24 = new ahv_2();
            ang_2 ang_25 = this.jQZ.a(ffj_0.sgh);
            if (ang_25 != null) {
                bgt_0 bgt_010 = cvo_2.daL();
                String string13 = eLP.b(ang_25);
                if (ang_25.b(bgt_010, this, null, bgt_010.fgg())) {
                    ahv_24.c(string13);
                } else {
                    ahv_24.ceC().ih("cc4444").c(string13).ceD();
                }
            }
            return ahv_24.ceL();
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
                return !bmi_2.iDE.a(this.jQZ.d(), baj_2.hzf.cZr()).isEmpty();
            }
            if (string.equals(jQs)) {
                eki_0 eki_04 = baj_2.hzf.cZr();
                ArrayList<Integer> arrayList = new ArrayList<Integer>(bmi_2.iDE.a(this.jQZ.d(), eki_04));
                arrayList.sort(Integer::compareTo);
                Iterator iterator = arrayList.iterator();
                while (iterator.hasNext()) {
                    int n = (Integer)iterator.next();
                    if (!eki_04.tX(n)) continue;
                    return true;
                }
                return false;
            }
            if (string.equals(jQt)) {
                int n = this.jQZ.d();
                bei_0 bei_02 = new bei_0(n);
                eKQ.qEb.q(bei_02);
                return bei_02.jRk;
            }
            if (string.equals(jQr)) {
                eki_0 eki_05 = baj_2.hzf.cZr();
                ArrayList<Integer> arrayList = new ArrayList<Integer>(bmi_2.iDE.a(this.jQZ.d(), eki_05));
                arrayList.sort(Integer::compareTo);
                if (arrayList.isEmpty()) {
                    return null;
                }
                ahv_2 ahv_25 = new ahv_2();
                ahv_25.c(aum_0.cWf().c("crafts.item.isUsedIn", new Object[0])).ceH();
                int n = arrayList.size();
                for (int i = 0; i < n; ++i) {
                    int n3;
                    boolean bl;
                    if (i != 0) {
                        ahv_25.c(", ");
                    }
                    if (!(bl = eki_05.tX(n3 = ((Integer)arrayList.get(i)).intValue()))) {
                        ahv_25.ceC().ih(awx_2.dnJ.bQk());
                    }
                    ahv_25.c(aum_0.cWf().a(43, (long)n3, new Object[0]));
                    if (bl) continue;
                    ahv_25.ceD();
                }
                return ahv_25.toString();
            }
            if (string.equals(jQu)) {
                return false;
            }
            if (string.equals(jQv)) {
                return this.dSB();
            }
            if (string.equals(jQw)) {
                bgv_2 bgv_22 = (bgv_2)this.jQZ;
                return bgv_22.dUr().getStyle();
            }
            if (string.equals(jQx)) {
                bgv_2 bgv_23 = (bgv_2)this.jQZ;
                return aum_0.cWf().c(bgv_23.dUr().clY(), new Object[0]);
            }
            if (string.equals(jQy)) {
                return this.jQZ.fYz();
            }
            if (string.equals(jQA)) {
                if (this.jQZ.fVc() == fgW.smf) {
                    return null;
                }
                return aum_0.cWf().c(this.jQZ.fVc().clY(), new Object[0]);
            }
            if (string.equals(jQz)) {
                return this.jQZ.dUw();
            }
            if (string.equals(jQH)) {
                return this.jQZ.fUZ() != null && this.jQZ.fUZ().dTl() == fgM.skG;
            }
            if (string.equals(jQI)) {
                bfq_0 bfq_02;
                if (this.jRf == null && this.jQZ.fUZ() != null && this.jQZ.fUZ().dTl() == fgM.skG && (bfq_02 = (bfq_0)this.jQZ.fUZ()).dTq()) {
                    this.jRf = csw_2.Ms(bfq_02.dTp());
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
                return new ahv_2().ceC().ih(beo_0.e(this.jQZ.dwg())).c(aum_0.cWf().c("item.rarity." + this.jQZ.dwg().name(), new Object[0])).ceD().ceL();
            }
            if (string.equals(jQK)) {
                return aum_0.cWf().c("item.rarity." + this.jQZ.dwg().name(), new Object[0]);
            }
            if (string.equals(jQe)) {
                String string14 = auc_0.cVq().aZ(this.jQZ.dGh().aIi());
                if ((string14 == null || string14.isEmpty()) && this.jQZ.dGh().fZm() != null) {
                    return auc_0.cVq().aZ(this.jQZ.dGh().fZm().aIi());
                }
                return string14;
            }
        }
        if (string.equals(jQO)) {
            Long l = bgn_1.dUk().GC(this.jQZ.d());
            return beg_1.z(l);
        }
        if (string.equals(jQR)) {
            if (this.jQZ.dCC() == null) {
                return null;
            }
            return Stream.of(this.jQZ.dCC().fZe()).map(rd_02 -> bES.a(rd_02, false)).toList();
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
            return beg_1.t((bgv_2)this.jQZ).isPresent();
        }
        if (jQP.equals(string)) {
            return beg_1.u((bgv_2)this.jQZ).orElse(false);
        }
        if (jQW.equals(string)) {
            return this.dSA();
        }
        if (jQL.equals(string)) {
            return beo_0.d(this.jQZ.dwg());
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
            return aum_0.cWf().c("effects", new Object[0]).toUpperCase();
        }
        if (jQU.equals(string)) {
            return aum_0.cWf().c("requirements", new Object[0]).toUpperCase();
        }
        if (jQV.equals(string)) {
            return aum_0.cWf().c("utilization", new Object[0]).toUpperCase();
        }
        if (jQX.equals(string)) {
            return bpm_1.dCG().Fa(this.jQZ.d());
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
    public static Optional<bgf_1> t(@NotNull bgv_2 bgv_22) {
        fgl_0 fgl_02 = bgv_22.fUZ();
        if (!(fgl_02 instanceof bgf_1)) {
            return Optional.empty();
        }
        bgf_1 bgf_12 = (bgf_1)((Object)fgl_02);
        if (fgM.slb.contains(fgl_02.dTl())) {
            return Optional.empty();
        }
        return Optional.of(bgf_12);
    }

    public static boolean f(fhc_0 fhc_02) {
        bgt_0 bgt_02 = (bgt_0)fcI.sh(aue_0.cVJ().cVK().Xi());
        if (bgt_02 == null) {
            return false;
        }
        ang_2 ang_22 = fhc_02.a(ffj_0.sgc);
        if (!fhc_02.fAu()) {
            return false;
        }
        return ang_22 == null || ang_22.b(bgt_02, bgt_02.aZw(), fhc_02, bgt_02.fgg());
    }

    public static Optional<Boolean> u(bgv_2 bgv_22) {
        Optional<bgf_1> optional = beg_1.t(bgv_22);
        if (optional.isEmpty()) {
            return Optional.empty();
        }
        bgt_0 bgt_02 = (bgt_0)fcI.sh(aue_0.cVJ().cVO().xl());
        return Optional.of(optional.get().a(bgt_02, bgv_22));
    }

    /*
     * WARNING - void declaration
     */
    private void a(ang_2 ang_22, ArrayList<String> arrayList, Object object) {
        String string = eLP.b(ang_22);
        if (string.length() <= 0) {
            return;
        }
        String[] stringArray = BH.a(string, '\n');
        bgt_0 bgt_02 = cvo_2.daL();
        for (String string2 : stringArray) {
            void object2;
            if (!ang_22.b(bgt_02, this, null, object)) {
                String string3 = "<text color=\"cc4444\">" + string2 + "</text>";
            }
            arrayList.add((String)object2);
        }
    }

    private ber_0 dSB() {
        if (this.jRg == null) {
            this.jRg = new ber_0(this.jQZ);
        }
        return this.jRg;
    }

    public ArrayList<String> aO(ffV ffV2) {
        Object object;
        Object object2;
        ArrayList<String> arrayList = new ArrayList<String>();
        ArrayList<String> arrayList2 = beg_1.a(eLN.qJo, this.jQZ, ffV2);
        if (!arrayList2.isEmpty()) {
            arrayList.add(aum_0.cWf().c("effectOnUse", new Object[0]));
            object2 = arrayList2.iterator();
            while (object2.hasNext()) {
                object = (String)object2.next();
                arrayList.add((String)object);
            }
        }
        if (!((ArrayList)(object2 = beg_1.a(this.jQZ, ffV2))).isEmpty()) {
            arrayList.add(aum_0.cWf().c("effectOnEquip", new Object[0]));
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
            TLongObjectIterator<ffs_0> tLongObjectIterator = aue_0.cVJ().cVK().dno().fVg();
            while (tLongObjectIterator.hasNext()) {
                tLongObjectIterator.advance();
                ffs_0 ffs_02 = (ffs_0)tLongObjectIterator.value();
                if (!ffs_02.pb(this.jQZ.d())) continue;
                ang_2 ang_22 = this.jQZ.a(ffj_0.sge);
                if (ang_22 != null && !ang_22.b(aue_0.cVJ().cVK(), this, null, aue_0.cVJ().cVK().fgg())) break;
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
            Iterator<enk_0> iterator = this.jQZ.fYj();
            ArrayList<aoh_1> arrayList = new ArrayList<aoh_1>();
            this.jRc = "";
            while (iterator.hasNext()) {
                object = iterator.next();
                if (!object.fAt()) continue;
                arrayList.add(object.aZS());
            }
            if (!arrayList.isEmpty()) {
                object = aoi_1.m(arrayList);
                String string = ((aoh_1)object).bEq().toString();
                if (string.equals("SPECIAL")) {
                    return "";
                }
                try {
                    string = String.format(auc_0.cVq().bS("areasIconsPath"), string);
                    this.jRc = fty_2.b(string, -1, -1, null);
                }
                catch (fu_0 fu_02) {
                    jPx.error((Object)fu_02);
                }
            }
        }
        return this.jRc;
    }

    public ArrayList<String> dSG() {
        if (this.jRa == null) {
            this.jRa = beg_1.a(eLN.qJo, this.jQZ, null);
        }
        return this.jRa;
    }

    public ArrayList<String> dSH() {
        if (this.jRb == null) {
            this.jRb = beg_1.a(eLN.qJp, this.jQZ, null);
        }
        return this.jRb;
    }

    public static ArrayList<String> a(eLN eLN2, fhc_0 fhc_02, @Nullable ffV ffV2) {
        switch (eLN2) {
            case qJp: {
                return beg_1.a(ema_0.qMl, fhc_02, ffV2);
            }
        }
        return beg_1.a(ema_0.qMk, fhc_02, ffV2);
    }

    private static ArrayList<String> a(ema_0 ema_02, fhc_0 fhc_02, ffV ffV2) {
        bgt_0 bgt_02 = cvo_2.daL();
        emf_0 emf_02 = new emf_0(fhc_02, ffV2, ema_02);
        return emf_02.fzQ();
    }

    public ArrayList<String> dSI() {
        if (this.jRd == null) {
            this.jRd = beg_1.b(this.jQZ, null);
        }
        return this.jRd;
    }

    public static ArrayList<String> a(fhc_0 fhc_02, @Nullable ffV ffV2) {
        emf_0 emf_02 = new emf_0(fhc_02, ffV2, ema_0.qMj);
        ArrayList<String> arrayList = emf_02.fzQ();
        if (ffV2 != null && ffV2.dXg()) {
            arrayList.addAll(beg_1.aP(ffV2));
        }
        return arrayList;
    }

    @NotNull
    public static List<String> aP(@NotNull ffV ffV2) {
        return new eMi(ffV2.eAZ(), ffV2.dOg().dGh().fZq()).fAi();
    }

    public static ArrayList<String> b(fhc_0 fhc_02, @Nullable ffV ffV2) {
        emf_0 emf_02 = new emf_0(fhc_02, ffV2, ema_0.qMj);
        return emf_02.fzQ();
    }

    public static ArrayList<String> a(fhc_0 fhc_02, @Nullable ffV ffV2, short s) {
        emf_0 emf_02 = new emf_0(fhc_02, ffV2, s, ema_0.qMj);
        return emf_02.fzQ();
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

    public fhc_0 dOg() {
        return this.jQZ;
    }

    public fgj dwg() {
        return this.jQZ.dwg();
    }

    public static String z(@Nullable Long l) {
        return aum_0.cWf().c("market.item.average.price.suffix", l != null && l > 0L ? l : -1L);
    }

    private static String j(exx_2 exx_22) {
        try {
            return auk_0.hrk.a(BK.avt, exx_22.name(), null, 22, 22);
        }
        catch (fu_0 fu_02) {
            jPx.warn((Object)("Icon not found for " + exx_22.name()), (Throwable)fu_02);
            return null;
        }
    }
}

