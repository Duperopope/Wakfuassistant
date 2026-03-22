/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;

/*
 * Renamed from cIc
 */
public class cic_2
extends fko_1 {
    public static final String TAG = "timePointBarDecorator";
    public static final String ncF = "link";
    public static final String ncG = "doubleBubble";
    public static final String ncH = "borderBubble";
    public static final String ncI = "oppositeBorderBubble";
    private cid_1 ncJ;

    @Override
    public void d(fhv_1 fhv_12) {
        super.d(fhv_12);
        if (fhv_12 instanceof fze) {
            fze fze2 = (fze)fhv_12;
            String string = fze2.getName();
            if (ncF.equals(string)) {
                this.ncJ.c(fze2.getPixmap());
            } else if (ncG.equals(string)) {
                this.ncJ.d(fze2.getPixmap());
            } else if (ncH.equals(string)) {
                this.ncJ.b(fze2.getPixmap());
            } else if (ncI.equals(string)) {
                this.ncJ.e(fze2.getPixmap());
            }
        }
    }

    public void setPixelSeparations(int[] nArray, int[] nArray2, float[] fArray) {
        this.ncJ.setPixelSeparations(nArray, nArray2, fArray);
    }

    public int[] getPixelSeparations() {
        return this.ncJ.getPixelSeparations();
    }

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public cid_1 getMesh() {
        return this.ncJ;
    }

    @Override
    public Entity getEntity() {
        return this.ncJ.getEntity();
    }

    @Override
    public void aVI() {
        super.aVI();
        this.ncJ = new cid_1();
        this.ncJ.aVI();
    }

    @Override
    public void aVH() {
        super.aVH();
        this.ncJ = null;
    }
}

