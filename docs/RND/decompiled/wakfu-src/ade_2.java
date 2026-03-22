/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
import io.netty.buffer.ByteBuf;
import java.nio.ByteBuffer;

/*
 * Renamed from aDe
 */
final class ade_2
extends adc_2 {
    @Override
    public ByteBuffer a(ByteBuf byteBuf) {
        int n = byteBuf.readInt();
        short s = byteBuf.readShort();
        byte[] byArray = new byte[n - 4 - 2];
        byteBuf.readBytes(byArray);
        ByteBuffer byteBuffer = ByteBuffer.allocate(n);
        byteBuffer.putInt(n);
        byteBuffer.putShort(s);
        byteBuffer.put(byArray);
        byteBuffer.rewind();
        return byteBuffer;
    }
}

