/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 *  org.jetbrains.annotations.Contract
 *  org.jetbrains.annotations.NotNull
 */
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.nio.ByteBuffer;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from fty
 */
public final class fty_0
extends Record
implements ftz_0 {
    private final int tgf;
    @NotNull
    private final Long2ObjectOpenHashMap<ftv_0> tgg;

    public fty_0(int n, @NotNull Long2ObjectOpenHashMap<ftv_0> long2ObjectOpenHashMap) {
        this.tgf = n;
        this.tgg = long2ObjectOpenHashMap;
    }

    public static fty_0 aan(int n) {
        return new fty_0(n, (Long2ObjectOpenHashMap<ftv_0>)new Long2ObjectOpenHashMap());
    }

    @NotNull
    public static fty_0 gC(@NotNull ByteBuffer byteBuffer) {
        int n = byteBuffer.getInt();
        int n2 = byteBuffer.getInt();
        Long2ObjectOpenHashMap long2ObjectOpenHashMap = new Long2ObjectOpenHashMap(n2);
        for (int i = 0; i < n2; ++i) {
            ftv_0 ftv_02 = ftv_0.gB(byteBuffer);
            long2ObjectOpenHashMap.put(ftv_02.gmj(), (Object)ftv_02);
        }
        return new fty_0(n, (Long2ObjectOpenHashMap<ftv_0>)long2ObjectOpenHashMap);
    }

    @Override
    public int gmf() {
        return 8 + this.gmn().values().stream().mapToInt(ftv_0::gmf).sum();
    }

    @Override
    @NotNull
    @Contract(value="_ -> param1")
    public azg_1 j(@NotNull azg_1 azg_12) {
        azg_12.vC(this.gmm());
        azg_12.vC(this.gmn().size());
        this.gmn().forEach((l, ftv_02) -> ftv_02.j(azg_12));
        return azg_12;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{fty_0.class, "sectorId;buildingDataMap", "tgf", "tgg"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{fty_0.class, "sectorId;buildingDataMap", "tgf", "tgg"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{fty_0.class, "sectorId;buildingDataMap", "tgf", "tgg"}, this, object);
    }

    public int gmm() {
        return this.tgf;
    }

    @NotNull
    public Long2ObjectOpenHashMap<ftv_0> gmn() {
        return this.tgg;
    }
}

