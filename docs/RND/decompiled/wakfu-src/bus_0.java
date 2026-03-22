/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bus
 */
public class bus_0
implements aeh_2 {
    public static final String jpn = "furnitureCategoryList";
    private static final String[] jpo = new String[]{"furnitureCategoryList"};
    @NotNull
    private final List<bur_0> jpp = new ArrayList<bur_0>();

    public bus_0() {
    }

    public bus_0(List<bur_0> list) {
        this.jpp.addAll(list);
    }

    @Override
    public String[] bxk() {
        return jpo;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (string.equals(jpn)) {
            return this.jpp;
        }
        return null;
    }

    @NotNull
    public List<bur_0> dIW() {
        return this.jpp;
    }

    public void a(bur_0 bur_02) {
        this.jpp.add(bur_02);
        fse_1.gFu().a((aef_2)this, jpn);
    }

    public void mq(String string) {
        this.jpp.forEach(bur_02 -> bur_02.mq(string));
    }
}

