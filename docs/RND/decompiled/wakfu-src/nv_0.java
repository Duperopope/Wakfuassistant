/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.Unpooled
 */
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

/*
 * Renamed from Nv
 */
public abstract class nv_0
extends Nn
implements aai_2 {
    public static final int aYA = 7;

    public byte[] a(byte by, byte[] byArray) {
        int n = 7 + byArray.length;
        ByteBuf byteBuf = Unpooled.buffer((int)n);
        byteBuf.writeInt(n);
        byteBuf.writeByte((int)by);
        byteBuf.writeShort(this.d());
        byteBuf.writeBytes(byArray);
        return byteBuf.array();
    }
}

