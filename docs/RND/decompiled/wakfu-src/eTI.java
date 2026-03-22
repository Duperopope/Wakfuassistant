/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.map.hash.TLongObjectHashMap
 */
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.map.hash.TLongObjectHashMap;
import java.nio.ByteBuffer;

class eTI
extends fi_1 {
    final /* synthetic */ eTC rpY;

    eTI(eTC eTC2) {
        this.rpY = eTC2;
    }

    @Override
    public void as(ByteBuffer byteBuffer) {
        TLongObjectHashMap<String> tLongObjectHashMap = this.rpY.jfO.fJk();
        byteBuffer.put(this.rpY.jfO.faB());
        byteBuffer.put((byte)tLongObjectHashMap.size());
        TLongObjectIterator tLongObjectIterator = tLongObjectHashMap.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            byteBuffer.putLong(tLongObjectIterator.key());
            byte[] byArray = BH.aP((String)tLongObjectIterator.value());
            if (byArray.length > 127) {
                return;
            }
            byteBuffer.put((byte)byArray.length);
            byteBuffer.put(byArray);
        }
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        this.rpY.jfO.bD(byteBuffer.get());
        int n2 = byteBuffer.get();
        for (int i = 0; i < n2; ++i) {
            long l = byteBuffer.getLong();
            byte[] byArray = new byte[byteBuffer.get()];
            byteBuffer.get(byArray);
            this.rpY.jfO.j(l, BH.dc(byArray));
        }
    }

    @Override
    public int zt() {
        int n = 2;
        TLongObjectHashMap<String> tLongObjectHashMap = this.rpY.jfO.fJk();
        TLongObjectIterator tLongObjectIterator = tLongObjectHashMap.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            byte[] byArray = BH.aP((String)tLongObjectIterator.value());
            if (byArray.length > 127) {
                return n;
            }
            n += 9 + byArray.length;
        }
        return n;
    }
}

