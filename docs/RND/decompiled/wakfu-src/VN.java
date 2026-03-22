/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class VN
extends Record {
    private final int bKo;
    private final int bKp;
    public static final VN bKq = new VN(0, 0);

    public VN(int n, int n2) {
        this.bKo = n;
        this.bKp = n2;
    }

    public VN bkM() {
        return new VN(vz_0.qd(this.bKo), vz_0.qe(this.bKp));
    }

    public short bkN() {
        return (short)this.bKo;
    }

    public short bkO() {
        return (short)this.bKp;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{VN.class, "x;y", "bKo", "bKp"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{VN.class, "x;y", "bKo", "bKp"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{VN.class, "x;y", "bKo", "bKp"}, this, object);
    }

    public int bkP() {
        return this.bKo;
    }

    public int bkQ() {
        return this.bKp;
    }
}

