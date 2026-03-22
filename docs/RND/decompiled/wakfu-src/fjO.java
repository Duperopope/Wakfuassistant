/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class fjO
extends fjz_0 {
    public static final byte szN = 1;
    public static final byte szO = 2;
    private static final Logger szP = Logger.getLogger(fjO.class);
    public static final fja_0 szQ = new fjP();
    private byte szR;
    private long aDh;
    private byte szS;

    public fjO() {
        super(fjb_0.szj);
    }

    public void gS(byte by) {
        this.szR = by;
    }

    public void db(long l) {
        this.aDh = l;
    }

    public void d(fkK fkK2) {
        this.szS = fkK2.aJr();
    }

    @Override
    public void bGy() {
        fjo_0 fjo_02 = this.gbW();
        if (fjo_02 == null) {
            szP.error((Object)("Impossible d'ex\u00e9cuter l'action " + String.valueOf(this) + " : la nation " + this.epQ + " n'existe pas"));
            return;
        }
        if (this.szR == 1) {
            fjo_02.a(this.aDh, fkK.gU(this.szS));
        } else if (this.szR == 2) {
            fjo_02.b(this.aDh, fkK.gU(this.szS));
        }
    }

    @Override
    public boolean h(fjm fjm2) {
        return false;
    }

    @Override
    public boolean aF(ByteBuffer byteBuffer) {
        byteBuffer.put(this.szR);
        byteBuffer.putLong(this.aDh);
        byteBuffer.put(this.szS);
        return true;
    }

    @Override
    public boolean aG(ByteBuffer byteBuffer) {
        this.szR = byteBuffer.get();
        this.aDh = byteBuffer.getLong();
        this.szS = byteBuffer.get();
        return true;
    }

    @Override
    public int DN() {
        return 10;
    }

    @Override
    public void clear() {
        this.epQ = -1;
        this.szR = (byte)-1;
        this.aDh = -1L;
        this.szS = (byte)-1;
    }
}

