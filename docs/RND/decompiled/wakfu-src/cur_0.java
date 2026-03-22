/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cur
 */
public class cur_0
extends nr_0 {
    private long mbm;
    private int iIn;
    private int iIo;

    public long eDe() {
        return this.mbm;
    }

    public int aqT() {
        return this.iIn;
    }

    public int aqV() {
        return this.iIo;
    }

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mbm = byteBuffer.getLong();
        this.iIn = byteBuffer.getInt();
        this.iIo = byteBuffer.getInt();
        return true;
    }

    @Override
    public int d() {
        return 13053;
    }
}

