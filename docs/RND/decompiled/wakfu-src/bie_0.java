/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from biE
 */
public class bie_0
extends biy_0
implements Comparable<bie_0> {
    public static final String ily = "article";
    public static final String[] ilz = new String[]{"article"};
    public static final String[] ilA = new String[biy_0.ikS.length + ilz.length];
    @Nullable
    private bpt_1<?, ?> ilB;
    private boolean ilC = false;
    private final int ilD;

    protected bie_0(int n) {
        super(bia_0.ila);
        this.ilD = n;
    }

    public bpt_1<?, ?> dqu() {
        if (this.ilB == null && !this.ilC) {
            this.ilC = true;
            bor_0.a(bpt_12 -> {
                this.ilB = bpt_12;
                fse_1.gFu().a((aef_2)this, ily);
            }, "characterSlot");
        }
        return this.ilB;
    }

    @Override
    public String[] bxk() {
        return ilA;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (string.equals(ily)) {
            return this.dqu();
        }
        return super.eu(string);
    }

    public int a(@NotNull bie_0 bie_02) {
        return this.ilD - bie_02.ilD;
    }

    @Override
    public /* synthetic */ int compareTo(@NotNull Object object) {
        return this.a((bie_0)object);
    }

    static {
        System.arraycopy(ilz, 0, ilA, 0, ilz.length);
        System.arraycopy(biy_0.ikS, 0, ilA, ilz.length, biy_0.ikS.length);
    }
}

