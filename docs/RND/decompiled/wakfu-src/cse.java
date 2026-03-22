/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 */
import gnu.trove.map.hash.TLongObjectHashMap;
import java.nio.ByteBuffer;

public class cse
extends nr_0 {
    private long aDh;
    private final TLongObjectHashMap<fif> mgM = new TLongObjectHashMap();
    private final sv_2 mgN = new sv_2();

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.aDh = byteBuffer.getLong();
        byte[] byArray2 = new byte[byteBuffer.getInt()];
        byteBuffer.get(byArray2);
        this.mgN.aG(ByteBuffer.wrap(byArray2));
        while (byteBuffer.hasRemaining()) {
            long l = byteBuffer.getLong();
            byte by = byteBuffer.get();
            fif fif2 = fif.gH(by);
            fif2.eM(byteBuffer);
            this.mgM.put(l, (Object)fif2);
        }
        return true;
    }

    public TLongObjectHashMap<fif> eAz() {
        return this.mgM;
    }

    public sv_2 eAA() {
        return this.mgN;
    }

    public long KU() {
        return this.aDh;
    }

    @Override
    public int d() {
        return 13548;
    }
}

