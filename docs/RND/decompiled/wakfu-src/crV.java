/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 */
import gnu.trove.map.hash.TLongObjectHashMap;
import java.nio.ByteBuffer;

public class crV
extends nr_0 {
    private final TLongObjectHashMap<azy_1<Long, byte[], Long>> mgE = new TLongObjectHashMap();

    public TLongObjectHashMap<azy_1<Long, byte[], Long>> chB() {
        return this.mgE;
    }

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        int n = byteBuffer.getShort();
        for (int i = 0; i < n; ++i) {
            long l = byteBuffer.getLong();
            long l2 = byteBuffer.getLong();
            short s = byteBuffer.getShort();
            byte[] byArray2 = new byte[s];
            byteBuffer.get(byArray2);
            long l3 = byteBuffer.getLong();
            this.mgE.put(l, new azy_1<Long, byte[], Long>(l2, byArray2, l3));
        }
        return true;
    }

    @Override
    public int d() {
        return 12282;
    }
}

