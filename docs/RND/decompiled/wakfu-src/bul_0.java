/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Contract
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bul
 */
public abstract class bul_0<T>
implements bum_0<T> {
    private static final Map<Mv, Map<Character, rd_0>> joW = Map.of(Mv.aVl, Map.of(Character.valueOf('r'), rd_0.bjB, Character.valueOf('g'), rd_0.bjC, Character.valueOf('b'), rd_0.bjD, Character.valueOf('w'), rd_0.bjE), Mv.aVk, Map.of(Character.valueOf('v'), rd_0.bjC, Character.valueOf('j'), rd_0.bjE), Mv.aVm, Map.of(Character.valueOf('v'), rd_0.bjC, Character.valueOf('a'), rd_0.bjD), Mv.aVn, Map.of(Character.valueOf('v'), rd_0.bjC, Character.valueOf('a'), rd_0.bjD));
    private static final Map<Character, rd_0> joX = joW.get((Object)Mv.aVl);
    private static final rd_0[] joY = new rd_0[0];
    private final rd_0 @Nullable [] joZ;
    @Nullable
    protected final String jpa;

    protected bul_0(rd_0 @Nullable [] rd_0Array, @Nullable String string) {
        this.joZ = rd_0Array != null ? (rd_0[])rd_0Array.clone() : null;
        this.jpa = string;
    }

    protected static rd_0 @Nullable [] mp(@NotNull String string) {
        String string2 = string.trim();
        if (string2.isBlank()) {
            return null;
        }
        Mv mv = aum_0.cWf().aUXX();
        Map<Character, rd_0> map = joW.getOrDefault((Object)mv, joX);
        rd_0[] rd_0Array = new rd_0[string2.length()];
        for (int i = 0; i < string2.length(); ++i) {
            rd_0 rd_02;
            char c2 = string2.charAt(i);
            if (map.containsKey(Character.valueOf(c2))) {
                rd_02 = map.get(Character.valueOf(c2));
            } else if (joX.containsKey(Character.valueOf(c2))) {
                rd_02 = joX.get(Character.valueOf(c2));
            } else {
                return joY;
            }
            rd_0Array[i] = rd_02;
        }
        return rd_0Array;
    }

    @NotNull
    public static List<Character> c(rd_0 rd_02) {
        Mv mv = aum_0.cWf().aUXX();
        Character c2 = bul_0.a(joX, rd_02);
        Character c3 = bul_0.a(joW.get((Object)mv), rd_02);
        if (c2 == null) {
            return List.of();
        }
        if (c3 == null || c3 == c2) {
            return List.of(c2);
        }
        return List.of(c3, c2);
    }

    @Nullable
    private static Character a(Map<Character, rd_0> map, rd_0 rd_02) {
        if (map == null) {
            return null;
        }
        for (Map.Entry<Character, rd_0> entry : map.entrySet()) {
            if (entry.getValue() != rd_02) continue;
            return entry.getKey();
        }
        return null;
    }

    @Nullable
    protected abstract List<rd_0> al(T var1);

    protected abstract boolean dCl();

    @Override
    public boolean ah(T t) {
        if (this.joZ == null || Arrays.equals(this.joZ, joY)) {
            return false;
        }
        List<rd_0> list = this.al(t);
        if (list == null) {
            return false;
        }
        int n = list.size() - this.joZ.length;
        for (int i = 0; i <= n; ++i) {
            if (!this.b(list, i)) continue;
            return true;
        }
        return false;
    }

    @Contract(pure=true)
    private boolean b(List<rd_0> list, int n) {
        if (this.joZ == null) {
            return false;
        }
        for (int n2 = 0; n2 < this.joZ.length; n2 = (int)((byte)(n2 + 1))) {
            rd_0 rd_02;
            rd_0 rd_03 = list.get((byte)(n2 + n));
            if (rd_03 == null || rd_03 == rd_0.bjA) {
                return false;
            }
            rd_0 rd_04 = rd_02 = this.dCl() ? rd_03 : this.joZ[n2];
            if (rd_02 == rd_0.bjE || this.joZ[n2] == rd_03) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean isValid() {
        return this.joZ != null;
    }
}

