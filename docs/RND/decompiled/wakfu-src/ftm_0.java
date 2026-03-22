/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap
 *  org.jetbrains.annotations.NotNull
 */
import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from ftm
 */
public final class ftm_0
extends Record {
    private final int tfz;
    @NotNull
    private final ftp_0 tfA;
    @NotNull
    private final ftp_0 tfB;
    @NotNull
    private final Int2IntOpenHashMap tfC;

    public ftm_0(int n, @NotNull ftp_0 ftp_02, @NotNull ftp_0 ftp_03, @NotNull Int2IntOpenHashMap int2IntOpenHashMap) {
        this.tfz = n;
        this.tfA = ftp_02;
        this.tfB = ftp_03;
        this.tfC = int2IntOpenHashMap;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ftm_0.class, "id;initialState;finalState;itemCosts", "tfz", "tfA", "tfB", "tfC"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ftm_0.class, "id;initialState;finalState;itemCosts", "tfz", "tfA", "tfB", "tfC"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ftm_0.class, "id;initialState;finalState;itemCosts", "tfz", "tfA", "tfB", "tfC"}, this, object);
    }

    public int cZa() {
        return this.tfz;
    }

    @NotNull
    public ftp_0 glL() {
        return this.tfA;
    }

    @NotNull
    public ftp_0 glU() {
        return this.tfB;
    }

    @NotNull
    public Int2IntOpenHashMap glV() {
        return this.tfC;
    }
}

