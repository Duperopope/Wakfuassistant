/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bsz
 */
public class bsz_1
implements aeh_2 {
    public static final String jhi = "character";
    public static final String jhj = "currenciesView";
    public static final String[] jhk = new String[]{"character", "currenciesView"};
    private final bhJ jhl;
    private final List<bsy_0> jhm = new ArrayList<bsy_0>();

    public bsz_1(bhJ bhJ2, List<bsy_0> list) {
        this.jhl = bhJ2;
        this.jhm.addAll(list);
    }

    @Override
    public String[] bxk() {
        return jhk;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        switch (string) {
            case "character": {
                return this.jhl;
            }
            case "currenciesView": {
                return this.jhm;
            }
        }
        return null;
    }
}

