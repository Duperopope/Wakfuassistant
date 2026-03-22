/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.io.LittleEndianDataInputStream
 *  com.google.common.io.LittleEndianDataOutputStream
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import com.google.common.io.LittleEndianDataInputStream;
import com.google.common.io.LittleEndianDataOutputStream;
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class aeT {
    private static final TIntObjectHashMap<aeS> coM = new TIntObjectHashMap(20000, 1.0f);

    private aeT() {
    }

    public static void b(aeS aeS2) {
        assert (!coM.containsKey(aeS2.d())) : "Un \u00e9l\u00e9ment avec l'id " + aeS2.d() + " existe d\u00e9j\u00e0";
        coM.put(aeS2.d(), (Object)aeS2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void dJ(String string) {
        try (LittleEndianDataInputStream littleEndianDataInputStream = new LittleEndianDataInputStream((InputStream)new ByteArrayInputStream(fo_0.by(string)));){
            int n = littleEndianDataInputStream.readInt();
            for (int i = 0; i < n; ++i) {
                aeT.b(new aeS((DataInput)littleEndianDataInputStream));
            }
            coM.trimToSize();
        }
    }

    public static void ef(String string) {
        FileOutputStream fileOutputStream = fq_0.bO(string);
        LittleEndianDataOutputStream littleEndianDataOutputStream = new LittleEndianDataOutputStream((OutputStream)fileOutputStream);
        littleEndianDataOutputStream.writeInt(coM.size());
        TIntObjectIterator tIntObjectIterator = coM.iterator();
        for (int i = coM.size(); i > 0; --i) {
            tIntObjectIterator.advance();
            ((aeS)tIntObjectIterator.value()).b((DataOutput)littleEndianDataOutputStream);
        }
        littleEndianDataOutputStream.close();
    }

    public static aeS sc(int n) {
        return (aeS)coM.get(n);
    }

    public static void clear() {
        coM.clear();
    }

    public static int aVo() {
        return coM.size();
    }
}

