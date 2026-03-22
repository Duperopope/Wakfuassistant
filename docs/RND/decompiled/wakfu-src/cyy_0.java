/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cyY
 */
public class cyy_0
extends nr_0 {
    private byte kIf;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.kIf = byteBuffer.get();
        return true;
    }

    @Override
    public int d() {
        return 23345;
    }

    public byte evi() {
        return this.kIf;
    }
}

