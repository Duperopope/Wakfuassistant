/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
import io.netty.buffer.ByteBuf;
import java.nio.ByteBuffer;

/*
 * Renamed from aDd
 */
final class add_2
extends adc_2 {
    @Override
    public ByteBuffer a(ByteBuf byteBuf) {
        int n = byteBuf.readInt();
        byte[] byArray = new byte[n - 4];
        byteBuf.readBytes(byArray);
        ByteBuffer byteBuffer = ByteBuffer.allocate(n);
        byteBuffer.putInt(n);
        byteBuffer.put(byArray);
        byteBuffer.rewind();
        return byteBuffer;
    }
}

