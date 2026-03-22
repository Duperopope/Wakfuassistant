/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cwp
 */
public class cwp_0
extends nr_0 {
    private int eiQ;

    @Override
    public boolean dn(byte[] byArray) {
        if (byArray.length != 4) {
            return false;
        }
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.eiQ = byteBuffer.getInt();
        return true;
    }

    @Override
    public int d() {
        return 13206;
    }

    public int cmh() {
        return this.eiQ;
    }
}

