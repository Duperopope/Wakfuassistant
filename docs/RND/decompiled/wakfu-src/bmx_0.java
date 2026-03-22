/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bMx
 */
public class bmx_0
extends fqE<bmt_0>
implements aeh_2,
Comparable<bmx_0> {
    public static final String kxw = "id";
    public static final String kxx = "name";
    public static final String kxy = "level";
    public static final String kxz = "uiSelectedDeckCappedLevel";
    public static final String kxA = "minLevel";
    public static final String kxB = "maxLevel";
    public static final String kxC = "levelTextShort";
    public static final String kxD = "uiSelectedDeckCappedLevelTextShort";
    public static final String kxE = "spell";
    public static final String kxF = "ap";
    public static final String kxG = "mp";
    public static final String kxH = "wp";
    public static final String kxI = "huppermageResource";
    public static final String kxJ = "sp";
    public static final String kxK = "chrage";
    public static final String kxL = "range";
    public static final String kxM = "areaOfEffectIconURL";
    public static final String kxN = "areaOfEffectBigIconURL";
    public static final String kxO = "elementsUsedIconURL";
    public static final String kxP = "smallIconUrl";
    public static final String kxQ = "bigIconUrl";
    public static final String kxR = "longDescription";
    public static final String kxS = "description";
    public static final String kxT = "shortDescription";
    public static final String kxU = "shortOrCriticalDescription";
    public static final String kxV = "criticalDescription";
    public static final String kxW = "shortDescriptionElement";
    public static final String kxX = "usable";
    public static final String kxY = "unlockLevel";
    public static final String kxZ = "hasCastIntervalRestrictions";
    public static final String kya = "castIntervalRestrictionsDescription";
    public static final String kyb = "castMaxPerTarget";
    public static final String kyc = "castMaxPerTurn";
    public static final String kyd = "castInterval";
    public static final String kye = "testLineOfSight";
    public static final String kyf = "castOnlyInLine";
    public static final String kyg = "testFreeCell";
    public static final String kyh = "testNotBorderCell";
    public static final String kyi = "conditionsDescription";
    public static final String kyj = "isMonsterSpell";
    public static final String kyk = "hasCriticalEffect";
    public static final String kyl = "isCriticalDescription";
    public static final String kym = "isSupport";
    public static final String kyn = "isPassive";
    public static final String kyo = "modifiableRange";
    public static final String kyp = "hasEvolutionCondition";
    public static final String kyq = "evolutionText";
    public static final String kyr = "isUnlockedSpell";
    public static final String kys = "isInCurrentDeck";
    public static final String kyt = "tabbedContainerSize";
    public static final String kyu = "isCastableOnCaster";
    public static final String kyv = "isCastableThroughPortal";
    public static final String kyw = "isCastableOnDiag";
    public static final String kyx = "isAreaSpell";
    public static final String kyy = "isSingleTargetSpell";
    public static final String kyz = "elementColor";
    public static final String kyA = "effectLabel";
    public static final String kyB = "requirementsLabel";
    public static final String[] kyC = new String[]{"id", "name", "levelTextShort", "level", "ap", "mp", "wp", "huppermageResource", "sp", "chrage", "range", "elementsUsedIconURL", "spell", "smallIconUrl", "bigIconUrl", "longDescription", "description", "usable", "castMaxPerTarget", "castMaxPerTurn", "castInterval", "testLineOfSight", "castOnlyInLine", "testFreeCell", "testNotBorderCell", "conditionsDescription", "areaOfEffectIconURL", "areaOfEffectBigIconURL", "isMonsterSpell", "shortDescription", "hasEvolutionCondition", "evolutionText", "criticalDescription", "hasCriticalEffect", "isSupport", "isPassive", "modifiableRange", "isInCurrentDeck", "isCastableOnCaster", "isCastableThroughPortal", "isCastableOnDiag", "isAreaSpell", "isSingleTargetSpell", "uiSelectedDeckCappedLevelTextShort", "isUnlockedSpell", "unlockLevel", "elementColor", "tabbedContainerSize", "shortOrCriticalDescription", "uiSelectedDeckCappedLevel", "isCriticalDescription", "effectLabel", "requirementsLabel"};
    private boolean kyD;
    private final short kyE = (short)ewo_0.oBF.i(ewr_0.oCk);
    private final exP kyF;
    private static final int kyG = 225;
    private static final int kyH = 0;
    private static final int kyI = 24;
    private static final int kyJ = 26;
    private static final int kyK = 309;
    private static final int kyL = 38;

    public bmx_0(exP exP2) {
        this.kyF = exP2;
    }

    public bmx_0(bmt_0 bmt_02, short s, long l, exP exP2) {
        this.kyF = exP2;
        this.sUL = bmt_02;
        this.ejt = (short)Math.min(s, bmt_02.Fq());
        this.bgK = l;
    }

    public exP eeL() {
        return this.kyF;
    }

    @Override
    public fqF<bmt_0> eeM() {
        return bmb_0.eeV();
    }

    public bmx_0 ic(boolean bl) {
        bmx_0 bmx_02 = new bmx_0(this.kyF);
        bmx_02.sUL = this.sUL;
        bmx_02.ejt = bl ? (short)0 : this.ejt;
        bmx_02.cj(bmx_02.ejt);
        bmx_02.bgK = aym_2.bSE();
        return bmx_02;
    }

    public bmx_0 eeN() {
        return this.ic(false);
    }

    public bmx_0 eeO() {
        bmx_0 bmx_02 = new bmx_0(this.kyF);
        bmx_02.sUL = this.sUL;
        bmx_02.ejt = this.ejt;
        bmx_02.bgK = this.bgK;
        return bmx_02;
    }

    public bmx_0 U(exP exP2) {
        bmx_0 bmx_02 = new bmx_0(exP2);
        bmx_02.sUL = this.sUL;
        bmx_02.ejt = this.ejt;
        bmx_02.bgK = this.bgK;
        return bmx_02;
    }

    @Override
    public int aVt() {
        return ((bmt_0)this.sUL).aVt();
    }

    @Override
    public String[] bxk() {
        return kyC;
    }

    @Override
    public Object eu(String string) {
        bhJ bhJ2 = bmx_0.eeS();
        switch (string) {
            case "id": {
                return ((bmt_0)this.sUL).d();
            }
            case "levelTextShort": {
                return aum_0.cWf().c("levelShort.custom", this.cmL());
            }
            case "uiSelectedDeckCappedLevelTextShort": {
                return aum_0.cWf().c("levelShort.custom", this.ar(bhJ2));
            }
            case "minLevel": {
                return 1;
            }
            case "maxLevel": {
                return Math.min(this.aVe(), this.kyE);
            }
            case "level": {
                return this.cmL();
            }
            case "spell": {
                return this.sUL;
            }
            case "uiSelectedDeckCappedLevel": {
                return this.ar(bhJ2);
            }
            case "smallIconUrl": {
                return auc_0.cVq().zA(this.aVt());
            }
            case "bigIconUrl": {
                return auc_0.cVq().zB(this.aVt());
            }
            case "name": {
                if (this.sUL != null) {
                    return ((bmt_0)this.sUL).getName();
                }
                return null;
            }
            case "ap": {
                if (this.sUL != null) {
                    int n;
                    bgt_0 bgt_02;
                    if (((bmt_0)this.sUL).cvP()) {
                        bgt_02 = aue_0.cVJ().cVK();
                        if (bgt_02.dmL().t(ffS.sgQ) != null) {
                            ffV ffV2 = bgt_02.dmL().a(bgt_02.dnP(), ffS.sgQ);
                            n = ((bmt_0)this.sUL).h(this, bhJ2, null, bhJ2.fgg()) + ffV2.dOg().fYi();
                        } else {
                            n = ((bmt_0)this.sUL).h(this, bhJ2, null, bhJ2.fgg());
                        }
                    } else {
                        n = ((bmt_0)this.sUL).h(this, bhJ2, null, bhJ2.fgg());
                    }
                    bgt_02 = aue_0.cVJ().cVK();
                    if (bgt_02 != null && n > 0) {
                        if (bgt_02.a(exe_1.rDE)) {
                            n += 2;
                        } else if (bgt_02.a(exe_1.rDD)) {
                            ++n;
                        }
                    }
                    return n;
                }
                return null;
            }
            case "mp": {
                if (this.sUL != null) {
                    int n = ((bmt_0)this.sUL).g((fqE)this, (Object)bhJ2, null, bhJ2.fgg());
                    bgt_0 bgt_03 = aue_0.cVJ().cVK();
                    if (bgt_03 != null && n > 0) {
                        if (bgt_03.a(exe_1.rDH)) {
                            n += 2;
                        } else if (bgt_03.a(exe_1.rDG)) {
                            ++n;
                        }
                    }
                    return n;
                }
                return null;
            }
            case "wp": {
                if (this.sUL != null) {
                    bgt_0 bgt_04 = aue_0.cVJ().cVK();
                    int n = ((bmt_0)this.sUL).e((fqE)this, (Object)bhJ2, null, bhJ2.fgg());
                    if (bgt_04 != null && n > 0) {
                        if (bgt_04.a(exe_1.rDy)) {
                            n += 2;
                        } else if (bgt_04.a(exe_1.rDx)) {
                            ++n;
                        }
                    }
                    return n;
                }
                return null;
            }
            case "chrage": {
                if (this.sUL != null) {
                    fqO fqO2 = ((bmt_0)this.sUL).g((fqE)this, bhJ2, null, bhJ2.fgg());
                    return fqO2.r(exx_2.rGQ);
                }
                return null;
            }
            case "huppermageResource": {
                if (this.sUL != null) {
                    fqO fqO3 = ((bmt_0)this.sUL).g((fqE)this, bhJ2, null, bhJ2.fgg());
                    int n = fqK.a(fqO3, bhJ2);
                    return n < 0 ? -n : n;
                }
                return null;
            }
            case "sp": {
                if (this.sUL != null) {
                    fqO fqO4 = ((bmt_0)this.sUL).g((fqE)this, bhJ2, null, bhJ2.fgg());
                    return fqO4.r(exx_2.rHT);
                }
                return null;
            }
            case "range": {
                if (this.sUL == null) {
                    return null;
                }
                int n = this.eeU();
                int n2 = this.eeT();
                if ((n > 0 || n2 > 0) && n != n2) {
                    return n + "-" + n2;
                }
                return n2;
            }
            case "areaOfEffectIconURL": {
                if (this.sUL != null) {
                    for (enk_0 enk_02 : this) {
                        aoy_2 aoy_22 = enk_02.aZS().bEq();
                        if (aoy_22 == aoy_2.cLB || aoy_22 == aoy_2.cLA) {
                            return null;
                        }
                        String string2 = aoy_22.toString();
                        try {
                            return String.format(auc_0.cVq().bS("areasIconsPath"), string2);
                        }
                        catch (Exception exception) {
                            sUG.error((Object)("Impossible de trouver l'url de la zone " + string2));
                        }
                    }
                }
                return null;
            }
            case "areaOfEffectBigIconURL": {
                if (this.sUL != null) {
                    for (enk_0 enk_03 : this) {
                        String string3 = enk_03.aZS().bEq().toString();
                        try {
                            return String.format(auc_0.cVq().bS("areasBigIconsPath"), string3);
                        }
                        catch (Exception exception) {
                            sUG.error((Object)("Impossible de trouver l'url de la zone " + string3));
                        }
                    }
                }
                return null;
            }
            case "elementsUsedIconURL": {
                if (this.sUL != null) {
                    eNd eNd2 = ((bmt_0)this.sUL).g(fqS.sWr) ? eNd.qPe : eNd.ff(((bmt_0)this.sUL).giG());
                    String string4 = "";
                    if (eNd2 != null) {
                        try {
                            string4 = String.format(auc_0.cVq().bS("elementsIconsPath"), eNd2.name());
                        }
                        catch (fu_0 fu_02) {
                            sUG.error((Object)"PropertyException during getFieldValue for ELEMENT_USED_ICON_URL_FIELD", (Throwable)fu_02);
                        }
                        return string4;
                    }
                    return null;
                }
                return null;
            }
            case "longDescription": {
                if (this.sUL != null) {
                    return ((bmt_0)this.sUL).eeD();
                }
                return null;
            }
            case "description": {
                return this.a(eLN.qJn);
            }
            case "shortDescription": {
                return this.a(eLN.qJo);
            }
            case "shortOrCriticalDescription": {
                return this.kyD ? this.a(eLN.qJp) : this.a(eLN.qJo);
            }
            case "criticalDescription": {
                return this.a(eLN.qJp);
            }
            case "shortDescriptionElement": {
                if (this.sUL != null) {
                    eNd eNd3 = eNd.ff(((bmt_0)this.sUL).giG());
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(aum_0.cWf().c("spellDescription.levelShort", new Object[0])).append(" ").append(this.cmL());
                    if (eNd3 == eNd.qPf) {
                        stringBuilder.append(" ").append(aum_0.cWf().c(eNd3.name(), new Object[0]));
                    } else if (eNd3 != eNd.qOY) {
                        stringBuilder.append(" ").append(aum_0.cWf().c("spellDescription.element", new Object[0])).append(" ").append(aum_0.cWf().c(eNd3.name(), new Object[0]));
                    }
                    return stringBuilder;
                }
                return null;
            }
            case "usable": {
                bgt_0 bgt_05 = aue_0.cVJ().cVK();
                bsj_0 bsj_02 = bgt_05.dkZ();
                if (bsj_02 == null) {
                    return true;
                }
                bgy bgy2 = bsj_02.dGQ().dIA();
                bmx_0 bmx_02 = null;
                if (bgy2 != null && bgy2.dkQ()) {
                    bmx_02 = bgy2.jr(this.LV());
                }
                if (bgy2 == null || bmx_02 == null) {
                    return false;
                }
                fqH fqH2 = bsj_02.a((exP)bgy2, bmx_02, null, true);
                return fqH2 == fqH.sUS;
            }
            case "castIntervalRestrictionsDescription": {
                StringBuilder stringBuilder = new StringBuilder();
                boolean bl = true;
                byte by = ((bmt_0)this.sUL).a((fqE)this, bhJ2, null, bhJ2.bdV());
                byte by2 = this.b(bhJ2, null, bhJ2.bdV());
                byte by3 = this.eeR();
                if (by > 0) {
                    bl = false;
                    stringBuilder.append(aum_0.cWf().c("spell.cast.maxPerTarget", by));
                }
                if (by2 > 0) {
                    if (bl) {
                        bl = false;
                    } else {
                        stringBuilder.append("\n");
                    }
                    stringBuilder.append(aum_0.cWf().c("spell.cast.maxPerTurn", by2));
                }
                if (by3 == -1 || by3 > 0) {
                    if (bl) {
                        bl = false;
                    } else {
                        stringBuilder.append("\n");
                    }
                    if (by3 == -1) {
                        stringBuilder.append(aum_0.cWf().c("spell.cast.oncePerFight", new Object[0]));
                    } else {
                        stringBuilder.append(aum_0.cWf().c("spell.cast.minInterval", by3));
                    }
                }
                return stringBuilder.toString();
            }
            case "hasCastIntervalRestrictions": {
                return ((bmt_0)this.sUL).a((fqE)this, bhJ2, null, bhJ2.bdV()) > 0 || this.b(bhJ2, null, bhJ2.bdV()) > 0 || this.eeR() > 0;
            }
            case "castMaxPerTurn": {
                return this.b(bhJ2, null, null) > 0 ? Byte.valueOf(this.b(bhJ2, null, bhJ2.bdV())) : "-";
            }
            case "castMaxPerTarget": {
                return ((bmt_0)this.sUL).a((fqE)this, bhJ2, null, null) > 0 ? Byte.valueOf(((bmt_0)this.sUL).a((fqE)this, bhJ2, null, bhJ2.bdV())) : "-";
            }
            case "castInterval": {
                return this.eeR();
            }
            case "testLineOfSight": {
                return ((bmt_0)this.sUL).a((fqE)this, (Object)bhJ2, null, bhJ2.fgg());
            }
            case "testFreeCell": {
                return ((bmt_0)this.sUL).f((fqE)this, bhJ2, null, bhJ2.bdV());
            }
            case "testNotBorderCell": {
                return ((bmt_0)this.sUL).fYo();
            }
            case "castOnlyInLine": {
                return ((bmt_0)this.sUL).Zg(this.cmL()) > 1 && ((bmt_0)this.sUL).b((fqE)this, (Object)bhJ2, null, bhJ2.fgg());
            }
            case "conditionsDescription": {
                String string5;
                ang_2 ang_22 = ((bmt_0)this.sUL).giF();
                ArrayList<String> arrayList = new ArrayList<String>();
                if (ang_22 != null && !(string5 = eLP.b(ang_22)).isEmpty()) {
                    String[] stringArray;
                    String[] stringArray2 = stringArray = string5.split("\n");
                    int n = stringArray2.length;
                    for (int i = 0; i < n; ++i) {
                        String string6 = stringArray2[i];
                        arrayList.add(string6);
                    }
                }
                if (!(string5 = (String)this.eu(kya)).isEmpty()) {
                    for (String string7 : string5.split("\n")) {
                        arrayList.add(string7);
                    }
                }
                return !arrayList.isEmpty() ? arrayList : null;
            }
            case "isMonsterSpell": {
                return bfq_2.dge().BO(((bmt_0)this.sUL).xT()) == null;
            }
            case "hasCriticalEffect": {
                for (enk_0 enk_04 : this) {
                    if (!enk_04.df(1L)) continue;
                    return true;
                }
                return false;
            }
            case "isSupport": {
                return ((bmt_0)this.giP()).giG() == 9;
            }
            case "isPassive": {
                return ((bmt_0)this.giP()).eeY();
            }
            case "modifiableRange": {
                return ((bmt_0)this.giP()).d((fqE)this, (Object)bhJ2, null, bhJ2.fgg());
            }
            case "hasEvolutionCondition": {
                if (bhJ2 == null) {
                    return false;
                }
                if (!this.eeQ()) {
                    return true;
                }
                return null;
            }
            case "evolutionText": {
                short s;
                Object object;
                if (!this.eeQ()) {
                    ArrayList<String> arrayList = new ArrayList<String>();
                    object = ((bmt_0)this.giP()).giJ();
                    if (object != null) {
                        arrayList.add(eLP.b((amx_1)object));
                        return arrayList;
                    }
                }
                if ((s = ((bmt_0)this.giP()).cvo()) <= 1) {
                    return null;
                }
                object = new ArrayList();
                object.add(aum_0.cWf().c("required.level.custom", s));
                return object;
            }
            case "unlockLevel": {
                return ((bmt_0)this.sUL).cvo();
            }
            case "isUnlockedSpell": {
                if (bhJ2 == null) {
                    return true;
                }
                if (cvu_2.eUn() != null) {
                    return true;
                }
                return this.eeQ();
            }
            case "isCastableOnCaster": {
                return ((bmt_0)this.sUL).l(this, bhJ2, null, bhJ2.bdV());
            }
            case "isCastableThroughPortal": {
                return ((bmt_0)this.sUL).g(fqS.sWm);
            }
            case "isCastableOnDiag": {
                return ((bmt_0)this.sUL).k(this, bhJ2, null, bhJ2.bdV());
            }
            case "isAreaSpell": {
                return ((bmt_0)this.sUL).g(fqS.sWj);
            }
            case "isSingleTargetSpell": {
                return ((bmt_0)this.sUL).g(fqS.sWi);
            }
            case "isInCurrentDeck": {
                return this.bM(bhJ2);
            }
            case "tabbedContainerSize": {
                ArrayList<String> arrayList = this.a(eLN.qJo);
                int n = arrayList == null ? 0 : arrayList.size() + 2;
                int n3 = 26 + n * 24;
                n3 = GC.a(n3, 0, 225);
                return new fsm_1(309, n3 + 38);
            }
            case "elementColor": {
                eNd eNd4 = eNd.ff(((bmt_0)this.sUL).giG());
                if (((bmt_0)this.sUL).g(fqS.sWr)) {
                    return new fhl_2(ett_1.opu);
                }
                fqO fqO5 = ((bmt_0)this.sUL).g((fqE)this, this.kyF, null, this.kyF.fgg());
                if (fqO5.r(exx_2.rHT) > 0) {
                    return new fhl_2(ett_1.opv);
                }
                switch (eNd4) {
                    case qOZ: {
                        return new fhl_2(ett_1.opq);
                    }
                    case qPa: {
                        return new fhl_2(ett_1.opr);
                    }
                    case qPb: {
                        return new fhl_2(ett_1.ops);
                    }
                    case qPc: {
                        return new fhl_2(ett_1.opt);
                    }
                }
                return new fhl_2(ett_1.opw);
            }
            case "isCriticalDescription": {
                return this.kyD;
            }
            default: {
                return null;
            }
            case "effectLabel": {
                return ((bmt_0)this.sUL).eeY() ? aum_0.cWf().c("passive", new Object[0]).toUpperCase() : aum_0.cWf().c("effects", new Object[0]).toUpperCase();
            }
            case "requirementsLabel": 
        }
        return aum_0.cWf().c("requirements", new Object[0]).toUpperCase();
    }

    private int eeP() {
        if (this.kyF == null || this.kyF.dnJ() == null || this.kyF.dnK() == null) {
            return 0;
        }
        eIm eIm2 = this.kyF.dnK();
        frd frd2 = this.kyF.dnJ().Zx(eIm2.fwt().wp());
        return this.c(frd2);
    }

    public short c(frd frd2) {
        int n = frh.a(((bmt_0)this.sUL).d(), frd2, this.kyF);
        if (n == -1) {
            return this.cmL();
        }
        return (short)n;
    }

    private int ar(bhJ bhJ2) {
        frd frd2;
        if (this.kyF instanceof bhx_0) {
            return this.ejt;
        }
        if (aue_0.cVJ().c(cvu_2.eTO()) && (frd2 = bhJ2.dnM()) != null) {
            return this.c(frd2);
        }
        return this.eeP();
    }

    private boolean eeQ() {
        bgt_0 bgt_02;
        bgt_0 bgt_03 = cvu_2.eUm();
        bgt_0 bgt_04 = bgt_02 = bgt_03 != null ? bgt_03 : aue_0.cVJ().cVK();
        if (bgt_02 == null) {
            return true;
        }
        frd frd2 = bgt_02.dnM();
        if (frd2 == null) {
            return false;
        }
        int n = frd2.tL() <= 0 ? bgt_02.cmL() : frd2.tL();
        return n >= ((bmt_0)this.sUL).cvo();
    }

    protected byte eeR() {
        return ((bmt_0)this.sUL).d((fqE)this, this.kyF, null, null);
    }

    public ArrayList<String> a(eLN eLN2) {
        if (this.sUL != null) {
            ang_2 ang_22 = ((bmt_0)this.sUL).giF();
            ArrayList<String> arrayList = null;
            ArrayList<String> arrayList2 = null;
            if (ang_22 != null) {
                ArrayList<azx_1<String, ang_2>> arrayList3 = eLP.h(ang_22);
                bhJ bhJ2 = bmx_0.eeS();
                bsj_0 bsj_02 = bhJ2.dkZ();
                for (azx_1<String, ang_2> azx_12 : arrayList3) {
                    try {
                        if (bsj_02 == null || azx_12.aHI().b(bhJ2, bhJ2, this, bsj_02)) {
                            if (arrayList == null) {
                                arrayList = new ArrayList<String>();
                            }
                            arrayList.add(azx_12.getFirst());
                            continue;
                        }
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList<String>();
                        }
                        arrayList2.add(azx_12.getFirst());
                    }
                    catch (amf_2 amf_22) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(azx_12.getFirst());
                    }
                }
            }
            return eLL.a(new eMj(this, arrayList, arrayList2, eLN2));
        }
        return null;
    }

    private static bhJ eeS() {
        if (aue_0.cVJ().c(csp_1.eOC())) {
            return csp_1.eOD();
        }
        if (aue_0.cVJ().c(cvu_2.eTO())) {
            return cvu_2.eUm();
        }
        return aue_0.cVJ().cVK();
    }

    public int eeT() {
        if (this.kyF == null) {
            bhJ bhJ2 = bmx_0.eeS();
            return ((bmt_0)this.sUL).i(this, bhJ2, null, bhJ2.bdV());
        }
        int n = this.kyF.c(exx_2.rGq);
        int n2 = ((bmt_0)this.sUL).i(this, this.kyF, null, this.kyF.bdV());
        int n3 = ((bmt_0)this.sUL).d((fqE)this, (Object)this.kyF, null, this.kyF.bdV()) ? n2 + n : n2;
        return Math.max(this.eeU(), n3);
    }

    public int eeU() {
        if (this.kyF == null) {
            bhJ bhJ2 = bmx_0.eeS();
            return ((bmt_0)this.sUL).j(this, bhJ2, null, bhJ2.bdV());
        }
        return ((bmt_0)this.sUL).j(this, this.kyF, null, this.kyF.bdV());
    }

    public int e(@NotNull bmx_0 bmx_02) {
        return ((bmt_0)this.sUL).getName().compareTo(((bmt_0)bmx_02.giP()).getName());
    }

    @Override
    public short cj(short s) {
        if (this.ejt != super.cj(s)) {
            fse_1.gFu().a((aef_2)this, kxy, kxC);
        }
        return this.ejt;
    }

    public boolean bM(bgy bgy2) {
        if (bgy2 == null) {
            return false;
        }
        frd frd2 = bgy2.dnM();
        if (frd2 == null) {
            return false;
        }
        if (((bmt_0)this.sUL).eeY()) {
            return frd2.eEv().contains(((bmt_0)this.sUL).d());
        }
        return frd2.eEu().contains(((bmt_0)this.sUL).d());
    }

    public void id(boolean bl) {
        if (this.kyD == bl) {
            return;
        }
        this.kyD = bl;
        fse_1.gFu().a((aef_2)this, kxU, kyl);
    }

    @Override
    public /* synthetic */ RT bfg() {
        return this.eeO();
    }

    @Override
    public /* synthetic */ RT bff() {
        return this.eeN();
    }

    @Override
    public /* synthetic */ int compareTo(@NotNull Object object) {
        return this.e((bmx_0)object);
    }
}

