/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import java.nio.ByteBuffer;

/*
 * Renamed from cix
 */
public class cix_0
extends nr_0 {
    private final TIntObjectHashMap<ezt_0> lUS = new TIntObjectHashMap();
    private final TIntObjectHashMap<ezy_0> lUT = new TIntObjectHashMap();
    private byte idA;

    @Override
    public boolean dn(byte[] byArray) {
        int n;
        if (!this.h(byArray.length, 1, false)) {
            return false;
        }
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        int n2 = byteBuffer.getInt();
        for (n = 0; n < n2; ++n) {
            ezt_0 ezt_02 = ezt_0.fn(byteBuffer);
            this.lUS.put(ezt_02.d(), (Object)ezt_02);
        }
        n = byteBuffer.getInt();
        for (int i = 0; i < n; ++i) {
            ezy_0 ezy_02 = ezy_0.fp(byteBuffer);
            this.lUT.put(ezy_02.vY(), (Object)ezy_02);
        }
        this.idA = byteBuffer.get();
        return true;
    }

    public TIntObjectHashMap<ezt_0> evm() {
        return this.lUS;
    }

    public TIntObjectHashMap<ezy_0> evn() {
        return this.lUT;
    }

    public byte evo() {
        return this.idA;
    }

    @Override
    public int d() {
        return 427;
    }
}

