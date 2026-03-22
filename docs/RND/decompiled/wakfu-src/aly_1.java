/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaException
 *  org.keplerproject.luajava.LuaState
 */
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import org.keplerproject.luajava.LuaException;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aly
 */
public abstract class aly_1<SoundParam>
extends alz_1<SoundParam> {
    protected aly_1(LuaState luaState) {
        super(luaState);
    }

    protected List<alq_1> g(int n, int n2, boolean bl) {
        return this.a(n, n2, bl, alq_1::new);
    }

    protected List<alq_1> a(int n, int n2, boolean bl, BiFunction<Long, Float, alq_1> biFunction) {
        ArrayList<alq_1> arrayList = new ArrayList<alq_1>();
        int n3 = n;
        while (n3 < n2) {
            int n4 = n2 - n3;
            if (n4 < 2) {
                throw new LuaException(String.format("Invalid argument number for method %s. For %s sound declared, missing gain", this.getName(), arrayList.size() + 1));
            }
            long l = this.xs(n3++);
            float f2 = this.xr(n3++);
            if (bl) {
                if (n4 < 4) {
                    throw new LuaException(String.format("Invalid argument number for method %s. For %s sound declared, missing minPitch and maxPitch", this.getName(), arrayList.size() + 1));
                }
                float f3 = this.xr(n3++);
                float f4 = this.xr(n3++);
                arrayList.add(new alq_1(l, f2, f3, f4));
                continue;
            }
            arrayList.add(biFunction.apply(l, Float.valueOf(f2)));
        }
        return arrayList;
    }

    protected alq_1 o(List<alq_1> list) {
        int n = GC.q(0, list.size());
        return list.get(n);
    }
}

