/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.wakfu.client.console.command.NavigateToCommandSetCommand;
import java.net.URL;
import java.util.ArrayList;
import java.util.Optional;
import java.util.regex.Matcher;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.apache.log4j.Logger;
import org.xml.sax.helpers.DefaultHandler;

public class aUd
extends aUf {
    protected static final Logger gwB = Logger.getLogger(aUd.class);
    private aUd gwC;
    private final ArrayList<aUf> gwD = new ArrayList();
    boolean gwE;

    public aUd() {
        this("", "", false);
    }

    public aUd(String string, String string2, boolean bl) {
        super(string, string2, bl);
    }

    public boolean g(URL uRL) {
        SAXParserFactory sAXParserFactory = SAXParserFactory.newInstance();
        try {
            SAXParser sAXParser = sAXParserFactory.newSAXParser();
            aUe aUe2 = new aUe(this);
            sAXParser.parse(uRL.openStream(), (DefaultHandler)aUe2);
            return true;
        }
        catch (Exception exception) {
            gwB.error((Object)"SAX parser error :", (Throwable)exception);
            return false;
        }
    }

    public void z(ArrayList<aUc> arrayList) {
        for (aUc aUc2 : arrayList) {
            this.cUl().b(aUc2);
        }
    }

    public boolean b(String string, byte by) {
        for (aUf aUf2 : this.c(string, by)) {
            if (!aUf2.cUr()) continue;
            return true;
        }
        return false;
    }

    public ArrayList<aUf> getChildren() {
        return this.gwD;
    }

    public void b(aUf aUf2) {
        this.gwD.add(aUf2);
    }

    void b(aUd aUd2) {
        this.gwC = aUd2;
    }

    public aUd cUj() {
        return this.gwC;
    }

    public boolean cUk() {
        return this.gwC == null;
    }

    public aUd cUl() {
        if (this.cUk()) {
            return this;
        }
        return this.cUj().cUl();
    }

    public String bpu() {
        StringBuilder stringBuilder = new StringBuilder();
        if (this.gwC != null) {
            stringBuilder.append(this.cUj().bpu());
        }
        return stringBuilder.append(this.getName()).append("/").toString();
    }

    public ArrayList<aUf> c(String string, byte by) {
        ArrayList<aUf> arrayList = new ArrayList<aUf>();
        for (aUf aUf2 : this.gwD) {
            Matcher matcher;
            if (aUf2.cUo() > by || !(matcher = aUf2.cUp().matcher(string)).matches()) continue;
            arrayList.add(aUf2);
        }
        return arrayList;
    }

    public ArrayList<String> cUm() {
        ArrayList<String> arrayList = new ArrayList<String>();
        for (aUf aUf2 : this.gwD) {
            arrayList.add(aUf2.getName());
        }
        return arrayList;
    }

    public Optional<aUd> cUn() {
        for (aUf aUf2 : this.gwD) {
            if (!(aUf2 instanceof aUd)) continue;
            aUd aUd2 = (aUd)aUf2;
            if (!aUd2.gwE) continue;
            return Optional.of(aUd2);
        }
        return Optional.empty();
    }

    @Override
    public aQm cUi() {
        return new NavigateToCommandSetCommand(this);
    }
}

