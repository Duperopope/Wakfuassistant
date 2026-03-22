/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.ReplayingDecoder
 */
import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ReplayingDecoder;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
 * Renamed from aDb
 */
public class adb_2
extends ReplayingDecoder<Void> {
    public static final int dCK = 6;
    private final adc_2 dCL;
    private final List<aav_1<?>> dCM = new ArrayList();

    public adb_2(adc_2 adc_22, Collection<aav_1<?>> collection) {
        this.dCL = adc_22;
        this.dCM.addAll(collection);
    }

    public boolean b(aav_1<?> aav_12) {
        return this.dCM.add(aav_12);
    }

    protected void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) {
        ByteBuffer byteBuffer = this.dCL.a(byteBuf);
        ArrayList arrayList = Lists.newArrayList(this.dCM);
        aam_2 aam_22 = null;
        for (int i = 0; i < arrayList.size() && aam_22 == null; ++i) {
            aav_1 aav_12 = (aav_1)arrayList.get(i);
            byteBuffer.rewind();
            aam_22 = aav_12.eJ(byteBuffer);
        }
        if (aam_22 == null) {
            if (byteBuf.capacity() >= 6) {
                throw new UnsupportedOperationException("Unable to decode message (msg id could be " + byteBuf.getShort(4) + ")");
            }
            throw new UnsupportedOperationException("Unable to decode message");
        }
        hp_2.mZ(aam_22.d()).update(byteBuffer.position());
        list.add(aam_22);
    }

    public String toString() {
        return "ServerMessageDecoder{m_decoders=" + this.dCM.size() + "}";
    }
}

