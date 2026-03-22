/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from cSS
 */
class css_2
implements Comparator<bgx_0> {
    css_2(csp_1 csp_12) {
    }

    public int a(bgx_0 bgx_02, bgx_0 bgx_03) {
        if (bgx_02 == bgx_03) {
            return 0;
        }
        if (bgx_02 instanceof csv_2) {
            return Integer.MAX_VALUE;
        }
        if (bgx_03 instanceof csv_2) {
            return Integer.MIN_VALUE;
        }
        return bgx_02.dju() - bgx_03.dju();
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((bgx_0)object, (bgx_0)object2);
    }
}

