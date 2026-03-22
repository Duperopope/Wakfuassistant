/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from buj
 */
public abstract class buj_0<T>
implements bum_0<T> {
    @NotNull
    private final String joV;

    protected buj_0(@NotNull String string) {
        this.joV = string;
    }

    @Nullable
    protected abstract String am(T var1);

    protected boolean dIQ() {
        return false;
    }

    @Override
    public boolean ah(T t) {
        String string = this.am(t);
        String string2 = this.dIQ() ? BH.aT(string) : string;
        return string2 != null && string2.contains(this.joV);
    }

    @Override
    public boolean isValid() {
        return !this.joV.isEmpty();
    }

    @Override
    public buh_0 dcz() {
        return buh_0.jot;
    }

    @NotNull
    public String dIR() {
        return this.joV;
    }

    @Override
    @Nullable
    public String dCm() {
        return this.joV;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        buj_0 buj_02 = (buj_0)object;
        return Objects.equals(this.joV, buj_02.joV);
    }

    public int hashCode() {
        return Objects.hash(this.joV);
    }
}

