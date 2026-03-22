/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from NR
 */
public class nr_1
extends nr_0 {
    private Long aYP;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.aYP = byteBuffer.getLong();
        return true;
    }

    public Long aWG() {
        return this.aYP;
    }

    @Override
    public int d() {
        return 674;
    }
}

