/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TIntHashSet
 */
import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import com.ankamagames.framework.graphics.engine.transformer.BatchTransformer;
import gnu.trove.set.hash.TIntHashSet;
import java.util.ArrayList;

public class abj {
    static final TIntHashSet cdb = new TIntHashSet();
    public final float cdc = 0.001f;
    public final float cdd = 2.0f;
    public final float cde = 10.0f;
    private float cdf = 0.0f;

    public void a(aaa_0 aaa_02, int n) {
        this.cdf += (float)n;
        ArrayList<aay_0> arrayList = aaa_02.brM();
        for (int i = arrayList.size() - 1; i >= 0; --i) {
            DisplayedScreenElement[] displayedScreenElementArray;
            aay_0 aay_02 = arrayList.get(i);
            if (aay_02 == null || (displayedScreenElementArray = aay_02.brA()) == null) continue;
            for (DisplayedScreenElement displayedScreenElement : displayedScreenElementArray) {
                float f2;
                int n2;
                if (!displayedScreenElement.brn() || !cdb.contains(n2 = displayedScreenElement.brk().bsz().d())) continue;
                float f3 = displayedScreenElement.bcC();
                float f4 = (float)Math.sqrt(f3 * f3 + (f2 = (float)displayedScreenElement.bcD()) * f2) + 2.0f * this.cdf / 1000.0f;
                float f5 = 0.001f * GC.G((float)Math.PI * 2 * f4 / 10.0f);
                if (f5 < 0.0f) {
                    f5 *= 0.2f;
                }
                BatchTransformer batchTransformer = displayedScreenElement.brl().bIS();
                float f6 = batchTransformer.bPu().bQE()[12];
                float f7 = batchTransformer.bPu().bQE()[13];
                batchTransformer.bPu().Y(new float[]{1.0f + f5, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f + f5, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f6, f7, 0.0f, 1.0f});
            }
        }
    }

    static {
        cdb.add(10208);
        cdb.add(11138);
        cdb.add(10036);
        cdb.add(10211);
        cdb.add(17702);
        cdb.add(17704);
        cdb.add(17712);
        cdb.add(17713);
        cdb.add(17755);
        cdb.add(17756);
    }
}

