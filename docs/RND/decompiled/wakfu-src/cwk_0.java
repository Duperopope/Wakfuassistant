/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from cwk
 */
public class cwk_0
extends nr_0 {
    protected static final Logger mkR = Logger.getLogger(cwk_0.class);
    private long bhR;
    private int mfZ;
    private byte[] hvy;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.bhR = byteBuffer.getLong();
        this.mfZ = byteBuffer.getInt();
        this.hvy = new byte[byteBuffer.getShort()];
        byteBuffer.get(this.hvy);
        return true;
    }

    @Override
    public int d() {
        return 13584;
    }

    public long Qy() {
        return this.bhR;
    }

    public int ezG() {
        return this.mfZ;
    }

    public byte[] ezH() {
        return this.hvy;
    }
}

