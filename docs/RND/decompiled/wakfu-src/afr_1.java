/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 *  org.jetbrains.annotations.Unmodifiable
 *  org.keplerproject.luajava.JavaFunction
 *  org.keplerproject.luajava.LuaState
 */
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;
import org.keplerproject.luajava.JavaFunction;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aFr
 */
public abstract class afr_1
implements Gx {
    protected static final Logger dIl = Logger.getLogger(afr_1.class);

    protected afr_1() {
    }

    @Override
    public @Unmodifiable Collection<Gy> aNB() {
        ArrayList<afk_1> arrayList = new ArrayList<afk_1>();
        arrayList.addAll(this.cal());
        arrayList.addAll(this.cam());
        return arrayList.stream().sorted(Comparator.comparing(Gy::getName)).toList();
    }

    private Collection<afk_1> cal() {
        Object[] objectArray = this.b(null);
        return objectArray == null ? Lists.newArrayList() : Lists.newArrayList((Object[])objectArray);
    }

    private Collection<afk_1> cam() {
        Object[] objectArray = this.a(null);
        return objectArray == null ? Lists.newArrayList() : Lists.newArrayList((Object[])objectArray);
    }

    void c(LuaState luaState) {
        afk_1[] afk_1Array;
        afk_1[] afk_1Array2 = this.a(luaState);
        if (afk_1Array2 != null) {
            luaState.newTable();
            afk_1Array = afk_1Array2;
            int n = afk_1Array.length;
            for (int i = 0; i < n; ++i) {
                afk_1 afk_12 = afk_1Array[i];
                if (afk_12 == null) continue;
                assert (afk_12.getName() != null);
                luaState.pushString(afk_12.getName());
                luaState.pushJavaFunction((JavaFunction)afk_12);
                luaState.setTable(-3);
            }
            if (this.getName() != null) {
                luaState.setGlobal(this.getName());
            } else {
                luaState.setGlobal("UnknownLibrary " + this.toString());
            }
        }
        if ((afk_1Array = this.b(luaState)) != null) {
            for (afk_1 afk_13 : afk_1Array) {
                afk_13.cac();
            }
        }
    }

    @Nullable
    public abstract afk_1[] a(LuaState var1);

    @Nullable
    public abstract afk_1[] b(LuaState var1);
}

