/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.Comparator;
import org.apache.log4j.Logger;

/*
 * Renamed from aaZ
 */
abstract class aaz_0<M extends abm>
implements Comparator<M> {
    private static final Logger ccO = Logger.getLogger(aaz_0.class);
    private float ccG;
    private float ccH;

    aaz_0() {
    }

    public final void aE(float f2, float f3) {
        this.ccG = f2;
        this.ccH = f3;
    }

    public final int a(M m, M m2) {
        float f2;
        aaq_0 aaq_02 = this.a(m);
        aaq_0 aaq_03 = this.a(m2);
        float f3 = aaz_0.a(aaq_02, this.ccG, this.ccH);
        if (f3 == (f2 = aaz_0.a(aaq_03, this.ccG, this.ccH))) {
            return 0;
        }
        return f3 < f2 ? 1 : -1;
    }

    private static float a(aaq_0 aaq_02, float f2, float f3) {
        if (aaq_02 == null) {
            return Float.POSITIVE_INFINITY;
        }
        float f4 = (float)aaq_02.bsM() - f2;
        float f5 = (float)aaq_02.bsN() - f3;
        return f4 * f4 + f5 * f5;
    }

    protected abstract aaq_0 a(M var1);

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((abm)object, (abm)object2);
    }
}

