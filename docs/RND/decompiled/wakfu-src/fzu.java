/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Insets;

public abstract class fzu
extends fha_2 {
    private final Insets tFV = new Insets(0, 0, 0, 0);
    public static final int tFW = -2012158909;
    public static final int tFX = -1183792394;

    @Deprecated
    public void setSpacing(Insets insets) {
        this.setInsets(insets);
    }

    @Deprecated
    public Insets getSpacing() {
        return this.getInsets();
    }

    public void setInsets(Insets insets) {
        if (insets == null) {
            return;
        }
        this.tFV.top = insets.top;
        this.tFV.bottom = insets.bottom;
        this.tFV.left = insets.left;
        this.tFV.right = insets.right;
        fzm fzm2 = this.getParentOfType(fzm.class);
        if (fzm2 != null) {
            fzm2.setSpacing(this);
        }
    }

    public Insets getInsets() {
        return this.tFV;
    }

    @Override
    public void a(fhi_2 fhi_22) {
        fzu fzu2 = (fzu)fhi_22;
        super.a(fzu2);
        fzu2.setInsets(this.tFV);
    }

    @Override
    public void aVI() {
        super.aVI();
        this.tFV.set(0, 0, 0, 0);
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

