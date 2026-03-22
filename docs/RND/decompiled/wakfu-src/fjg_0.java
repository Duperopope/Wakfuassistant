/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from fjG
 */
public class fjg_0
extends fjz_0 {
    private static final Logger szx = Logger.getLogger(fjg_0.class);
    public static final fja_0 szy = new fjh_0();
    private long aDh;

    public fjg_0() {
        super(fjb_0.szk);
    }

    public void db(long l) {
        this.aDh = l;
    }

    @Override
    public void bGy() {
        fjo_0 fjo_02 = this.gbW();
        if (fjo_02 == null) {
            szx.error((Object)("Impossible d'ex\u00e9cuter l'action " + String.valueOf(this) + " : la nation " + this.epQ + " n'existe pas"));
            return;
        }
        fjo_02.mg(this.aDh);
    }

    @Override
    public boolean h(fjm fjm2) {
        return false;
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.aDh);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.aDh = byteBuffer.getLong();
        return true;
    }

    @Override
    public int DN() {
        return 8;
    }

    @Override
    public void clear() {
        this.epQ = -1;
        this.aDh = -1L;
    }
}

