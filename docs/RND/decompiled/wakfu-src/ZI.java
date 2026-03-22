/*
 * Decompiled with CFR 0.152.
 */
public class ZI {
    public static final String bWr = "Anim";
    public static final String bWs = "-Debut";
    public static final String bWt = "-Fin";
    public static final String bWu = "AnimStatique";
    public static final String bWv = "AnimPosing";
    public static final String bWw = "AnimPosingAssis";
    public static final String bWx = "AnimStatique-UI";
    public static final String bWy = "Course";
    public static final String bWz = "AnimCourse";
    public static final String bWA = "AnimStatiqueCadre";
    public static final String bWB = "AnimSaut";
    public static final String bWC = "AnimSaut-Marche";
    public static final String bWD = "AnimSaut-Marche";
    public static final String bWE = "AnimSaut-Marche";
    public static final String bWF = "AnimSaut-Marche";
    public static final String bWG = "AnimSaut-Marche";
    public static final String bWH = "AnimMarche";
    public static final String bWI = "AnimHit";
    public static final String bWJ = "AnimHamecon";
    public static final String bWK = "Accessoire";
    public static final String bWL = "blason";
    public static final String bWM = "blason_bg";
    public static final String bWN = "AnimRelique";
    public static final String bWO = "AnimRelique-Saut";
    public static final String bWP = "AnimArtefact-Papatte";
    public static final String bWQ = "AnimArtefact-Nager";
    public static final String bWR = "AnimArtefact-Nager-Statique";
    public static final String bWS = "AnimArtefact-Nager-Marche";
    public static final String bWT = "AnimArtefact-Nager-Debut";
    public static final String bWU = "AnimArtefact-Nager-Fin";
    public static final String bWV = "Mnt";

    public static String m(String string, boolean bl) {
        StringBuilder stringBuilder = new StringBuilder(string);
        int n = stringBuilder.lastIndexOf("-");
        if (n == -1) {
            if (bl) {
                stringBuilder.append(bWt);
            }
        } else {
            stringBuilder.replace(n, stringBuilder.length(), bWt);
        }
        return stringBuilder.toString();
    }
}

