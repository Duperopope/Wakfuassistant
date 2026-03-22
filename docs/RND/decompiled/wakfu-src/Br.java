/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.GeneratedMessageV3
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  org.jetbrains.annotations.TestOnly
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageV3;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Supplier;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.TestOnly;

@TestOnly
public final class Br<T> {
    private static final String atL = "newBuilder";
    private static final String atM = "set";
    private static final String atN = "setUnknownFields";
    private static final String atO = "build";
    public static final int atP = 16;
    public static final int atQ = 0;
    public static final int atR = 5;
    public static final int atS = 8;
    private static final List<Class<?>> atT = List.of(Boolean.class, Byte.class, Character.class, Short.class, Integer.class, Long.class, Float.class, Double.class, String.class);
    private final Class<T> atU;
    private final Bx atV;
    private int atW = 16;
    private int atX = 0;
    private int atY = 5;
    private int atZ = 8;
    private Bs aua = Bs.aug;
    private final Map<String, Supplier<Object>> aub = new HashMap<String, Supplier<Object>>();
    private final Map<String, Supplier<Object>> auc = new HashMap<String, Supplier<Object>>();
    private final Map<Integer, Supplier<Object>> aud = new HashMap<Integer, Supplier<Object>>();
    private final Map<Class<?>, Supplier<?>> aue = new HashMap();
    private final Map<Class<?>, Class<?>> auf = new HashMap();

    public Br(Class<T> clazz, Bx bx) {
        this.atU = clazz;
        this.atV = bx;
    }

    public Br<T> me(int n) {
        this.atW = n;
        return this;
    }

    public Br<T> mf(int n) {
        this.atX = n;
        return this;
    }

    public Br<T> mg(int n) {
        this.atY = n;
        return this;
    }

    public Br<T> mh(int n) {
        this.atZ = n;
        return this;
    }

    public Br<T> a(Bs bs) {
        this.aua = bs;
        return this;
    }

    public Br<T> a(String string, Supplier<Object> supplier) {
        this.aub.put(string, supplier);
        return this;
    }

    public Br<T> a(String string, Object object) {
        this.aub.put(string, () -> object);
        return this;
    }

    public Br<T> a(String string, int n, Supplier<Object> supplier) {
        this.auc.put(string, supplier);
        this.aud.put(n, supplier);
        return this;
    }

    public Br<T> a(String string, int n, Object object) {
        this.auc.put(string, () -> object);
        this.aud.put(n, () -> object);
        return this;
    }

    public <U> Br<T> a(Class<U> clazz, Supplier<U> supplier) {
        this.aue.put(clazz, supplier);
        return this;
    }

    public <U> Br<T> a(Class<U> clazz, Class<? extends U> clazz2) {
        this.auf.put(clazz, clazz2);
        return this;
    }

    private static void a(AccessibleObject accessibleObject) {
        if (!accessibleObject.isAccessible()) {
            accessibleObject.setAccessible(true);
        }
    }

    public T aHE() {
        try {
            if (GeneratedMessageV3.class.isAssignableFrom(this.atU)) {
                return this.a(this.atU, 0);
            }
            Object object = this.b(this.atU, 0);
            this.f(object);
            return (T)object;
        }
        catch (Exception exception) {
            throw new RuntimeException("Error while creating instance of " + String.valueOf(this.atU), exception);
        }
    }

    private void f(Object object) {
        this.a(object, 0);
    }

    private void a(Object object, int n) {
        Class<?> clazz = object.getClass();
        do {
            Field[] fieldArray = clazz.getDeclaredFields();
            this.a(object, fieldArray, n);
        } while ((clazz = clazz.getSuperclass()) != null);
    }

    private void a(Object object, Field[] fieldArray, int n) {
        for (Field field : fieldArray) {
            if (Modifier.isStatic(field.getModifiers()) || Modifier.isFinal(field.getModifiers()) || Modifier.isTransient(field.getModifiers()) || Modifier.isVolatile(field.getModifiers())) continue;
            Br.a(field);
            field.set(object, this.a(field.getName(), Bt.a(field), n));
        }
    }

    private <M extends GeneratedMessageV3> M a(Class<M> clazz, int n) {
        Method method = clazz.getMethod(atL, new Class[0]);
        Object object = method.invoke(clazz, new Object[0]);
        Class<?> clazz2 = object.getClass();
        for (Method method2 : clazz2.getMethods()) {
            Parameter[] parameterArray;
            if (method2.getReturnType() != clazz2 || !method2.getName().startsWith(atM) || method2.getName().equals(atN) || (parameterArray = method2.getParameters()).length != 1 || GeneratedMessageV3.Builder.class.isAssignableFrom(parameterArray[0].getType())) continue;
            method2.invoke(object, this.a(Br.a(method2), Bt.c(parameterArray[0].getType()), n));
        }
        return (M)((GeneratedMessageV3)clazz2.getMethod(atO, new Class[0]).invoke(object, new Object[0]));
    }

    private static String a(Method method) {
        String string = method.getName().substring(atM.length());
        return string.substring(0, 1).toLowerCase() + string.substring(1);
    }

    @Nullable
    private <U> U a(String string, Bt<U> bt, int n) {
        if (this.aub.containsKey(string)) {
            return (U)this.aub.get(string).get();
        }
        return this.a(bt, n);
    }

