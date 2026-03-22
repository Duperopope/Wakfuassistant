/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.MessageLite
 */
import com.google.protobuf.MessageLite;
import java.util.HashMap;

/*
 * Renamed from LZ
 */
public final class lz_2
extends Enum<lz_2> {
    public static final /* enum */ lz_2 aRz = new lz_2(46532934236L, (MessageLite)mb_2.aTP());
    private final long aRA;
    private final MessageLite aRB;
    private static final /* synthetic */ lz_2[] aRC;

    public static lz_2[] values() {
        return (lz_2[])aRC.clone();
    }

    public static lz_2 valueOf(String string) {
        return Enum.valueOf(lz_2.class, string);
    }

    private lz_2(long l, MessageLite messageLite) {
        this.aRA = l;
        this.aRB = messageLite;
    }

    public static HashMap<Long, MessageLite> a() {
        lz_2[] lz_2Array;
        HashMap<Long, MessageLite> hashMap = new HashMap<Long, MessageLite>();
        for (lz_2 lz_22 : lz_2Array = lz_2.values()) {
            hashMap.put(lz_22.aRA, lz_22.aRB);
        }
        return hashMap;
    }

    private static /* synthetic */ lz_2[] aTE() {
        return new lz_2[]{aRz};
    }

    static {
        aRC = lz_2.aTE();
    }
}

