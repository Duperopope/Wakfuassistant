/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.Set;
import org.jetbrains.annotations.NotNull;

public class eKL
implements ekz_0 {
    @NotNull
    private final Set<ekz_0> qDH;

    public eKL(@NotNull Set<ekz_0> set) {
        this.qDH = set;
    }

    @Override
    public void d(@NotNull eKW eKW2) {
        this.qDH.forEach(ekz_02 -> ekz_02.d(eKW2));
    }

    @Override
    public void t(int n, long l) {
        this.qDH.forEach(ekz_02 -> ekz_02.t(n, l));
    }

    @Override
    public void du(int n, int n2) {
        this.qDH.forEach(ekz_02 -> ekz_02.du(n, n2));
    }

    @Override
    public void Ef(int n) {
        this.qDH.forEach(ekz_02 -> ekz_02.Ef(n));
    }
}

