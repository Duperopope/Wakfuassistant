/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.procedure.TLongObjectProcedure
 */
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.procedure.TLongObjectProcedure;
import java.nio.ByteBuffer;

/*
 * Renamed from eVy
 */
public final class evy_0 {
    public static byte[] e(TLongObjectHashMap<eVw> tLongObjectHashMap) {
        azg_1 azg_12 = new azg_1();
        short s = (short)tLongObjectHashMap.size();
        azg_12.aG(s);
        tLongObjectHashMap.forEachEntry((TLongObjectProcedure)new evz_0(azg_12));
        return azg_12.bTe();
    }

    public static TLongObjectHashMap<eVw> eH(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        TLongObjectHashMap tLongObjectHashMap = new TLongObjectHashMap();
        int n = byteBuffer.getShort();
        for (int i = 0; i < n; ++i) {
            long l = byteBuffer.getLong();
            byte[] byArray2 = new byte[byteBuffer.getInt()];
            byteBuffer.get(byArray2);
            eVw eVw2 = evx_0.eG(byArray2);
            tLongObjectHashMap.put(l, (Object)eVw2);
        }
        return tLongObjectHashMap;
    }
}

