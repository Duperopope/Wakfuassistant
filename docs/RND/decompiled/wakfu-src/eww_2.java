/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from eWw
 */
class eww_2 {
    final TO rBJ;
    final tz_0 rBK;

    public tz_0 fOe() {
        return this.rBK;
    }

    public TO fOf() {
        return this.rBJ;
    }

    public int DN() {
        return this.rBJ.DN() + 2 + 1;
    }

    public void as(ByteBuffer byteBuffer) {
        byteBuffer.putShort(this.rBK.biN());
        byteBuffer.put((byte)(this.rBK.biM() ? 1 : 0));
        this.rBJ.as(byteBuffer);
    }

    public static eww_2 b(Tz tz, long l, ByteBuffer byteBuffer) {
        short s = byteBuffer.getShort();
        boolean bl = byteBuffer.get() == 1;
        return new eww_2(TO.f(tz, byteBuffer), tz_0.ff(l).pA(s).bn(bl));
    }

    public static eww_2 a(TO tO, tz_0 tz_02) {
        return new eww_2(tO, tz_02);
    }

    eww_2(TO tO, tz_0 tz_02) {
        this.rBJ = tO;
        this.rBK = tz_02;
    }
}

