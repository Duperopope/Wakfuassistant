/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongIterator
 *  gnu.trove.set.hash.TLongHashSet
 */
import gnu.trove.iterator.TLongIterator;
import gnu.trove.set.hash.TLongHashSet;
import java.nio.ByteBuffer;

/*
 * Renamed from cxm
 */
public class cxm_0
extends nv_0 {
    private TLongHashSet mlH;

    public void b(TLongHashSet tLongHashSet) {
        this.mlH = tLongHashSet;
    }

    @Override
    public byte[] aVX() {
        int n = this.mlH.size();
        ByteBuffer byteBuffer = ByteBuffer.allocate(2 + 8 * n);
        byteBuffer.putShort((short)n);
        TLongIterator tLongIterator = this.mlH.iterator();
        while (tLongIterator.hasNext()) {
            byteBuffer.putLong(tLongIterator.next());
        }
        return this.a((byte)6, byteBuffer.array());
    }

    @Override
    public int d() {
        return 15792;
    }
}

