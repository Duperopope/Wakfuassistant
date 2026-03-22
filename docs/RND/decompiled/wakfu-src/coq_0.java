/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from coq
 */
public class coq_0
extends nr_0 {
    private int mcS;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mcS = byteBuffer.getInt();
        return true;
    }

    @Override
    public int d() {
        return 12147;
    }

    public int ewg() {
        return this.mcS;
    }
}

