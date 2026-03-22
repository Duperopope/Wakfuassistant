/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cyQ
 */
public class cyq_0
extends nr_0 {
    private long kVl;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.kVl = byteBuffer.getLong();
        return true;
    }

    @Override
    public int d() {
        return 22065;
    }

    public long eAU() {
        return this.kVl;
    }
}

