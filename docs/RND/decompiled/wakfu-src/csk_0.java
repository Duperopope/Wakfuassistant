/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 */
import gnu.trove.map.hash.TLongObjectHashMap;
import java.nio.ByteBuffer;

/*
 * Renamed from csk
 */
public class csk_0
extends nr_0 {
    private final TLongObjectHashMap<fif> mgY = new TLongObjectHashMap();
    private final uy_1 mgZ = new uy_1();
    private byte mgX;
    private long aDh;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.aDh = byteBuffer.getLong();
        this.mgX = byteBuffer.get();
        this.mgZ.aG(byteBuffer);
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
            this.mgY.put(l, (Object)fif2);
        }
        return true;
    }

    public long KU() {
        return this.aDh;
    }

    public byte eAJ() {
        return this.mgX;
    }

    public ffV eAK() {
        return bEm.dSb().a(this.mgZ);
    }

    public TLongObjectHashMap<fif> eAz() {
        return this.mgY;
    }

    @Override
    public int d() {
        return 12641;
    }
}

