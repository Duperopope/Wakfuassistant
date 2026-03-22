/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.Unpooled
 */
import com.google.common.base.Charsets;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/*
 * Renamed from evq
 */
public class evq_2 {
    public static final Comparator<evk_2> ovI = new evr_2();
    public static final Comparator<evt_2> ovJ = new evs_2();

    private evq_2() {
    }

    public static evp_2 a(Optional<evk_2> optional, int n) {
        Optional optional2 = optional.isPresent() ? optional.get().On(n) : Optional.empty();
        return optional2.isPresent() ? ((evt_2)optional2.get()).feh() : evp_2.ovx;
    }

    public static byte[] a(evk_2 evk_22) {
        ByteBuf byteBuf = Unpooled.buffer();
        byteBuf.writeLong(evk_22.xl());
        String string = evk_22.feb();
        byte[] byArray = string.getBytes(Charsets.UTF_8);
        byteBuf.writeInt(byArray.length);
        byteBuf.writeBytes(byArray);
        List<evt_2> list = evk_22.h();
        byteBuf.writeInt(list.size());
        for (evt_2 evt_22 : list) {
            byteBuf.writeInt(evt_22.vY());
            byteBuf.writeInt(evt_22.feh().d());
        }
        return byteBuf.array();
    }

    public static evk_2 eq(byte[] byArray) {
        ByteBuf byteBuf = Unpooled.wrappedBuffer((byte[])byArray);
        long l = byteBuf.readLong();
        byte[] byArray2 = new byte[byteBuf.readInt()];
        byteBuf.readBytes(byArray2);
        String string = new String(byArray2, Charsets.UTF_8);
        evk_2 evk_22 = new evk_2(l, string);
        int n = byteBuf.readInt();
        for (int i = 0; i < n; ++i) {
            evt_2 evt_22 = new evt_2(byteBuf.readInt(), evp_2.Oo(byteBuf.readInt()));
            evk_22.a(evt_22);
        }
        return evk_22;
    }
}

