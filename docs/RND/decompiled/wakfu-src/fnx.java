/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TByteHashSet
 */
import gnu.trove.set.hash.TByteHashSet;
import java.util.Map;
import java.util.Set;

public class fnx
extends fno {
    private static final int[] sJs = new int[fnB.values().length];

    @Override
    public byte gei() {
        return 9;
    }

    @Override
    public boolean ha(byte by) {
        return by >= 0 && by < this.gei();
    }

    @Override
    public short[] hb(byte by) {
        int n = by / 3 * 6;
        int n2 = by % 3 * 6;
        return new short[]{(short)n, (short)n2};
    }

    @Override
    public void a(fnq fnq2) {
        TByteHashSet tByteHashSet = new TByteHashSet();
        for (byte by2 = 0; by2 < this.gei(); by2 = (byte)(by2 + 1)) {
            tByteHashSet.add(by2);
        }
        Set set = this.sIL.entrySet();
        for (Map.Entry entry : set) {
            tByteHashSet.remove(((Byte)entry.getKey()).byteValue());
        }
        tByteHashSet.forEach(by -> {
            fnp fnp2 = fnq2.dzx();
            this.a(by, fnp2);
            return true;
        });
    }
}

