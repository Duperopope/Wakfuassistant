/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

public interface fhl {
    public void a(ffS var1, Long var2);

    public void b(ffS var1, Long var2);

    default public void a(ffS ffS2, Long l, @Nullable fib fib2) {
        this.b(ffS2, l);
    }

    public void b(fhk var1);
}

