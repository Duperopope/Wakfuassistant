/*
 * Decompiled with CFR 0.152.
 */
import java.util.Set;
import java.util.stream.Collectors;

/*
 * Renamed from aEE
 */
public interface aee_1 {
    public void es(String var1);

    public void s(String var1, String var2);

    default public void d(String string, boolean bl) {
        this.s(string, Boolean.toString(bl));
    }

    default public void b(String string, double d2) {
        this.s(string, Double.toString(d2));
    }

    default public void b(String string, float f2) {
        this.s(string, Float.toString(f2));
    }

    default public void k(String string, int n) {
        this.s(string, Integer.toString(n));
    }

    default public void d(String string, long l) {
        this.s(string, Long.toString(l));
    }

    default public void m(String string, String string2) {
        this.s(string, string2);
    }

    default public void a(String string, Set<Short> set) {
        this.s(string, set.stream().map(String::valueOf).collect(Collectors.joining(",")));
    }

    public void t(String var1, String var2);

    default public void w(String string, boolean bl) {
        this.t(string, Boolean.toString(bl));
    }

    default public void c(String string, double d2) {
        this.t(string, Double.toString(d2));
    }

    default public void d(String string, float f2) {
        this.t(string, Float.toString(f2));
    }

    default public void l(String string, int n) {
        this.t(string, Integer.toString(n));
    }

    default public void e(String string, long l) {
        this.t(string, Long.toString(l));
    }

    default public void I(String string, String string2) {
        this.t(string, string2);
    }

    default public void b(String string, Set<Short> set) {
        this.t(string, set.stream().map(String::valueOf).collect(Collectors.joining(",")));
    }
}

