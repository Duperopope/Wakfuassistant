/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.nio.ByteBuffer;

public final class fgs
extends Record {
    private final long sjB;
    private final short sjC;
    private final short sjD;

    public fgs(long l, short s, short s2) {
        this.sjB = l;
        this.sjC = s;
        this.sjD = s2;
    }

    public void e(azg_1 azg_12) {
        azg_12.gK(this.sjB);
        azg_12.aG(this.sjC);
        azg_12.aG(this.sjD);
    }

    public static int DN() {
        return 12;
    }

    public static fgs ga(ByteBuffer byteBuffer) {
        return new fgs(byteBuffer.getLong(), byteBuffer.getShort(), byteBuffer.getShort());
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{fgs.class, "uid;position;quantity", "sjB", "sjC", "sjD"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{fgs.class, "uid;position;quantity", "sjB", "sjC", "sjD"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{fgs.class, "uid;position;quantity", "sjB", "sjC", "sjD"}, this, object);
    }

    public long fXc() {
        return this.sjB;
    }

    public short dRi() {
        return this.sjC;
    }

    public short fWB() {
        return this.sjD;
    }
}

