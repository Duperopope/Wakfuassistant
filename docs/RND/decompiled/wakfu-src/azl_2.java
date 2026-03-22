/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 *  org.jetbrains.annotations.NotNull
 */
import gnu.trove.procedure.TObjectProcedure;
import java.lang.reflect.Array;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from azl
 */
public class azl_2<T>
implements Iterable<T> {
    private T[] dvj;

    public azl_2() {
        this.dvj = (Object[])Array.newInstance(Object.class, 0);
    }

    public azl_2(T[] TArray) {
        this.dvj = (Object[])TArray.clone();
    }

    public void M(T t) {
        if (t == null) {
            return;
        }
        int n = this.dvj.length;
        Object[] objectArray = (Object[])Array.newInstance(Object.class, n + 1);
        System.arraycopy(this.dvj, 0, objectArray, 0, n);
        objectArray[n] = t;
        this.dvj = objectArray;
    }

    public void b(T[] TArray) {
        if (TArray == null || TArray.length == 0) {
            return;
        }
        int n = this.dvj.length;
        Object[] objectArray = (Object[])Array.newInstance(Object.class, n + TArray.length);
        if (n > 0) {
            System.arraycopy(this.dvj, 0, objectArray, 0, n);
        }
        System.arraycopy(TArray, 0, objectArray, n, TArray.length);
        this.dvj = objectArray;
    }

    public void c(T[] TArray) {
        if (TArray == null) {
            this.dvj = (Object[])Array.newInstance(Object.class, 0);
            return;
        }
        this.dvj = TArray;
    }

    public void c(int n, T t) {
        if (n < 0) {
            return;
        }
        if (n >= this.dvj.length) {
            Object[] objectArray = (Object[])Array.newInstance(Object.class, n + 1);
            System.arraycopy(this.dvj, 0, objectArray, 0, this.dvj.length);
            this.dvj = objectArray;
        }
        this.dvj[n] = t;
    }

    public T vK(int n) {
        if (n < 0 || n >= this.dvj.length) {
            return null;
        }
        return this.dvj[n];
    }

    public int aVo() {
        return this.dvj.length;
    }

    public void clear() {
        this.dvj = (Object[])Array.newInstance(Object.class, 0);
    }

    @Override
    @NotNull
    public Iterator<T> iterator() {
        return new azh_1<T>(this.dvj, false);
    }

    public void h(TObjectProcedure<T> tObjectProcedure) {
        for (int i = 0; i < this.dvj.length; ++i) {
            if (tObjectProcedure.execute(this.dvj[i])) continue;
            return;
        }
    }
}

