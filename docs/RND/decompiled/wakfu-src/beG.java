/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.haapi.client.okhttp.ankama.model.AlmanaxEvent
 */
import com.ankama.haapi.client.okhttp.ankama.model.AlmanaxEvent;

public class beG {
    private final String hNN;
    private final String hNO;

    public beG(String string, String string2) {
        this.hNN = string;
        this.hNO = string2;
    }

    public static beG a(AlmanaxEvent almanaxEvent) {
        String string = almanaxEvent.getBossName();
        String string2 = almanaxEvent.getBossText();
        return new beG(string, string2);
    }

    public String deD() {
        return this.hNO;
    }

    public String deE() {
        return this.hNN;
    }
}

