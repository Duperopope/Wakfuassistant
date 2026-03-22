/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class fjS
extends fjz_0 {
    private static final Logger szW = Logger.getLogger(fjS.class);
    public static final fja_0 szX = new fjt_0();
    private int epK;

    public fjS() {
        super(fjb_0.szc);
    }

    public void Ck(int n) {
        this.epK = n;
    }

    @Override
    public void bGy() {
        fjo_0 fjo_02 = this.gbW();
        if (fjo_02 == null) {
            szW.error((Object)("Impossible d'ex\u00e9cuter l'action " + String.valueOf(this) + " : la nation " + this.epQ + " n'existe pas"));
            return;
        }
        fjo_02.Jk(this.epK);
    }

    @Override
    public boolean h(fjm fjm2) {
        return false;
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.epK);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.epK = byteBuffer.getInt();
        return true;
    }

    @Override
    public int DN() {
        return 4;
    }

    @Override
    public void clear() {
        this.epQ = -1;
        this.epK = -1;
    }
}

