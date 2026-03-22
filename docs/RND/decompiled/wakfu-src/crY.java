/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 */
import gnu.trove.map.hash.TLongObjectHashMap;
import java.nio.ByteBuffer;

public class crY
extends nr_0 {
    private final TLongObjectHashMap<byte[]> mgG = new TLongObjectHashMap();

    public TLongObjectHashMap<byte[]> chB() {
        return this.mgG;
    }

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        int n = byteBuffer.getShort();
        for (int i = 0; i < n; ++i) {
            long l = byteBuffer.getLong();
            short s = byteBuffer.getShort();
            byte[] byArray2 = new byte[s];
            byteBuffer.get(byArray2);
            this.mgG.put(l, (Object)byArray2);
        }
        return true;
    }

    @Override
    public int d() {
        return 12865;
    }
}