    @Nullable
    private <T> T a(Bt<T> bt, int n) {
        Class clazz = bt.auk;
        if (this.aue.containsKey(clazz)) {
            return (T)this.aue.get(clazz).get();
        }
        if (clazz.isPrimitive() || atT.contains(clazz)) {
            return (T)this.b(clazz);
        }
        if (clazz.isEnum()) {
            T[] TArray = clazz.getEnumConstants();
            return this.atV.a(TArray);
        }
        if (clazz.isArray()) {
            return (T)this.b(Bt.c(clazz.getComponentType()), n);
        }
        if (Collection.class.isAssignableFrom(clazz)) {
            Objects.requireNonNull(bt.aul);
            Bt<?> bt2 = Br.a(((ParameterizedType)bt.aul).getActualTypeArguments()[0]);
            Object object = this.b(bt2, n);
            ArrayList<Object> arrayList = new ArrayList<Object>();
            for (int i = 0; i < Array.getLength(object); ++i) {
                arrayList.add(Array.get(object, i));
            }
            if (Set.class.isAssignableFrom(clazz)) {
                return (T)new HashSet(arrayList);
            }
            return (T)arrayList;
        }
        if (Map.class.isAssignableFrom(clazz)) {
            Objects.requireNonNull(bt.aul);
            Type[] typeArray = ((ParameterizedType)bt.aul).getActualTypeArguments();
            Bt<?> bt3 = Br.a(typeArray[0]);
            Bt<?> bt4 = Br.a(typeArray[1]);
            Object object = this.b(bt3, n);
            Object object2 = this.b(bt4, n);
            HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
            for (int i = 0; i < Math.min(Array.getLength(object), Array.getLength(object2)); ++i) {
                hashMap.put(Array.get(object, i), Array.get(object2, i));
            }
            return (T)hashMap;
        }
        if (GeneratedMessageV3.class.isAssignableFrom(clazz)) {
            return this.a(clazz, n + 1);
        }
        if (ByteString.class.isAssignableFrom(clazz)) {
            return (T)ByteString.copyFromUtf8((String)this.atV.mi(this.atW));
        }
        Object object = this.b(this.auf.getOrDefault(clazz, clazz), n);
        if (n >= this.atZ) {
            return null;
        }
        this.a(object, n + 1);
        return (T)object;
    }

    @NotNull
    private <T> Object b(Class<T> clazz, int n) {
        Constructor<T> constructor = this.a(clazz);
        Class<?>[] classArray = constructor.getParameterTypes();
        Type[] typeArray = constructor.getGenericParameterTypes();
        Object[] objectArray = new Object[constructor.getParameterCount()];
        for (int i = 0; i < objectArray.length; ++i) {
            Parameter parameter = constructor.getParameters()[i];
            objectArray[i] = parameter.isNamePresent() && this.auc.containsKey(parameter.getName()) ? this.auc.get(parameter.getName()).get() : (!parameter.isNamePresent() && this.aud.containsKey(i) ? this.aud.get(i).get() : this.a(new Bt(classArray[i], typeArray[i]), n));
        }
        return constructor.newInstance(objectArray);
    }

    @NotNull
    private Constructor<?> a(Class<?> clazz) {
        Constructor<?> constructor2;
        Constructor<?>[] constructorArray = clazz.getDeclaredConstructors();
        if (constructorArray.length == 0) {
            throw new IllegalArgumentException("type " + String.valueOf(clazz) + " does not have any constructor");
        }
        Arrays.sort(constructorArray, Comparator.comparing(constructor -> constructor.getParameterTypes().length));
        if (this.aua == Bs.aug) {
            constructor2 = constructorArray[0];
        } else if (this.aua == Bs.auh) {
            constructor2 = constructorArray[constructorArray.length - 1];
        } else if (this.aua == Bs.aui) {
            constructor2 = this.atV.a(constructorArray);
        } else {
            throw new IllegalArgumentException("Constructor selection " + String.valueOf((Object)this.aua) + " is invalid");
        }
        Br.a(constructor2);
        return constructor2;
    }

    @NotNull
    private Object b(Bt bt, int n) {
        ArrayList<T> arrayList = new ArrayList<T>();
        for (int i = 0; i < this.atV.n(this.atX, this.atY); ++i) {
            T t = this.a(bt, n);
            if (t == null) continue;
            arrayList.add(t);
        }
        Object object = Array.newInstance(bt.auk, arrayList.size());
        for (int i = 0; i < arrayList.size(); ++i) {
            Array.set(object, i, arrayList.get(i));
        }
        return object;
    }

    @NotNull
    private Object b(Class<?> clazz) {
        if (clazz == Boolean.TYPE || clazz == Boolean.class) {
            return this.atV.aHO();
        }
        if (clazz == Byte.TYPE || clazz == Byte.class) {
            return this.atV.aHN();
        }
        if (clazz == Character.TYPE || clazz == Character.class) {
            return Character.valueOf((char)this.atV.a(0L, 65535L));
        }
        if (clazz == Short.TYPE || clazz == Short.class) {
            return this.atV.aHM();
        }
        if (clazz == Integer.TYPE || clazz == Integer.class) {
            return this.atV.aHL();
        }
        if (clazz == Long.TYPE || clazz == Long.class) {
            return this.atV.aHK();
        }
        if (clazz == Float.TYPE || clazz == Float.class) {
            return Float.valueOf(this.atV.aHL());
        }
        if (clazz == Double.TYPE || clazz == Double.class) {
            return (double)this.atV.aHK();
        }
        if (clazz == String.class) {
            return this.atV.mi(this.atW);
        }
        throw new IllegalArgumentException("Unknown simple type: " + String.valueOf(clazz));
    }

    private static Bt<?> a(@NotNull Type type) {
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType)type;
            return new Bt((Class)parameterizedType.getRawType(), parameterizedType);
        }
        return new Bt((Class)type, null);
    }
}

