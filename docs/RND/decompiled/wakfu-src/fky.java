/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongByteIterator
 *  gnu.trove.map.hash.TLongByteHashMap
 */
import gnu.trove.iterator.TLongByteIterator;
import gnu.trove.map.hash.TLongByteHashMap;
import java.nio.ByteBuffer;

public class fky {
    private static final byte sBY = 2;
    final TLongByteHashMap sBZ = new TLongByteHashMap();
    private final fkD sCa;

    public fky(fkD fkD2) {
        this.sCa = fkD2;
    }

    public void ub(long l) {
        this.sBZ.put(l, (byte)2);
        this.gcs();
    }

    public boolean tP(long l) {
        return this.sBZ.get(l) != 0;
    }

    public void gcr() {
        TLongByteIterator tLongByteIterator = this.sBZ.iterator();
        while (tLongByteIterator.hasNext()) {
            tLongByteIterator.advance();
            byte by = tLongByteIterator.value();
            if (by == 1) {
                tLongByteIterator.remove();
            }
            tLongByteIterator.setValue((byte)(by - 1));
        }
        this.gcs();
    }

    private void gcs() {
        this.sCa.ekV();
    }

    public void as(ByteBuffer byteBuffer) {
        byteBuffer.putShort((short)this.sBZ.size());
        TLongByteIterator tLongByteIterator = this.sBZ.iterator();
        while (tLongByteIterator.hasNext()) {
            tLongByteIterator.advance();
            byteBuffer.putLong(tLongByteIterator.key());
            byteBuffer.put(tLongByteIterator.value());
        }
    }

    public void eL(ByteBuffer byteBuffer) {
        this.sBZ.clear();
        short s = byteBuffer.getShort();
        for (short s2 = 0; s2 < s; s2 = (short)(s2 + 1)) {
            this.sBZ.put(byteBuffer.getLong(), byteBuffer.get());
        }
    }

    public int DN() {
        return 2 + this.sBZ.size() * 9;
    }
}

