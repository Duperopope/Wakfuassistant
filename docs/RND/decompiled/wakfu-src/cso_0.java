/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.InvalidProtocolBufferException
 *  lombok.Generated
 */
import com.google.protobuf.InvalidProtocolBufferException;
import java.nio.ByteBuffer;
import lombok.Generated;

/*
 * Renamed from csO
 */
public class cso_0
extends csP {
    private rc_0 lXD;

    @Override
    protected void fj(ByteBuffer byteBuffer) {
        byte by = byteBuffer.get();
        this.lXD = rc_0.mL(by).orElseThrow(() -> new InvalidProtocolBufferException("Unknown slot action ID " + by));
    }

    @Override
    public int d() {
        return 13335;
    }

    @Generated
    public rc_0 eBC() {
        return this.lXD;
    }
}

