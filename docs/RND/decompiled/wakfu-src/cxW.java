/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.InvalidProtocolBufferException
 */
import com.google.protobuf.InvalidProtocolBufferException;
import java.nio.ByteBuffer;
import java.util.EnumMap;
import java.util.Map;
import java.util.Optional;

public class cxW
extends nr_0 {
    private Map<exp_1, Object> mmj;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        int n = byteBuffer.getInt();
        this.mmj = new EnumMap<exp_1, Object>(exp_1.class);
        for (int i = 0; i < n; ++i) {
            short s = byteBuffer.getShort();
            Optional<exp_1> optional = exp_1.et(s);
            if (optional.isEmpty()) {
                throw new InvalidProtocolBufferException("Invalid global variable id: " + s);
            }
            exp_1 exp_12 = optional.get();
            Object object = exp_12.fOX().fI(byteBuffer);
            this.mmj.put(exp_12, object);
        }
        return true;
    }

    public Map<exp_1, Object> eFi() {
        return this.mmj;
    }

    @Override
    public int d() {
        return 1176;
    }
}

