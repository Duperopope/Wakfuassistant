/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from ang
 */
public abstract class ang_2
extends amx_1 {
    public static final int cJY = 0;
    public static final int cJZ = -1;
    private boolean boW = false;
    protected static final Logger cKa = Logger.getLogger(ang_2.class);

    public ang_2 bDK() {
        if (!this.bDp()) {
            this.boW = !this.boW;
            return this;
        }
        return new amz_2(!this.b(null, null, null, null));
    }

    public abstract boolean bDp();

    public abstract int a(Object var1, Object var2, Object var3, Object var4);

    public boolean b(Object object, Object object2, Object object3, Object object4) {
        boolean bl;
        try {
            boolean bl2 = bl = this.a(object, object2, object3, object4) == 0;
            if (this.boW) {
                return !bl;
            }
        }
        catch (amf_2 amf_22) {
            bl = false;
            cKa.error((Object)("Expected exception on " + this.bDq().name() + " | User : " + String.valueOf(object) + " Target : " + String.valueOf(object2) + " Context : " + String.valueOf(object4)), (Throwable)amf_22);
        }
        catch (RuntimeException runtimeException) {
            bl = false;
            cKa.error((Object)("Unexpected exception on " + this.bDq().name() + " | User : " + String.valueOf(object) + " Target : " + String.valueOf(object2) + " Context : " + String.valueOf(object4)), (Throwable)runtimeException);
        }
        return bl;
    }

    @Override
    public amz_1 bDv() {
        return amz_1.cJz;
    }

    public boolean bDL() {
        return this.boW;
    }
}

