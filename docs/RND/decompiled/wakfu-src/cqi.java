/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class cqi
extends cqf {
    private acd_1 lXV;
    private Long mey;

    @Override
    public boolean dn(byte[] byArray) {
        if (byArray == null || byArray.length != 22) {
            dwV.error((Object)"le message recu a une taille de donn\u00e9es incorrecte");
            return false;
        }
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.fg(byteBuffer);
        this.lXV = new acd_1();
        this.lXV.setX(byteBuffer.getInt());
        this.lXV.setY(byteBuffer.getInt());
        this.lXV.aM(byteBuffer.getShort());
        this.mey = byteBuffer.getLong();
        return true;
    }

    @Override
    public int d() {
        return 13916;
    }

    public acd_1 exV() {
        return this.lXV;
    }

    public Long exW() {
        return this.mey;
    }
}

