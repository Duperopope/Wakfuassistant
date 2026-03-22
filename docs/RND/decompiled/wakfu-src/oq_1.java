/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.Map;

/*
 * Renamed from OQ
 */
class oq_1
extends fi_1 {
    final /* synthetic */ op_1 bah;

    oq_1(op_1 op_12) {
        this.bah = op_12;
    }

    @Override
    public void as(ByteBuffer byteBuffer) {
        if (this.bah.baf == null) {
            byteBuffer.put((byte)0);
            return;
        }
        int n = this.bah.baf.size();
        if (n > 127) {
            oT.error((Object)("Nombre d'actions " + n + " > 255"));
            return;
        }
        byteBuffer.put((byte)n);
        for (Map.Entry<Short, Integer> entry : this.bah.baf.entrySet()) {
            byteBuffer.putShort(entry.getKey());
            byteBuffer.putInt(entry.getValue());
        }
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        throw new UnsupportedOperationException();
    }
}

