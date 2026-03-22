/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.JavaFunction
 *  org.keplerproject.luajava.LuaException
 *  org.keplerproject.luajava.LuaState
 */
import com.google.common.collect.Lists;
import java.util.Collection;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.JavaFunction;
import org.keplerproject.luajava.LuaException;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aFk
 */
public abstract class afk_1
extends JavaFunction
implements Gy {
    private static final Logger dHP = Logger.getLogger(afk_1.class);
    private static final int dHQ = -1;
    protected int dHR = 0;
    private final afe_1[] dHS = this.bBg();
    private final afe_1[] dHT = this.bBh();

    public afk_1(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String getDescription() {
        return "NO Description... Please Dev, implement me!";
    }

    public Collection<afe_1> aNC() {
        Object[] objectArray = this.bBg();
        return objectArray != null ? Lists.newArrayList((Object[])objectArray) : Lists.newArrayList();
    }

    public Collection<afe_1> aND() {
        Object[] objectArray = this.bBh();
        return objectArray != null ? Lists.newArrayList((Object[])objectArray) : Lists.newArrayList();
    }

    @Nullable
    public abstract afe_1[] bBg();

    @Nullable
    public abstract afe_1[] bBh();

    public final void cac() {
        assert (this.getName() != null);
        super.register(this.getName());
    }

    public final int execute() {
        int n;
        this.dHR = 0;
        int n2 = this.cag();
        if (n2 >= 0) {
            try {
                this.ss(n2);
            }
            catch (LuaException luaException) {
                throw this.hQ(luaException.toString());
            }
        } else {
            this.a(dHP, "Fonction " + this.getClass().getSimpleName() + " non ex\u00e9cut\u00e9e");
        }
        int n3 = n = this.dHT == null ? 0 : this.dHT.length;
        if (n != this.dHR) {
            boolean bl = this.cad();
            if (this.dHR < n && !bl) {
                this.a(dHP, " nombre de valeur de retour incorrect (attendu " + (bl ? ">=" : "") + n + " lu: " + this.dHR + " )");
            }
        }
        return this.dHR;
    }

    private boolean cad() {
        return this.dHT[this.dHT.length - 1].caK() == aff_2.dJC;
    }

    final String cae() {
        try {
            return this.cai().aXV();
        }
        catch (LuaException luaException) {
            dHP.error((Object)"No script", (Throwable)luaException);
            return "<inconnu>";
        }
    }

    final String caf() {
        try {
            return this.cai().caE();
        }
        catch (LuaException luaException) {
            dHP.error((Object)"No script", (Throwable)luaException);
            return "-1";
        }
    }

    private LuaException hQ(String string) {
        return new LuaException(this.hR(string));
    }

    private String hR(String string) {
        String string2 = "<inconnu>";
        try {
            string2 = this.cai().aXV();
        }
        catch (Exception exception) {
            dHP.warn((Object)"pas de script associ? a cette fonction");
        }
        return "fichier=" + string2 + " ligne=" + this.caf() + " " + string;
    }

    protected final void a(Logger logger, String string) {
        this.a(logger, string, true);
    }

    protected final void a(Logger logger, String string, boolean bl) {
        String string2 = this.cae();
        String string3 = this.caf();
        String string4 = String.format("[LUA] (%s:%s) %s", string2, string3, string);
        if (bl) {
            logger.error((Object)string4, (Throwable)new ago_2(string2, string3, string4));
        } else {
            logger.error((Object)string4);
        }
    }

    protected abstract void ss(int var1);

    private int cag() {
        afe_1[] afe_1Array = this.dHS;
        if (afe_1Array == null) {
            return this.cO(0, 0);
        }
        int n = 0;
        int n2 = 0;
        for (int i = 0; i < afe_1Array.length; ++i) {
            ++n2;
            if (!afe_1Array[i].aNF()) {
                ++n;
            }
            if (afe_1Array[i].caK() != aff_2.dJC) continue;
            n2 = Integer.MAX_VALUE;
        }
        if (n2 < n) {
            n2 = n;
        }
        return this.cO(n, n2);
    }

    private int cO(int n, int n2) {
        assert (n <= n2);
        int n3 = this.L.getTop() - 1;
        if (n3 >= n && n3 <= n2) {
            for (int i = 0; i < n; ++i) {
                if (this.xo(i)) continue;
                return -i - 1;
            }
            return n3;
        }
        String string = n == n2 ? String.format("(attendu: %d, lu: %d)", n, n3) : (n2 == Integer.MAX_VALUE ? String.format("(attendu au moins: %d, lu: %d)", n, n3) : String.format("(attendu: %d-%d, lu: %d)", n, n2, n3));
        this.a(dHP, "nombre de param?tre incorrect " + string);
        return -1;
    }

    private boolean xo(int n) {
        assert (n >= 0);
        afe_1[] afe_1Array = this.dHS;
        if (afe_1Array == null) {
            this.a(dHP, "La fonction n'attend pas de param?tre");
            return false;
        }
        if (n < afe_1Array.length) {
            aff_2 aff_22 = afe_1Array[n].caK();
            if (this.L.isNil(n + 2)) {
                this.a(dHP, " param?tre " + n + " est null");
                return false;
            }
            if (!aff_22.a(this.L, n + 2)) {
                String string = String.format("mauvais type d'argument #%d: (definition: %s, fonction:%s)", n, aff_22, this.L.typeName(this.L.type(n + 2)));
                this.a(dHP, string);
                return false;
            }
        }
        return true;
    }

    public afq_2[] cP(int n, int n2) {
        int n3 = n2 - n;
        if (n3 <= 0) {
            return null;
        }
        afq_2[] afq_2Array = new afq_2[n3];
        for (int i = 0; i < n3; ++i) {
            int n4 = n + i + 2;
            afq_2Array[i] = afq_2.b(this.L, n4);
        }
        return afq_2Array;
    }

    public final int xp(int n) {
        assert (n >= 0);
        if (this.L.isObject(n + 2)) {
            return (int)((Long)this.L.toJavaObject(n + 2)).longValue();
        }
        return this.L.toInteger(n + 2);
    }

    public final double xq(int n) {
        assert (n >= 0);
        if (this.L.isObject(n + 2)) {
            return (Double)this.L.toJavaObject(n + 2);
        }
        return this.L.toNumber(n + 2);
    }

    public final float xr(int n) {
        return (float)this.xq(n);
    }

    public final long xs(int n) {
        assert (n >= 0);
        if (this.L.isObject(n + 2)) {
            return (Long)this.L.toJavaObject(n + 2);
        }
        if (this.L.isNumber(n + 2)) {
            return (long)this.L.toNumber(n + 2);
        }
        return 0L;
    }

    protected final Object xt(int n) {
        assert (n >= 0);
        if (this.L.isObject(n + 2)) {
            return this.L.toJavaObject(n + 2);
        }
        return null;
    }

    public final String xu(int n) {
        assert (n >= 0);
        return this.L.toString(n + 2);
    }

    public final afq_2[] xv(int n) {
        assert (n >= 0);
        int n2 = n + 2;
        afq_2[] afq_2Array = new afq_2[this.L.objLen(n2)];
        for (int i = 0; i < afq_2Array.length; ++i) {
            this.L.pushNumber((double)(i + 1));
            this.L.getTable(n2);
            afq_2Array[i] = afq_2.b(this.L, -1);
            this.L.pop(1);
        }
        return afq_2Array;
    }

    public final String xw(int n) {
        assert (n >= 0);
        if (this.L.isObject(n + 2)) {
            return this.L.toJavaObject(n + 2).toString();
        }
        return this.L.toString(n + 2);
    }

    public final boolean xx(int n) {
        assert (n >= 0);
        if (this.L.isObject(n + 2)) {
            return (Boolean)this.L.toJavaObject(n + 2);
        }
        return this.L.toBoolean(n + 2);
    }

    public boolean xy(int n) {
        assert (n >= 0);
        int n2 = n + 2;
        return this.L.isTable(n2);
    }

    public boolean xz(int n) {
        assert (n >= 0);
        int n2 = n + 2;
        return this.L.isNumber(n2);
    }

    public boolean xA(int n) {
        assert (n >= 0);
        int n2 = n + 2;
        return this.L.isString(n2);
    }

    public boolean xB(int n) {
        assert (n >= 0);
        int n2 = n + 2;
        return this.L.isBoolean(n2);
    }

    private void a(aff_2 aff_22) {
        assert (aff_22 != null);
        if (this.dHT == null) {
            return;
        }
        if (this.dHR >= this.dHT.length - 1 && this.cad()) {
            return;
        }
        aff_2 aff_23 = this.dHT[this.dHR].caK();
        if (!aff_23.b(aff_22)) {
            throw this.hQ("Type de valeur de retour incorrecte :" + String.valueOf(aff_23) + "attendue: " + String.valueOf(aff_22));
        }
    }

    protected final void dK(boolean bl) {
        this.a(aff_2.dJA);
        this.L.pushBoolean(bl);
        ++this.dHR;
    }

    protected final void xC(int n) {
        this.a(aff_2.dJy);
        this.L.pushNumber((double)n);
        ++this.dHR;
    }

    protected final void ad(Object object) {
        this.a(aff_2.dJv);
        this.L.pushJavaObject(object);
        ++this.dHR;
    }

    protected final void dJ(float f2) {
        this.a(aff_2.dJz);
        this.L.pushNumber((double)f2);
        ++this.dHR;
    }

    protected final void hA(long l) {
        this.a(aff_2.dJw);
        this.L.pushObjectValue((Object)l);
        ++this.dHR;
    }

    protected final void R(double d2) {
        this.a(aff_2.dJz);
        this.L.pushNumber(d2);
        ++this.dHR;
    }

    protected final void dM(byte[] byArray) {
        this.a(aff_2.dJx);
        this.L.pushString(byArray);
        ++this.dHR;
    }

    protected final void hS(String string) {
        this.a(aff_2.dJx);
        this.L.pushString(string);
        ++this.dHR;
    }

    protected final void cah() {
        this.L.pushNil();
        ++this.dHR;
    }

    protected final afx_1 cai() {
        assert (this.L != null);
        this.L.getGlobal("script");
        afx_1 afx_12 = (afx_1)this.L.toJavaObject(-1);
        this.L.pop(1);
        return afx_12;
    }
}

