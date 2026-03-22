/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntShortIterator
 *  gnu.trove.list.array.TIntArrayList
 *  gnu.trove.list.array.TLongArrayList
 *  gnu.trove.list.array.TShortArrayList
 *  gnu.trove.map.hash.TByteShortHashMap
 *  gnu.trove.map.hash.TIntShortHashMap
 */
import gnu.trove.iterator.TIntShortIterator;
import gnu.trove.list.array.TIntArrayList;
import gnu.trove.list.array.TLongArrayList;
import gnu.trove.list.array.TShortArrayList;
import gnu.trove.map.hash.TByteShortHashMap;
import gnu.trove.map.hash.TIntShortHashMap;
import java.util.ArrayList;
import java.util.LinkedList;

public class eLP {
    public static final String qJr = "or";
    public static final String qJs = "xor";
    public static final String qJt = "critere.true";
    public static final String qJu = "critere.false";
    public static final String qJv = "critere.hp";
    public static final String qJw = "critere.ap";
    public static final String qJx = "critere.mp";
    public static final String qJy = "critere.wp";
    public static final String qJz = "critere.chrage";
    public static final String qJA = "critere.control";
    public static final String qJB = "critere.tackle";
    public static final String qJC = "critere.block";
    public static final String qJD = "critere.ranged.dmg";
    public static final String qJE = "critere.ferocity";
    public static final String qJF = "critere.dodge";
    public static final String qJG = "critere.range";
    public static final String qJH = "LEADERSHIPShort";
    public static final String qJI = "critere.willpower";
    public static final String qJJ = "critere.casterbreed";
    public static final String qJK = "critere.targetbreed";
    public static final String qJL = "critere.casterbreedId";
    public static final String qJM = "critere.targetbreedId";
    public static final String qJN = "critere.nottargetbreedid";
    public static final String qJO = "critere.hassummon";
    public static final String qJP = "critere.nothassummon";
    public static final String qJQ = "critere.hasequip";
    public static final String qJR = "critere.nothasequip";
    public static final String qJS = "critere.hasequipwithpos";
    public static final String qJT = "critere.nothasequipwithpos";
    public static final String qJU = "critere.targethour";
    public static final String qJV = "critere.nottargethour";
    public static final String qJW = "critere.isennemy";
    public static final String qJX = "critere.isnotennemy";
    public static final String qJY = "critere.petinrange";
    public static final String qJZ = "critere.summoned";
    public static final String qKa = "critere.not.summoned";
    public static final String qKb = "critere.beaconamount";
    public static final String qKc = "critere.barrelamount";
    public static final String qKd = "critere.trapamount";
    public static final String qKe = "critere.nbsummons";
    public static final String qKf = "critere.nbroublabot";
    public static final String qKg = "critere.inf";
    public static final String qKh = "critere.sup";
    public static final String qKi = "critere.infeq";
    public static final String qKj = "critere.supeq";
    public static final String qKk = "critere.isSex.";
    public static final String qKl = "critere.getSpellTreeLevel";
    public static final String qKm = "critere.kamaCount";
    public static final String qKn = "critere.hasState";
    public static final String qKo = "critere.notHasState";
    public static final String qKp = "critere.hasStateFromLevel";
    public static final String qKq = "critere.notHasStateFromLevel";
    public static final String qKr = "critere.hasCraft";
    public static final String qKs = "critere.notHasCraft";
    public static final String qKt = "critere.symbiotSpace";
    public static final String qKu = "critere.craftLevel";
    public static final String qKv = "critere.getWakfuGaugeValue";
    public static final String qKw = "critere.getStasisGauge";
    public static final String qKx = "critere.getCrimeScore";
    public static final String qKy = "critere.isDay";
    public static final String qKz = "critere.notIsDay";
    public static final String qKA = "critere.isDead";
    public static final String qKB = "critere.isNotDead";
    public static final String qKC = "critere.istargetonsameteam";
    public static final String qKD = "critere.notistargetonsameteam";
    public static final String qKE = "critere.getZoneWakfu";
    public static final String qKF = "critere.getZoneStasis";
    public static final String qKG = "critere.hasSummonWithBreed";
    public static final String qKH = "critere.nothasSummonWithBreed";
    public static final String qKI = "critere.getInstanceId";
    public static final String qKJ = "critere.notGetInstanceId";
    public static final String qKK = "critere.getNationId";
    public static final String qKL = "critere.notGetNationId";
    public static final String qKM = "critere.getNationAlignment";
    public static final String qKN = "critere.getNoNationAlignment";
    public static final String qKO = "critere.target";
    public static final String qKP = "critere.isCarryingOwnBarrel";
    public static final String qKQ = "critere.hasSurrondingCellWithOwnBarrel";
    public static final String qKR = "critere.distanceBetweenTargetAndNearestAllyBeacon";
    public static final String qKS = "critere.isTargetCellValidForNewObstacle";
    public static final String qKT = "critere.nbBombs";
    public static final String qKU = "critere.getTotalLeadership";
    public static final String qKV = "critere.hasAvailableCreature";
    public static final String qKW = "critere.isOnOwnDial";
    public static final String qKX = "critere.not.isCarried";
    public static final String qKY = "critere.isCarried";
    public static final String qKZ = "critere.add";
    public static final String qLa = "critere.guildLevel";
    public static final String qLb = "critere.guildBonus";
    public static final String qLc = "critere.hasAnotherSameEquipment";
    public static final String qLd = "critere.isOnHour";
    public static final String qLe = "critere.notIsOnHour";
    public static final String qLf = "critere.isObstacle";
    public static final String qLg = "critere.notIsObstacle";
    public static final String qLh = "critere.hasEquipmentId";
    public static final String qLi = "critere.hasUnlockedCompanion";
    public static final String qLj = "critere.isCompanion";
    public static final String qLk = "critere.isCompanionNegated";
    public static final String qLl = "critere.notHasUnlockedCompanion";
    public static final String qLm = "critere.getStateCountInRange";
    public static final String qLn = "critere.getOwnTeamStateCountInRange";
    public static final String qLo = "critere.hasSubscriptionLevel";
    public static final String qLp = "critere.hasPvpRank";
    public static final String qLq = "critere.isAchievementActive";
    public static final String qLr = "critere.not.isAchievementActive";
    public static final String qLs = "critere.isAchievementComplete";
    public static final String qLt = "critere.not.isAchievementComplete";
    public static final String qLu = "critere.isAchievementFailed";
    public static final String qLv = "critere.not.isAchievementFailed";
    public static final String qLw = "critere.isAchievementObjectiveComplete";
    public static final String qLx = "critere.not.isAchievementObjectiveComplete";
    public static final String qLy = "critere.isAchievementRepeatable";
    public static final String qLz = "critere.not.isAchievementRepeatable";
    public static final String qLA = "critere.isAchievementRunning";
    public static final String qLB = "critere.not.isAchievementRunning";
    public static final String qLC = "critere.getCompanyRank";
    public static final String qLD = "critere.isKnownRecipe";
    public static final String qLE = "critere.not.isInNationJail";
    public static final String qLF = "critere.isInNationJail";
    public static final String qLG = "critere.not.isInAdminJail";
    public static final String qLH = "critere.isInAdminJail";
    public static final String qLI = "critere.not.isInHavenBag";
    public static final String qLJ = "critere.isInHavenBag";
    public static final String qLK = "critere.not.isBattleground";
    public static final String qLL = "critere.isBattleground";
    public static final String qLM = "critere.getAchievementCategoryActiveCount";

