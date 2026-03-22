/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Objects
 */
import com.google.common.base.Objects;
import java.io.Serializable;
import java.util.Map;

public class Bu<F, S>
implements Serializable {
    private static final long aum = -8480619990108172965L;
    private final F aun;
    private final S auo;

    public Bu(F f2, S s) {
        this.aun = f2;
        this.auo = s;
    }

    public Bu(Map.Entry<F, S> entry) {
        this(entry.getKey(), entry.getValue());
    }

    public F getFirst() {
        return this.aun;
    }

    public S aHI() {
        return this.auo;
    }

    public static <F, S> Bu<F, S> a(F f2, S s) {
        return new Bu<F, S>(f2, s);
    }

    public static <F, S> Bu<F, S> a(Map.Entry<F, S> entry) {
        return new Bu<F, S>(entry);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        Bu bu = (Bu)object;
        return Objects.equal(this.aun, bu.aun) && Objects.equal(this.auo, bu.auo);
    }

    public int hashCode() {
        return Objects.hashCode((Object[])new Object[]{this.aun, this.auo});
    }

    public String toString() {
        return "ObjectPair{m_first=" + String.valueOf(this.aun) + ", m_second=" + String.valueOf(this.auo) + "}";
    }
}

