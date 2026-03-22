/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from MO
 */
public class mo_1 {
    public static final short aXj = -1;
    public final short aXk;
    public final boolean aXl;
    public final float aXm;
    public final float aXn;
    public final float aXo;

    public mo_1() {
        this(-1);
    }

    public mo_1(short s) {
        this(s, true, 0.01f, 1.0f, 0.01f);
    }

    public mo_1(short s, boolean bl, float f2, float f3, float f4) {
        this.aXk = s;
        this.aXl = bl;
        this.aXm = f2;
        this.aXn = f3;
        this.aXo = f4;
    }

    public mo_1 O(short s) {
        return new mo_1(s, this.aXl, this.aXm, this.aXn, this.aXo);
    }

    public mo_1(ByteBuffer byteBuffer) {
        this.aXk = byteBuffer.getShort();
        this.aXl = byteBuffer.get() != 0;
        this.aXm = byteBuffer.getFloat();
        this.aXn = byteBuffer.getFloat();
        this.aXo = byteBuffer.getFloat();
    }

    public void a(fs_0 fs_02) {
        fs_02.k(this.aXk);
        fs_02.g(this.aXl ? (byte)1 : 0);
        fs_02.b(this.aXm);
        fs_02.b(this.aXn);
        fs_02.b(this.aXo);
    }
}

