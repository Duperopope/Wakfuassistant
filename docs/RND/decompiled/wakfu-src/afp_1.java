/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.THashMap
 *  gnu.trove.procedure.TObjectObjectProcedure
 *  gnu.trove.set.hash.THashSet
 *  org.keplerproject.luajava.LuaState
 */
import gnu.trove.map.hash.THashMap;
import gnu.trove.procedure.TObjectObjectProcedure;
import gnu.trove.set.hash.THashSet;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Collection;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aFp
 */
public class afp_1 {
    private final THashMap<String, Class> dIi = new THashMap();

    public void a(InputStream inputStream, String string, String string2, THashMap<String, Collection<afo_1>> tHashMap) {
        THashSet<afo_1> tHashSet = this.c(new InputStreamReader(inputStream));
        if (tHashSet == null) {
            return;
        }
        tHashMap.put((Object)afp_1.K(string2, string), tHashSet);
    }

    public final THashSet<afo_1> c(Reader reader) {
        THashSet tHashSet = new THashSet();
        try {
            BufferedReader bufferedReader = new BufferedReader(reader);
            String string = bufferedReader.readLine();
            while (string != null) {
                this.a(string, (Collection<afo_1>)tHashSet);
                string = bufferedReader.readLine();
            }
            bufferedReader.close();
        }
        catch (IOException iOException) {
            afl_2.dHV.error((Object)"", (Throwable)iOException);
            return null;
        }
        return tHashSet;
    }

    public static String K(String string, String string2) {
        return string.length() == 0 ? string2 : string + "/" + string2;
    }

    private void a(String string, Collection<afo_1> collection) {
        this.dIi.forEachEntry((TObjectObjectProcedure)new afq_1(this, string, collection));
    }

    public void c(afr_1[] afr_1Array) {
        try {
            for (afr_1 afr_12 : afr_1Array) {
                int n;
                afk_1[] afk_1Array;
                if (!afp_1.a(afr_12)) continue;
                afk_1[] afk_1Array2 = afr_12.a(null);
                if (afk_1Array2 != null) {
                    afk_1Array = afk_1Array2;
                    int n2 = afk_1Array.length;
                    for (n = 0; n < n2; ++n) {
                        afk_1 afk_12 = afk_1Array[n];
                        if (!afp_1.a(afk_12)) continue;
                        this.dIi.put((Object)(afr_12.getName() + "." + afk_12.getName()), afk_12.getClass());
                    }
                }
                if ((afk_1Array = afr_12.b(null)) == null) continue;
                afk_1[] afk_1Array3 = afk_1Array;
                n = afk_1Array3.length;
                for (int i = 0; i < n; ++i) {
                    afk_1 afk_13 = afk_1Array3[i];
                    if (!afp_1.a(afk_13)) continue;
                    this.dIi.put((Object)afk_13.getName(), afk_13.getClass());
                }
            }
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    private static boolean a(afr_1 afr_12) {
        try {
            afr_12.getClass().getDeclaredConstructor(new Class[0]);
            return true;
        }
        catch (NoSuchMethodException noSuchMethodException) {
            return false;
        }
    }

    private static boolean a(afk_1 afk_12) {
        try {
            afk_12.getClass().getDeclaredConstructor(LuaState.class);
            return true;
        }
        catch (NoSuchMethodException noSuchMethodException) {
            return false;
        }
    }
}

