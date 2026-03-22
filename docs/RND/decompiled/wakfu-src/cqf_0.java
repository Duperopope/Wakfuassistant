/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 */
import gnu.trove.map.hash.TLongObjectHashMap;
import java.nio.ByteBuffer;

/*
 * Renamed from cqF
 */
public final class cqf_0
extends cqf {
    final TLongObjectHashMap<acd_1> mfn = new TLongObjectHashMap();
    private boolean mfo;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.fg(byteBuffer);
        int n = byteBuffer.getShort();
        for (int i = 0; i < n; ++i) {
            long l = byteBuffer.getLong();
            acd_1 acd_12 = new acd_1(byteBuffer.getInt(), byteBuffer.getInt(), byteBuffer.getShort());
            this.mfn.put(l, (Object)acd_12);
        }
        this.mfo = byteBuffer.get() == 1;
        return false;
    }

    public boolean eyL() {
        return this.mfo;
    }

    public TLongObjectHashMap<acd_1> eyM() {
        return this.mfn;
    }

    @Override
    public int d() {
        return 13070;
    }
}

