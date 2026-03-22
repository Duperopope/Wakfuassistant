/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaState
 */
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aFn
 */
class afn_1
extends afr_1 {
    private final String dIc;
    private final Constructor[] dId;
    private final Constructor[] dIe;

    afn_1(String string, Constructor[] constructorArray, Constructor[] constructorArray2) {
        this.dIc = string;
        this.dId = constructorArray;
        this.dIe = constructorArray2;
    }

    @Override
    public afk_1[] a(LuaState luaState) {
        return afn_1.a(this.dId, luaState);
    }

    @Override
    public afk_1[] b(LuaState luaState) {
        return afn_1.a(this.dIe, luaState);
    }

    private static afk_1[] a(Constructor[] constructorArray, LuaState luaState) {
        if (constructorArray == null || constructorArray.length == 0) {
            return null;
        }
        afk_1[] afk_1Array = new afk_1[constructorArray.length];
        for (int i = 0; i < constructorArray.length; ++i) {
            try {
                afk_1Array[i] = (afk_1)constructorArray[i].newInstance(luaState);
                continue;
            }
            catch (InstantiationException instantiationException) {
                dIl.error((Object)"", (Throwable)instantiationException);
                continue;
            }
            catch (IllegalAccessException illegalAccessException) {
                dIl.error((Object)"", (Throwable)illegalAccessException);
                continue;
            }
            catch (InvocationTargetException invocationTargetException) {
                dIl.error((Object)"", (Throwable)invocationTargetException);
            }
        }
        return afk_1Array;
    }

    @Override
    public final String getName() {
        return this.dIc;
    }

    @Override
    public String getDescription() {
        return "NO Description<br/>Please Dev... implement me!";
    }
}

