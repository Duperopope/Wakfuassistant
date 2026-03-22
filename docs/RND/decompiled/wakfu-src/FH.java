/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class FH {
    private final Method aBL;
    private final Object aBM;
    private final Bj<String, Void> aBN;

    FH(Method method, Object object) {
        this.aBL = method;
        this.aBM = object;
        this.aBN = this.aLk();
    }

    public Class<?> aLg() {
        return this.aBL.getReturnType();
    }

    public boolean aLh() {
        return this.aBN.isValid();
    }

    public String aLi() {
        if (this.aLh()) {
            throw new IllegalStateException(String.format("Method %s is a property", this));
        }
        return this.aBN.aHB();
    }

    public Object aLj() {
        boolean bl = this.aBL.isAccessible();
        try {
            this.aBL.setAccessible(true);
            Object object = this.aLl();
            return object;
        }
        catch (IllegalAccessException | InvocationTargetException reflectiveOperationException) {
            throw new RuntimeException("Invoke exception for " + String.valueOf(this.aBL), reflectiveOperationException);
        }
        finally {
            this.aBL.setAccessible(bl);
        }
    }

    public String toString() {
        return String.format("%s.%s", this.aBL.getDeclaringClass().getSimpleName(), this.aBL.getName());
    }

    private Bj<String, Void> aLk() {
        if (this.aBL.getParameterTypes().length > 0) {
            return Bj.c(String.format("Method %s has more than 0 parameters.", this));
        }
        return Bj.d(null);
    }

    private Object aLl() {
        if (!this.aLh()) {
            throw new IllegalStateException(String.format("Method %s is not a property.", this));
        }
        return this.aBL.invoke(this.aBM, new Object[0]);
    }
}

