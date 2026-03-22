/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

public class ctd
extends nr_0 {
    private fpP mhP;
    private final Map<Integer, Integer> mhS = new HashMap<Integer, Integer>();

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mhP = fpP.hm(byteBuffer.get());
        if (this.mhP.aHz()) {
            return true;
        }
        int n = byteBuffer.getInt();
        for (int i = 0; i < n; ++i) {
            this.mhS.put(byteBuffer.getInt(), byteBuffer.getInt());
        }
        return true;
    }

    @Override
    public int d() {
        return 13035;
    }

    public fpP eBN() {
        return this.mhP;
    }

    public Map<Integer, Integer> eBQ() {
        return this.mhS;
    }
}

