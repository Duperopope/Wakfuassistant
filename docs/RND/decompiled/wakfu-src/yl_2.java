/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from yl
 */
public abstract class yl_2
implements gs_0 {
    public static yl_2 ed(ByteBuffer byteBuffer) {
        uq_1 uq_12;
        byte by = byteBuffer.get();
        switch (by) {
            case 0: {
                uq_12 = new uq_1();
                break;
            }
            default: {
                return null;
            }
        }
        if (!uq_12.aG(byteBuffer)) {
            return null;
        }
        return uq_12;
    }

    public static yl_2 d(ByteBuffer byteBuffer, int n) {
        uq_1 uq_12;
        byte by = byteBuffer.get();
        switch (by) {
            case 0: {
                uq_12 = new uq_1();
                break;
            }
            default: {
                return null;
            }
        }
        if (!uq_12.b(byteBuffer, n)) {
            return null;
        }
        return uq_12;
    }

    public abstract byte avV();

    public abstract void a(StringBuilder var1, String var2);
}

