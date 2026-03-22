/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.InvalidProtocolBufferException
 */
import com.google.protobuf.InvalidProtocolBufferException;
import java.nio.ByteBuffer;
import java.util.Optional;

/*
 * Renamed from csM
 */
public abstract class csm_0
extends nr_0 {
    private fhe_0 mhF;

    protected abstract void fd(ByteBuffer var1);

    @Override
    public final boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        byte by = byteBuffer.get();
        Optional<fhe_0> optional = fhe_0.eL(by);
        if (optional.isEmpty()) {
            throw new InvalidProtocolBufferException("Unknown status: " + by);
        }
        this.mhF = optional.get();
        if (!this.mhF.aHz()) {
            this.fd(byteBuffer);
        }
        return true;
    }

    public fhe_0 eBA() {
        return this.mhF;
    }

    public int evL() {
        return 11100 + this.mhF.aJr();
    }
}

