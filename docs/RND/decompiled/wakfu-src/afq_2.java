/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.keplerproject.luajava.LuaException
 *  org.keplerproject.luajava.LuaState
 */
import org.keplerproject.luajava.LuaException;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aFQ
 */
public final class afq_2 {
    private final Object dJI;
    private final aff_2 dJJ;

    public afq_2(Object object) {
        if (object == null) {
            this.dJJ = aff_2.dJD;
            this.dJI = object;
            return;
        }
        if (object instanceof String) {
            this.dJJ = aff_2.dJx;
            this.dJI = object;
            return;
        }
        if (object instanceof Boolean) {
            this.dJJ = aff_2.dJA;
            this.dJI = object;
            return;
        }
        if (object instanceof Double) {
            this.dJJ = aff_2.dJz;
            this.dJI = object;
            return;
        }
        if (object instanceof Integer) {
            this.dJJ = aff_2.dJy;
            this.dJI = object;
            return;
        }
        if (object instanceof Long) {
            this.dJJ = aff_2.dJw;
            this.dJI = object;
            return;
        }
        if (object instanceof Float) {
            this.dJJ = aff_2.dJz;
            this.dJI = ((Float)object).doubleValue();
            return;
        }
        if (object instanceof Short) {
            this.dJJ = aff_2.dJy;
            this.dJI = ((Short)object).intValue();
            return;
        }
        if (object instanceof Byte) {
            this.dJJ = aff_2.dJy;
            this.dJI = ((Byte)object).intValue();
            return;
        }
        if (object instanceof Character) {
            this.dJJ = aff_2.dJx;
            this.dJI = ((Character)object).toString();
            return;
        }
        this.dJJ = aff_2.dJv;
        this.dJI = object;
    }

    public aff_2 caK() {
        return this.dJJ;
    }

    public Object getValue() {
        return this.dJI;
    }

    public void d(LuaState luaState) {
        switch (this.caK()) {
            case dJz: {
                luaState.pushNumber(((Double)this.getValue()).doubleValue());
                break;
            }
            case dJy: {
                luaState.pushNumber((double)((Integer)this.getValue()).intValue());
                break;
            }
            case dJA: {
                luaState.pushBoolean(((Boolean)this.getValue()).booleanValue());
                break;
            }
            case dJx: {
                luaState.pushString((String)this.getValue());
                break;
            }
            case dJv: 
            case dJw: {
                luaState.pushJavaObject(this.getValue());
                break;
            }
            case dJD: {
                luaState.pushNil();
            }
        }
    }

    public static afq_2 b(LuaState luaState, int n) {
        if (luaState.isNumber(n)) {
            return new afq_2(luaState.toNumber(n));
        }
        if (luaState.isBoolean(n)) {
            return new afq_2(luaState.toBoolean(n));
        }
        if (luaState.isString(n)) {
            return new afq_2(luaState.toString(n));
        }
        if (luaState.isObject(n)) {
            return new afq_2(luaState.toJavaObject(n));
        }
        if (luaState.isNil(n)) {
            return new afq_2(null);
        }
        throw new LuaException("Valeur de type inconnu dans un script Lua");
    }
}

