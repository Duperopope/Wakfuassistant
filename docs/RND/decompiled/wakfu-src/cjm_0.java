/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntShortIterator
 *  gnu.trove.map.hash.TIntShortHashMap
 */
import gnu.trove.iterator.TIntShortIterator;
import gnu.trove.map.hash.TIntShortHashMap;
import java.nio.ByteBuffer;

/*
 * Renamed from cjM
 */
public class cjm_0
extends nv_0 {
    private final long lXg;
    private final int lXh;
    private final byte lXi;
    private final TIntShortHashMap lXj = new TIntShortHashMap();

    public cjm_0(long l, int n, byte by) {
        this.lXg = l;
        this.lXh = n;
        this.lXi = by;
    }

    public void j(int n, short s) {
        this.lXj.put(n, s);
    }

    @Override
    public byte[] aVX() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(13 + this.lXj.size() * 6);
        byteBuffer.putLong(this.lXg);
        byteBuffer.putInt(this.lXh);
        byteBuffer.put(this.lXi);
        TIntShortIterator tIntShortIterator = this.lXj.iterator();
        while (tIntShortIterator.hasNext()) {
            tIntShortIterator.advance();
            byteBuffer.putInt(tIntShortIterator.key());
            byteBuffer.putShort(tIntShortIterator.value());
        }
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int d() {
        return 13846;
    }
}

