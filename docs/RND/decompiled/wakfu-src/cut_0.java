/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cut
 */
public class cut_0
extends nr_0 {
    private long mbm;
    private int mjp;
    private int iIn;
    private int iIo;
    private boolean bmT;

    public long eDe() {
        return this.mbm;
    }

    public long eDf() {
        return this.mjp;
    }

    public int aqT() {
        return this.iIn;
    }

    public int aqV() {
        return this.iIo;
    }

    public boolean bfb() {
        return this.bmT;
    }

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.mbm = byteBuffer.getLong();
        this.mjp = byteBuffer.getInt();
        this.iIn = byteBuffer.getInt();
        this.iIo = byteBuffer.getInt();
        this.bmT = byteBuffer.get() == 1;
        return true;
    }

    @Override
    public int d() {
        return 12290;
    }
}

