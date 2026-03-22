/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from buo
 */
public abstract class buo_0<T>
implements bug_0<T> {
    @NotNull
    private final String jpc;

    protected buo_0(@NotNull String string) {
        this.jpc = string;
    }

    protected abstract @NotNull List<@Nullable String> aj(T var1);

    protected boolean dIQ() {
        return false;
    }

    @Override
    public boolean ah(T t) {
        List<String> list = this.aj(t);
        boolean bl = this.dIQ();
        for (String string : list) {
            String string2 = bl ? BH.aT(string) : string;
            if (string2 == null || !string2.contains(this.jpc)) continue;
            return true;
        }
        return false;
    }

    @Override
    public boolean isValid() {
        return !this.jpc.isEmpty();
    }

    @Override
    public buh_0 dcz() {
        return buh_0.jot;
    }

    @NotNull
    public String dIR() {
        return this.jpc;
    }
}

