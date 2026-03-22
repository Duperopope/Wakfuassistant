/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntIntIterator
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntIntHashMap
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.iterator.TIntIntIterator;
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntIntHashMap;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.nio.ByteBuffer;

public class cyp
extends nr_0 {
    private final TIntObjectHashMap<byte[]> mmx = new TIntObjectHashMap();
    private final TIntIntHashMap mmy = new TIntIntHashMap();

    public TIntObjectIterator<byte[]> eFx() {
        return this.mmx.iterator();
    }

    public TIntIntIterator eFy() {
        return this.mmy.iterator();
    }

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        while (byteBuffer.hasRemaining()) {
            int n = byteBuffer.getInt();
            byte[] byArray2 = new byte[byteBuffer.getInt()];
            byteBuffer.get(byArray2);
            ByteBuffer byteBuffer2 = ByteBuffer.wrap(byArray2);
            this.mmy.put(n, byteBuffer2.getInt());
            byte[] byArray3 = new byte[byteBuffer2.getInt()];
            byteBuffer2.get(byArray3);
            this.mmx.put(n, (Object)byArray3);
        }
        return true;
    }

    @Override
    public int d() {
        return 14551;
    }
}

