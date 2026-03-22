/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
import java.nio.ByteBuffer;
import lombok.Generated;

public class cpf
extends nr_0 {
    private long aDh;
    private byte lWh;
    private short jzf;
    private int jzg;
    private boolean mdH = false;
    private fhk mdI;
    private frd mdJ;
    private ehy_0 mdK;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.aDh = byteBuffer.getLong();
        this.lWh = byteBuffer.get();
        this.jzf = byteBuffer.getShort();
        this.jzg = byteBuffer.getInt();
        boolean bl = this.mdH = byteBuffer.get() == 1;
        if (this.mdH) {
            this.mdI = fhj.eN(cpf.fe(byteBuffer));
            this.mdJ = fre.gw(ByteBuffer.wrap(cpf.fe(byteBuffer)));
            this.mdK = eHN.c(cpf.fe(byteBuffer), this.aDh);
        }
        return true;
    }

    private static byte[] fe(ByteBuffer byteBuffer) {
        int n = byteBuffer.getInt();
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        return byArray;
    }

    @Override
    public int d() {
        return 13956;
    }

    @Generated
    public long KU() {
        return this.aDh;
    }

    @Generated
    public byte evu() {
        return this.lWh;
    }

    @Generated
    public short ewW() {
        return this.jzf;
    }

    @Generated
    public int ewX() {
        return this.jzg;
    }

    @Generated
    public boolean ewY() {
        return this.mdH;
    }

    @Generated
    public fhk ewZ() {
        return this.mdI;
    }

    @Generated
    public frd exa() {
        return this.mdJ;
    }

    @Generated
    public ehy_0 exb() {
        return this.mdK;
    }
}

