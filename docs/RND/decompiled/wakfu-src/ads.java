/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

public class ads {
    public int o;
    public short cjC;
    public String cjD;
    public ang_2 bfe;

    public ads() {
    }

    public ads(int n, short s, String string) {
        this.o = n;
        this.cjC = s;
        this.cjD = string;
    }

    public void a(@NotNull apl_1 apl_12) {
        this.o = apl_12.aIA();
        this.cjC = apl_12.aIz();
        this.cjD = apl_12.aIC();
    }

    public void b(@NotNull fs_0 fs_02) {
        fs_02.mz(this.o);
        fs_02.k(this.cjC);
        fs_02.bo(this.cjD);
    }
}

