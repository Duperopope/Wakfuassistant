/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
import java.nio.ByteBuffer;
import lombok.Generated;

public class cph
extends nr_0 {
    private long aDh;
    private int jzC;
    private eIg mdM;
    private boolean mdH = false;
    private eIj jyX;
    private fhk jzA;
    private frd jzG;
    private ehy_0 hOz;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.aDh = byteBuffer.getLong();
        this.jzC = byteBuffer.getInt();
        this.mdM = eIg.eO(byteBuffer.get());
        boolean bl = this.mdH = byteBuffer.get() == 1;
        if (this.mdH) {
            this.jyX = eIl.ez(cph.fe(byteBuffer));
            this.jzA = fhj.eN(cph.fe(byteBuffer));
            this.jzG = fre.gw(ByteBuffer.wrap(cph.fe(byteBuffer)));
            this.hOz = eHN.c(cph.fe(byteBuffer), this.aDh);
        }
        return false;
    }

    private static byte[] fe(ByteBuffer byteBuffer) {
        int n = byteBuffer.getInt();
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        return byArray;
    }

    @Override
    public int d() {
        return 12675;
    }

    @Generated
    public long KU() {
        return this.aDh;
    }

    @Generated
    public int exe() {
        return this.jzC;
    }

    @Generated
    public eIg exf() {
        return this.mdM;
    }

    @Generated
    public boolean ewY() {
        return this.mdH;
    }

    @Generated
    public eIj exg() {
        return this.jyX;
    }

    @Generated
    public fhk dmL() {
        return this.jzA;
    }

    @Generated
    public frd dMT() {
        return this.jzG;
    }

    @Generated
    public ehy_0 dMx() {
        return this.hOz;
    }
}

