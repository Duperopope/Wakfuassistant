/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
import java.nio.ByteBuffer;
import lombok.Generated;

/*
 * Renamed from cpB
 */
public class cpb_0
extends cph_0 {
    private int mdZ;
    private long aDh;

    @Override
    void ff(ByteBuffer byteBuffer) {
        this.mdZ = byteBuffer.getInt();
        this.aDh = byteBuffer.getLong();
    }

    @Override
    public int d() {
        return 12079;
    }

    @Generated
    public int ext() {
        return this.mdZ;
    }

    @Generated
    public long KU() {
        return this.aDh;
    }
}

