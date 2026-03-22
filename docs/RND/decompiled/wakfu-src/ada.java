/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class ada {
    private static final Logger cim = Logger.getLogger(ada.class);
    private int chV;
    private int chW;
    private int chX;
    private String cin;
    private String cio;
    private int cip;
    private static final ada ciq = new ada();

    public static ada buh() {
        return ciq;
    }

    private ada() {
        this.reset();
    }

    public int bui() {
        return this.chV;
    }

    public int buj() {
        return this.chW;
    }

    public int buk() {
        return this.chX;
    }

    public String bul() {
        return this.cin;
    }

    public int getSoundId() {
        return this.cip;
    }

    public void rK(int n) {
        this.chV = n;
    }

    public void rL(int n) {
        this.chW = n;
    }

    public void rJ(int n) {
        this.chX = n;
    }

    public void el(String string) {
        this.cin = string;
    }

    public void setSoundId(int n) {
        this.cip = n;
    }

    public String bum() {
        return this.cio;
    }

    public void em(String string) {
        this.cio = string;
    }

    public void reset() {
        this.chV = 1000;
        this.chW = 1000;
        this.chX = 0;
        this.cin = null;
        this.cio = null;
        this.cip = 0;
    }
}

