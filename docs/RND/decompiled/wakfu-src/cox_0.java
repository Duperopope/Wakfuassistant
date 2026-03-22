/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cox
 */
public class cox_0
extends nr_0 {
    private fre_0 jFc;
    private long jhA;
    private long mcZ;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.jFc = fre_0.hD(byteBuffer.get());
        this.jhA = byteBuffer.getLong();
        this.mcZ = byteBuffer.getLong();
        return true;
    }

    @Override
    public int d() {
        return 12880;
    }

    public fre_0 dQh() {
        return this.jFc;
    }

    public long dGf() {
        return this.jhA;
    }

    public long ewo() {
        return this.mcZ;
    }
}

