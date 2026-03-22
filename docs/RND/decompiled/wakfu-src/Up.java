/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TShortObjectHashMap
 */
import gnu.trove.map.hash.TShortObjectHashMap;
import java.nio.ByteBuffer;
import java.util.List;

final class Up {
    private final Tz buJ;

    Up(Tz tz) {
        this.buJ = tz;
    }

    void a(Uj uj, ByteBuffer byteBuffer, int n, TShortObjectHashMap<List<TO>> tShortObjectHashMap) {
        for (int i = 0; i < n; ++i) {
            short s = byteBuffer.getShort();
            int n2 = byteBuffer.getInt();
            for (int j = 0; j < n2; ++j) {
                int n3 = byteBuffer.getInt();
                byte[] byArray = new byte[n3];
                byteBuffer.get(byArray);
                try {
                    TO tO = TO.f(this.buJ, ByteBuffer.wrap(byArray));
                    uj.a(tO, s, tShortObjectHashMap);
                    continue;
                }
                catch (Exception exception) {
                    Un.buH.error((Object)"Exception levee", (Throwable)exception);
                }
            }
        }
    }
}

