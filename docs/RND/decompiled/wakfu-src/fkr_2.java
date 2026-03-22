/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;

/*
 * Renamed from fKR
 */
public class fkr_2
extends fkv_2 {
    public static final String TAG = "SwitchingPlainBackground";
    private final fln_1 uHE = new fln_1();
    public static final int uHF = -1992012396;

    @Override
    public void d(fhv_1 fhv_12) {
        if (fhv_12 instanceof fyp_0) {
            this.uHE.F(((fyp_0)fhv_12).getColor());
        }
        super.d(fhv_12);
    }

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public fkv_1 getMesh() {
        return this.uHE;
    }

    @Override
    public Entity getEntity() {
        return null;
    }

    public int getDuration() {
        return this.uHE.getDuration();
    }

    public void setDuration(int n) {
        this.uHE.setDuration(n);
    }

    @Override
    public void a(fhi_2 fhi_22) {
        super.a(fhi_22);
        fkr_2 fkr_22 = (fkr_2)fhi_22;
        fkr_22.setDuration(this.getDuration());
    }

    @Override
    public void aVH() {
        super.aVH();
        this.uHE.aVH();
    }

    @Override
    public void aVI() {
        super.aVI();
        this.uHE.aVI();
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        if (n != -1992012396) {
            return super.setXMLAttribute(n, string, fic_12);
        }
        this.setDuration(Bw.m(string));
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n != -1992012396) {
            return super.setPropertyAttribute(n, object);
        }
        this.setDuration(Bw.m(object));
        return true;
    }
}

