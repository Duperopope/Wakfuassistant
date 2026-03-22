/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class fjY
extends fjz_0 {
    private static final Logger sAc = Logger.getLogger(fjY.class);
    public static final fja_0 sAd = new fjZ();
    private long aDh;

    public fjY() {
        super(fjb_0.szl);
    }

    public void db(long l) {
        this.aDh = l;
    }

    @Override
    public void bGy() {
        fjo_0 fjo_02 = this.gbW();
        if (fjo_02 == null) {
            sAc.error((Object)("Impossible d'ex\u00e9cuter l'action " + String.valueOf(this) + " : la nation " + this.epQ + " n'existe pas"));
            return;
        }
        fjo_02.mh(this.aDh);
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

