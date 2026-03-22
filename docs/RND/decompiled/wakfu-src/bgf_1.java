/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bGf
 */
public interface bgf_1 {
    public boolean a(@Nullable bgt_0 var1, @Nullable fhc_0 var2);

    default public boolean c(@Nullable bgt_0 bgt_02, @Nullable ffV ffV2) {
        return this.a(bgt_02, ffV2 != null ? ffV2.dOg() : null);
    }
}

