/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from blh
 */
public class blh_0
extends eJG
implements blf_0 {
    public blh_0(fdl fdl2) {
        super(fdl2);
    }

    @Override
    public void cg(byte[] byArray) {
        this.qAf.clear();
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.qAa.ts(byteBuffer.getLong());
        int n = byteBuffer.getShort();
        for (int i = 0; i < n; ++i) {
            this.qAf.put(byteBuffer.getInt(), byteBuffer.getInt());
        }
    }
}

