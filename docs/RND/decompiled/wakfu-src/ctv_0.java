/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from ctV
 */
public class ctv_0
extends nr_0 {
    private final ArrayList<fkw> miY = new ArrayList();
    private int laP;
    private int laW;

    @Override
    public boolean dn(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.laP = byteBuffer.getInt();
        this.laW = byteBuffer.getInt();
        while (byteBuffer.hasRemaining()) {
            this.miY.add(fkw.gl(byteBuffer));
        }
        return true;
    }

    public ArrayList<fkw> eCR() {
        return this.miY;
    }

    public int ekU() {
        return this.laP;
    }

    public int eCt() {
        return this.laW;
    }

    @Override
    public int d() {
        return 14147;
    }
}

