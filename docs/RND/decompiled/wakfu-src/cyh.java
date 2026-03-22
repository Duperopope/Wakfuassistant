/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

public class cyh
extends nr_0 {
    private Map<Integer, Boolean> kBV;
    private long mmr;
    private fam kCh;

    @Override
    public boolean dn(byte ... byArray) {
        int n;
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        int n2 = byteBuffer.getInt();
        this.kBV = new HashMap<Integer, Boolean>(n2);
        for (n = 0; n < n2; ++n) {
            this.kBV.put(byteBuffer.getInt(), byteBuffer.get() != 0);
        }
        this.mmr = byteBuffer.getLong();
        n = byteBuffer.remaining();
        byte[] byArray2 = new byte[n];
        byteBuffer.get(byArray2);
        this.kCh = new fam();
        this.kCh.as(byArray2);
        return true;
    }

    public Map<Integer, Boolean> eFq() {
        return this.kBV;
    }

    public long efY() {
        return this.mmr;
    }

    public fam eFr() {
        return this.kCh;
    }

    @Override
    public int d() {
        return 14021;
    }
}

