/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Unmodifiable
 */
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Unmodifiable;

public class eKK {
    private static final eKK qDF = new eKK();
    private final Set<eKR> qDG = new HashSet<eKR>();

    public static eKK fyJ() {
        return qDF;
    }

    public void i(eKR eKR2) {
        this.qDG.add(eKR2);
    }

    public boolean QT(int n) {
        return this.qDG.stream().anyMatch(eKR2 -> eKR2.d() == n);
    }

    public boolean j(@NotNull eKR eKR2) {
        return this.QT(eKR2.d());
    }

    @NotNull
    public @Unmodifiable Set<Integer> fyK() {
        return this.qDG.stream().map(eKR::d).collect(Collectors.toUnmodifiableSet());
    }

    @NotNull
    public @Unmodifiable Set<eKR> fyL() {
        return Collections.unmodifiableSet(this.qDG);
    }
}

