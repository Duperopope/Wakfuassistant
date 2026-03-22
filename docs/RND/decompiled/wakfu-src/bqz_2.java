/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.List;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bqz
 */
public class bqz_2
implements aeh_2 {
    public static final String jal = "itemName";
    public static final String jam = "items";
    public static final String[] jan = new String[]{"itemName", "items"};
    private final int jao;
    private final List<bgv_2> jap;

    public bqz_2(int n) {
        this.jao = n;
        this.jap = bEm.dSb().Gw(n);
    }

    @Override
    @Nullable
    public Object eu(String string) {
        return switch (string) {
            case jal -> bgv_2.Dm(this.jao);
            case jam -> this.jap;
            default -> null;
        };
    }

    @Override
    public String[] bxk() {
        return jan;
    }
}

