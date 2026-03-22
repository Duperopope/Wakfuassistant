/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.EnumMap;
import java.util.Map;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bRt
 */
public final class brt_1
implements aeh_2 {
    private static final brt_1 law = new brt_1();
    private static final String lax = "total";
    private static final String lay = "heroes";
    private static final String laz = "admins";
    private static final String laA = "accountInventories";
    private static final String laB = "characterInventories";
    private static final String laC = "gamesAccountData";
    private static final String laD = "subscriptions";
    private static final String laE = "worldname";
    private int dff;
    private int laF;
    private int laG;
    private EnumMap<evt_1, Integer[]> laH;
    private int laI;
    private int laJ;
    private int laK;

    public static brt_1 ekR() {
        return law;
    }

    public void Je(int n) {
        this.dff = n;
        fse_1.gFu().aT("statistics", lax);
    }

    public void Jf(int n) {
        this.laF = n;
        fse_1.gFu().aT("statistics", lay);
    }

    public void Jg(int n) {
        this.laG = n;
        fse_1.gFu().aT("statistics", laz);
    }

    public void a(EnumMap<evt_1, Integer[]> enumMap) {
        this.laH = new EnumMap<evt_1, Integer[]>(enumMap);
        fse_1.gFu().aT("statistics", laD);
    }

    public void Jh(int n) {
        this.laI = n;
        fse_1.gFu().aT("statistics", laA);
    }

    public void Ji(int n) {
        this.laJ = n;
        fse_1.gFu().aT("statistics", laB);
    }

    public void Jj(int n) {
        this.laK = n;
        fse_1.gFu().aT("statistics", laC);
    }

    public void clear() {
        this.dff = -1;
        this.laG = -1;
        if (this.laH != null) {
            this.laH.clear();
            this.laH = null;
        }
        this.laI = -1;
        this.laJ = -1;
    }

    @Override
    public String[] bxk() {
        return new String[]{lax, lay, laz, laD, laA, laB, laC};
    }

    @Override
    @Nullable
    public Object eu(String string) {
        switch (string) {
            case "worldname": {
                return aub_0.cVb().cVp();
            }
            case "total": {
                return this.dff;
            }
            case "heroes": {
                return this.laF;
            }
            case "admins": {
                return this.laG;
            }
            case "subscriptions": {
                return this.ekS();
            }
            case "accountInventories": {
                return this.laI;
            }
            case "characterInventories": {
                return this.laJ;
            }
            case "gamesAccountData": {
                return this.laK;
            }
        }
        return null;
    }

    private String ekS() {
        if (this.laH == null) {
            return "";
        }
        ahv_2 ahv_22 = new ahv_2();
        for (Map.Entry<evt_1, Integer[]> entry : this.laH.entrySet()) {
            Integer[] integerArray = entry.getValue();
            ahv_22.c(" - ").c(entry.getKey().name()).c(" : ").af(integerArray[0]).c(" (").af(integerArray[1]).k(')').ceH();
        }
        return ahv_22.ceL();
    }
}

