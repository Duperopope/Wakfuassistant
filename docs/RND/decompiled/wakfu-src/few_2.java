/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from fEW
 */
public class few_2
extends feq_2 {
    public static final String TAG = "tintIntensityColorPicker";
    public static final String uod = "tintColorPicker";
    public static final String uoe = "intensityColorPicker";
    private fer_2 uof;
    fer_2 uog;
    private int uoh = 8;
    private float uoi = 0.3f;
    private float uoj = 1.0f;
    private fis_1 uok;
    public static final int uol = "colors".hashCode();
    public static final int uom = 1162213606;
    public static final int uon = -449540607;
    public static final int uoo = -923966673;

    @Override
    public void a(String string, fes_2 fes_22) {
        super.a(string, fes_22);
        if (string.equals(uod)) {
            this.uof = (fer_2)fes_22;
            this.unS = true;
            this.setNeedsToPreProcess();
        } else if (string.equals(uoe)) {
            this.uog = (fer_2)fes_22;
            this.unS = true;
            this.setNeedsToPreProcess();
        }
    }

    public int getNumVariation() {
        return this.uoh;
    }

    public void setNumVariation(int n) {
        this.uoh = n;
    }

    public float getMinIntensity() {
        return this.uoi;
    }

    public void setMinIntensity(float f2) {
        this.uoi = f2;
    }

    public float getMaxIntensity() {
        return this.uoj;
    }

    public void setMaxIntensity(float f2) {
        this.uoj = f2;
    }

    void x(axb_2 axb_22) {
        if (this.uog == null) {
            return;
        }
        ArrayList<axb_2> arrayList = new ArrayList<axb_2>(this.uoh);
        for (int i = 0; i < this.uoh; ++i) {
            awx_2 awx_22 = new awx_2(axb_22);
            float f2 = this.uoi + (float)i * (this.uoj - this.uoi) / (float)(this.uoh - 1);
            awx_22.S(f2);
            arrayList.add(awx_22);
        }
        this.uog.setColors(arrayList);
    }

    @Override
    protected void gvx() {
        this.uof.setColors(this.dpf);
        if (this.dpf == null || this.dpf.size() == 0) {
            return;
        }
        this.x((axb_2)this.dpf.get(0));
    }

    private void gvy() {
        this.uok = new fex_1(this);
        this.a(fzq_0.tJB, this.uok, true);
    }

    @Override
    public void aVH() {
        super.aVH();
        this.uof = null;
        this.uog = null;
        this.uok = null;
    }

    @Override
    public void aVI() {
        super.aVI();
        frz_2 frz_22 = (frz_2)this.getLayoutManager();
        frz_22.setHorizontal(false);
        this.uoh = 8;
        this.uoi = 0.3f;
        this.uoj = 1.0f;
        this.gvy();
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        if (n == 1162213606) {
            this.setNumVariation(Bw.m(string));
        } else if (n == -923966673) {
            this.setMaxIntensity(Bw.o(string));
        } else if (n == -449540607) {
            this.setMinIntensity(Bw.o(string));
        } else {
            return super.setXMLAttribute(n, string, fic_12);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == uol) {
            this.setColors((ArrayList)object);
        } else if (n == 1162213606) {
            this.setNumVariation(Bw.m(object));
        } else if (n == -923966673) {
            this.setMaxIntensity(Bw.o(object));
        } else if (n == -449540607) {
            this.setMinIntensity(Bw.o(object));
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }
}

