/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from fom
 */
class fom_0
implements fnt_0 {
    private static final Logger sLe = Logger.getLogger(fom_0.class);
    private long sLf;

    fom_0() {
    }

    fom_0(ux_0 ux_02) {
        this.sLf = ux_02.bjB();
    }

    @Override
    public byte[] apI() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(8);
        byteBuffer.putLong(this.sLf);
        return byteBuffer.array();
    }

    @Override
    public void eM(ByteBuffer byteBuffer) {
        this.sLf = byteBuffer.getLong();
    }

    @Override
    public void a(fnm_0 fnm_02) {
        try {
            if (this.sLf > 0L) {
                fnm_02.af(uw_0.fn(this.sLf));
            } else {
                fnm_02.geV();
            }
        }
        catch (foD foD2) {
            sLe.error((Object)"Impossible de changer la date de sommeil du familier", (Throwable)foD2);
        }
    }

    @Override
    public fnw_0 gfg() {
        return fnw_0.sKT;
    }

    public String toString() {
        return "PetSleepDateChange{m_sleepDate=" + this.sLf + "}";
    }
}

