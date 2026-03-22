/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import org.apache.log4j.Logger;

/*
 * Renamed from fKK
 */
public class fkk_1
extends fkv_2
implements fzc {
    private static final Logger uHw = Logger.getLogger(fkk_1.class);
    public static final String TAG = "PlainBackground";
    private flk_1 uHx;
    public static final int uHy = 94842723;

    @Override
    public void e(fhv_1 fhv_12) {
        super.e(fhv_12);
    }

    @Override
    public void d(fhv_1 fhv_12) {
        if (fhv_12 instanceof fyp_0) {
            fhv_12.a(fzq_0.tJt, new fkl_1(this), false);
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
    public void a(fhi_2 fhi_22) {
        fkk_1 fkk_12 = (fkk_1)fhi_22;
        fkk_12.setColor(this.getColor());
        super.a(fhi_22);
    }

    public void setColor(fyp_0 fyp_02) {
        this.setColor(fyp_02.getColor());
    }

    public void setColor(axb_2 axb_22) {
        if (axb_22 != null) {
            this.getMesh().setColor(axb_22);
        }
    }

    public axb_2 getColor() {
        return this.getMesh().gDp();
    }

    @Override
    public flk_1 getMesh() {
        return this.uHx;
    }

    @Override
    public Entity getEntity() {
        return this.getMesh().gDq();
    }

    @Override
    public boolean isValidAdd(fhi_2 fhi_22) {
        if (fhi_22 instanceof fyp_0 && ((fyp_0)fhi_22).getColor() == null) {
            uHw.error((Object)"Tentative d'ajout d'un ColorElement sans couleur");
            return false;
        }
        return super.isValidAdd(fhi_22);
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
    public void aVI() {
        super.aVI();
        this.uHx = new flk_1();
        this.uHx.aVI();
    }

    @Override
    public void aVH() {
        super.aVH();
        this.uHx.aVH();
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
        if (n != 94842723) {
            return super.setPropertyAttribute(n, object);
        }
        this.setColor((axb_2)object);
        return true;
    }

    @Override
    public void setModulationColor(axb_2 axb_22) {
        this.uHx.setModulationColor(axb_22);
    }

    @Override
    public axb_2 getModulationColor() {
        return this.uHx.getModulationColor();
    }
}

