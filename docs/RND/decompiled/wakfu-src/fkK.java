/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TByteObjectHashMap
 */
import gnu.trove.map.hash.TByteObjectHashMap;
import java.util.EnumSet;
import java.util.Iterator;

public final class fkK
extends Enum<fkK> {
    public static final /* enum */ fkK sCk = new fkK(1, fkL.sCt);
    public static final /* enum */ fkK sCl = new fkK(2, fkL.sCu);
    private static final TByteObjectHashMap<fkK> sCm;
    private final byte sCn;
    private long sCo;
    private final fkL sCp;
    private static final /* synthetic */ fkK[] sCq;

    public static fkK[] values() {
        return (fkK[])sCq.clone();
    }

    public static fkK valueOf(String string) {
        return Enum.valueOf(fkK.class, string);
    }

    private fkK(int n2, fkL fkL2) {
        this.sCn = (byte)n2;
        this.sCo = 1 << this.sCn;
        this.sCp = fkL2;
    }

    public byte aJr() {
        return this.sCn;
    }

    public long gcy() {
        return this.sCo;
    }

    public fkL gcz() {
        return this.sCp;
    }

    public static long b(EnumSet<fkK> enumSet) {
        long l = 0L;
        Iterator iterator = enumSet.iterator();
        while (iterator.hasNext()) {
            l |= ((fkK)((Object)iterator.next())).sCo;
        }
        return l;
    }

    public static EnumSet<fkK> ud(long l) {
        EnumSet<fkK> enumSet = EnumSet.noneOf(fkK.class);
        fkK[] fkKArray = fkK.values();
        for (int i = 0; i < fkKArray.length; ++i) {
            fkK fkK2 = fkKArray[i];
            if ((l & fkK2.sCo) != fkK2.sCo) continue;
            enumSet.add(fkK2);
        }
        return enumSet;
    }

    public static fkK gU(byte by) {
        return (fkK)((Object)sCm.get(by));
    }

    private static /* synthetic */ fkK[] gcA() {
        return new fkK[]{sCk, sCl};
    }

    static {
        sCq = fkK.gcA();
        sCm = new TByteObjectHashMap();
        fkK[] fkKArray = fkK.values();
        for (int i = 0; i < fkKArray.length; ++i) {
            fkK fkK2 = fkKArray[i];
            sCm.put(fkK2.sCn, (Object)fkK2);
        }
    }
}

