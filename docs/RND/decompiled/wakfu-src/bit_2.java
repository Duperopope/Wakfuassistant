/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bIt
 */
public class bit_2 {
    private static final Logger kgg = Logger.getLogger(bit_2.class);
    public static final bit_2 kgh = new bit_2();
    private final TIntObjectHashMap<fso_1> kgi = new TIntObjectHashMap();
    public static final fso_1 kgj;
    public static final fso_1 kgk;
    public static final fso_1 kgl;
    public static final fso_1 kgm;
    public static final fso_1 kgn;
    public static final fso_1 kgo;
    public static final fso_1 kgp;
    public static final fso_1 kgq;
    public static final fso_1 kgr;
    public static final fso_1 kgs;
    public static final fso_1 kgt;
    public static final fso_1 kgu;
    public static final fso_1 kgv;
    public static final fso_1 kgw;
    public static final fso_1 kgx;
    public static final short kgy = 46;

    @Nullable
    public fso_1 GZ(int n) {
        fso_1 fso_12 = (fso_1)this.kgi.get(n);
        if (fso_12 != null || this.kgi.containsKey(n)) {
            return fso_12;
        }
        float f2 = bit_2.Ha(n);
        try {
            String string = auc_0.cVq().bS("pointsOfInterestIconPath");
            String string2 = fo_0.b(string, n);
            if (!bl_0.bl(string2)) {
                kgg.warn((Object)("Impossible de trouver la texture " + string2));
            } else {
                fso_12 = new fso_1(string2, 0.5f, f2);
            }
        }
        catch (fu_0 fu_02) {
            kgg.warn((Object)fu_02.getMessage());
        }
        this.kgi.put(n, (Object)fso_12);
        return fso_12;
    }

    private static float Ha(int n) {
        if (n == 36) {
            return 1.0f;
        }
        return 0.66f;
    }

    private static fso_1 mP(String string) {
        return bit_2.b(string, 0.5f, 0.66f);
    }

    private static fso_1 b(String string, float f2, float f3) {
        try {
            String string2 = auc_0.kG(string);
            if (!bl_0.bl(string2)) {
                kgg.warn((Object)("Impossible de trouver la texture " + string2 + " key=" + string));
                return null;
            }
            return new fso_1(string2, f2, f3);
        }
        catch (fu_0 fu_02) {
            kgg.error((Object)("Probl\u00e8me de chargement de l'icone pathKey=" + string), (Throwable)fu_02);
            return null;
        }
    }

    static {
        kgx = bit_2.mP("newPoiPath");
        kgj = bit_2.mP("zaapPoiPath");
        kgk = bit_2.mP("dragoPoiPath");
        kgm = bit_2.mP("boatPoiPath");
        kgl = bit_2.mP("cannonPoiPath");
        kgn = bit_2.b("pointsOfInterestDefaultSmallIconPath", 0.5f, 0.5f);
        kgo = bit_2.mP("compassPointFile");
        kgr = bit_2.b("miniMapPointFile", 0.5f, 0.5f);
        kgs = bit_2.b("miniMapPointBigFile", 0.5f, 1.0f);
        kgw = bit_2.b("partyMemberPoiPath", 0.5f, 1.0f);
        kgp = bit_2.mP("pointsOfInterestProtectorIconPath");
        kgq = bit_2.mP("pointsOfInterestProtectorinChaosIconPath");
        kgt = bit_2.mP("hwBuidingIconRedPath");
        kgu = bit_2.mP("hwBuidingIconOrangePath");
        kgv = bit_2.mP("hwBuidingIconGreenPath");
    }
}

