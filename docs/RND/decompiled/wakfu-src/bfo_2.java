/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.HashMultimap
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import com.google.common.collect.HashMultimap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bfo
 */
public class bfo_2
implements aeh_2,
Comparable {
    protected static final Logger hSo = Logger.getLogger(bfo_2.class);
    public static final String hSp = "id";
    public static final String hSq = "name";
    public static final String hSr = "longName";
    public static final String hSs = "godName";
    public static final String hSt = "description";
    public static final String hSu = "backgroundDescription";
    public static final String hSv = "buttonStyle";
    public static final String hSw = "iconUrl";
    public static final String hSx = "smallIconUrl";
    public static final String hSy = "bigIconUrl";
    public static final String hSz = "smallBackgroundUrl";
    public static final String hSA = "bigBackgroundUrl";
    public static final String hSB = "supportSpellsText";
    public static final String hSC = "femaleIllustration";
    public static final String hSD = "maleIllustration";
    public static final String hSE = "malePortraitIllustration";
    public static final String hSF = "femalePortraitIllustration";
    public static final String hSG = "maleFemalePortraitIllustration";
    public static final String hSH = "difficulty";
    public static final String hSI = "emptyStarDifficulty";
    public static final String hSJ = "elementalSpells";
    public static final String hSK = "activeSpells";
    public static final String hSL = "passiveSpells";
    public static final String hSM = "roles";
    public static final String hSN = "breedDarkColor";
    public static final String hSO = "breedLightColor";
    public static final String hSP = "showcasedSpells";
    public static final String hSQ = "breedSoloMaleIllustration";
    public static final String hSR = "breedSoloFemaleIllustration";
    public static final String hSS = "breedDuoMaleIllustration";
    public static final String hST = "breedDuoFemaleIllustration";
    public static final String[] hSU = new String[]{"id", "name", "longName", "godName", "description", "backgroundDescription", "buttonStyle", "iconUrl", "smallIconUrl", "bigIconUrl", "smallBackgroundUrl", "bigBackgroundUrl", "supportSpellsText", "femaleIllustration", "maleIllustration", "malePortraitIllustration", "femalePortraitIllustration", "maleFemalePortraitIllustration", "difficulty", "emptyStarDifficulty", "roles", "elementalSpells", "activeSpells", "passiveSpells", "showcasedSpells"};
    private final byte hSV = (byte)3;
    private final byte hSW = 0;
    private final byte hSX = 1;
    @Nullable
    private final eym hSY;
    private final List<bfx_2> hSZ;
    private final HashMultimap<eNd, bmt_0> hTa;

    public bfo_2(@Nullable eym eym2) {
        this.hSY = eym2;
        this.hTa = HashMultimap.create();
        this.hSZ = eym2 == null ? Collections.emptyList() : eym2.fhU().stream().map(eyA2 -> new bfx_2((eyA)((Object)eyA2), this.hSY)).toList();
    }

    public short aIi() {
        return this.hSY == null ? eym.phV.aWP() : this.hSY.aWP();
    }

    public String getName() {
        return aum_0.cWf().c("breed." + this.aIi(), new Object[0]);
    }

    public String getDescription() {
        return aum_0.cWf().c("breedLongDesc." + this.aIi(), new Object[0]);
    }

    public String dfV() {
        return aum_0.cWf().c("breedLongName." + this.aIi(), this.getName());
    }

    public eym dfW() {
        return this.hSY;
    }

    public void a(bmt_0 bmt_02) {
        if (this.hTa.containsValue((Object)bmt_02)) {
            hSo.warn((Object)"On ajoute plusieurs fois le m\u00eame spell, cet appel est sans doute useless : ", (Throwable)new Exception());
        }
        this.hTa.put((Object)eNd.ff(bmt_02.giG()), (Object)bmt_02);
    }

    public List<bmt_0> c(eNd eNd2) {
        bmt_0[] bmt_0Array = this.d(eNd2);
        if (bmt_0Array == null) {
            return null;
        }
        ArrayList<bmt_0> arrayList = new ArrayList<bmt_0>(bmt_0Array.length);
        for (bmt_0 bmt_02 : bmt_0Array) {
            arrayList.add(bmt_02);
        }
        return arrayList;
    }

    private bmt_0[] d(eNd eNd2) {
        Set set = this.hTa.get((Object)eNd2);
        if (set == null) {
            return null;
        }
        bmt_0[] bmt_0Array = new bmt_0[set.size()];
        set.toArray(bmt_0Array);
        Arrays.sort(bmt_0Array, new bme_1());
        return bmt_0Array;
    }

    public boolean BM(int n) {
        Collection<bmt_0> collection = this.dga();
        for (bmt_0 bmt_02 : collection) {
            if (bmt_02.d() != n) continue;
            return true;
        }
        return false;
    }

    public List<bmt_0> dfX() {
        return this.dga().stream().filter(Objects::nonNull).filter(bmt_02 -> bmt_02.giG() != eNd.qPf.aJr()).collect(Collectors.toList());
    }

    public List<bmt_0> dfY() {
        return this.dga().stream().filter(Objects::nonNull).filter(bmt_02 -> !bmt_02.eeY()).filter(bmt_02 -> bmt_02.giG() == eNd.qPf.aJr()).collect(Collectors.toList());
    }

    public List<bmt_0> dfZ() {
        return this.dga().stream().filter(Objects::nonNull).filter(fqD::eeY).filter(bmt_02 -> bmt_02.giG() == eNd.qPf.aJr()).collect(Collectors.toList());
    }

    public Collection<bmt_0> dga() {
        return this.hTa.values();
    }

    @Override
    public Object eu(String string) {
        switch (string) {
            case "id": {
                return this.aIi();
            }
            case "name": {
                return this.getName();
            }
            case "longName": {
                return this.dfV();
            }
            case "description": {
                return this.getDescription();
            }
            case "iconUrl": {
                try {
                    return String.format(auc_0.cVq().bS("breedIconPath"), this.aIi());
                }
                catch (fu_0 fu_02) {
                    hSo.error((Object)fu_02.getMessage(), (Throwable)fu_02);
                    break;
                }
            }
            case "smallIconUrl": {
                try {
                    return String.format(auc_0.cVq().bS("breedSmallIconPath"), this.aIi());
                }
                catch (fu_0 fu_03) {
                    hSo.error((Object)fu_03.getMessage(), (Throwable)fu_03);
                    break;
                }
            }
            case "bigIconUrl": {
                return this.dgc();
            }
            case "smallBackgroundUrl": {
                try {
                    return String.format(auc_0.cVq().bS("breedSmallBackgroundsPath"), this.aIi());
                }
                catch (fu_0 fu_04) {
                    hSo.error((Object)fu_04.getMessage(), (Throwable)fu_04);
                    break;
                }
            }
            case "bigBackgroundUrl": {
                try {
                    return String.format(auc_0.cVq().bS("breedBigBackgroundsPath"), this.aIi());
                }
                catch (fu_0 fu_05) {
                    hSo.error((Object)fu_05.getMessage(), (Throwable)fu_05);
                    break;
                }
            }
            case "buttonStyle": {
                return "characterCreationBreed" + this.aIi();
            }
            case "supportSpellsText": {
                return aum_0.cWf().c("breedSupportSpells", this.getName());
            }
            case "maleIllustration": {
                try {
                    return String.format(auc_0.cVq().bS("breedIllustrationPath"), this.dfW().aWP(), (byte)0);
                }
                catch (fu_0 fu_06) {
                    hSo.error((Object)"PropertyException during getFieldValue for MALE_ILLUSTRATION_FIELD", (Throwable)fu_06);
                    break;
                }
            }
            case "femaleIllustration": {
                try {
                    return String.format(auc_0.cVq().bS("breedIllustrationPath"), this.dfW().aWP(), (byte)1);
                }
                catch (fu_0 fu_07) {
                    hSo.error((Object)"PropertyException during getFieldValue for FEMALE_ILLUSTRATION_FIELD", (Throwable)fu_07);
                    break;
                }
            }
            case "malePortraitIllustration": {
                try {
                    return String.format(auc_0.cVq().bS("breedCharacterPortrait80Path"), String.valueOf(this.dfW().aWP()) + String.valueOf(0));
                }
                catch (fu_0 fu_08) {
                    hSo.error((Object)"PropertyException during getFieldValue for MALE_PORTRAIT_ILLUSTRATION_FIELD", (Throwable)fu_08);
                    break;
                }
            }
            case "femalePortraitIllustration": {
                try {
                    return String.format(auc_0.cVq().bS("breedCharacterPortrait80Path"), String.valueOf(this.dfW().aWP()) + String.valueOf(1));
                }
                catch (fu_0 fu_09) {
                    hSo.error((Object)"PropertyException during getFieldValue for FEMALE_PORTRAIT_ILLUSTRATION_FIELD", (Throwable)fu_09);
                    break;
                }
            }
            case "maleFemalePortraitIllustration": {
                try {
                    String[] stringArray = new String[2];
                    byte by = csp_1.eOD().aWO();
                    stringArray[by] = String.format(auc_0.cVq().bS("breedCharacterPortrait80Path"), String.valueOf(this.dfW().aWP()) + String.valueOf(0));
                    stringArray[(by + 1) % 2] = String.format(auc_0.cVq().bS("breedCharacterPortrait80Path"), String.valueOf(this.dfW().aWP()) + String.valueOf(1));
                    return stringArray;
                }
                catch (fu_0 fu_010) {
                    hSo.error((Object)"PropertyException during getFieldValue for MALE_FEMALE_PORTRAIT_ILLUSTRATION_FIELD", (Throwable)fu_010);
                    break;
                }
            }
            case "difficulty": {
                return Math.min(this.hSY.ckP(), 3);
            }
            case "emptyStarDifficulty": {
                return Math.max(3 - this.hSY.ckP(), 0);
            }
            case "elementalSpells": {
                return this.dfX();
            }
            case "passiveSpells": {
                return this.dfZ();
            }
            case "activeSpells": {
                return this.dfY();
            }
            case "showcasedSpells": {
                return this.dgb();
            }
            case "roles": {
                return this.hSZ;
            }
            case "breedDarkColor": {
                return bfo_2.b(this.hSY);
            }
            case "breedLightColor": {
                return bfo_2.a(this.hSY);
            }
            case "breedSoloMaleIllustration": {
                try {
                    return String.format(auc_0.cVq().bS("breedSoloIllustrationPath"), this.hSY.aWP(), (byte)0);
                }
                catch (fu_0 fu_011) {
                    hSo.warn((Object)"Missing configuration when retrieving breed solo illustration", (Throwable)fu_011);
                    return null;
                }
            }
            case "breedSoloFemaleIllustration": {
                try {
                    return String.format(auc_0.cVq().bS("breedSoloIllustrationPath"), this.hSY.aWP(), (byte)1);
                }
                catch (fu_0 fu_012) {
                    hSo.warn((Object)"Missing configuration when retrieving breed solo illustration", (Throwable)fu_012);
                    return null;
                }
            }
            case "breedDuoMaleIllustration": {
                try {
                    return String.format(auc_0.cVq().bS("breedDuoIllustrationPath"), this.hSY.aWP(), (byte)0);
                }
                catch (fu_0 fu_013) {
                    hSo.warn((Object)"Missing configuration when retrieving breed duo illustration", (Throwable)fu_013);
                    return null;
                }
            }
            case "breedDuoFemaleIllustration": {
                try {
                    return String.format(auc_0.cVq().bS("breedDuoIllustrationPath"), this.hSY.aWP(), (byte)1);
                }
                catch (fu_0 fu_014) {
                    hSo.warn((Object)"Missing configuration when retrieving breed duo illustration", (Throwable)fu_014);
                    return null;
                }
            }
        }
        return null;
    }

    private List<bmt_0> dgb() {
        if (this.hSY == null) {
            return Collections.emptyList();
        }
        int[] nArray = this.hSY.ckN();
        return Arrays.stream(nArray).mapToObj(n -> {
            for (bmt_0 bmt_02 : this.dga()) {
                if (bmt_02.d() != n) continue;
                return bmt_02;
            }
            return null;
        }).filter(Objects::nonNull).toList();
    }

    @Nullable
    public String dgc() {
        try {
            return String.format(auc_0.cVq().bS("breedBigIconPath"), this.aIi());
        }
        catch (fu_0 fu_02) {
            hSo.error((Object)fu_02.getMessage(), (Throwable)fu_02);
            return null;
        }
    }

    @Nullable
    public String dgd() {
        try {
            return String.format(auc_0.cVq().bS("breedHudIconPath"), this.aIi());
        }
        catch (fu_0 fu_02) {
            hSo.error((Object)fu_02.getMessage(), (Throwable)fu_02);
            return null;
        }
    }

    @Override
    public String[] bxk() {
        return hSU;
    }

    public int compareTo(@NotNull Object object) {
        bfo_2 bfo_22 = (bfo_2)object;
        return this.aIi() - bfo_22.aIi();
    }

    public static axb_2 a(eym eym2) {
        return switch (eym2) {
            default -> throw new MatchException(null, null);
            case eym.phZ -> new fhl_2(ett_1.oqx);
            case eym.pij -> new fhl_2(ett_1.oqy);
            case eym.pik -> new fhl_2(ett_1.oqz);
            case eym.pio -> new fhl_2(ett_1.oqA);
            case eym.pia -> new fhl_2(ett_1.oqB);
            case eym.pic -> new fhl_2(ett_1.oqC);
            case eym.pif -> new fhl_2(ett_1.oqD);
            case eym.pig -> new fhl_2(ett_1.oqE);
            case eym.pih -> new fhl_2(ett_1.oqF);
            case eym.phX -> new fhl_2(ett_1.oqG);
            case eym.phW -> new fhl_2(ett_1.oqH);
            case eym.pib -> new fhl_2(ett_1.oqI);
            case eym.pid -> new fhl_2(ett_1.oqJ);
            case eym.pii -> new fhl_2(ett_1.oqK);
            case eym.pil -> new fhl_2(ett_1.oqL);
            case eym.pin -> new fhl_2(ett_1.oqM);
            case eym.phY -> new fhl_2(ett_1.oqN);
            case eym.pie -> new fhl_2(ett_1.oqO);
            case eym.phU, eym.pim, eym.phV -> awx_2.dnF;
        };
    }

    public static axb_2 b(eym eym2) {
        return switch (eym2) {
            default -> throw new MatchException(null, null);
            case eym.phZ -> new fhl_2(ett_1.oqf);
            case eym.pij -> new fhl_2(ett_1.oqg);
            case eym.pik -> new fhl_2(ett_1.oqh);
            case eym.pio -> new fhl_2(ett_1.oqi);
            case eym.pia -> new fhl_2(ett_1.oqj);
            case eym.pic -> new fhl_2(ett_1.oqk);
            case eym.pif -> new fhl_2(ett_1.oql);
            case eym.pig -> new fhl_2(ett_1.oqm);
            case eym.pih -> new fhl_2(ett_1.oqn);
            case eym.phX -> new fhl_2(ett_1.oqo);
            case eym.phW -> new fhl_2(ett_1.oqp);
            case eym.pib -> new fhl_2(ett_1.oqq);
            case eym.pid -> new fhl_2(ett_1.oqr);
            case eym.pii -> new fhl_2(ett_1.oqs);
            case eym.pil -> new fhl_2(ett_1.oqt);
            case eym.pin -> new fhl_2(ett_1.oqu);
            case eym.phY -> new fhl_2(ett_1.oqv);
            case eym.pie -> new fhl_2(ett_1.oqw);
            case eym.phU, eym.pim, eym.phV -> awx_2.dnF;
        };
    }
}

