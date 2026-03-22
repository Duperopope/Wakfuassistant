/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL
 *  com.jogamp.opengl.GL2
 *  gnu.trove.procedure.TObjectProcedure
 */
import com.jogamp.opengl.GL;
import com.jogamp.opengl.GL2;
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from awI
 */
final class awi_1
implements TObjectProcedure<awk_1> {
    private static final int dmu = 1000000;
    private GL2 cWv;
    private long cOZ;
    private float dmv;

    awi_1() {
    }

    float bOZ() {
        return this.dmv;
    }

    void i(GL2 gL2) {
        this.cWv = gL2;
        this.cOZ = System.nanoTime();
        this.dmv = 0.0f;
    }

    public boolean e(awk_1 awk_12) {
        if (awk_12 == null || awk_12.bPe()) {
            return true;
        }
        if (awk_12.b((GL)this.cWv)) {
            this.dmv += awk_12.bPi();
            awk_12.dmJ = awl_1.dmO;
        }
        return System.nanoTime() - this.cOZ <= 1000000L;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.e((awk_1)object);
    }
}