    public static ArrayList<String> ab(ArrayList<ang_2> arrayList) {
        TIntShortIterator tIntShortIterator;
        short s;
        short s2;
        Object object;
        TShortArrayList tShortArrayList = null;
        TByteShortHashMap tByteShortHashMap = null;
        TByteShortHashMap tByteShortHashMap2 = null;
        TIntShortHashMap tIntShortHashMap = null;
        TIntShortHashMap tIntShortHashMap2 = null;
        for (int i = 0; i < arrayList.size(); ++i) {
            object = arrayList.get(i);
            if (object == null) continue;
            LinkedList<ang_2> linkedList = eLP.g((ang_2)object);
            block13: for (ang_2 ang_22 : linkedList) {
                byte by;
                amx_1 amx_12;
                boolean bl = false;
                s2 = 0;
                s = 0;
                boolean bl2 = false;
                amu_1 amu_12 = null;
                amu_1 amu_13 = null;
                Enum enum_ = ang_22.bDq();
                if (enum_ instanceof amg_2) {
                    switch ((amg_2)enum_) {
                        case cIK: {
                            amx_12 = (aml_2)ang_22;
                            if (((aml_2)amx_12).bDr().bDp()) {
                                bl = true;
                                amu_12 = ((aml_2)amx_12).bDr();
                                amu_13 = ((aml_2)amx_12).bDs();
                                break;
                            }
                            s2 = 1;
                            amu_13 = ((aml_2)amx_12).bDr();
                            amu_12 = ((aml_2)amx_12).bDs();
                            break;
                        }
                        case cIL: {
                            amx_12 = (amm_2)ang_22;
                            if (((amm_2)amx_12).bDr().bDp()) {
                                s = 1;
                                amu_12 = ((amm_2)amx_12).bDr();
                                amu_13 = ((amm_2)amx_12).bDs();
                                break;
                            }
                            bl2 = true;
                            amu_13 = ((amm_2)amx_12).bDr();
                            amu_12 = ((amm_2)amx_12).bDs();
                            break;
                        }
                        case cII: {
                            amx_12 = (ami_2)ang_22;
                            s = 1;
                            bl2 = true;
                            if (((ami_2)amx_12).bDr().bDp()) {
                                amu_12 = ((ami_2)amx_12).bDr();
                                amu_13 = ((ami_2)amx_12).bDs();
                                break;
                            }
                            amu_13 = ((ami_2)amx_12).bDr();
                            amu_12 = ((ami_2)amx_12).bDs();
                        }
                    }
                } else if (enum_ instanceof ehq_0) {
                    switch ((ehq_0)enum_) {
                        case pFN: {
                            amx_12 = (efc_0)ang_22;
                            if (tShortArrayList == null) {
                                tShortArrayList = ((efc_0)amx_12).fnZ();
                                break;
                            }
                            for (by = 0; by < tShortArrayList.size(); ++by) {
                                if (((efc_0)amx_12).fnZ().contains(tShortArrayList.get((int)by))) continue;
                                tShortArrayList.removeAt((int)by);
                            }
                            break;
                        }
                    }
                }
                if (amu_12 == null || !(enum_ instanceof ehq_0)) continue;
                switch ((ehq_0)enum_) {
                    case pFG: {
                        amx_12 = (ecy_0)amu_13;
                        by = ((ecy_0)amx_12).axA();
                        if (by == -1) continue block13;
                        if (s != 0 || bl) {
                            if (tIntShortHashMap == null) {
                                tIntShortHashMap = new TIntShortHashMap();
                            }
                            if (!bl) continue block13;
                            tIntShortHashMap.put((int)by, (short)Math.max((double)tIntShortHashMap.get((int)by), amu_12.e(null, null, null, null) + 1.0));
                            break;
                        }
                        if (tIntShortHashMap2 == null) {
                            tIntShortHashMap2 = new TIntShortHashMap();
                        }
                        if (s2 == 0) continue block13;
                        tIntShortHashMap2.put((int)by, (short)Math.min((double)(tIntShortHashMap2.contains((int)by) ? (int)tIntShortHashMap2.get((int)by) : Short.MAX_VALUE), amu_12.e(null, null, null, null) - 1.0));
                        break;
                    }
                    case pFA: {
                        amx_12 = (ebi_0)amu_13;
                        by = ((ebi_0)amx_12).fnE().aJr();
                        if (s != 0 || bl) {
                            if (tByteShortHashMap == null) {
                                tByteShortHashMap = new TByteShortHashMap();
                            }
                            if (bl) {
                                tByteShortHashMap.put(by, (short)Math.max((double)tByteShortHashMap.get(by), amu_12.e(null, null, null, null) + 1.0));
                                break;
                            }
                            tByteShortHashMap.put(by, (short)Math.max((double)tByteShortHashMap.get(by), amu_12.e(null, null, null, null)));
                            break;
                        }
                        if (tByteShortHashMap2 == null) {
                            tByteShortHashMap2 = new TByteShortHashMap();
                        }
                        if (s2 != 0) {
                            tByteShortHashMap2.put(by, (short)Math.min((double)(tByteShortHashMap2.contains(by) ? (int)tByteShortHashMap2.get(by) : Short.MAX_VALUE), amu_12.e(null, null, null, null) - 1.0));
                            break;
                        }
                        tByteShortHashMap2.put(by, (short)Math.min((double)(tByteShortHashMap2.contains(by) ? (int)tByteShortHashMap2.get(by) : Short.MAX_VALUE), amu_12.e(null, null, null, null)));
                    }
                }
            }
        }
        ArrayList<String> arrayList2 = new ArrayList<String>();
        if (tShortArrayList != null) {
            object = eLL.imR.c(qJJ, new Object[0]);
            for (int i = 0; i < tShortArrayList.size(); ++i) {
                object = (String)object + " " + eLL.qJe.As(tShortArrayList.get(i));
            }
            arrayList2.add((String)object);
        }
        for (exx_2 exx_22 : exx_2.values()) {
            s2 = 0;
            s = 0;
            if (tByteShortHashMap != null && tByteShortHashMap.get(exx_22.aJr()) > 0) {
                s2 = tByteShortHashMap.get(exx_22.aJr());
            }
            if (tByteShortHashMap2 != null && tByteShortHashMap2.get(exx_22.aJr()) > 0) {
                s = tByteShortHashMap2.get(exx_22.aJr());
            }
            if (s > 0 && s2 > 0) {
                if (s2 < s) {
                    arrayList2.add(s2 + " < " + eLP.l(exx_22) + " < " + s);
                    continue;
                }
                arrayList2.add(eLP.l(exx_22) + " = " + s2);
                continue;
            }
            if (s > 0) {
                arrayList2.add(eLP.l(exx_22) + " < " + s);
                continue;
            }
            if (s2 <= 0) continue;
            arrayList2.add(eLP.l(exx_22) + " > " + s2);
        }
        if (tIntShortHashMap != null) {
            tIntShortIterator = tIntShortHashMap.iterator();
            while (tIntShortIterator.hasNext()) {
                tIntShortIterator.advance();
                ahv_2 ahv_22 = eLL.qJd.ceG();
                fqD fqD2 = eLL.qJe.bb((short)tIntShortIterator.key());
                eLL.qJe.a(ahv_22, fqD2);
                ahv_22.c(" > ").aN(tIntShortIterator.value());
                arrayList2.add(ahv_22.ceL());
            }
        }
        if (tIntShortHashMap2 != null) {
            tIntShortIterator = tIntShortHashMap2.iterator();
            while (tIntShortIterator.hasNext()) {
                tIntShortIterator.advance();
                ahv_2 ahv_23 = eLL.qJd.ceG();
                fqD fqD3 = eLL.qJe.bb((short)tIntShortIterator.key());
                eLL.qJe.a(ahv_23, fqD3);
                ahv_23.c(" < ").aN(tIntShortIterator.value());
                arrayList2.add(ahv_23.ceL());
            }
        }
        return arrayList2;
    }

