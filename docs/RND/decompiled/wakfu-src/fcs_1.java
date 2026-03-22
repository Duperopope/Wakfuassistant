/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Collection;
import java.util.List;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fCs
 */
public class fcs_1
extends faw_2
implements fzc {
    private static final Logger tYE = Logger.getLogger(fcs_1.class);
    public static final String TAG = "radarChart";
    private ffy_1 tYF;
    public static final int tYG = -1984141319;
    public static final int tYH = -1156593849;
    public static final int tYI = "series".hashCode();

    @Override
    protected void eKZ() {
        super.eKZ();
        this.bVe.g(this.tYF.bnL());
    }

    @Override
    public String getTag() {
        return TAG;
    }

    public int getVertices() {
        return this.tYF.getVertices();
    }

    public void setVertices(int n) {
        this.tYF.setVertices(n);
        this.gtK();
    }

    public List<ftf_1> getSeries() {
        return this.tYF.getSeries();
    }

    public void setSeries(Object object) {
        if (object instanceof ftf_1) {
            this.tYF.S(List.of((ftf_1)object));
            this.gtK();
        } else {
            try {
                this.tYF.S((Collection)object);
                this.gtK();
            }
            catch (ClassCastException classCastException) {
                tYE.error((Object)("Invalid type of radar chart values: expected Collection<" + ftf_1.class.getSimpleName() + "> but got " + object.getClass().getSimpleName()), (Throwable)classCastException);
            }
        }
    }

    @Override
    public void setModulationColor(@Nullable axb_2 axb_22) {
        if (this.tYF != null) {
            this.tYF.setModulationColor(axb_22);
            this.gtK();
        }
    }

    @Override
    @Nullable
    public axb_2 getModulationColor() {
        return this.tYF == null ? null : this.tYF.getModulationColor();
    }

    @Override
    public void grg() {
        super.grg();
        this.gtK();
    }

    @Override
    public boolean LZ(int n) {
        boolean bl = super.LZ(n);
        this.gtK();
        return bl;
    }

    private void gtK() {
        if (this.tYF != null) {
            int n = this.uki.getContentWidth();
            int n2 = this.uki.getContentHeight();
            int n3 = this.uki.getLeftInset();
            int n4 = this.uki.getBottomInset();
            this.tYF.O(n3, n4, n, n2);
        }
    }

    @Override
    public void a(fhi_2 fhi_22) {
        fcs_1 fcs_12 = (fcs_1)fhi_22;
        super.a(fhi_22);
        fcs_12.setVertices(this.getVertices());
        fcs_12.setModulationColor(this.getModulationColor());
        fcs_12.setSeries(this.getSeries());
        fcs_12.setNeedsToPreProcess();
    }

    @Override
    public void aVH() {
        super.aVH();
        this.tYF.aVH();
        this.tYF = null;
    }

    @Override
    public void aVI() {
        super.aVI();
        this.tYF = new ffy_1();
        this.tYF.aVI();
        fys_0 fys_02 = new fys_0();
        fys_02.aVI();
        fys_02.setWidget(this);
        this.d(fys_02);
        fct_2 fct_22 = new fct_2(this);
        fct_22.aVI();
        this.a(fct_22);
        this.setNonBlocking(false);
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        if (n == -1984141319) {
            this.setVertices(Bw.m(string));
        } else if (n == -1156593849) {
            this.setModulationColor(fic_12.vm(string));
        } else {
            return super.setXMLAttribute(n, string, fic_12);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == -1984141319) {
            this.setVertices(Bw.m(object));
        } else if (n == tYI) {
            this.setSeries(object);
        } else if (n == -1156593849) {
            this.setModulationColor((axb_2)object);
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }
}

