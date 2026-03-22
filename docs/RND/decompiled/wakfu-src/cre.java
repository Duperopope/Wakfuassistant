/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.nio.ByteBuffer;
import org.jetbrains.annotations.Nullable;

public class cre
extends cqQ {
    private long btF;
    private byte mfU;
    private anp_2 jAm;
    private byte mfV;

    @Override
    public boolean dn(byte[] byArray) {
        if (!this.h(byArray.length, 20, false)) {
            return false;
        }
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.fi(byteBuffer);
        this.btF = byteBuffer.getLong();
        this.mfU = byteBuffer.get();
        this.mfV = byteBuffer.get();
        int n = byArray.length - 22;
        byte[] byArray2 = new byte[n];
        byteBuffer.get(byArray2);
        this.jAm = new anp_2(byArray2);
        return true;
    }

    @Override
    public int d() {
        return 12310;
    }

    public long OO() {
        return this.btF;
    }

    public byte ezz() {
        return this.mfU;
    }

    @Override
    public int avZ() {
        return 0;
    }

    @Override
    public eui_1 eza() {
        return eui_1.rsk;
    }

    public anp_2 bgh() {
        return this.jAm;
    }

    @Nullable
    public euz_1 ezA() {
        return euz_1.SC(this.mfV);
    }
}

