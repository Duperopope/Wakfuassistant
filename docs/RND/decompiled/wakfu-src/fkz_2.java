/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import java.awt.Insets;

/*
 * Renamed from fKz
 */
public abstract class fkz_2
extends fko_1 {
    protected Insets cxn;
    protected boolean uGx;
    public static final int uGy = -2012158909;
    public static final int uGz = -1183792394;

    public Insets getInsets() {
        return this.cxn;
    }

    public void setInsets(Insets insets) {
        this.cxn.set(insets.top, insets.left, insets.bottom, insets.right);
    }

    @Deprecated
    public void setSpacing(Insets insets) {
        this.setInsets(insets);
    }

    @Override
    public abstract Entity getEntity();

    @Override
    public void aVH() {
        super.aVH();
        this.cxn = null;
    }

    @Override
    public void aVI() {
        super.aVI();
        this.cxn = new Insets(0, 0, 0, 0);
    }

    @Override
    public void a(fhi_2 fhi_22) {
        fkz_2 fkz_22 = (fkz_2)fhi_22;
        super.a(fkz_22);
        fkz_22.setInsets(this.cxn);
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        if (n != -2012158909 && n != -1183792394) {
            return super.setXMLAttribute(n, string, fic_12);
        }
        this.setInsets(fic_12.vo(string));
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n != -2012158909 && n != -1183792394) {
            return super.setPropertyAttribute(n, object);
        }
        this.setInsets((Insets)object);
        return true;
    }
}

