/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from fAA
 */
public class faa_1
extends fbt_1 {
    public static final String TAG = "AnimatedImage";
    final ArrayList<fze> tOR = new ArrayList();
    private long elm = 1000L;
    int crT;
    private Runnable bIf;
    public static final int tOS = 95467907;

    @Override
    public void d(fhv_1 fhv_12) {
        if (fhv_12 instanceof fze) {
            this.i((fze)fhv_12);
            return;
        }
        super.d(fhv_12);
    }

    private void i(fze fze2) {
        if (!this.tOR.contains(fze2)) {
            this.tOR.add(fze2);
        }
        if (this.tOR.size() == 1) {
            this.setPixmap(fze2);
        } else if (this.tOR.size() == 2) {
            this.gsu();
        }
    }

    private void gsu() {
        this.bIf = new fab_2(this);
        abg_2.bUP().a(this.bIf, this.elm, -1);
    }

    public void setDelay(long l) {
        this.elm = l;
    }

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public void aVH() {
        abg_2.bUP().h(this.bIf);
        this.tOR.clear();
        super.aVH();
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        if (n != 95467907) {
            return super.setXMLAttribute(n, string, fic_12);
        }
        this.setDelay(Bw.p(string));
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        return super.setPropertyAttribute(n, object);
    }
}

