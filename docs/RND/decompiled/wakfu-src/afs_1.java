/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  aDm$aDp
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.procedure.TIntObjectProcedure
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 *  org.keplerproject.luajava.LuaStateFactory
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.procedure.TIntObjectProcedure;
import gnu.trove.procedure.TObjectProcedure;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;
import org.keplerproject.luajava.LuaStateFactory;

/*
 * Renamed from aFs
 */
public class afs_1
extends adm_1<byte[]>
implements afd_1,
Runnable {
    private static final Logger dIn = Logger.getLogger((String)"LUA");
    private static final Logger dIo = Logger.getLogger(afs_1.class);
    public static final String dIp = "script";
    public static final String dIq = ".lua";
    public static final String dIr = "jar:file:";
    public static final String dIs = "!/";
    private static final int dIt = 0x200000;
    private static final int dIu = 30;
    public static final FilenameFilter dIv = new afu_1();
    private static final afs_1 dIw = new afs_1();
    private final TIntObjectHashMap<afx_1> dIx = new TIntObjectHashMap();
    private final List<afd_1> dIy = new ArrayList<afd_1>();
    private long dIz;
    private final TObjectProcedure<afx_1> dIA = new aft_1();
    private final afw_1 dIB = new afw_1(this);

    private afs_1() {
        super(0x200000L, true);
        abg_2.bUP().a((Runnable)this, 30L);
    }

    public static afs_1 can() {
        return dIw;
    }

    @Override
    protected final adm_1.aDp dC(byte[] byArray) {
        return new afv_1(this, byArray);
    }

    @Override
    public final String bLX() {
        return dIq;
    }

    @Override
    public final FilenameFilter bLY() {
        return dIv;
    }

    public final void a(afd_1 afd_12) {
        if (!this.dIy.contains(afd_12)) {
            this.dIy.add(afd_12);
        }
    }

    public final void b(afd_1 afd_12) {
        this.dIy.remove(afd_12);
    }

    public boolean cao() {
        String string = this.bYf();
        if (!string.startsWith(dIr)) {
            return true;
        }
        string = string.substring(dIr.length());
        File file = new File(string = string.substring(0, string.length() - dIs.length()));
        return file.exists() && file.isFile() && file.canRead();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final afx_1 xD(int n) {
        TIntObjectHashMap<afx_1> tIntObjectHashMap = this.dIx;
        synchronized (tIntObjectHashMap) {
            return (afx_1)this.dIx.get(n);
        }
    }

    String xE(int n) {
        assert (this.bYf() != null);
        return String.format("%d%s", n, dIq);
    }

    public final afx_1 a(int n, afr_1[] afr_1Array, boolean bl) {
        assert (this.bYf() != null);
        return this.a(this.xE(n), afr_1Array, bl);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Nullable
    public afx_1 a(String string, afr_1[] afr_1Array, boolean bl) {
        String string2 = this.bYf() + string;
        afx_1 afx_12 = this.d(afr_1Array);
        afl_2.dHW.J(string, string2);
        afx_12.e(afl_2.dHW.hT(string));
        afx_12.e(afr_1Array);
        try {
            afx_12.b(string, (byte[])this.hb(string));
            afx_12.hX(string);
            afx_12.dL(bl);
        }
        catch (Exception exception) {
            dIo.warn((Object)("Impossible de charger le fichier " + string), (Throwable)exception);
            return null;
        }
        if (afx_12.caz() != afy_1.dIV) {
            return null;
        }
        int n = afx_12.caw();
        TIntObjectHashMap<afx_1> tIntObjectHashMap = this.dIx;
        synchronized (tIntObjectHashMap) {
            this.dIx.put(n, (Object)afx_12);
        }
        return afx_12;
    }

    public final afx_1 a(String string, @Nullable afr_1[] afr_1Array, @Nullable Map<String, Object> map, boolean bl) {
        afx_1 afx_12 = this.b(string, afr_1Array, bl);
        if (afx_12 != null) {
            afx_12.hX("Command : " + string);
            afx_12.s(map);
        } else {
            dIo.error((Object)("Le Script de commande [" + string + "] n'existe pas"));
        }
        return afx_12;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private afx_1 b(String string, afr_1[] afr_1Array, boolean bl) {
        afx_1 afx_12 = this.d(afr_1Array);
        afx_12.e(afl_2.dHW.hU(string));
        afx_12.hW(string);
        afx_12.dL(bl);
        if (afx_12.caz() != afy_1.dIV) {
            return null;
        }
        int n = afx_12.caw();
        TIntObjectHashMap<afx_1> tIntObjectHashMap = this.dIx;
        synchronized (tIntObjectHashMap) {
            this.dIx.put(n, (Object)afx_12);
        }
        return afx_12;
    }

    public final afx_1 a(String string, afd_1 afd_12) {
        return this.a(string, null, null, afd_12, false);
    }

    public final afx_1 hV(String string) {
        return this.a(string, (afr_1[])null, (afd_1)null);
    }

    public final afx_1 a(String string, @Nullable afd_1 afd_12, boolean bl) {
        return this.a(string, null, null, afd_12, bl);
    }

    public final afx_1 x(String string, boolean bl) {
        return this.a(string, (afd_1)null, bl);
    }

    public final afx_1 a(int n, afd_1 afd_12) {
        return this.a(n, null, null, afd_12, false);
    }

    public final afx_1 xF(int n) {
        return this.a(n, null, null);
    }

    public final afx_1 a(int n, @Nullable afd_1 afd_12, boolean bl) {
        return this.a(n, null, null, afd_12, bl);
    }

    public final afx_1 l(int n, boolean bl) {
        return this.a(n, (afd_1)null, bl);
    }

    public final afx_1 a(int n, @Nullable afr_1[] afr_1Array, @Nullable afd_1 afd_12) {
        return this.a(n, afr_1Array, null, afd_12, false);
    }

    public final afx_1 a(int n, @Nullable afr_1[] afr_1Array, @Nullable Map<String, Object> map, @Nullable afd_1 afd_12, boolean bl) {
        assert (this.bYf() != null);
        return this.a(this.xE(n), afr_1Array, map, afd_12, bl);
    }

    public final afx_1 a(int n, afr_1[] afr_1Array, Map<String, Object> map, boolean bl) {
        return this.a(n, afr_1Array, map, null, bl);
    }

    public final afx_1 a(String string, @Nullable afr_1[] afr_1Array, @Nullable afd_1 afd_12) {
        return this.a(string, afr_1Array, null, afd_12, false);
    }

    public final afx_1 a(String string, afr_1 ... afr_1Array) {
        return this.a(string, afr_1Array, (afd_1)null);
    }

    public final afx_1 a(String string, @Nullable afr_1[] afr_1Array, @Nullable Map<String, Object> map, afd_1 afd_12, boolean bl) {
        afx_1 afx_12 = this.a(string, afr_1Array, bl);
        if (afx_12 != null) {
            if (afd_12 != null) {
                afx_12.c(afd_12);
            }
            afx_12.s(map);
        } else {
            dIo.warn((Object)("Script [" + string + "] does not exist"));
        }
        return afx_12;
    }

    public final void xG(int n) {
        afx_1 afx_12 = this.xD(n);
        if (afx_12 != null) {
            afx_12.cay();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final int cap() {
        int n = 1;
        TIntObjectHashMap<afx_1> tIntObjectHashMap = this.dIx;
        synchronized (tIntObjectHashMap) {
            while (this.dIx.containsKey(n)) {
                ++n;
            }
        }
        return n;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void qF(int n) {
        TIntObjectHashMap<afx_1> tIntObjectHashMap = this.dIx;
        synchronized (tIntObjectHashMap) {
            this.dIB.xI(n);
            this.dIx.forEachEntry((TIntObjectProcedure)this.dIB);
        }
    }

    void xH(int n) {
        this.dIx.remove(n);
    }

    private afx_1 d(afr_1 ... afr_1Array) {
        LuaState luaState = LuaStateFactory.newLuaState();
        int n = this.cap();
        afx_1 afx_12 = new afx_1(n, luaState, afr_1Array);
        afx_12.e(afr_1Array);
        afx_12.c(this);
        luaState.pushJavaObject((Object)afx_12);
        luaState.setGlobal(dIp);
        return afx_12;
    }

    public final void caq() {
        abg_2.bUP().h(this);
    }

    @Override
    public final void run() {
        long l = System.currentTimeMillis();
        int n = (int)(l - this.dIz);
        this.qF(n);
        this.dIz = l;
    }

    @Override
    public void a(afx_1 afx_12, afc_1 afc_12, String string) {
        for (int i = 0; i < this.dIy.size(); ++i) {
            assert (this.dIy.get(i) != null);
            this.dIy.get(i).a(afx_12, afc_12, string);
        }
        String string2 = afx_12.aXV();
        String string3 = afx_12.caE();
        String string4 = String.format("[LUA] %s (%s) %s", new Object[]{afc_12, string2, string});
        if (!afx_12.cav()) {
            dIn.error((Object)string4);
        }
        dIo.error((Object)string4, (Throwable)new agp_2(string2, string3, string4));
    }

    @Override
    public void a(afx_1 afx_12) {
        for (int i = 0; i < this.dIy.size(); ++i) {
            this.dIy.get(i).a(afx_12);
        }
    }

    @Override
    public void b(afx_1 afx_12) {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void car() {
        TIntObjectHashMap<afx_1> tIntObjectHashMap = this.dIx;
        synchronized (tIntObjectHashMap) {
            this.dIx.forEachValue(this.dIA);
            this.dIx.clear();
        }
    }
}

