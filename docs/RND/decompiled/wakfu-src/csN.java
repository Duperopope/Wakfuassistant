/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.InvalidProtocolBufferException
 *  lombok.Generated
 *  org.jetbrains.annotations.NotNull
 */
import com.google.protobuf.InvalidProtocolBufferException;
import java.nio.ByteBuffer;
import lombok.Generated;
import org.jetbrains.annotations.NotNull;

public class csN
extends csP {
    @NotNull
    private rb_0 lXy;

    @Override
    protected void fj(ByteBuffer byteBuffer) {
        byte by = byteBuffer.get();
        this.lXy = rb_0.mL(by).orElseThrow(() -> new InvalidProtocolBufferException("Unknown sacrifice action ID " + by));
    }

    @Override
    public int d() {
        return 13648;
    }

    @NotNull
    @Generated
    public rb_0 eBB() {
        return this.lXy;
    }
}

