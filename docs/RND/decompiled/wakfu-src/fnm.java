/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TByteObjectHashMap
 */
import gnu.trove.map.hash.TByteObjectHashMap;

@Deprecated(forRemoval=true)
public final class fnm
extends Enum<fnm> {
    public static final /* enum */ fnm sIx = new fnm(1, 1);
    public static final /* enum */ fnm sIy = new fnm(2, 10);
    public static final /* enum */ fnm sIz = new fnm(3, 50);
    public static final /* enum */ fnm sIA = new fnm(4, 100);
    private static final TByteObjectHashMap<fnm> sIB;
    public final byte sIC;
    public final short sID;
    private static final /* synthetic */ fnm[] sIE;

    public static fnm[] values() {
        return (fnm[])sIE.clone();
    }

    public static fnm valueOf(String string) {
        return Enum.valueOf(fnm.class, string);
    }

    private fnm(int n2, int n3) {
        this.sIC = (byte)n2;
        this.sID = (short)n3;
    }

    public static fnm gY(byte by) {
        return (fnm)((Object)sIB.get(by));
    }

    public static fnm fo(short s) {
        fnm[] fnmArray = fnm.values();
        for (int i = 0; i < fnmArray.length; ++i) {
            fnm fnm2 = fnmArray[i];
            if (fnm2.sID != s) continue;
            return fnm2;
        }
        return null;
    }

    private static /* synthetic */ fnm[] ged() {
        return new fnm[]{sIx, sIy, sIz, sIA};
    }

    static {
        sIE = fnm.ged();
        sIB = new TByteObjectHashMap();
        fnm[] fnmArray = fnm.values();
        for (int i = 0; i < fnmArray.length; ++i) {
            fnm fnm2 = fnmArray[i];
            sIB.put(fnm2.sIC, (Object)fnm2);
        }
    }
}

