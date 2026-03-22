/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

/*
 * Renamed from cZz
 */
public final class czz_1
extends Record {
    final int obp;
    private final short obq;
    private final int obr;
    private final int obs;
    private final short obt;

    public czz_1(int n, short s, int n2, int n3, short s2) {
        this.obp = n;
        this.obq = s;
        this.obr = n2;
        this.obs = n3;
        this.obt = s2;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{czz_1.class, "bossOrder;bossId;dungeonId;classicDungeonId;bossAchievementId", "obp", "obq", "obr", "obs", "obt"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{czz_1.class, "bossOrder;bossId;dungeonId;classicDungeonId;bossAchievementId", "obp", "obq", "obr", "obs", "obt"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{czz_1.class, "bossOrder;bossId;dungeonId;classicDungeonId;bossAchievementId", "obp", "obq", "obr", "obs", "obt"}, this, object);
    }

    public int eZn() {
        return this.obp;
    }

    public short eZo() {
        return this.obq;
    }

    public int eZp() {
        return this.obr;
    }

    public int eZq() {
        return this.obs;
    }

    public short eZr() {
        return this.obt;
    }
}

