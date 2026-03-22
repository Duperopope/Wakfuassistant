/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cst
 */
public class cst_0
extends nr_0 {
    private int brR;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.brR = byteBuffer.getInt();
        return true;
    }

    public int avr() {
        return this.brR;
    }

    @Override
    public int d() {
        return 13608;
    }
}

