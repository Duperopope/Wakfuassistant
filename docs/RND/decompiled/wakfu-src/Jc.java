/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInput;

public class Jc {
    private final JF aJY;

    public Jc(JF jF) {
        this.aJY = jF;
    }

    public void b(DataInput dataInput) {
        byte[] byArray = new byte[3];
        dataInput.readFully(byArray);
        String string = new String(byArray).intern();
        if ("eps".equals(string)) {
            this.aJY.aA(false);
        } else if ("EPS".equals(string)) {
            this.aJY.aA(true);
        } else {
            throw new IllegalStateException("Invalid signature " + string);
        }
        long l = (long)dataInput.readInt() & 0xFFFFFFFFL;
        this.aJY.cG(l);
    }
}

