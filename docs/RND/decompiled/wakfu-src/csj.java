/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 */
import gnu.trove.map.hash.TLongObjectHashMap;
import java.nio.ByteBuffer;

public class csj
extends nr_0 {
    private final TLongObjectHashMap<fif> mgW = new TLongObjectHashMap();
    private byte mgX;
    private long aDh;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mgX = byteBuffer.get();
        this.aDh = byteBuffer.getLong();
        while (byteBuffer.hasRemaining()) {
            long l = byteBuffer.getLong();
            byte by = byteBuffer.get();
            fif fif2 = fif.gH(by);
            fif2.eM(byteBuffer);
            if (fif2.fZw() == 0) {
                ((fie)fif2).nu(true);
            } else if (fif2.fZw() == 2) {
                ((fii_0)fif2).nu(true);
            }
            this.mgW.put(l, (Object)fif2);
        }
        return true;
    }

    public long KU() {
        return this.aDh;
    }

    public byte eAJ() {
        return this.mgX;
    }

    public TLongObjectHashMap<fif> eAz() {
        return this.mgW;
    }

    @Override
    public int d() {
        return 12654;
    }
}

