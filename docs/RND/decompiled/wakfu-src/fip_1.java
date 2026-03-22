/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.log4j.Logger;

/*
 * Renamed from fIp
 */
public class fip_1 {
    public static final String[] uAT = new String[0];
    private static final Pattern uAU = Pattern.compile("(^([a-zA-Z.]+):)?([a-zA-Z]+)(\\(([!]?([_a-zA-Z0-9\\-\\.~#]+([,]?[\\s]*[!]?[_a-zA-Z0-9\\-\\.~#]+)*)*)\\))?");
    public static final String uAV = ";";
    public static final String uAW = "!";
    protected static final Logger uAX = Logger.getLogger(fip_1.class);
    protected String[] uAY;
    protected String cEp = null;
    protected fhs_2 nQt = null;

    public void vw(String string) {
        this.cEp = string;
        this.uAY = BH.j(string, uAV);
    }

    public void b(String string, fhs_2 fhs_22) {
        this.cEp = string;
        this.uAY = BH.j(string, uAV);
        this.nQt = fhs_22;
    }

    public void setElementMap(fhs_2 fhs_22) {
        this.nQt = fhs_22;
    }

    public Object gBz() {
        Object object = null;
        for (String string : this.uAY) {
            String string2;
            String[] stringArray;
            String string3;
            Matcher matcher = uAU.matcher(string);
            if (!matcher.matches()) {
                uAX.error((Object)("Erreur de syntaxe : '" + string + "' n'est pas du type 'package:method(param1,param2,...)'."));
                continue;
            }
            String string4 = matcher.group(2);
            object = this.a(string4, string3 = matcher.group(3), stringArray = (string2 = matcher.group(5)) != null ? BH.a(string2, ',') : uAT);
            if (object instanceof Boolean && ((Boolean)object).booleanValue()) break;
        }
        return object;
    }

    private Object a(String string, String string2, String[] stringArray) {
        Method[] methodArray;
        ArrayList arrayList = new ArrayList();
        ArrayList<Object> arrayList2 = new ArrayList<Object>();
        this.a(stringArray, arrayList, arrayList2);
        Class<?> clazz = fyw_0.gqw().td(string);
        if (clazz == null) {
            String string3 = (String)(string != null ? string + ":" : "") + string2 + "(" + fip_1.bs(arrayList) + ")";
            uAX.warn((Object)String.format("La m\u00e9thode : %s est inconnue !", string3), (Throwable)new fiu_2(string3));
            return null;
        }
        for (Method method : methodArray = clazz.getMethods()) {
            if (!method.getName().equals(string2)) continue;
            boolean bl = false;
            Class<?>[] classArray = method.getParameterTypes();
            if (classArray.length > arrayList.size()) continue;
            for (int exception = 0; exception < classArray.length; ++exception) {
                Class<?> clazz2 = classArray[exception];
                if (arrayList.size() <= exception) {
                    bl = false;
                } else if (clazz2.isArray()) {
                    if (clazz2.isAssignableFrom((Class)arrayList.get(exception))) {
                        bl = true;
                    } else {
                        int n = 0;
                        int n2 = arrayList.size();
                        for (int object = exception; object < n2 && clazz2.getComponentType().isAssignableFrom((Class)arrayList.get(object)); ++object) {
                            ++n;
                        }
                        if (n > 0) {
                            Object object = Array.newInstance(clazz2.getComponentType(), n);
                            for (int i = 0; i < n; ++i) {
                                arrayList.remove(exception);
                                Array.set(object, i, arrayList2.remove(exception));
                            }
                            arrayList2.add(exception, object);
                            arrayList.add(exception, clazz2);
                        } else {
                            bl = false;
                        }
                    }
                } else {
                    bl = classArray[exception].isAssignableFrom((Class)arrayList.get(exception));
                }
                if (!bl) break;
            }
            if (classArray.length != arrayList.size()) {
                bl = false;
            }
            if (!bl) continue;
            try {
                return method.invoke(null, arrayList2.toArray());
            }
            catch (Exception exception) {
                uAX.error((Object)("Erreur lors du invokeCallBack sur la m\u00e9thode " + method.getName() + " de la classe " + clazz.getName()), (Throwable)exception);
                if (exception.getCause() != null) {
                    uAX.error((Object)"Raison : ", exception.getCause());
                }
                return null;
            }
        }
        String string3 = (String)(string != null ? string + ":" : "") + string2 + "(" + fip_1.bs(arrayList) + ")";
        uAX.warn((Object)String.format("La m\u00e9thode : %s est inconnue !", string3), (Throwable)new fiu_2(string3));
        return null;
    }

    protected void a(String[] stringArray, List<Class<?>> list, List<Object> list2) {
        for (int i = 0; i < stringArray.length; ++i) {
            Object object;
            fhv_1 fhv_13 = null;
            boolean bl = stringArray[i].startsWith(uAW);
            String string = stringArray[i].replace(uAW, "");
            if (this.nQt != null) {
                if (bl) {
                    fhv_13 = this.nQt.getElementRecursively(string, fhv_12 -> !fhv_12.isATemplate());
                    if (fhv_13 == null) {
                        object = this.nQt;
                        while (fhv_13 == null && ((fhs_2)object).gAv() != null) {
                            object = ((fhs_2)object).gAv();
                            fhv_13 = ((fhs_2)object).getElementRecursively(string, fhv_12 -> !fhv_12.isATemplate());
                        }
                    }
                } else {
                    fhv_13 = this.nQt.uH(string);
                }
            }
            if (fhv_13 != null) {
                object = fhv_13.getElementValue();
                if (object == null) continue;
                list.add(object.getClass());
                list2.add(object);
                continue;
            }
            if (string.isEmpty()) continue;
            list.add(String.class);
            list2.add(string);
        }
    }

    private static String bs(List<Class<?>> list) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Class<?> clazz : list) {
            stringBuilder.append(',').append(clazz.getName());
        }
        return stringBuilder.toString().substring(1);
    }
}

