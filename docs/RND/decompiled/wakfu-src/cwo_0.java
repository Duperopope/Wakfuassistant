/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cwo
 */
public class cwo_0
extends nr_0 {
    private int eiQ;
    private int mkV;

    @Override
    public boolean dn(byte[] byArray) {
        if (byArray.length != 8) {
            return false;
        }
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.eiQ = byteBuffer.getInt();
        this.mkV = byteBuffer.getInt();
        return true;
    }

    @Override
    public int d() {
        return 13670;
    }

    public int cmh() {
        return this.eiQ;
    }

    public int eEM() {
        return this.mkV;
    }
}

