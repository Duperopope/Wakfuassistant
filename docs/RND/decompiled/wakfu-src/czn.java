/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

public class czn
extends nr_0 {
    private Map<Long, Float> mnh;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        int n = byteBuffer.getShort();
        this.mnh = new HashMap<Long, Float>(n);
        for (int i = 0; i < n; ++i) {
            this.mnh.put(byteBuffer.getLong(), Float.valueOf(byteBuffer.getFloat()));
        }
        return true;
    }

    public Map<Long, Float> eGh() {
        return this.mnh;
    }

    @Override
    public int d() {
        return 23760;
    }
}

