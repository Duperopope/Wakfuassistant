/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from Ux
 */
public interface ux_0
extends Comparable<ux_0> {
    public String toString();

    public boolean bjv();

    public String bjM();

    public boolean g(@NotNull ux_0 var1);

    public boolean h(@NotNull ux_0 var1);

    public boolean i(@NotNull ux_0 var1);

    public boolean j(@NotNull ux_0 var1);

    public int k(@NotNull ux_0 var1);

    public uz_0 l(ux_0 var1);

    public ux_0 a(ux_0 var1, ua_0 var2);

    public ux_0 a(ux_0 var1, ua_0 var2, boolean var3);

    public long bjB();

    public Date bjC();

    public long bjz();

    public long bjA();

    public int bjD();

    public int bjE();

    public int bjF();

    public int bjG();

    public int bjH();

    public int bjI();

    public int bjJ();

    public void bjt();

    @NotNull
    default public ux_0 pM(int n) {
        return this.a(TimeUnit.MINUTES, n);
    }

    @NotNull
    default public ux_0 pN(int n) {
        return this.b(TimeUnit.MINUTES, n);
    }

    @NotNull
    default public ux_0 pO(int n) {
        return this.a(TimeUnit.DAYS, n);
    }

    @NotNull
    default public ux_0 pP(int n) {
        return this.b(TimeUnit.DAYS, n);
    }

    @NotNull
    public ux_0 a(@NotNull TimeUnit var1, int var2);

    @NotNull
    public ux_0 b(@NotNull TimeUnit var1, int var2);

    @NotNull
    default public ux_0 bjN() {
        return this.pO(1);
    }

    @NotNull
    default public ux_0 bjO() {
        return this.pP(1);
    }

    public ux_0 bjL();

    @Override
    default public /* synthetic */ int compareTo(@NotNull Object object) {
        return this.k((ux_0)object);
    }
}

