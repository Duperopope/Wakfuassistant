/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fKv
 */
public abstract class fkv_2
extends fko_1 {
    private boolean tEj = false;
    public static final int uGo = -908189606;

    public boolean isScaled() {
        return this.tEj;
    }

    public void setScaled(boolean bl) {
        this.tEj = bl;
    }

    @Override
    public abstract fkv_1 getMesh();

    @Override
    public void a(fhi_2 fhi_22) {
        fkv_2 fkv_22 = (fkv_2)fhi_22;
        super.a(fkv_22);
        fkv_22.setScaled(this.tEj);
    }

    @Override
    public void aVI() {
        super.aVI();
        this.tEj = false;
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        if (n != -908189606) {
            return super.setXMLAttribute(n, string, fic_12);
        }
        this.setScaled(Bw.aK(string));
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n != -908189606) {
            return super.setPropertyAttribute(n, object);
        }
        this.setScaled(Bw.l(object));
        return true;
    }
}

