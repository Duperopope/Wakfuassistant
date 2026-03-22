/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.Optional;

public class cxV
extends nr_0 {
    private exp_1 mmi;
    private Object aGT;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        short s = byteBuffer.getShort();
        Optional<exp_1> optional = exp_1.et(s);
        if (optional.isEmpty()) {
            return false;
        }
        this.mmi = optional.get();
        this.aGT = this.mmi.fOX().fI(byteBuffer);
        return true;
    }

    @Override
    public int d() {
        return 1123;
    }

    public exp_1 eFh() {
        return this.mmi;
    }

    public Object getValue() {
        return this.aGT;
    }
}

