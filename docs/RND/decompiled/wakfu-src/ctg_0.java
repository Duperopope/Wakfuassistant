/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.nio.ByteBuffer;

/*
 * Renamed from ctG
 */
public class ctg_0
extends nr_0 {
    private final TIntObjectHashMap<byte[]> mix = new TIntObjectHashMap();

    public TIntObjectIterator<byte[]> eCu() {
        return this.mix.iterator();
    }

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        while (byteBuffer.hasRemaining()) {
            int n = byteBuffer.getInt();
            int n2 = byteBuffer.getInt();
            byte[] byArray2 = new byte[n2];
            byteBuffer.get(byArray2);
            this.mix.put(n, (Object)byArray2);
        }
        return true;
    }

    @Override
    public int d() {
        return 14865;
    }
}