    public static LinkedList<ang_2> g(ang_2 ang_22) {
        if (ang_22 == null) {
            return null;
        }
        if (ang_22.bDq() == amg_2.cID) {
            amw_1 amw_12 = (amw_1)ang_22;
            LinkedList<ang_2> linkedList = new LinkedList<ang_2>();
            linkedList.addAll(eLP.g(amw_12.bDt()));
            linkedList.addAll(eLP.g(amw_12.bDu()));
            return linkedList;
        }
        LinkedList<ang_2> linkedList = new LinkedList<ang_2>();
        linkedList.add(ang_22);
        return linkedList;
    }

    public static String l(exx_2 exx_22) {
        if (exx_22 == exx_2.rGi) {
            return eLL.imR.c(qJv, new Object[0]);
        }
        if (exx_22 == exx_2.rGj) {
            return eLL.imR.c(qJw, new Object[0]);
        }
        if (exx_22 == exx_2.rGl) {
            return eLL.imR.c(qJy, new Object[0]);
        }
        if (exx_22 == exx_2.rGk) {
            return eLL.imR.c(qJx, new Object[0]);
        }
        if (exx_22 == exx_2.rGr) {
            return eLL.imR.c(qJH, new Object[0]);
        }
        if (exx_22 == exx_2.rGJ) {
            return eLL.imR.c(eLL.gCN, new Object[0]);
        }
        if (exx_22 == exx_2.rGL) {
            return eLL.imR.c(eLL.gCL, new Object[0]);
        }
        if (exx_22 == exx_2.rGM) {
            return eLL.imR.c(eLL.gCK, new Object[0]);
        }
        if (exx_22 == exx_2.rGK) {
            return eLL.imR.c(eLL.gCM, new Object[0]);
        }
        if (exx_22 == exx_2.rGN) {
            return eLL.imR.c(eLL.gCO, new Object[0]);
        }
        if (exx_22 == exx_2.rHH) {
            return eLL.imR.c(eLL.gCB, new Object[0]);
        }
        if (exx_22 == exx_2.rHT) {
            return eLL.imR.c(eLL.qJf, new Object[0]);
        }
        if (exx_22 == exx_2.rHN) {
            return eLL.imR.c(eLL.gCD, new Object[0]);
        }
        if (exx_22 == exx_2.rGQ) {
            return eLL.qJe.cZw();
        }
        if (exx_22 == exx_2.rGm) {
            return eLL.imR.c(qJB, new Object[0]);
        }
        if (exx_22 == exx_2.rHm) {
            return eLL.imR.c(qJC, new Object[0]);
        }
        if (exx_22 == exx_2.rHA) {
            return eLL.imR.c(qJD, new Object[0]);
        }
        if (exx_22 == exx_2.rGq) {
            return eLL.imR.c(qJG, new Object[0]);
        }
        if (exx_22 == exx_2.rGo) {
            return eLL.imR.c(qJE, new Object[0]);
        }
        if (exx_22 == exx_2.rGn) {
            return eLL.imR.c(qJF, new Object[0]);
        }
        if (exx_22 == exx_2.rHl) {
            return eLL.imR.c(qJI, new Object[0]);
        }
        return "";
    }

