/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * Renamed from fSE
 */
public class fse_2
extends fsr_2<Float> {
    private static final Set<Class> vey = Set.of(frx_1.class, fkd_1.class, fze.class);
    private final Map<fzc, Bu<Float, Float>> vez = new HashMap<fzc, Bu<Float, Float>>();
    private boolean ncw = true;

    public fse_2(float f2, float f3, fes_2 fes_22, int n, int n2, int n3, abn abn2) {
        this.bl(Float.valueOf(f2));
        this.bm(Float.valueOf(f3));
        this.a(fes_22);
        this.sO(n);
        this.setDuration(n2);
        this.acd(n3);
        this.setEasing(abn2);
    }

    @Override
    public boolean Ma(int n) {
        if (!super.Ma(n)) {
            return false;
        }
        if (this.tXJ == null) {
            return true;
        }
        if (this.ncw) {
            boolean bl = ((Float)this.vec).floatValue() > ((Float)this.veb).floatValue();
            ((fhv_1)this.ved).a(fhv_12 -> {
                if (fhv_12 instanceof fzc) {
                    float f2;
                    fzc fzc2 = (fzc)((Object)fhv_12);
                    axb_2 axb_22 = fzc2.getMinModulationColor();
                    axb_2 axb_23 = fzc2.getMaxModulationColor();
                    float f3 = axb_22 == null ? 0.0f : axb_22.aIX();
                    float f4 = f2 = axb_23 == null ? 1.0f : axb_23.aIX();
                    if (bl) {
                        this.vez.put(fzc2, new Bu<Float, Float>(Float.valueOf(Math.max(f3, ((Float)this.veb).floatValue())), Float.valueOf(Math.min(f2, ((Float)this.vec).floatValue()))));
                    } else {
                        this.vez.put(fzc2, new Bu<Float, Float>(Float.valueOf(Math.min(f2, ((Float)this.veb).floatValue())), Float.valueOf(Math.max(f3, ((Float)this.vec).floatValue()))));
                    }
                }
            }, vey);
            this.ncw = false;
        }
        this.gc(this.bUi);
        return true;
    }

    @Override
    public void cbz() {
        this.gc(this.bMn);
        super.cbz();
    }

    private void gc(float f2) {
        Bu<Float, Float> bu = new Bu<Float, Float>((Float)this.veb, (Float)this.vec);
        ((fhv_1)this.ved).a(fhv_12 -> {
            if (fhv_12 instanceof fzc) {
                fzc fzc2 = (fzc)((Object)fhv_12);
                Bu<Float, Float> bu2 = this.vez.getOrDefault(fzc2, bu);
                float f3 = this.tXJ.h(bu2.getFirst().floatValue(), bu2.aHI().floatValue(), f2, this.bMn);
                axb_2 axb_22 = fzc2.getModulationColor();
                if (axb_22 == null) {
                    axb_22 = awx_2.dnF;
                }
                awx_2 awx_22 = new awx_2(axb_22.aIU(), axb_22.aIV(), axb_22.aIW(), f3);
                fzc2.setModulationColor(awx_22);
            }
        }, vey);
    }

    public String toString() {
        return "[TransparencyTween] " + String.valueOf(this.veb) + " -> " + String.valueOf(this.vec);
    }
}

