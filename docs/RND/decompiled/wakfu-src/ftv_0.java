/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Contract
 *  org.jetbrains.annotations.NotNull
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.nio.ByteBuffer;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from ftv
 */
public final class ftv_0
extends Record
implements ftz_0 {
    private final long tfZ;
    private final int tga;
    @NotNull
    private final abi_1 tgb;
    private final int tgc;
    private final int tgd;
    public static int Rk = 24;

    public ftv_0(long l, int n, @NotNull abi_1 abi_12, int n2, int n3) {
        this.tfZ = l;
        this.tga = n;
        this.tgb = abi_12;
        this.tgc = n2;
        this.tgd = n3;
    }

    @NotNull
    public static ftv_0 gB(@NotNull ByteBuffer byteBuffer) {
        long l = byteBuffer.getLong();
        int n = byteBuffer.getInt();
        int n2 = byteBuffer.getInt();
        abi_1 abi_12 = abi_1.wG(n2);
        if (abi_12 == abi_1.dzt) {
            throw new IllegalArgumentException(String.format("Unknown %s with following index %s", abi_1.class.getSimpleName(), n2));
        }
        int n3 = byteBuffer.getInt();
        int n4 = byteBuffer.getInt();
        return new ftv_0(l, n, abi_12, n3, n4);
    }

    @Override
    public int gmf() {
        return Rk;
    }

    @Override
    @NotNull
    @Contract(value="_ -> param1")
    public azg_1 j(@NotNull azg_1 azg_12) {
        azg_12.gK(this.gmj());
        azg_12.vC(this.gmk());
        azg_12.vC(this.gmd().wp());
        azg_12.vC(this.bkP());
        azg_12.vC(this.bkQ());
        return azg_12;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ftv_0.class, "buildingUid;buildingRefId;direction;x;y", "tfZ", "tga", "tgb", "tgc", "tgd"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ftv_0.class, "buildingUid;buildingRefId;direction;x;y", "tfZ", "tga", "tgb", "tgc", "tgd"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ftv_0.class, "buildingUid;buildingRefId;direction;x;y", "tfZ", "tga", "tgb", "tgc", "tgd"}, this, object);
    }

    public long gmj() {
        return this.tfZ;
    }

    public int gmk() {
        return this.tga;
    }

    @NotNull
    public abi_1 gmd() {
        return this.tgb;
    }

    public int bkP() {
        return this.tgc;
    }

    public int bkQ() {
        return this.tgd;
    }
}

