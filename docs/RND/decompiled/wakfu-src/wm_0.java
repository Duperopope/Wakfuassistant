/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jdom.Element
 */
import org.jdom.Element;

/*
 * Renamed from Wm
 */
public class wm_0 {
    public final int bNb;
    public final int bNc;
    public final int bNd;

    public wm_0(int n, int n2, int n3) {
        this.bNb = n;
        this.bNc = n2;
        this.bNd = n3;
    }

    final Element dC(String string) {
        Element element = new Element(string);
        element.setAttribute("id", String.valueOf(this.bNb));
        element.setAttribute("minQuantity", String.valueOf(this.bNc));
        element.setAttribute("maxQuantity", String.valueOf(this.bNd));
        return element;
    }
}

