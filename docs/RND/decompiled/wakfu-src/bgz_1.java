/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.List;
import java.util.function.Consumer;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bGz
 */
public class bgz_1<T extends bDy>
implements aeh_2 {
    public static final String jVT = "inventoryCategories";
    public static final String[] jVU = new String[]{"inventoryCategories"};
    private List<T> hOo;

    public bgz_1(List<T> list) {
        this.hOo = list;
    }

    @Override
    public String[] bxk() {
        return jVU;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        switch (string) {
            case "inventoryCategories": {
                return this.dcb();
            }
        }
        return null;
    }

    public List<T> dcb() {
        return this.hOo;
    }

    public boolean aJG() {
        return this.hOo == null || this.hOo.isEmpty();
    }

    public void X(List<T> list) {
        this.hOo = list;
        fse_1.gFu().a((aef_2)this, jVT);
    }

    public int dTW() {
        int n = 0;
        for (bDy bDy2 : this.hOo) {
            if (bDy2 == null) continue;
            n += bDy2.aVo();
        }
        return n;
    }

    public void f(Consumer<T> consumer) {
        this.hOo.forEach(bDy2 -> {
            if (bDy2 != null) {
                consumer.accept(bDy2);
            }
        });
    }

    public void j(Consumer<fgf_0> consumer) {
        this.hOo.forEach(bDy2 -> {
            if (bDy2 != null) {
                bDy2.j(consumer);
            }
        });
    }
}

