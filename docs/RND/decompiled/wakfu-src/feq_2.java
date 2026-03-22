/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from fEQ
 */
public abstract class feq_2
extends faw_2 {
    private static final Logger unR = Logger.getLogger(feq_2.class);
    protected ArrayList<axb_2> dpf;
    protected boolean unS = false;
    public static final int unT = "colors".hashCode();

    public void setColors(ArrayList<axb_2> arrayList) {
        if (this.dpf == arrayList) {
            return;
        }
        this.dpf = arrayList;
        this.unS = true;
        this.setNeedsToPreProcess();
    }

    protected abstract void gvx();

    @Override
    public boolean LZ(int n) {
        boolean bl = super.LZ(n);
        if (this.unS) {
            this.gvx();
            this.unS = false;
        }
        return bl;
    }

    @Override
    public void aVH() {
        super.aVH();
        this.setColors(null);
    }

    @Override
    public void aVI() {
        super.aVI();
        this.unS = false;
        this.dpf = new ArrayList();
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n != unT) {
            return super.setPropertyAttribute(n, object);
        }
        this.setColors((ArrayList)object);
        return true;
    }
}

