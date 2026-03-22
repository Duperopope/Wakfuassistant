/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from crK
 */
public class crk_0
extends nr_0 {
    private int eln;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.eln = byteBuffer.getInt();
        return true;
    }

    public int coF() {
        return this.eln;
    }

    @Override
    public int d() {
        return 14195;
    }
}

