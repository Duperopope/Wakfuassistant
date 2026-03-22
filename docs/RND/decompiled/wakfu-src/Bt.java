/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.lang.invoke.MethodHandle;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.lang.runtime.ObjectMethods;
import org.jetbrains.annotations.Nullable;

final class Bt<T>
extends Record {
    final Class<T> auk;
    @Nullable
    final Type aul;

    Bt(Class<T> clazz, @Nullable Type type) {
        this.auk = clazz;
        this.aul = type;
    }

    static <T> Bt<T> c(Class<T> clazz) {
        return new Bt<T>(clazz, null);
    }

    static Bt<?> a(Field field) {
        return new Bt(field.getType(), field.getGenericType());
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{Bt.class, "type;genericType", "auk", "aul"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{Bt.class, "type;genericType", "auk", "aul"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{Bt.class, "type;genericType", "auk", "aul"}, this, object);
    }

    public Class<T> aHG() {
        return this.auk;
    }

    @Nullable
    public Type aHH() {
        return this.aul;
    }
}

