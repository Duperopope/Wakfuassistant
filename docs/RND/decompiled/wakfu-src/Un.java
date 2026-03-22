/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TShortObjectHashMap
 *  gnu.trove.procedure.TShortObjectProcedure
 *  gnu.trove.set.hash.TLongHashSet
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TShortObjectHashMap;
import gnu.trove.procedure.TShortObjectProcedure;
import gnu.trove.set.hash.TLongHashSet;
import java.nio.ByteBuffer;
import java.util.List;
import org.apache.log4j.Logger;

public final class Un {
    static final Logger buH = Logger.getLogger(Un.class);

    public static byte[] a(Uj uj) {
        azg_1 azg_12 = new azg_1();
        Un.d(uj, azg_12);
        Un.a(uj, azg_12);
        return azg_12.bTe();
    }

    public static void a(byte[] byArray, Tz tz, Uj uj) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        Un.a(uj, byteBuffer);
        Un.a(uj, byteBuffer, tz);
    }

    private static void a(Uj uj, azg_1 azg_12) {
        Un.b(uj, azg_12);
        Un.c(uj, azg_12);
    }

    private static void a(Uj uj, ByteBuffer byteBuffer, Tz tz) {
        Un.b(uj, byteBuffer, tz);
        Un.c(uj, byteBuffer, tz);
    }

    private static void b(Uj uj, ByteBuffer byteBuffer, Tz tz) {
        Un.a(uj, byteBuffer, uj.bja(), tz);
    }

    private static void c(Uj uj, ByteBuffer byteBuffer, Tz tz) {
        Un.a(uj, byteBuffer, uj.bjb(), tz);
    }

    private static void b(Uj uj, azg_1 azg_12) {
        Un.a(azg_12, uj.bja());
    }

    private static void c(Uj uj, azg_1 azg_12) {
        Un.a(azg_12, uj.bjb());
    }

    private static void a(azg_1 azg_12, TShortObjectHashMap<List<TO>> tShortObjectHashMap) {
        azg_12.vC(tShortObjectHashMap.size());
        tShortObjectHashMap.forEachEntry((TShortObjectProcedure)new Uo(azg_12));
    }

    private static void a(Uj uj, ByteBuffer byteBuffer, TShortObjectHashMap<List<TO>> tShortObjectHashMap, Tz tz) {
        int n = byteBuffer.getInt();
        Up up = new Up(tz);
        up.a(uj, byteBuffer, n, tShortObjectHashMap);
    }

    private static void d(Uj uj, azg_1 azg_12) {
        TLongHashSet tLongHashSet = uj.biZ();
        azg_12.aG((short)tLongHashSet.size());
        tLongHashSet.forEach(l -> {
            azg_12.gK(l);
            return true;
        });
    }

    private static void a(Uj uj, ByteBuffer byteBuffer) {
        int n = byteBuffer.getShort();
        for (int i = 0; i < n; ++i) {
            uj.fi(byteBuffer.getLong());
        }
    }
}

