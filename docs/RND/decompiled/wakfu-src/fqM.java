/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TByteIntIterator
 *  gnu.trove.iterator.TIntIntIterator
 *  gnu.trove.iterator.TLongIntIterator
 *  gnu.trove.map.hash.TByteIntHashMap
 *  gnu.trove.map.hash.TIntIntHashMap
 *  gnu.trove.map.hash.TLongIntHashMap
 */
import gnu.trove.iterator.TByteIntIterator;
import gnu.trove.iterator.TIntIntIterator;
import gnu.trove.iterator.TLongIntIterator;
import gnu.trove.map.hash.TByteIntHashMap;
import gnu.trove.map.hash.TIntIntHashMap;
import gnu.trove.map.hash.TLongIntHashMap;
import java.nio.ByteBuffer;

final class fqM {
    fqM() {
    }

    static byte[] a(fqQ fqQ2) {
        azg_1 azg_12 = new azg_1();
        fqM.a(azg_12, fqQ2.gjh());
        fqM.a(azg_12, fqQ2.gji());
        fqM.a(azg_12, fqQ2.gjj());
        fqM.a(azg_12, fqQ2.gjk());
        return azg_12.bTe();
    }

    static void a(ByteBuffer byteBuffer, fqQ fqQ2) {
        fqM.b(byteBuffer, fqQ2);
        fqM.c(byteBuffer, fqQ2);
        fqM.d(byteBuffer, fqQ2);
        fqM.e(byteBuffer, fqQ2);
    }

    private static void a(ByteBuffer byteBuffer, int n, TLongIntHashMap tLongIntHashMap) {
        tLongIntHashMap.clear();
        for (int i = n; i > 0; --i) {
            tLongIntHashMap.put(byteBuffer.getLong(), byteBuffer.getInt());
        }
    }

    private static void a(ByteBuffer byteBuffer, int n, TIntIntHashMap tIntIntHashMap) {
        tIntIntHashMap.clear();
        for (int i = n; i > 0; --i) {
            tIntIntHashMap.put(byteBuffer.getInt(), byteBuffer.getInt());
        }
    }

    private static void a(ByteBuffer byteBuffer, int n, TByteIntHashMap tByteIntHashMap) {
        tByteIntHashMap.clear();
        for (int i = n; i > 0; --i) {
            tByteIntHashMap.put(byteBuffer.get(), byteBuffer.getInt());
        }
    }

    private static void a(azg_1 azg_12, TIntIntHashMap tIntIntHashMap) {
        if (tIntIntHashMap == null) {
            azg_12.aF((byte)0);
        } else {
            azg_12.aF((byte)tIntIntHashMap.size());
            TIntIntIterator tIntIntIterator = tIntIntHashMap.iterator();
            while (tIntIntIterator.hasNext()) {
                tIntIntIterator.advance();
                azg_12.vC(tIntIntIterator.key());
                azg_12.vC(tIntIntIterator.value());
            }
        }
    }

    private static void a(azg_1 azg_12, TLongIntHashMap tLongIntHashMap) {
        if (tLongIntHashMap == null) {
            azg_12.aF((byte)0);
        } else {
            azg_12.aF((byte)tLongIntHashMap.size());
            TLongIntIterator tLongIntIterator = tLongIntHashMap.iterator();
            while (tLongIntIterator.hasNext()) {
                tLongIntIterator.advance();
                azg_12.gK(tLongIntIterator.key());
                azg_12.vC(tLongIntIterator.value());
            }
        }
    }

    private static void a(azg_1 azg_12, TByteIntHashMap tByteIntHashMap) {
        if (tByteIntHashMap == null) {
            azg_12.aF((byte)0);
            return;
        }
        azg_12.aF((byte)tByteIntHashMap.size());
        TByteIntIterator tByteIntIterator = tByteIntHashMap.iterator();
        while (tByteIntIterator.hasNext()) {
            tByteIntIterator.advance();
            azg_12.aF(tByteIntIterator.key());
            azg_12.vC(tByteIntIterator.value());
        }
    }

    private static void b(ByteBuffer byteBuffer, fqQ fqQ2) {
        int n = byteBuffer.get() & 0xFF;
        if (n <= 0) {
            return;
        }
        fqM.a(byteBuffer, n, fqQ2.gjh());
    }

    private static void c(ByteBuffer byteBuffer, fqQ fqQ2) {
        int n = byteBuffer.get() & 0xFF;
        if (n <= 0) {
            return;
        }
        fqM.a(byteBuffer, n, fqQ2.gji());
    }

    private static void d(ByteBuffer byteBuffer, fqQ fqQ2) {
        int n = byteBuffer.get() & 0xFF;
        if (n <= 0) {
            return;
        }
        fqM.a(byteBuffer, n, fqQ2.gjj());
    }

    private static void e(ByteBuffer byteBuffer, fqQ fqQ2) {
        int n = byteBuffer.get() & 0xFF;
        if (n <= 0) {
            return;
        }
        fqM.a(byteBuffer, n, fqQ2.gjk());
    }
}

