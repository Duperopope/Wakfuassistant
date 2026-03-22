/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.List;

/*
 * Renamed from anO
 */
public interface ano_2<T extends anu_1> {
    public Iterator<T> ban();

    default public Iterator<T> l(T t) {
        return this.ban();
    }

    public List<T> a(acd_1 var1);

    public List<T> b(int var1, int var2, int var3);
}

