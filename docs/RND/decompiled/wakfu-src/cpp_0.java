/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cpP
 */
public class cpp_0
extends nr_0 {
    private int jcr;
    private byte mel;
    private long exa;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.jcr = byteBuffer.getInt();
        this.mel = byteBuffer.get();
        this.exa = byteBuffer.getLong();
        return true;
    }

    @Override
    public int d() {
        return 13050;
    }

    public int dye() {
        return this.jcr;
    }

    public emh_0 exH() {
        return emh_0.fd(this.mel);
    }

    public long czn() {
        return this.exa;
    }
}

