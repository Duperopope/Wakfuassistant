/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.THashMap
 *  gnu.trove.procedure.TObjectObjectProcedure
 *  gnu.trove.set.hash.THashSet
 *  org.apache.log4j.Logger
 *  org.keplerproject.luajava.LuaState
 */
import gnu.trove.map.hash.THashMap;
import gnu.trove.procedure.TObjectObjectProcedure;
import gnu.trove.set.hash.THashSet;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collection;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from aFl
 */
public class afl_2 {
    static final Logger dHV = Logger.getLogger(afl_2.class);
    public static final afl_2 dHW = new afl_2();
    private afr_1[] dHX;
    private final THashMap<String, afn_1[]> dHY = new THashMap();
    private afp_1 dHZ;

    private afl_2() {
    }

    public void a(afr_1[] afr_1Array) {
        this.dHX = afr_1Array;
    }

    public void b(afr_1 ... afr_1Array) {
        if (this.dHZ != null) {
            this.dHZ.c(afr_1Array);
        }
        afr_1[] afr_1Array2 = this.dHX;
        this.dHX = new afr_1[afr_1Array2.length + afr_1Array.length];
        System.arraycopy(afr_1Array2, 0, this.dHX, 0, afr_1Array2.length);
        System.arraycopy(afr_1Array, 0, this.dHX, afr_1Array2.length, afr_1Array.length);
    }

    public void dJ(String string) {
        try {
            int n;
            int n2;
            apl_1 apl_12 = apl_1.dw(fo_0.by(string));
            int n3 = apl_12.aIA();
            afn_1[][] afn_1ArrayArray = new afn_1[n3][];
            for (n2 = 0; n2 < n3; ++n2) {
                n = apl_12.aIy();
                afn_1ArrayArray[n2] = new afn_1[n];
                for (int i = 0; i < n; ++i) {
                    String string2 = apl_12.aIC();
                    Constructor[] constructorArray = afl_2.x(apl_12);
                    afn_1ArrayArray[n2][i] = string2.length() == 0 ? new afn_1(string2, null, constructorArray) : new afn_1(string2, constructorArray, null);
                }
            }
            n2 = apl_12.aIA();
            for (n = 0; n < n2; ++n) {
                String string3 = apl_12.aIC();
                int n4 = apl_12.aIA();
                this.dHY.put((Object)string3, (Object)afn_1ArrayArray[n4]);
            }
        }
        catch (IOException iOException) {
            dHV.error((Object)"", (Throwable)iOException);
        }
    }

    private static Constructor[] x(apl_1 apl_12) {
        int n = apl_12.aIy();
        String[] stringArray = new String[n];
        for (int i = 0; i < n; ++i) {
            stringArray[i] = apl_12.aIC();
        }
        return afl_2.q(stringArray);
    }

    static Constructor[] q(String[] stringArray) {
        Constructor[] constructorArray = new Constructor[stringArray.length];
        for (int i = 0; i < stringArray.length; ++i) {
            try {
                Class<?> clazz = Class.forName(stringArray[i]);
                constructorArray[i] = clazz.getDeclaredConstructor(LuaState.class);
                constructorArray[i].setAccessible(true);
                continue;
            }
            catch (NoSuchMethodException noSuchMethodException) {
                dHV.error((Object)"", (Throwable)noSuchMethodException);
                continue;
            }
            catch (ClassNotFoundException classNotFoundException) {
                dHV.error((Object)"", (Throwable)classNotFoundException);
            }
        }
        return constructorArray;
    }

    public afn_1[] hT(String string) {
        return (afn_1[])this.dHY.get((Object)string);
    }

    public boolean J(String string, String string2) {
        if (this.dHY.containsKey((Object)string)) {
            return this.dHY.get((Object)string) != null;
        }
        try {
            InputStream inputStream = fo_0.bz(string2);
            afn_1[] afn_1Array = this.b(new InputStreamReader(inputStream));
            if (afn_1Array == null) {
                this.dHY.put((Object)string, null);
                return false;
            }
            this.dHY.put((Object)string, (Object)afn_1Array);
            return true;
        }
        catch (IOException iOException) {
            dHV.error((Object)"", (Throwable)iOException);
            return false;
        }
    }

    public afn_1[] hU(String string) {
        return this.b(new StringReader(string));
    }

    public afn_1[] b(Reader reader) {
        THashSet<afo_1> tHashSet;
        if (this.dHZ == null) {
            this.dHZ = new afp_1();
            this.dHZ.c(this.dHX);
        }
        if ((tHashSet = this.dHZ.c(reader)) == null) {
            return null;
        }
        THashMap<String, ArrayList<Class>> tHashMap = afl_2.j(tHashSet);
        afn_1[] afn_1Array = new afn_1[tHashMap.size()];
        tHashMap.forEachEntry((TObjectObjectProcedure)new afm_2(this, afn_1Array));
        return afn_1Array;
    }

    public static THashMap<String, ArrayList<Class>> j(Collection<afo_1> collection) {
        THashMap tHashMap = new THashMap();
        for (afo_1 afo_12 : collection) {
            String string = afo_12.caj();
            ArrayList<Class> arrayList = (ArrayList<Class>)tHashMap.get((Object)string);
            if (arrayList == null) {
                arrayList = new ArrayList<Class>();
                tHashMap.put((Object)string, arrayList);
            }
            arrayList.add(afo_12.dIg);
        }
        return tHashMap;
    }
}

