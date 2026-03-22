/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
 * Renamed from coW
 */
public class cow_0
extends nr_0 {
    private final HashMap<Long, Byte> mdC = new HashMap();

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        for (int i = byteBuffer.get() - 1; i >= 0; --i) {
            long l = byteBuffer.getLong();
            byte by = byteBuffer.get();
            this.mdC.put(l, by);
        }
        return true;
    }

    @Override
    public int d() {
        return 12524;
    }

    public Iterator<Map.Entry<Long, Byte>> ewR() {
        return this.mdC.entrySet().iterator();
    }
}

