/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashSet;

/*
 * Renamed from ary
 */
public final class ary_2 {
    public static final int cTL = 1460857362;
    public static final int cTM = 2571426;
    public static final int cTN = 70353081;
    public static final int cTO = 2455640;
    public static final int cTP = 80097030;
    public static final int cTQ = 2047106;
    public static final int cTR = -1157987650;
    public static final int cTS = -514753261;
    private static final String[] cTT = new String[]{"CheveuxHaut", "CheveuxBas", "CheveuxArriere"};
    private static final String[] cTU = new String[]{"BajouePeau", "Barbe", "Bouche", "Bouche01", "Bouche02", "Bouche03", "Bouche04", "Bouche05", "Bouche06", "Bouche07", "Bouche08", "Bouche09", "Bouche10", "Bouche11", "Bouche12", "Bouche13", "Bouche14", "CheveuxBas", "CheveuxHaut", "CheveuxArriere", "CheveuxNatteBasse", "CheuveuxNatteHaute", "Crane", "Oreille", "Joue_02", "Joue01", "Joue02", "Joue03", "Nez01", "Nez02", "Nez02Peau", "Oei02", "Oeil01", "Oeil02", "Oeil03", "Oeil04", "Oeil05", "Oeil06", "Oeil07", "Oeil08", "Oeil09", "Oeil10", "Oeil11", "Oeil12", "Oeil13", "Oeil14", "Oeil15", "Oeil16", "Pleur", "Pleur_2", "Pupille01", "Pupille02", "Pupille03", "Reflet", "Sourcil01", "Sourcil02", "Sourcil03"};
    private static final String[] cTV = new String[]{"JambeVetement", "JambePeau", "CuisseVetement", "CuissePeau"};
    private static final String[] cTW = new String[]{"Pied01Vetement", "Pied02Vetement", "PiedPeau01", "PiedPeau02"};
    private static final String[] cTX = new String[]{"TroncVetement", "TroncPeau"};
    private static final String[] cTY = new String[]{"BrasVetement", "BrasPeau"};
    private static final String[] cTZ = new String[]{"BrasVetement", "CuisseVetement", "EpauleVetement", "JambeVetement", "BassinVetement", "CorpsVetement", "JupeVetement", "Jupe2Vetement", "TroncVetement"};
    private static final String[] cUa = new String[]{"Epaulette-G", "Epaulette-D", "CorpsHabit", "Ceinture", "CuisseHabit", "JambeHabit", "PiedHabit01", "PiedHabit02", "Bouclier", "Cape", "CapeBas"};
    private static final int cUb = 855858226;
    private static final String[] cUc = new String[]{"BrasBas", "Peau_BrasBas"};
    private static final int cUd = -2026252917;
    private static final String[] cUe = new String[]{"BrasMilieu", "Peau_BrasMilieu"};
    private static final int cUf = 761980122;
    private static final String[] cUg = new String[]{"BrasHaut", "Peau_BrasHaut"};
    private static final int cUh = 2422137;
    private static final String[] cUi = new String[]{"OeilAmovible-Blanc01", "OeilAmovible-Blanc02", "OeilAmovible-Blanc03", "OeilAmovible-Blanc04", "OeilAmovible-Blanc05", "OeilAmovible-Blanc06", "OeilAmovible-Blanc07", "OeilAmovible-Blanc08", "OeilAmovible-Blanc09", "OeilAmovible-Halo01", "OeilAmovible-Halo02", "OeilAmovible-Noir01", "OeilAmovible-Noir02", "OeilAmovible-Noir03", "OeilAmovible-Noir04", "OeilAmovible-Halo01", "OeilAmovible-Halo02", "OeilAmovible-Marque"};
    private static final int cUj = -2027940606;
    private static final String[] cUk = new String[]{"Marque"};
    private static final int cUl = 525252987;
    private static final String[] cUm = new String[]{"Oeil-Marque"};
    private static final int cUn = -485157885;
    private static final String[] cUo = new String[]{"EliatropeCoiffeBas", "EliatropeCoiffeHaut", "Barbe", "Chapeau", "Chapeau02", "CheveuxBas", "CheveuxHaut", "CheveuxArriere", "CheveuxNatteBasse", "CheuveuxNatteHaute", "Oei02", "Oeil01", "Oeil02", "Oeil03", "Oeil04", "Oeil05", "Oeil06", "Oeil07", "Oeil08", "Oeil09", "Oeil10", "Oeil11", "Oeil12", "Oeil13", "Oeil14", "Oeil15", "Oeil16", "Pupille01", "Pupille02", "Pupille03", "Sourcil01", "Sourcil02", "Sourcil03", "Crane", "Oreille", "BassinPeau", "BrasPeau", "EpaulePeau", "JambePeau", "PiedPeau01", "PiedPeau02", "TroncPeau", "Nez02Peau", "CorpsPeau", "CuissePeau", "Main_01", "Main_02", "Main_Doigt_01", "Main_Doigt_02", "Main_Doigt_03", "Main_doigt_04", "Main_doigt_05", "Main_doigt_06", "Main_doigt_07", "Main_doigt_08", "Main_doigt_09", "Main_doigt_10", "Main_doigt_11", "Main_doigt_12", "Main_doigt_13", "Main_Paume_01", "Main_Paume_02", "Main_Paume_03", "Main_Paume_04", "Main_Paume_05", "Main_pouce_01", "Main_pouce_02", "Main_pouce_03", "Main_pouce_04", "Main_pouce_05", "Main_pouce_06", "Main_pouce_07", "Main_pouce_08", "Main_pouce_09", "Main_pouce_10", "Main_pouce_11", "Main_pouce_12", "Main_pouce_13", "Main_pouce_14", "Main_01", "Main_02", "Main_03", "Main_04", "Main_05"};
    private static final int cUp = -1147503697;
    private static final String[] cUq = new String[]{"EliatropeCoiffeBas", "EliatropeCoiffeHaut", "SacADos-C", "SacADos-G", "SacADos-D", "Barbe", "CuisseHabit", "JambeHabit", "PiedHabit01", "PiedHabit02", "Chapeau", "Chapeau02", "Epaulette-D", "Epaulette-G", "CorpsHabit", "BrasVetement", "EpauleVetement", "TroncVetement", "Jupe2Vetement", "JupeVetement", "CorpsVetement", "BassinVetement", "CuisseVetement", "JambeVetement", "Cape", "CapeBas", "CheveuxBas"};
    private static final HashSet<String> cUr = new HashSet(50);

    public static String[] n(String[] stringArray) {
        for (String string : stringArray) {
            String[] stringArray2;
            for (String string2 : stringArray2 = ary_2.fT(string)) {
                cUr.add(string2);
            }
        }
        String[] stringArray3 = new String[cUr.size()];
        cUr.toArray(stringArray3);
        return stringArray3;
    }

    public static String[] fT(String string) {
        switch (string.hashCode()) {
            case 1460857362: {
                return cTT;
            }
            case 2571426: {
                return cTU;
            }
            case 70353081: {
                return cTV;
            }
            case 2455640: {
                return cTW;
            }
            case 80097030: {
                return cTX;
            }
            case 2047106: {
                return cTY;
            }
            case -1157987650: {
                return cTZ;
            }
            case -514753261: {
                return cUa;
            }
            case 855858226: {
                return cUc;
            }
            case -2026252917: {
                return cUe;
            }
            case 761980122: {
                return cUg;
            }
            case 2422137: {
                return cUi;
            }
            case -2027940606: {
                return cUk;
            }
            case 525252987: {
                return cUm;
            }
            case -485157885: {
                return cUo;
            }
            case -1147503697: {
                return cUq;
            }
        }
        return new String[]{string};
    }
}