    public static String b(amx_1 amx_12) {
        return eLP.a(amx_12, null);
    }

    public static String a(amx_1 amx_12, eLR eLR2) {
        Object object;
        boolean bl;
        if (!amx_12.bDA()) {
            return "";
        }
        if (eLR2 != null && eLR2.fAc() && amx_12 instanceof ang_2 && (bl = eLP.a((ang_2)(object = (ang_2)amx_12), eLR2))) {
            return "";
        }
        if (amx_12.bDB() != null) {
            if (amx_12 instanceof ang_2) {
                object = (ang_2)amx_12;
                if (eLR2 != null && !eLP.a((ang_2)object, eLR2)) {
                    return My.aUV().c(amx_12.bDB(), new Object[0]);
                }
                return "";
            }
            return My.aUV().c(amx_12.bDB(), new Object[0]);
        }
        object = amx_12.bDq();
        Object object2 = "";
        if (object instanceof amg_2) {
            switch ((amg_2)((Object)object)) {
                case cIK: {
                    aml_2 aml_22 = (aml_2)amx_12;
                    String string = eLP.a(aml_22.bDr(), eLR2);
                    String string2 = eLP.a(aml_22.bDs(), eLR2);
                    if (string.length() == 0 || string2.length() == 0) {
                        return "";
                    }
                    if (aml_22.bDs().bDp()) {
                        object2 = eLL.imR.c(qKg, string, string2);
                        break;
                    }
                    if (aml_22.bDr().bDp()) {
                        object2 = eLL.imR.c(qKh, string2, string);
                        break;
                    }
                    object2 = eLL.imR.c(qKg, string, string2);
                    break;
                }
                case cIL: {
                    amm_2 amm_22 = (amm_2)amx_12;
                    String string = eLP.a(amm_22.bDr(), eLR2);
                    String string3 = eLP.a(amm_22.bDs(), eLR2);
                    if (string.length() == 0 || string3.length() == 0) {
                        return "";
                    }
                    if (amm_22.bDs().bDp()) {
                        object2 = eLL.imR.c(qKi, string, eLP.a(amm_22.bDs(), eLR2));
                        break;
                    }
                    if (amm_22.bDr().bDp()) {
                        object2 = eLL.imR.c(qKj, eLP.a(amm_22.bDs(), eLR2), string);
                        break;
                    }
                    object2 = eLL.imR.c(qKi, string, eLP.a(amm_22.bDs(), eLR2));
                    break;
                }
                case cID: {
                    amw_1 amw_12 = (amw_1)amx_12;
                    String string = eLP.a((amx_1)amw_12.bDt(), eLR2);
                    String string4 = eLP.a((amx_1)amw_12.bDu(), eLR2);
                    if (string.isEmpty() && string4.isEmpty()) {
                        return "";
                    }
                    if (string.isEmpty()) {
                        object2 = string4;
                        break;
                    }
                    if (string4.isEmpty()) {
                        object2 = string;
                        break;
                    }
                    object2 = string + (string.isEmpty() ? "" : "\n") + string4;
                    break;
                }
                case cII: {
                    boolean bl2;
                    amu_1 amu_12;
                    amu_1 amu_13;
                    if (amx_12 instanceof ami_2) {
                        ami_2 ami_22 = (ami_2)amx_12;
                        amu_13 = ami_22.bDr();
                        amu_12 = ami_22.bDs();
                        bl2 = true;
                    } else {
                        amp_1 amp_12 = (amp_1)amx_12;
                        amu_13 = amp_12.bDr();
                        amu_12 = amp_12.bDs();
                        bl2 = false;
                    }
                    if (amu_13.bDp()) {
                        object2 = eLP.a(amu_12, amu_13, bl2);
                        break;
                    }
                    object2 = eLP.a(amu_13, amu_12, bl2);
                    break;
                }
                case cIN: {
                    amv_1 amv_12 = (amv_1)amx_12;
                    String string = eLP.a((amx_1)amv_12.bDu(), eLR2);
                    String string5 = eLP.a((amx_1)amv_12.bDt(), eLR2);
                    if (string5.length() == 0 && string.length() == 0) {
                        return "";
                    }
                    if (string5.length() == 0) {
                        object2 = string;
                        break;
                    }
                    if (string.length() == 0) {
                        object2 = string5;
                        break;
                    }
                    object2 = string + "\n" + eLL.imR.c(qJr, new Object[0]) + " " + string5;
                    break;
                }
                case cIO: {
                    anj_2 anj_22 = (anj_2)amx_12;
                    String string = eLP.a((amx_1)anj_22.bDu(), eLR2);
                    String string6 = eLP.a((amx_1)anj_22.bDt(), eLR2);
                    if (string6.isEmpty() && string.isEmpty()) {
                        return "";
                    }
                    if (string6.isEmpty()) {
                        object2 = string;
                        break;
                    }
                    if (string.isEmpty()) {
                        object2 = string6;
                        break;
                    }
                    object2 = string + "\n" + eLL.imR.c(qJs, new Object[0]) + " " + string6;
                    break;
                }
                case cIP: {
                    anh_2 anh_22 = (anh_2)amx_12;
                    object2 = anh_22.getValue();
                    break;
                }
                case cIG: {
                    amb_2 amb_22 = (amb_2)amx_12;
                    object2 = String.valueOf(amb_22.d(null, null, null, null));
                    break;
                }
                case cIC: {
                    amu_2 amu_22 = (amu_2)amx_12;
                    String string = eLP.a(amu_22.bDr(), eLR2);
                    String string7 = eLP.a(amu_22.bDs(), eLR2);
                    if (string.length() == 0 && string7.length() == 0) {
                        return "";
                    }
                    if (string.length() == 0) {
                        return string7;
                    }
                    if (string7.length() == 0) {
                        return string;
                    }
                    object2 = eLL.imR.c(qKZ, string, string7);
                    break;
                }
                default: {
                    object2 = "";
                    break;
                }
            }
        } else if (object instanceof ehq_0) {
            switch ((ehq_0)((Object)object)) {
                case pFA: {
                    ebi_0 ebi_02 = (ebi_0)amx_12;
                    object2 = eLP.l(ebi_02.fnE());
                    break;
                }
                case pHk: {
                    ebk_0 ebk_02 = (ebk_0)amx_12;
                    object2 = eLP.l(ebk_02.fnE()) + " " + eLL.imR.c(eLL.gzU, new Object[0]);
                    break;
                }
                case pFB: {
                    eBj eBj2 = (eBj)amx_12;
                    object2 = eLP.l(eBj2.fnE()) + " %";
                    break;
                }
                case pGO: {
                    object2 = eLL.imR.c(eLL.gRV, new Object[0]);
                    break;
                }
                case pMT: {
                    object2 = eLL.imR.c(eLL.gRW, new Object[0]);
                    break;
                }
                case pFG: {
                    ecy_0 ecy_02 = (ecy_0)amx_12;
                    int n = ecy_02.axA();
                    if (n != -1) {
                        ahv_2 ahv_22 = eLL.qJd.ceG();
                        fqD fqD2 = eLL.qJe.bb((short)n);
                        eLL.qJe.a(ahv_22, fqD2);
                        object2 = ahv_22.ceL();
                        break;
                    }
                    object2 = "";
                    break;
                }
                case pFN: {
                    efc_0 efc_02 = (efc_0)amx_12;
                    Object object3 = efc_02.fnF() ? eLL.imR.c(qJK, new Object[0]) : eLL.imR.c(qJJ, new Object[0]);
                    for (int i = 0; i < efc_02.fnZ().size(); ++i) {
                        object3 = (String)object3 + " ";
                        object3 = (String)object3 + eLL.qJe.As(efc_02.fnZ().get(i));
                    }
                    object2 = object3;
                    break;
                }
                case pGy: {
                    efe_0 efe_02 = (efe_0)amx_12;
                    boolean bl3 = ((ang_2)amx_12).bDL();
                    Object object4 = efe_02.fnF() ? eLL.imR.c(bl3 ? qJN : qJM, new Object[0]) : eLL.imR.c(qJL, new Object[0]);
                    for (int i = 0; i < efe_02.fob().size(); ++i) {
                        object4 = (String)object4 + " ";
                        object4 = (String)object4 + eLL.qJe.bd(efe_02.fob().get(i));
                    }
                    object2 = object4;
                    break;
                }
                case pGP: {
                    efd_0 efd_02 = (efd_0)amx_12;
                    boolean bl4 = ((ang_2)amx_12).bDL();
                    Object object5 = efd_02.fnF() ? eLL.imR.c(bl4 ? qJN : qJM, new Object[0]) : eLL.imR.c(qJL, new Object[0]);
                    for (int i = 0; i < efd_02.foa().size(); ++i) {
                        object5 = (String)object5 + " ";
                        object5 = (String)object5 + eLL.qJe.be((short)efd_02.foa().get(0));
                    }
                    object2 = object5;
                    break;
                }
                case pFy: {
                    if (((ang_2)amx_12).bDL()) {
                        object2 = eLL.imR.c(qJP, new Object[0]);
                        break;
                    }
                    object2 = eLL.imR.c(qJO, new Object[0]);
                    break;
                }
                case pLz: {
                    object2 = eLL.imR.c(qLc, new Object[0]);
                    break;
                }
                case pFK: {
                    edw_0 edw_02 = (edw_0)amx_12;
                    Object object6 = "";
                    boolean bl5 = ((ang_2)amx_12).bDL();
                    if (edw_02.fnP().size() > 0) {
                        object6 = eLL.imR.c(edw_02.fnP().get((int)0).shc, new Object[0]);
                    }
                    for (int i = 1; i < edw_02.fnP().size(); ++i) {
                        object6 = (String)object6 + " " + eLL.imR.c(qJr, new Object[0]) + " " + eLL.imR.c(edw_02.fnP().get((int)i).shc, new Object[0]);
                    }
                    Object object7 = "";
                    if (edw_02.fnO().size() > 0) {
                        object7 = eLL.qJe.Ap(edw_02.fnO().get(0));
                    }
                    for (int i = 1; i < edw_02.fnO().size(); ++i) {
                        int n = edw_02.fnO().get(i);
                        object7 = (String)object7 + " " + eLL.imR.c(qJr, new Object[0]) + " " + eLL.qJe.Ap(n);
                    }
                    if (edw_02.fnP().size() > 0) {
                        if (bl5) {
                            object2 = eLL.imR.c(qJT, object7, object6);
                            break;
                        }
                        object2 = eLL.imR.c(qJS, object7, object6);
                        break;
                    }
                    if (bl5) {
                        object2 = eLL.imR.c(qJR, object7);
                        break;
                    }
                    object2 = eLL.imR.c(qJQ, object7);
                    break;
                }
                case pJu: {
                    if (((ang_2)amx_12).bDL()) {
                        object2 = eLL.imR.c(qJV, new Object[0]);
                        break;
                    }
                    object2 = eLL.imR.c(qJU, new Object[0]);
                    break;
                }
                case pJI: {
                    eGb eGb2 = (eGb)amx_12;
                    long l = eGb2.fod().d(null, null, null, null);
                    eSS eSS2 = eTo.fIZ().iY(l);
                    if (eSS2 == null || eSS2.aeV() != etm_0.rnr.aHp()) break;
                    if (((ang_2)amx_12).bDL()) {
                        object2 = eLL.imR.c(qLe, new Object[0]);
                        break;
                    }
                    object2 = eLL.imR.c(qLd, new Object[0]);
                    break;
                }
                case pMG: {
                    if (((ang_2)amx_12).bDL()) {
                        object2 = eLL.imR.c(qLg, new Object[0]);
                        break;
                    }
                    object2 = eLL.imR.c(qLf, new Object[0]);
                    break;
                }
                case pGu: {
                    object2 = eLL.imR.c(qKm, new Object[0]);
                    break;
                }
                case pFz: {
                    if (((ang_2)amx_12).bDL()) {
                        object2 = eLL.imR.c(qJX, new Object[0]);
                        break;
                    }
                    object2 = eLL.imR.c(qJW, new Object[0]);
                    break;
                }
                case pFT: {
                    object2 = eLL.imR.c(qKb, new Object[0]);
                    break;
                }
                case pFU: {
                    object2 = eLL.imR.c(qKc, new Object[0]);
                    break;
                }
                case pFI: {
                    object2 = eLL.imR.c(qKd, new Object[0]);
                    break;
                }
                case pFS: {
                    object2 = eLL.imR.c(qKe, new Object[0]);
                    break;
                }
                case pKs: {
                    object2 = eLL.imR.c(qKf, new Object[0]);
                    break;
                }
                case pFF: {
                    object2 = eLL.imR.c(qKt, new Object[0]);
                    break;
                }
                case pJd: {
                    ebr_0 ebr_02 = (ebr_0)amx_12;
                    String string = eLL.qJe.bc((short)ebr_02.cms());
                    object2 = eLL.imR.c(qKu, string);
                    break;
                }
                case pGm: {
                    egu_0 egu_02 = (egu_0)amx_12;
                    object2 = eLL.imR.c(String.format("%s%s", qKk, egu_02.aWO()), new Object[0]);
                    break;
                }
                case pGg: {
                    eCZ eCZ2 = (eCZ)amx_12;
                    byte by = (byte)eCZ2.dDF();
                    object2 = eLL.imR.c(qKl, eLP.fc(by));
                    break;
                }
                case pFL: {
                    eeo_0 eeo_02 = (eeo_0)amx_12;
                    fqU fqU2 = fqX.gjM().Zr(eeo_02.LR());
                    String string = ((ang_2)amx_12).bDL() ? qKo : qKn;
                    object2 = eLL.imR.c(string, fqU2.getName(), eeo_02.fnS());
                    break;
                }
                case pKl: {
                    eep_0 eep_02 = (eep_0)amx_12;
                    fqU fqU3 = fqX.gjM().Zr(eep_02.LR());
                    String string = ((ang_2)amx_12).bDL() ? qKq : qKp;
                    object2 = eLL.imR.c(string, fqU3.getName(), eep_02.fnS());
                    break;
                }
                case pJc: {
                    eDQ eDQ2 = (eDQ)amx_12;
                    String string = eLL.qJe.bc((short)eDQ2.cms());
                    if (((ang_2)amx_12).bDL()) {
                        object2 = eLL.imR.c(qKs, string);
                        break;
                    }
                    object2 = eLL.imR.c(qKr, string);
                    break;
                }
                case pHj: {
                    object2 = eLL.imR.c(qKv, new Object[0]);
                    break;
                }
                case pHu: {
                    object2 = eLL.imR.c(qKw, new Object[0]);
                    break;
                }
                case pHF: {
                    ebs_0 ebs_02 = (ebs_0)amx_12;
                    int n = ebs_02.Xt();
                    if (n > 0) {
                        String string = eLL.qJe.At(n);
                        object2 = eLL.imR.c(qKx, string);
                        break;
                    }
                    object2 = eLL.qJe.cZx();
                    break;
                }
                case pHM: {
                    eFt eFt2 = (eFt)amx_12;
                    if (eFt2.bDL()) {
                        object2 = eLL.imR.c(qKB, new Object[0]);
                        break;
                    }
                    object2 = eLL.imR.c(qKA, new Object[0]);
                    break;
                }
                case pFO: {
                    eFs eFs2 = (eFs)amx_12;
                    if (eFs2.bDL()) {
                        object2 = eLL.imR.c(qKz, new Object[0]);
                        break;
                    }
                    object2 = eLL.imR.c(qKy, new Object[0]);
                    break;
                }
                case pIZ: {
                    object2 = eLL.imR.c(qKU, new Object[0]);
                    break;
                }
                case pIX: {
                    object2 = eLL.imR.c(qKV, new Object[0]);
                    break;
                }
                case pKF: {
                    object2 = eLL.imR.c(qKW, new Object[0]);
                    break;
                }
                case pII: {
                    object2 = eLL.imR.c(qKF, new Object[0]);
                    break;
                }
                case pJw: {
                    String string = eLL.qJe.bd(((eEs)amx_12).aWP());
                    if (((ang_2)amx_12).bDL()) {
                        object2 = eLL.imR.c(qKH, string);
                        break;
                    }
                    object2 = eLL.imR.c(qKG, string);
                    break;
                }
                case pIV: {
                    object2 = eLL.imR.c(qKP, new Object[0]);
                    break;
                }
                case pIT: {
                    boolean bl6 = ((ang_2)amx_12).bDL();
                    if (bl6) {
                        object2 = eLL.imR.c(qKX, new Object[0]);
                        break;
                    }
                    object2 = eLL.imR.c(qKY, new Object[0]);
                    break;
                }
                case pIR: {
                    object2 = eLL.imR.c(qKQ, new Object[0]);
                    break;
                }
                case pIQ: {
                    object2 = eLL.imR.c(qKS, new Object[0]);
                    break;
                }
                case pJx: {
                    object2 = eLL.imR.c(qKT, new Object[0]);
                    break;
                }
                case pGA: {
                    object2 = eLL.imR.c(qKR, new Object[0]);
                    break;
                }
                case pJe: {
                    object2 = eLL.imR.c(qLa, new Object[0]);
                    break;
                }
                case pGM: {
                    eea_0 eea_02 = (eea_0)amx_12;
                    String string = eLL.qJe.Ar(eea_02.tJ());
                    object2 = eLL.imR.c(qLb, string);
                    break;
                }
                case pFJ: {
                    eDV eDV2 = (eDV)amx_12;
                    TIntArrayList tIntArrayList = eDV2.fnN();
                    StringBuilder stringBuilder = new StringBuilder();
                    int n = tIntArrayList.size();
                    for (int i = 0; i < n; ++i) {
                        if (i != 0) {
                            stringBuilder.append(", ");
                        }
                        stringBuilder.append(eLL.qJe.Aq(tIntArrayList.get(i)));
                    }
                    object2 = eLL.imR.c(qLh, stringBuilder.toString());
                    break;
                }
                case pHr: {
                    object2 = String.valueOf(eLL.qJe.Xt());
                    break;
                }
                case pLS: {
                    String string = eLL.qJe.bd(((eec_0)amx_12).aWP());
                    if (((ang_2)amx_12).bDL()) {
                        object2 = eLL.imR.c(qLl, string);
                        break;
                    }
                    object2 = eLL.imR.c(qLi, string);
                    break;
                }
                case pMe: {
                    if (((ang_2)amx_12).bDL()) {
                        object2 = eLL.imR.c(qLk, new Object[0]);
                        break;
                    }
                    object2 = eLL.imR.c(qLj, new Object[0]);
                    break;
                }
                case pJO: {
                    eDb eDb2 = (eDb)amx_12;
                    fqU fqU4 = fqX.gjM().Zr((int)eDb2.fnK());
                    object2 = eLL.imR.c(qLm, fqU4.getName(), eDb2.fnL(), eDb2.fnB());
                    break;
                }
                case pMa: {
                    eDb eDb3 = (eDb)amx_12;
                    fqU fqU5 = fqX.gjM().Zr((int)eDb3.fnK());
                    object2 = eLL.imR.c(qLn, fqU5.getName(), eDb3.fnL(), eDb3.fnB());
                    break;
                }
                case pMd: {
                    eer_0 eer_02 = (eer_0)amx_12;
                    Object object8 = "";
                    for (int n : eer_02.fnT().toArray()) {
                        object8 = (String)object8 + eLL.qJe.Au(n) + ",";
                    }
                    object8 = ((String)object8).substring(0, ((String)object8).length() - 1) + ".";
                    object2 = eLL.imR.c(qLo, object8);
                    break;
                }
                case pMm: {
                    eEl eEl2 = (eEl)amx_12;
                    byte by = eEl2.fnR();
                    fpp_0 fpp_02 = fpp_0.hk(by);
                    String string = eLL.qJe.a(fpp_02);
                    object2 = eLL.imR.c(qLp, string);
                    break;
                }
                case pGs: {
                    eco_0 eco_02 = (eco_0)amx_12;
                    TLongArrayList tLongArrayList = eco_02.o(null, null, null, null);
                    Object object9 = "";
                    for (long l : tLongArrayList.toArray()) {
                        object9 = (String)object9 + eLL.qJe.Aq((int)l) + ",";
                    }
                    object2 = object9 = ((String)object9).substring(0, ((String)object9).length() - 1) + ".";
                    break;
                }
                case pHY: {
                    eel_0 eel_02 = (eel_0)amx_12;
                    String string = eLL.qJe.Am(eel_02.apw());
                    if (((ang_2)amx_12).bDL()) {
                        object2 = eLL.imR.c(qLr, string);
                        break;
                    }
                    object2 = eLL.imR.c(qLq, string);
                    break;
                }
                case pHX: {
                    eEM eEM2 = (eEM)amx_12;
                    String string = eLL.qJe.Am(eEM2.apw());
                    if (((ang_2)amx_12).bDL()) {
                        object2 = eLL.imR.c(qLt, string);
                        break;
                    }
                    object2 = eLL.imR.c(qLs, string);
                    break;
                }
                case pLy: {
                    eEN eEN2 = (eEN)amx_12;
                    String string = eLL.qJe.Am(eEN2.apw());
                    if (((ang_2)amx_12).bDL()) {
                        object2 = eLL.imR.c(qLv, string);
                        break;
                    }
                    object2 = eLL.imR.c(qLu, string);
                    break;
                }
                case pHW: {
                    eEO eEO2 = (eEO)amx_12;
                    String string = eLL.qJe.An(eEO2.ewy());
                    if (((ang_2)amx_12).bDL()) {
                        object2 = eLL.imR.c(qLx, string);
                        break;
                    }
                    object2 = eLL.imR.c(qLw, string);
                    break;
                }
                case pLx: {
                    eeq_0 eeq_02 = (eeq_0)amx_12;
                    String string = eLL.qJe.Am(eeq_02.apw());
                    if (((ang_2)amx_12).bDL()) {
                        object2 = eLL.imR.c(qLB, string);
                        break;
                    }
                    object2 = eLL.imR.c(qLA, string);
                    break;
                }
                case pNG: {
                    eAL eAL2 = (eAL)amx_12;
                    String string = eLL.qJe.Ao(eAL2.fnz());
                    object2 = eLL.imR.c(qLM, string);
                    break;
                }
                case pMD: {
                    object2 = eLL.imR.c(qLC, new Object[0]);
                    break;
                }
                case pMC: {
                    object2 = eLL.imR.c(qLD, new Object[0]);
                    break;
                }
                case pNP: {
                    if (((ang_2)amx_12).bDL()) {
                        object2 = eLL.imR.c(qLE, new Object[0]);
                        break;
                    }
                    object2 = eLL.imR.c(qLF, new Object[0]);
                    break;
                }
                case pNQ: {
                    if (((ang_2)amx_12).bDL()) {
                        object2 = eLL.imR.c(qLG, new Object[0]);
                        break;
                    }
                    object2 = eLL.imR.c(qLH, new Object[0]);
                    break;
                }
                case pNR: {
                    if (((ang_2)amx_12).bDL()) {
                        object2 = eLL.imR.c(qLI, new Object[0]);
                        break;
                    }
                    object2 = eLL.imR.c(qLJ, new Object[0]);
                    break;
                }
                case pMR: {
                    if (((ang_2)amx_12).bDL()) {
                        object2 = eLL.imR.c(qLK, new Object[0]);
                        break;
                    }
                    object2 = eLL.imR.c(qLL, new Object[0]);
                    break;
                }
                default: {
                    object2 = "";
                }
            }
        }
        if (amx_12 instanceof ehm_0 && ((ehm_0)((Object)amx_12)).fnF()) {
            object2 = (String)object2 + eLL.imR.c(qKO, new Object[0]);
        }
        return object2;
    }

