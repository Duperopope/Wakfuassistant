/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bqF
 */
public final class bqf_1
extends Record {
    private final int jaL;
    private final double jaM;
    private final short jaN;
    private final short jaO;
    private final short @NotNull [] jaP;
    private final short @NotNull [] jaQ;
    private final boolean jaR;

    public bqf_1(int n, double d2, short s, short s2, short @NotNull [] sArray, short @NotNull [] sArray2, boolean bl) {
        this.jaL = n;
        this.jaM = d2;
        this.jaN = s;
        this.jaO = s2;
        this.jaP = sArray;
        this.jaQ = sArray2;
        this.jaR = bl;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{bqf_1.class, "itemRefId;dropRate;minLevel;maxLevel;includedInstances;excludedInstances;hasAdditionalCriteria", "jaL", "jaM", "jaN", "jaO", "jaP", "jaQ", "jaR"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{bqf_1.class, "itemRefId;dropRate;minLevel;maxLevel;includedInstances;excludedInstances;hasAdditionalCriteria", "jaL", "jaM", "jaN", "jaO", "jaP", "jaQ", "jaR"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{bqf_1.class, "itemRefId;dropRate;minLevel;maxLevel;includedInstances;excludedInstances;hasAdditionalCriteria", "jaL", "jaM", "jaN", "jaO", "jaP", "jaQ", "jaR"}, this, object);
    }

    public int dEq() {
        return this.jaL;
    }

    public double cYu() {
        return this.jaM;
    }

    public short dEr() {
        return this.jaN;
    }

    public short dEs() {
        return this.jaO;
    }

    public short @NotNull [] dEt() {
        return this.jaP;
    }

    public short @NotNull [] dEu() {
        return this.jaQ;
    }

    public boolean dEv() {
        return this.jaR;
    }
}

