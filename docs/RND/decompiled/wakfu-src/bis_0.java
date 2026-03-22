/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from biS
 */
public class bis_0
implements Comparator<enk_0> {
    public static final bis_0 imT = new bis_0();

    public int a(enk_0 enk_02, enk_0 enk_03) {
        return enk_02.avZ() - enk_03.avZ();
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((enk_0)object, (enk_0)object2);
    }
}

