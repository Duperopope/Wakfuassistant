/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL2
 *  gnu.trove.map.hash.THashMap
 *  gnu.trove.procedure.TObjectProcedure
 */
import com.ankamagames.framework.kernel.core.maths.Matrix44;
import com.jogamp.opengl.GL2;
import gnu.trove.map.hash.THashMap;
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/*
 * Renamed from auM
 */
public class aum_2 {
    static final double dfm = 1000000.0;
    static final int dfn = 500;
    static final float dfo = 2.0f;
    static final float dfp = 200.0f;
    static final float dfq = 300.0f;
    static final Comparator<auu_2> dfr = new aun_2();
    static final Comparator<auu_2> dfs = new auo_2();
    private static final THashMap<String, aul_2> dft = new THashMap(10);
    private static final THashMap<String, aut_2> dfu = new THashMap(10);
    private static final auu_2 dfv;
    private static auu_2 dfw;
    private static auv_2 dfx;
    private static boolean aJj;
    static long dfy;

    public static boolean aOY() {
        return aJj && dfx != null;
    }

    public static void az(boolean bl) {
        aJj = bl;
        aum_2.reset();
    }

    public static void d(String string, int n, int n2) {
        dfx = new auv_2(string, n, n2);
    }

    public static void a(String string, int n, float f2, float f3, float f4, float f5, double d2) {
        if (!aum_2.aOY()) {
            return;
        }
        aut_2 aut_22 = (aut_2)dfu.get((Object)string);
        if (aut_22 == null) {
            aut_22 = new aut_2();
            dfu.put((Object)string, (Object)aut_22);
        }
        aut_22.dfC[0] = f2;
        aut_22.dfC[1] = f3;
        aut_22.dfC[2] = f4;
        aut_22.dfC[3] = f5;
        aut_22.dfD = 200.0 / d2;
        aut_22.uG(n);
    }

    public static void b(String string, float f2, float f3, float f4) {
        aum_2.d(string, new float[]{f2, f3, f4, 0.8f});
    }

    public static void gn(String string) {
        aum_2.d(string, null);
    }

    private static void d(String string, float[] fArray) {
        if (!aum_2.aOY()) {
            return;
        }
        aul_2 aul_22 = (aul_2)dft.get((Object)string);
        if (aul_22 == null) {
            aul_22 = new aul_2(string);
            dft.put((Object)string, (Object)aul_22);
        }
        aul_22.dfl = dfy;
        aul_22.bdU = fArray;
        auu_2 auu_22 = null;
        int n = aum_2.dfw.dfG.size();
        for (int i = 0; i < n; ++i) {
            auu_2 auu_23 = aum_2.dfw.dfG.get(i);
            if (auu_23.dfE != aul_22) continue;
            auu_22 = auu_23;
            break;
        }
        if (auu_22 == null) {
            auu_22 = new auu_2(aul_22, dfw);
            aum_2.dfw.dfG.add(auu_22);
        }
        dfw = auu_22;
        aul_22.bMx();
    }

    public static void bMy() {
        if (!aum_2.aOY()) {
            return;
        }
        dfw = dfv;
        ++dfy;
        ArrayList arrayList = new ArrayList();
        dft.forEachValue((TObjectProcedure)new aup_2(arrayList));
        int n = arrayList.size();
        for (int i = 0; i < n; ++i) {
            aul_2 aul_22 = (aul_2)dft.remove(arrayList.get(i));
            aum_2.a(dfv, aul_22);
        }
        dfu.forEachValue((TObjectProcedure)new auq_2());
    }

    private static boolean a(auu_2 auu_22, aul_2 aul_22) {
        int n;
        for (n = 0; n < auu_22.dfG.size(); ++n) {
            if (auu_22.dfG.get((int)n).dfE != aul_22) continue;
            auu_22.dfG.remove(n);
            return true;
        }
        for (n = 0; n < auu_22.dfG.size(); ++n) {
            if (!aum_2.a(auu_22.dfG.get(n), aul_22)) continue;
            return true;
        }
        return false;
    }

    private static void reset() {
        dfy = 0L;
        dft.clear();
        dfu.clear();
        dfw = dfv;
        aum_2.dfv.dfG.clear();
    }

    public static void bIi() {
        if (!aum_2.aOY()) {
            return;
        }
        long l = System.nanoTime();
        ((aul_2)dft.get((Object)aum_2.dfw.dfE.dfh)).gA(l);
        dfw = aum_2.dfw.dfF;
    }

    public static void b(art_1 art_12) {
        if (!aum_2.aOY()) {
            return;
        }
        aum_2.j(art_12);
        dfx.a(art_12, 8, 0);
        dfx.fY(String.format("%15s|%6s|%6s|%6s|%6s", "", "avg/call", "avg", "min", "max"));
        auu_2[] auu_2Array = new auu_2[aum_2.dfv.dfG.size()];
        aum_2.dfv.dfG.toArray(auu_2Array);
        Arrays.sort(auu_2Array, dfr);
        for (auu_2 auu_22 : auu_2Array) {
            aum_2.a(auu_22, 0);
        }
        dfx.bIi();
    }

    private static void j(art_1 art_12) {
        GL2 gL2 = art_12.bIq();
        ava_2.bMH().db(false);
        ava_2.bMH().h(gL2);
        art_12.a(Matrix44.dAe);
        art_12.b(Matrix44.dAe);
        art_12.bIn();
        float[] fArray = new float[]{0.2f, 0.2f, 0.2f, 0.9f};
        gL2.glColor4fv(fArray, 0);
        gL2.glBegin(1);
        float f2 = -500.0f;
        float f3 = -300.0f;
        gL2.glVertex2f(-500.0f, -300.0f);
        gL2.glVertex2f(500.0f, -300.0f);
        gL2.glVertex2f(-500.0f, -300.0f);
        gL2.glVertex2f(-500.0f, -100.0f);
        gL2.glEnd();
        dft.forEachValue((TObjectProcedure)new aur_2(gL2));
        dfu.forEachValue((TObjectProcedure)new aus_2(gL2));
        dfx.a(art_12, 0, (int)((float)art_12.bIu() * 0.5f - 200.0f - 16.0f - 300.0f));
        dfx.e("10 ms", fArray);
        dfx.bIi();
    }

    private static void a(auu_2 auu_22, int n) {
        Object object = "";
        for (int i = 0; i < n; ++i) {
            object = (String)object + "_";
        }
        if (auu_22.dfE.dfl != dfy) {
            object = (String)object + "#";
        }
        if ((double)auu_22.dfE.dfj.dfb / 1000000.0 > 0.01 || n >= 2 || n == 0) {
            if ((double)auu_22.dfE.dfj.dfb / 1000000.0 > 0.01 || auu_22.dfE.dfh.startsWith("*")) {
                dfx.e(auu_22.dfE.gm((String)object), auu_22.dfE.bdU);
            }
            auu_2[] auu_2Array = new auu_2[auu_22.dfG.size()];
            auu_22.dfG.toArray(auu_2Array);
            Arrays.sort(auu_2Array, dfr);
            for (auu_2 auu_23 : auu_2Array) {
                aum_2.a(auu_23, n + 1);
            }
        }
    }

    static {
        dfw = dfv = new auu_2(null, null);
        aJj = false;
        dfy = 0L;
    }
}

