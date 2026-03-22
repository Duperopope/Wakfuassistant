/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from aQk
 */
public class aqk_0
implements aeh_2,
aqi_0 {
    public static final String eBX = "prompt";
    public static final String eBY = "logs";
    public static final String[] eBZ = new String[]{"prompt", "logs"};
    private static final aqk_0 eCa = new aqk_0();
    private String eCb = "";
    private final List<String> eCc = new ArrayList<String>();

    public static aqk_0 cBK() {
        return eCa;
    }

    private aqk_0() {
    }

    @Override
    public void jJ(String string) {
        this.eCb = string;
        fse_1.gFu().a((aef_2)this, eBX);
    }

    @Override
    public void jI(String string) {
        this.a(string, awx_2.dnJ);
    }

    @Override
    public void jF(String string) {
        this.a(string, awx_2.dnL);
    }

    @Override
    public void jH(String string) {
        this.jK(string);
    }

    @Override
    public void n(String string, int n) {
        this.a(string, new awx_2((n & 0xFF) << 16 | n & 0xFF00 | (n & 0xFF0000) >> 16));
    }

    @Override
    public void jG(String string) {
        this.jK(string + "\n");
    }

    private void a(String string, axb_2 axb_22) {
        this.jK(new ahv_2().ih(axb_22.bQk()).c(string).ceL());
    }

    private void jK(String string) {
        this.eCc.add((String)(string.endsWith("\n") ? string : string + "\n"));
        fse_1.gFu().a((aef_2)this, eBY);
    }

    public void clear() {
        this.eCc.clear();
        fse_1.gFu().a((aef_2)this, eBY);
    }

    @Override
    public Object eu(String string) {
        switch (string) {
            case "prompt": {
                return this.eCb;
            }
            case "logs": {
                return String.join((CharSequence)"\n", this.eCc);
            }
        }
        return null;
    }

    @Override
    public String[] bxk() {
        return eBZ;
    }
}