    private static boolean a(ang_2 ang_22, eLR eLR2) {
        if (eLR2 != null) {
            return ang_22.b(eLR2.fzZ(), eLR2.fAa(), eLR2.dFa(), eLR2.fAb());
        }
        return ang_22.b(null, null, null, null);
    }

    private static String fc(byte by) {
        return eLL.imR.c(eNd.ff(by).aXB(), new Object[0]);
    }

    public static ArrayList<azx_1<String, ang_2>> h(ang_2 ang_22) {
        ArrayList<azx_1<String, ang_2>> arrayList = new ArrayList<azx_1<String, ang_2>>();
        LinkedList<ang_2> linkedList = eLP.g(ang_22);
        if (linkedList != null) {
            for (ang_2 ang_23 : linkedList) {
                String string = eLP.b(ang_23);
                if (string.length() <= 0) continue;
                arrayList.add(new azx_1<String, ang_2>(string, ang_23));
            }
        }
        return arrayList;
    }

    private static String a(amx_1 amx_12, amx_1 amx_13, boolean bl) {
        Object object;
        String string = eLP.b(amx_13);
        if (string.length() == 0) {
            return "";
        }
        if (amx_12.bDq() instanceof ehq_0) {
            object = (ehq_0)amx_12.bDq();
            switch (eLQ.qLO[((Enum)object).ordinal()]) {
                case 69: {
                    ecw_0 ecw_02 = (ecw_0)amx_12;
                    String string2 = eLL.qJe.At(Bw.m(eLP.b(ecw_02.fnI())));
                    String string3 = eLL.qJe.At(Bw.m(eLP.b(ecw_02.fnJ())));
                    String string4 = eLL.qJe.ba(Bw.q(string));
                    if (bl) {
                        return eLL.imR.c(qKM, string2, string4, string3);
                    }
                    return eLL.imR.c(qKN, string2, string4, string3);
                }
                case 70: {
                    String string5 = eLL.qJe.Aw(Bw.m(string));
                    if (bl) {
                        return eLL.imR.c(qKI, string5);
                    }
                    return eLL.imR.c(qKJ, string5);
                }
                case 49: {
                    String string6 = eLL.qJe.At(Bw.m(string));
                    if (bl) {
                        return eLL.imR.c(qKK, string6);
                    }
                    return eLL.imR.c(qKL, string6);
                }
            }
        }
        object = new StringBuilder();
        String string7 = eLP.b(amx_12);
        if (string7.length() == 0) {
            return "";
        }
        ((StringBuilder)object).append(string7);
        ((StringBuilder)object).append(bl ? " = " : " != ");
        ((StringBuilder)object).append(string);
        return ((StringBuilder)object).toString();
    }
}

