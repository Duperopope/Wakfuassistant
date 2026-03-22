/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 */
import gnu.trove.map.hash.TLongObjectHashMap;
import java.nio.ByteBuffer;

public class csv
extends nr_0 {
    private final TLongObjectHashMap<fif> mhk = new TLongObjectHashMap();
    private long mhl;
    private long jWq;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.jWq = byteBuffer.getLong();
        this.mhl = byteBuffer.getLong();
        while (byteBuffer.hasRemaining()) {
            long l = byteBuffer.getLong();
            byte by = byteBuffer.get();
            fif fif2 = fif.gH(by);
            fif2.eM(byteBuffer);
            this.mhk.put(l, (Object)fif2);
        }
        return true;
    }

    public TLongObjectHashMap<fif> eAz() {
        return this.mhk;
    }

    public long eAV() {
        return this.jWq;
    }

    public long eAW() {
        return this.mhl;
    }

    @Override
    public int d() {
        return 13426;
    }
}

