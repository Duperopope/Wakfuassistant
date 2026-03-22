/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from Nj
 */
class nj_0
extends fi_1 {
    final /* synthetic */ ni_1 aYc;

    nj_0(ni_1 ni_12) {
        this.aYc = ni_12;
    }

    @Override
    public void as(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException("Impossible de s\u00e9rialiser un \u00e9l\u00e9ment interactif c\u00f4t\u00e9 client");
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        oT.trace((Object)("D\u00e9codage des donn\u00e9es globales (len=" + byteBuffer.remaining() + ")"));
        if (byteBuffer.remaining() > 0) {
            if (byteBuffer.remaining() < 1) {
                oT.error((Object)"Impossible de d\u00e9s\u00e9rialiser une partie vide");
                return;
            }
            int n2 = byteBuffer.get() & 0xFF;
            if (byteBuffer.remaining() != n2 * 6) {
                oT.error((Object)("Impossible de d\u00e9s\u00e9rialiser " + n2 + " actions dans un buffer de " + byteBuffer.remaining() + " octets"));
                return;
            }
            for (int i = 0; i < n2; ++i) {
                short s = byteBuffer.getShort();
                int n3 = byteBuffer.getInt();
                rw_0 rw_02 = rw_0.Y(s);
                if (rw_02 != null) {
                    this.aYc.aXY.put(rw_02, n3);
                    continue;
                }
                oT.error((Object)("Pas de InteractiveElementAction d'ID=" + s));
            }
        }
    }
}

