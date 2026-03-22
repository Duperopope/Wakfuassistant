/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 */
import gnu.trove.map.hash.TLongObjectHashMap;
import java.nio.ByteBuffer;

public class csf
extends nr_0 {
    private final TLongObjectHashMap<fif> mgO = new TLongObjectHashMap();
    private boolean mgP;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        boolean bl = this.mgP = byteBuffer.get() == 1;
        while (byteBuffer.hasRemaining()) {
            long l = byteBuffer.getLong();
            byte by = byteBuffer.get();
            fif fif2 = fif.gH(by);
            fif2.eM(byteBuffer);
            this.mgO.put(l, (Object)fif2);
        }
        return true;
    }

    public TLongObjectHashMap<fif> eAz() {
        return this.mgO;
    }

    public boolean eAB() {
        return this.mgP;
    }

    @Override
    public int d() {
        return 13804;
    }
}

