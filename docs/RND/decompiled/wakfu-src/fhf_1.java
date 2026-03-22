/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fHf
 */
public class fhf_1
implements fib_1<Object> {
    public static final Class<Object> uvP = Object.class;

    @Override
    public Object um(String string) {
        return null;
    }

    @Override
    public Object b(Class<? extends Object> clazz, String string) {
        return this.b(clazz, string, (fhs_2)null);
    }

    @Override
    public Object b(Class<? extends Object> clazz, String string, fhs_2 fhs_22) {
        if (Boolean.TYPE.equals(clazz) || Boolean.class.equals(clazz)) {
            return Bw.aK(string);
        }
        if (Integer.TYPE.equals(clazz) || Integer.class.equals(clazz)) {
            return Bw.m(string);
        }
        if (Long.TYPE.equals(clazz) || Long.class.equals(clazz)) {
            return Bw.p(string);
        }
        if (Float.TYPE.equals(clazz) || Float.class.equals(clazz)) {
            return Float.valueOf(Bw.o(string));
        }
        if (Double.TYPE.equals(clazz) || Double.class.equals(clazz)) {
            return Bw.n(string);
        }
        if (Byte.TYPE.equals(clazz) || Byte.class.equals(clazz)) {
            return Bw.q(string);
        }
        if (Short.TYPE.equals(clazz) || Short.class.equals(clazz)) {
            return Bw.r(string);
        }
        return null;
    }

    @Override
    public Class<Object> gzM() {
        return uvP;
    }

    public static Class<?> v(Class<?> clazz) {
        if (clazz.equals(Boolean.TYPE)) {
            return Boolean.class;
        }
        if (clazz.equals(Double.TYPE)) {
            return Double.class;
        }
        if (clazz.equals(Float.TYPE)) {
            return Float.class;
        }
        if (clazz.equals(Short.TYPE)) {
            return Short.class;
        }
        if (clazz.equals(Integer.TYPE)) {
            return Integer.class;
        }
        if (clazz.equals(Long.TYPE)) {
            return Long.class;
        }
        if (clazz.equals(Character.TYPE)) {
            return Character.class;
        }
        if (clazz.equals(Byte.TYPE)) {
            return Byte.class;
        }
        if (clazz.equals(Void.TYPE)) {
            return Void.class;
        }
        return null;
    }

    public static Class<?> w(Class<?> clazz) {
        if (clazz.equals(Boolean.class)) {
            return Boolean.TYPE;
        }
        if (clazz.equals(Double.class)) {
            return Double.TYPE;
        }
        if (clazz.equals(Float.class)) {
            return Float.TYPE;
        }
        if (clazz.equals(Short.class)) {
            return Short.TYPE;
        }
        if (clazz.equals(Integer.class)) {
            return Integer.TYPE;
        }
        if (clazz.equals(Long.class)) {
            return Long.TYPE;
        }
        if (clazz.equals(Character.class)) {
            return Character.TYPE;
        }
        if (clazz.equals(Byte.class)) {
            return Byte.TYPE;
        }
        if (clazz.equals(Void.class)) {
            return Void.TYPE;
        }
        return null;
    }

    @Override
    public boolean gzN() {
        return true;
    }

    @Override
    public boolean gzO() {
        return true;
    }

    @Override
    public String a(ftz_2 ftz_22, fhq_2 fhq_22, Class<? extends Object> clazz, String object, fhu_1 fhu_12) {
        Object object2 = this.b(clazz, (String)object);
        if (object2 instanceof Number) {
            object = "(" + clazz.getName() + ")" + String.valueOf(object2);
            if (clazz.equals(Float.class) || clazz.equals(Float.TYPE)) {
                object = (String)object + "f";
            }
        } else {
            object = clazz.equals(Character.class) ? "'" + (String)object + "'" : (object2 == null ? "null" : object2.toString());
        }
        ftz_22.E(clazz);
        return object;
    }
}

