/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class fdJ
extends Record {
    @NotNull
    private final ftj_0 rXv;
    @NotNull
    private final Optional<ang_2> rXw;
    @NotNull
    private final Optional<ang_2> rXx;
    private static final Logger rXy = LoggerFactory.getLogger(fdJ.class);

    public fdJ(@NotNull ftj_0 ftj_02, @NotNull Optional<ang_2> optional, @NotNull Optional<ang_2> optional2) {
        this.rXv = ftj_02;
        this.rXw = optional;
        this.rXx = optional2;
    }

    public static fdJ a(@NotNull ftj_0 ftj_02) {
        return new fdJ(ftj_02, Optional.empty(), Optional.empty());
    }

    public static fdJ a(@NotNull ftj_0 ftj_02, @Nullable String string, @Nullable String string2, int n) {
        ang_2 ang_22 = null;
        try {
            ang_22 = ehu_0.rY(string);
        }
        catch (Exception exception) {
            rXy.error(String.format("Unable to parse visibility criterion for following parameter %s and biome %s", n, ftj_02.cZa()), (Throwable)exception);
        }
        ang_2 ang_23 = null;
        try {
            ang_23 = ehu_0.rY(string2);
        }
        catch (Exception exception) {
            rXy.error(String.format("Unable to parse activation criterion for following parameter %s and biome %s", n, ftj_02.cZa()), (Throwable)exception);
        }
        return fdJ.a(ftj_02, ang_22, ang_23);
    }

    public static fdJ a(@NotNull ftj_0 ftj_02, @Nullable ang_2 ang_22, @Nullable ang_2 ang_23) {
        return new fdJ(ftj_02, Optional.ofNullable(ang_22), Optional.ofNullable(ang_23));
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{fdJ.class, "biomeDefinition;visibilityCriterion;activationCriterion", "rXv", "rXw", "rXx"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{fdJ.class, "biomeDefinition;visibilityCriterion;activationCriterion", "rXv", "rXw", "rXx"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{fdJ.class, "biomeDefinition;visibilityCriterion;activationCriterion", "rXv", "rXw", "rXx"}, this, object);
    }

    @NotNull
    public ftj_0 fTU() {
        return this.rXv;
    }

    @NotNull
    public Optional<ang_2> fTV() {
        return this.rXw;
    }

    @NotNull
    public Optional<ang_2> fTW() {
        return this.rXx;
    }
}

