/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import org.apache.log4j.Logger;

/*
 * Renamed from fKM
 */
public class fkm_1
extends fkz_2
implements fzc {
    private static final Logger uHA = Logger.getLogger(fkm_1.class);
    public static final String TAG = "PlainBorder";
    private final fll_1 uHB = new fll_1();
    public static final int uHC = 94842723;

    @Override
    public void d(fhv_1 fhv_12) {
        if (fhv_12 instanceof fyp_0) {
            fhv_12.a(fzq_0.tJt, new fkn_1(this), false);
            this.setColor((fyp_0)fhv_12);
            this.a((fyp_0)fhv_12);
        }
        super.d(fhv_12);
    }

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public boolean isValidAdd(fhi_2 fhi_22) {
        if (fhi_22 instanceof fyp_0 && ((fyp_0)fhi_22).getColor() == null) {
            uHA.error((Object)"Tentative d'ajout d'un ColorElement sans couleur");
            return false;
        }
        return super.isValidAdd(fhi_22);
    }

    @Override
    public fll_1 getMesh() {
        return this.uHB;
    }

    @Override
    public Entity getEntity() {
        return this.uHB.getEntity();
    }

    public void setColor(fyp_0 fyp_02) {
        this.setColor(fyp_02.getColor());
    }

    public void setColor(axb_2 axb_22) {
        this.uHB.D(axb_22);
    }

    public axb_2 getColor() {
        return this.uHB.gDr();
    }

    @Override
    public void setModulationColor(axb_2 axb_22) {
        this.uHB.E(axb_22);
    }

    @Override
    public axb_2 getModulationColor() {
        return this.uHB.gDs();
    }

    protected void a(fyp_0 fyp_02) {
        if (this.uxK == null) {
            return;
        }
        for (int i = this.uxK.size() - 1; i >= 0; --i) {
            fhv_1 fhv_12 = (fhv_1)this.uxK.get(i);
            if (!(fhv_12 instanceof fyp_0)) continue;
            this.m(fhv_12);
        }
    }

    @Override
    public void a(fhi_2 fhi_22) {
        super.a(fhi_22);
        fkm_1 fkm_12 = (fkm_1)fhi_22;
        fkm_12.setColor(this.uHB.gDr());
        fkm_12.setModulationColor(this.getModulationColor());
    }

    @Override
    public void aVH() {
        super.aVH();
        this.uHB.aVH();
    }

    @Override
    public void aVI() {
        super.aVI();
        this.uHB.aVI();
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        if (n != 94842723) {
            return super.setXMLAttribute(n, string, fic_12);
        }
        this.setColor(fic_12.vm(string));
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == 94842723) {
            if (object != null) {
                this.setColor((axb_2)object);
            }
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }
}

