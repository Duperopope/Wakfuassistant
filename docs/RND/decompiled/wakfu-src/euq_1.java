/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TByteObjectHashMap
 */
import gnu.trove.map.hash.TByteObjectHashMap;
import java.util.HashMap;

/*
 * Renamed from euQ
 */
public final class euq_1
extends Enum<euq_1> {
    public static final /* enum */ euq_1 orL = new euq_1(1, "WKSTEAMER");
    public static final /* enum */ euq_1 orM = new euq_1(2, "ANTIADDICT");
    public static final /* enum */ euq_1 orN = new euq_1(3, "WKCHARACTERS");
    public static final /* enum */ euq_1 orO = new euq_1(4, "WKVAULTUP");
    public static final /* enum */ euq_1 orP = new euq_1(5, "WKBUILDCARAC");
    public static final /* enum */ euq_1 orQ = new euq_1(6, "WKBUILDEQUIP");
    public static final /* enum */ euq_1 orR = new euq_1(7, "WKBUILDSORT");
    public static final /* enum */ euq_1 orS = new euq_1(8, "WKBETAACCESS");
    public static final /* enum */ euq_1 orT = new euq_1(9, "WKBETAREWARD");
    public static final /* enum */ euq_1 orU = new euq_1(10, "WKOUGINAK");
    public static final /* enum */ euq_1 orV = new euq_1(11, "WAKFU_NEO");
    private static final TByteObjectHashMap<euq_1> orW;
    private static final HashMap<String, euq_1> orX;
    private final byte orY;
    private final String orZ;
    private static final /* synthetic */ euq_1[] osa;

    public static euq_1[] values() {
        return (euq_1[])osa.clone();
    }

    public static euq_1 valueOf(String string) {
        return Enum.valueOf(euq_1.class, string);
    }

    private euq_1(byte by, String string2) {
        this.orY = by;
        this.orZ = string2;
    }

    public byte aJr() {
        return this.orY;
    }

    public String fds() {
        return this.orZ;
    }

    public static euq_1 ep(byte by) {
        return (euq_1)((Object)orW.get(by));
    }

    public static euq_1 rB(String string) {
        return orX.get(string);
    }

    private static /* synthetic */ euq_1[] fdt() {
        return new euq_1[]{orL, orM, orN, orO, orP, orQ, orR, orS, orT, orU, orV};
    }

    static {
        osa = euq_1.fdt();
        orW = new TByteObjectHashMap();
        orX = new HashMap();
        for (euq_1 euq_12 : euq_1.values()) {
            orW.put(euq_12.orY, (Object)euq_12);
            orX.put(euq_12.orZ, euq_12);
        }
    }
}

