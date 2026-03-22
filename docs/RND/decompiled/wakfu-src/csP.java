/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.InvalidProtocolBufferException
 *  lombok.Generated
 */
import com.google.protobuf.InvalidProtocolBufferException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import lombok.Generated;

public abstract class csP
extends csm_0 {
    private long mhG;
    private long lVH;
    private fhi_0 mhH;

    @Override
    protected final void fd(ByteBuffer byteBuffer) {
        this.mhG = byteBuffer.getLong();
        this.lVH = byteBuffer.getLong();
        byte[] byArray = new byte[byteBuffer.getShort()];
        byteBuffer.get(byArray);
        fhi_0 fhi_02 = fhk_0.eQ(byArray);
        if (fhi_02 == null) {
            throw new InvalidProtocolBufferException("Unable to unserialized shard " + Arrays.toString(byArray));
        }
        this.mhH = fhi_02;
        this.fj(byteBuffer);
    }

    protected void fj(ByteBuffer byteBuffer) {
    }

    @Generated
    public long eBD() {
        return this.mhG;
    }

    @Generated
    public long exc() {
        return this.lVH;
    }

    @Generated
    public fhi_0 eBE() {
        return this.mhH;
    }
}

