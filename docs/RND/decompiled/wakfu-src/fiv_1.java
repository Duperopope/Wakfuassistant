/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import org.apache.log4j.Logger;

/*
 * Renamed from fIv
 */
public class fiv_1<T extends fhi_2>
implements fiw_1 {
    private static final Logger uBo = Logger.getLogger(fiv_1.class);
    public static final boolean uBp = true;
    public static final String uBq = "checkOut";
    private final ArrayList<Method> uBr = new ArrayList();
    private final ArrayList<Method> uBs = new ArrayList();
    private final ArrayList<Method> uBt = new ArrayList();
    private final ArrayList<Method> uBu = new ArrayList();
    private final Class uBv;
    private Method uBw = null;
    protected final Class[] uBx = new Class[]{Object.class, String.class, Float.TYPE, Double.TYPE, Boolean.TYPE, Character.TYPE, Long.TYPE, Byte.TYPE, Integer.TYPE};

    public fiv_1(Class clazz) {
        this.uBv = clazz;
        this.gBM();
        this.gBK();
        this.gBN();
        this.gBO();
        this.gBL();
    }

    protected int B(Class<?> clazz) {
        for (int i = 0; i < this.uBx.length; ++i) {
            if (!clazz.isAssignableFrom(this.uBx[i])) continue;
            return i;
        }
        return -1;
    }

    protected void gBK() {
        Method[] methodArray = this.uBv.getMethods();
        for (int i = 0; i < methodArray.length; ++i) {
            String string = methodArray[i].getName();
            if (!string.startsWith("get")) continue;
            this.uBs.add(methodArray[i]);
        }
    }

    protected void gBL() {
        try {
            this.uBw = this.uBv.getDeclaredMethod(uBq, new Class[0]);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    protected void gBM() {
        this.e(this.uBr, "set");
    }

    protected void gBN() {
        this.e(this.uBt, "prepend");
    }

    protected void gBO() {
        this.e(this.uBu, "append");
    }

    public T gBP() {
        fhi_2 fhi_22;
        if (this.uBw != null) {
            fhi_22 = (fhi_2)this.uBw.invoke(null, new Object[0]);
        } else {
            fhi_22 = (fhi_2)this.uBv.newInstance();
            fhi_22.aVI();
        }
        return (T)fhi_22;
    }

    public T a(ftc_2 ftc_22, String string) {
        fhi_2 fhi_22;
        ftc_22.E(this.uBv);
        if (this.uBw != null) {
            fhi_22 = (fhi_2)this.uBw.invoke(null, new Object[0]);
            ftc_22.a(new fte_2(this.uBv, string, this.uBv.getSimpleName() + ".checkOut()"));
        } else {
            fhi_22 = (fhi_2)this.uBv.newInstance();
            ftc_22.a(new fte_2(this.uBv, string, "new " + this.uBv.getSimpleName() + "()"));
            if (fhi_22 instanceof ayx_2) {
                ftc_22.a(new ftd_2(null, "onCheckOut", string, new String[0]));
                fhi_22.aVI();
            }
        }
        return (T)fhi_22;
    }

    public T be(Object object) {
        Class<?> clazz = object.getClass();
        Constructor<?>[] constructorArray = this.uBv.getConstructors();
        for (int i = 0; i < constructorArray.length; ++i) {
            Class<?>[] classArray = constructorArray[i].getParameterTypes();
            if (classArray.length <= 0 || !classArray[0].isAssignableFrom(clazz)) continue;
            return (T)((fhi_2)constructorArray[i].newInstance(object));
        }
        return (T)((fhi_2)this.uBv.newInstance());
    }

    public T g(Object ... objectArray) {
        if (objectArray == null) {
            return (T)((fhi_2)this.uBv.newInstance());
        }
        Object[] objectArray2 = new Class[objectArray.length];
        Constructor<?>[] constructorArray = this.uBv.getConstructors();
        for (int i = 0; i < objectArray2.length; ++i) {
            objectArray2[i] = objectArray[i].getClass();
        }
        Constructor<?> constructor = null;
        for (int i = 0; constructor == null && i < constructorArray.length; ++i) {
            Class<?>[] classArray = constructorArray[i].getParameterTypes();
            if (classArray.length != objectArray2.length) continue;
            constructor = constructorArray[i];
            for (int j = 0; constructor != null && j < classArray.length; ++j) {
                if (classArray[j].equals(Object.class)) {
                    if (classArray[j].equals(objectArray2[j])) continue;
                    constructor = null;
                    continue;
                }
                if (classArray[j].isAssignableFrom((Class<?>)objectArray2[j])) continue;
                constructor = null;
            }
        }
        if (constructor != null) {
            return (T)((fhi_2)constructor.newInstance(objectArray));
        }
        throw new IllegalArgumentException("Impossible de trouver de constructeur pour les types : " + Arrays.toString(objectArray2));
    }

    public Class gBQ() {
        return this.uBv;
    }

    public Method C(Class clazz) {
        Method method = null;
        int n = this.uBr.size();
        for (int i = 0; i < n; ++i) {
            Method method2 = this.uBr.get(i);
            Class<?>[] classArray = method2.getParameterTypes();
            if (classArray == null || classArray.length <= 0 || !clazz.equals(classArray[0])) continue;
            method = method2;
            break;
        }
        return method;
    }

    @Override
    public Method vx(String string) {
        return this.c(this.uBr, string);
    }

    @Override
    public Method vy(String string) {
        return this.a(this.uBr, string, "set");
    }

    public Method e(String string, Class clazz) {
        return this.a(this.uBr, string, "set", clazz, null);
    }

    public Method a(String string, Class clazz, Class clazz2) {
        return this.a(this.uBr, string, "set", clazz, clazz2);
    }

    @Override
    public Method vz(String string) {
        return this.a(this.uBs, string, "get");
    }

    public Method f(String string, Class clazz) {
        return this.a(this.uBs, string, "get", clazz, null);
    }

    @Override
    public Method vA(String string) {
        return this.a(this.uBu, string, "append");
    }

    public Method g(String string, Class clazz) {
        return this.a(this.uBu, string, "append", clazz, null);
    }

    @Override
    public Method vB(String string) {
        return this.a(this.uBt, string, "prepend");
    }

    public Method h(String string, Class clazz) {
        return this.a(this.uBt, string, "prepend", clazz, null);
    }

    private Method c(ArrayList<Method> arrayList, String string) {
        int n = arrayList.size();
        for (int i = 0; i < n; ++i) {
            Method method = arrayList.get(i);
            if (!method.getName().equals(string)) continue;
            return method;
        }
        return null;
    }

    private ArrayList<Method> d(ArrayList<Method> arrayList, String string) {
        ArrayList<Method> arrayList2 = new ArrayList<Method>();
        int n = arrayList.size();
        for (int i = 0; i < n; ++i) {
            Method method = arrayList.get(i);
            if (!method.getName().equalsIgnoreCase(string)) continue;
            arrayList2.add(method);
        }
        return arrayList2;
    }

    private Method a(ArrayList<Method> arrayList, String object, String string) {
        object = string + (String)object;
        int n = arrayList.size();
        Method method = null;
        for (int i = 0; i < n; ++i) {
            Method method2 = arrayList.get(i);
            if (!method2.getName().equalsIgnoreCase((String)object)) continue;
            method = method2;
            break;
        }
        return method;
    }

    private Method a(ArrayList<Method> arrayList, String object, String string, Class<?> clazz, Class<?> clazz2) {
        object = string + (String)object;
        int n = arrayList.size();
        Method method = null;
        for (int i = 0; i < n; ++i) {
            Method method2 = arrayList.get(i);
            if (!method2.getName().equalsIgnoreCase((String)object)) continue;
            Class<?>[] classArray = method2.getParameterTypes();
            if (classArray.length > 0) {
                Class<?> clazz3 = classArray[0];
                if (clazz2 != null && clazz2.isAssignableFrom(clazz3)) continue;
                if (clazz == null) {
                    return method2;
                }
                if (clazz3.isAssignableFrom(clazz)) {
                    return method2;
                }
            }
            method = method2;
        }
        return method;
    }

    private void e(ArrayList<Method> arrayList, String string) {
        Method[] methodArray = this.uBv.getMethods();
        for (int i = 0; i < methodArray.length; ++i) {
            Method method = methodArray[i];
            String string2 = method.getName();
            if (!string2.startsWith(string) || method.getParameterTypes().length != 1) continue;
            int n = arrayList.size();
            if (fic_1.gBr().z(method.getParameterTypes()[0])) {
                n = 0;
            }
            if (arrayList.contains(method)) {
                uBo.warn((Object)("La classe " + this.uBv.getSimpleName() + " poss\u00e8de plusieurs fonctions poss\u00e9dant le nom " + method.getName()));
            }
            arrayList.add(n, method);
        }
    }

    public /* synthetic */ Object h(Object[] objectArray) {
        return this.g(objectArray);
    }

    public /* synthetic */ Object bf(Object object) {
        return this.be(object);
    }

    public /* synthetic */ Object gBR() {
        return this.gBP();
    }

    public /* synthetic */ Object b(ftc_2 ftc_22, String string) {
        return this.a(ftc_22, string);
    }
}

