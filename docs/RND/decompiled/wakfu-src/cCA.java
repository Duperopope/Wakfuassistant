/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

public class cCA {
    public int o;
    public String p;

    public void a(@NotNull apl_1 apl_12) {
        this.o = apl_12.aIA();
        this.p = apl_12.aIC();
    }

    public void b(@NotNull fs_0 fs_02) {
        fs_02.mz(this.o);
        fs_02.bo(this.p);
    }

    public void F(@NotNull apl_1 apl_12) {
        this.a(apl_12);
    }

    public void r(@NotNull fs_0 fs_02) {
        this.b(fs_02);
    }

    public String toString() {
        return this.p + " (id=" + this.o + ")";
    }
}

