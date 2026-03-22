/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.nio.ByteBuffer;
import javax.annotation.Nullable;

/*
 * Renamed from cqv
 */
public class cqv_0
extends cqf {
    private byte[] hvJ;
    private byte[] hvI;
    private long btF;
    private byte ebP;
    private byte mff;
    private tw_0 hvK;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.fg(byteBuffer);
        this.btF = byteBuffer.getLong();
        this.mff = byteBuffer.get();
        this.ebP = byteBuffer.get();
        this.hvJ = new byte[byteBuffer.getShort()];
        byteBuffer.get(this.hvJ);
        this.hvI = new byte[byteBuffer.getInt()];
        byteBuffer.get(this.hvI);
        if (byteBuffer.get() == 1) {
            this.hvK = new tw_0();
            this.hvK.a(Tx.pw(byteBuffer.get()));
            this.hvK.el(byteBuffer.getLong());
            this.hvK.pv(byteBuffer.getInt());
        }
        return true;
    }

    public byte[] eyy() {
        return this.hvJ;
    }

    public byte[] eyz() {
        return this.hvI;
    }

    public long OO() {
        return this.btF;
    }

    public byte bcP() {
        return this.ebP;
    }

    public byte eyA() {
        return this.mff;
    }

    @Nullable
    public tw_0 eyB() {
        return this.hvK;
    }

    @Override
    public int d() {
        return 13419;
    }
}

