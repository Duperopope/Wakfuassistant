/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from adb
 */
public abstract class adb_0 {
    protected short ccg;
    protected short cch;

    public adb_0() {
        this(0, 0);
    }

    public adb_0(short s, short s2) {
        this.ccg = s;
        this.cch = s2;
    }

    public final short bun() {
        return this.ccg;
    }

    public final short buo() {
        return this.cch;
    }

    public final void u(short s, short s2) {
        this.ccg = s;
        this.cch = s2;
    }

    public final boolean bs(int n, int n2) {
        int n3 = this.ccg * 18;
        int n4 = this.cch * 18;
        return n >= n3 && n < n3 + 18 && n2 >= n4 && n2 < n4 + 18;
    }

    public abstract void clear();

    public void a(@NotNull apl_1 apl_12) {
        this.ccg = apl_12.aIz();
        this.cch = apl_12.aIz();
    }

    public void b(@NotNull fs_0 fs_02) {
        fs_02.k(this.ccg);
        fs_02.k(this.cch);
    }

    public final int rM(int n) {
        assert (n >= 0 && n < 18);
        return n + this.ccg * 18;
    }

    public final int rN(int n) {
        assert (n >= 0 && n < 18);
        return n + this.cch * 18;
    }
}

