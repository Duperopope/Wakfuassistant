/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap$Entry
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  org.jetbrains.annotations.Contract
 *  org.jetbrains.annotations.NotNull
 */
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.nio.ByteBuffer;
import java.util.Optional;
import java.util.OptionalInt;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from ftt
 */
public final class ftt_0
extends Record
implements ftz_0 {
    @NotNull
    private final Int2ObjectOpenHashMap<fty_0> tfU;
    @NotNull
    private final Int2ObjectOpenHashMap<ftu_0> tfV;

    public ftt_0(@NotNull Int2ObjectOpenHashMap<fty_0> int2ObjectOpenHashMap, @NotNull Int2ObjectOpenHashMap<ftu_0> int2ObjectOpenHashMap2) {
        this.tfU = int2ObjectOpenHashMap;
        this.tfV = int2ObjectOpenHashMap2;
    }

    @NotNull
    public static ftt_0 gme() {
        return new ftt_0((Int2ObjectOpenHashMap<fty_0>)new Int2ObjectOpenHashMap(), (Int2ObjectOpenHashMap<ftu_0>)new Int2ObjectOpenHashMap());
    }

    public OptionalInt uL(long l) {
        for (Int2ObjectMap.Entry entry : this.tfU.int2ObjectEntrySet()) {
            if (!((fty_0)entry.getValue()).gmn().containsKey(l)) continue;
            return OptionalInt.of(entry.getIntKey());
        }
        return OptionalInt.empty();
    }

    public Optional<ftv_0> uM(long l) {
        for (Int2ObjectMap.Entry entry : this.tfU.int2ObjectEntrySet()) {
            ftv_0 ftv_02 = (ftv_0)((fty_0)entry.getValue()).gmn().get(l);
            if (ftv_02 == null) continue;
            return Optional.of(ftv_02);
        }
        return Optional.empty();
    }

    @NotNull
    public static ftt_0 gz(@NotNull ByteBuffer byteBuffer) {
        fty_0 fty_02;
        int n;
        int n2 = byteBuffer.getInt();
        Int2ObjectOpenHashMap int2ObjectOpenHashMap = new Int2ObjectOpenHashMap(n2);
        for (n = 0; n < n2; ++n) {
            fty_02 = fty_0.gC(byteBuffer);
            int2ObjectOpenHashMap.put(fty_02.gmm(), (Object)fty_02);
        }
        n = byteBuffer.getInt();
        fty_02 = new Int2ObjectOpenHashMap(n2);
        for (int i = 0; i < n; ++i) {
            ftu_0 ftu_02 = ftu_0.gA(byteBuffer);
            fty_02.put(ftu_02.ctS(), ftu_02);
        }
        return new ftt_0((Int2ObjectOpenHashMap<fty_0>)int2ObjectOpenHashMap, (Int2ObjectOpenHashMap<ftu_0>)fty_02);
    }

    @Override
    public int gmf() {
        return 4 + this.gmg().values().stream().mapToInt(fty_0::gmf).sum() + 4 + this.gmh().values().stream().mapToInt(ftu_0::gmf).sum();
    }

    @Override
    @NotNull
    @Contract(value="_ -> param1")
    public azg_1 j(@NotNull azg_1 azg_12) {
        azg_12.vC(this.gmg().size());
        this.gmg().forEach((n, fty_02) -> fty_02.j(azg_12));
        azg_12.vC(this.gmh().size());
        this.gmh().forEach((n, ftu_02) -> ftu_02.j(azg_12));
        return azg_12;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ftt_0.class, "sectorDataMap;bridgeDataMap", "tfU", "tfV"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ftt_0.class, "sectorDataMap;bridgeDataMap", "tfU", "tfV"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ftt_0.class, "sectorDataMap;bridgeDataMap", "tfU", "tfV"}, this, object);
    }

    @NotNull
    public Int2ObjectOpenHashMap<fty_0> gmg() {
        return this.tfU;
    }

    @NotNull
    public Int2ObjectOpenHashMap<ftu_0> gmh() {
        return this.tfV;
    }
}

