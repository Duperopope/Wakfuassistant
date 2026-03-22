/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

public class cyf
extends nr_0 {
    private final ArrayList<buV> mmo = new ArrayList();
    private int mmp;
    private short cLw;

    @Override
    public boolean dn(byte ... byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.cLw = byteBuffer.getShort();
        this.mmp = byteBuffer.getInt();
        while (byteBuffer.remaining() > 0) {
            buV buV2 = new buV();
            buV2.eL(byteBuffer);
            this.mmo.add(buV2);
        }
        return true;
    }

    public int eFn() {
        return this.mmp;
    }

    public ArrayList<buV> eFo() {
        return this.mmo;
    }

    @Override
    public int d() {
        return 15607;
    }

    public short bEr() {
        return this.cLw;
    }
}

