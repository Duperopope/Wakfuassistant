/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.MessageLite
 */
import com.google.protobuf.MessageLite;

/*
 * Renamed from cib
 */
public class cib_0
extends nv_0 {
    private byte aYI;
    private short lUq;
    private MessageLite lUr;

    public cib_0(byte by, short s, MessageLite messageLite) {
        this.aYI = by;
        this.lUq = s;
        this.lUr = messageLite;
    }

    @Override
    public byte[] aVX() {
        azg_1 azg_12 = new azg_1();
        azg_12.dH(this.lUr.toByteArray());
        return this.a(this.aYI, azg_12.bTe());
    }

    public void de(byte by) {
        this.aYI = by;
    }

    public void cy(short s) {
        this.lUq = s;
    }

    public void d(MessageLite messageLite) {
        this.lUr = messageLite;
    }

    @Override
    public int d() {
        return this.lUq;
    }
}

