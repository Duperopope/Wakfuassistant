/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.apache.log4j.Logger;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

/*
 * Renamed from aqR
 */
public class aqr_2
implements apa_1<aqs_2> {
    protected static final Logger cRl = Logger.getLogger(aqr_2.class);
    private DocumentBuilder cRm;
    private Document cRn;
    private OutputStream cRo = null;
    private static final aqr_2 cRp = new aqr_2();

    public static aqr_2 bGR() {
        return cRp;
    }

    public aqr_2() {
        try {
            this.cRm = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        }
        catch (ParserConfigurationException parserConfigurationException) {
            cRl.error((Object)"Exception during XMLDocumentAccessor construction", (Throwable)parserConfigurationException);
        }
    }

    @Override
    public void ex(String string) {
        try {
            InputStream inputStream = fo_0.bz(string);
            this.gU(inputStream);
            inputStream.close();
        }
        catch (Exception exception) {
            File file = new File(string);
            if (file.exists()) {
                try {
                    this.cRn = this.cRm.parse(file);
                }
                catch (SAXException sAXException) {
                    this.cRm = DocumentBuilderFactory.newInstance().newDocumentBuilder();
                    throw sAXException;
                }
                if (this.cRn == null) {
                    throw new Exception("Impossible de parser le document " + string);
                }
            }
            this.cRn = null;
            throw new FileNotFoundException("Fichier non trouv\u00e9 : " + string);
        }
    }

    public void gU(InputStream inputStream) {
        this.cRn = this.cRm.parse(inputStream);
    }

    @Override
    public boolean eD(String string) {
        File file = new File(string);
        File file2 = file.getParentFile();
        boolean bl = file2.mkdirs() && file.createNewFile();
        this.cRo = new FileOutputStream(string);
        return bl;
    }

    public void c(OutputStream outputStream) {
        this.cRo = outputStream;
    }

    @Override
    public void close() {
        this.cRn = null;
    }

    @Override
    public void a(aqs_2 aqs_22, ape_1 ... ape_1Array) {
        try {
            Node node;
            if (this.cRn == null) {
                cRl.error((Object)"read() invoqu\u00e9 sur un document non ouvert ( voir : open() )");
                return;
            }
            aqs_22.bxE();
            for (node = this.cRn.getFirstChild(); node != null && node.getNodeType() != 1; node = node.getNextSibling()) {
            }
            aqt_2 aqt_22 = this.a(node, ape_1Array);
            if (aqt_22 != null) {
                aqs_22.a(aqt_22);
            }
            aqs_22.bEM();
        }
        catch (Exception exception) {
            aqs_22.eB("Exception : " + exception.getMessage());
            cRl.error((Object)"Exception during read", (Throwable)exception);
        }
    }

    private static String a(String string, ape_1[] ape_1Array) {
        if (ape_1Array != null && ape_1Array.length > 0) {
            for (ape_1 ape_12 : ape_1Array) {
                String string2 = ape_12.fs(string);
                if (string2 == null) continue;
                return string2;
            }
        }
        return string;
    }

    private aqt_2 a(Node node, ape_1[] ape_1Array) {
        if (node == null) {
            return null;
        }
        String string = aqr_2.a(node.getNodeName(), ape_1Array);
        String string2 = aqr_2.a(node.getNodeValue(), ape_1Array);
        aqt_2 aqt_22 = new aqt_2(string, string2);
        NamedNodeMap namedNodeMap = node.getAttributes();
        if (namedNodeMap != null) {
            for (int i = 0; i < namedNodeMap.getLength(); ++i) {
                Node node2 = namedNodeMap.item(i);
                string = aqr_2.a(node2.getNodeName(), ape_1Array);
                string2 = aqr_2.a(node2.getNodeValue(), ape_1Array);
                aqt_22.c(new aqu_2(string, string2));
            }
        }
        for (Node node3 = node.getFirstChild(); node3 != null; node3 = node3.getNextSibling()) {
            aqt_22.a(this.a(node3, ape_1Array));
        }
        return aqt_22;
    }

    @Override
    public void a(aqs_2 aqs_22) {
        this.a(aqs_22, true);
    }

    public void a(aqs_2 aqs_22, boolean bl) {
        this.a(aqs_22, bl, true);
    }

    public void a(aqs_2 aqs_22, boolean bl, boolean bl2) {
        this.a(aqs_22, bl, bl2, true);
    }

    public void a(aqs_2 aqs_22, boolean bl, boolean bl2, boolean bl3) {
        if (aqs_22 == null) {
            return;
        }
        aqs_22.bxF();
        try {
            if (bl) {
                this.b(aqs_22, bl2, bl3);
            } else {
                this.b(aqs_22);
            }
        }
        catch (TransformerException transformerException) {
            cRl.error((Object)"Probleme pendant la sauvegarde d'un fichier XML.", (Throwable)transformerException);
        }
        aqs_22.bxG();
    }

    private void b(aqs_2 aqs_22) {
        Document document = this.cRm.newDocument();
        Node node = aqr_2.a(aqs_22.bGT(), document);
        document.appendChild(node);
        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        DOMSource dOMSource = new DOMSource(document);
        StreamResult streamResult = new StreamResult(this.cRo);
        transformer.transform(dOMSource, streamResult);
    }

    private static Node a(apd_1 apd_12, Document document) {
        if (apd_12 == null) {
            return null;
        }
        Node node = aqr_2.b(apd_12, document);
        for (apd_1 apd_13 : apd_12.getChildren()) {
            Node node2 = aqr_2.a(apd_13, document);
            node.appendChild(node2);
        }
        return node;
    }

    private static Node b(apd_1 apd_12, Document document) {
        String string = apd_12.getName();
        String string2 = apd_12.bCt();
        if (string.equals("#text")) {
            return document.createTextNode(string2);
        }
        if (string.equals("#comment")) {
            return document.createComment(string2);
        }
        if (string.equals("#cdata-section")) {
            return document.createCDATASection(string2);
        }
        Element element = document.createElement(string);
        for (apd_1 apd_13 : apd_12.bEN()) {
            Attr attr = document.createAttribute(apd_13.getName());
            attr.setValue(apd_13.bCt());
            element.setAttributeNode(attr);
        }
        return element;
    }

    private void b(aqs_2 aqs_22, boolean bl, boolean bl2) {
        aqt_2 aqt_22 = aqs_22.bGT();
        try {
            if (bl) {
                aqr_2.a(this.cRo, "UTF-8");
            }
            if (aqt_22 != null) {
                this.a(aqt_22, this.cRo, "UTF-8", 0, bl2);
            }
            this.cRo.close();
            this.cRo = null;
        }
        catch (Exception exception) {
            aqs_22.eB("Exception : " + exception.getMessage());
            cRl.error((Object)"Exception during writeCustom", (Throwable)exception);
        }
    }

    private static void a(OutputStream outputStream, String string) {
        outputStream.write(("<?xml version=\"1.0\" encoding=\"" + string + "\"?>\r\n").getBytes(string));
    }

    private void a(apd_1 apd_12, OutputStream outputStream, String string, int n, boolean bl) {
        if (apd_12 == null) {
            return;
        }
        if (bl) {
            aqr_2.e(apd_12);
        }
        String string2 = apd_12.getName();
        String string3 = apd_12.bCt();
        StringBuilder stringBuilder = new StringBuilder();
        if (bl) {
            for (int i = 0; i < n; ++i) {
                stringBuilder.append('\t');
            }
        }
        String string4 = stringBuilder.toString();
        if (string2.equals("#text")) {
            outputStream.write(string4.getBytes(string));
            outputStream.write(string3.getBytes(string));
            if (bl) {
                outputStream.write("\r\n".getBytes(string));
            }
        } else if (string2.equals("#comment")) {
            outputStream.write(string4.getBytes(string));
            outputStream.write("<!--".getBytes(string));
            outputStream.write(string3.getBytes(string));
            outputStream.write("-->".getBytes(string));
        } else if (string2.equals("#cdata-section")) {
            outputStream.write(string4.getBytes(string));
            outputStream.write("<![CDATA[".getBytes(string));
            outputStream.write(string3.getBytes(string));
            outputStream.write("]]>".getBytes(string));
            if (bl) {
                outputStream.write("\n".getBytes(string));
            }
        } else {
            boolean bl2;
            outputStream.write(string4.getBytes(string));
            outputStream.write("<".getBytes(string));
            outputStream.write(string2.getBytes(string));
            aqr_2.a(apd_12, outputStream, string);
            boolean bl3 = !apd_12.getChildren().isEmpty();
            boolean bl4 = bl2 = apd_12.bCt() != null && !apd_12.bCt().isEmpty();
            if (!bl3 && !bl2) {
                outputStream.write("/".getBytes(string));
            }
            if (!bl2) {
                outputStream.write(">".getBytes(string));
                if (bl) {
                    outputStream.write("\r\n".getBytes(string));
                }
            } else {
                outputStream.write(">".getBytes(string));
            }
            for (apd_1 apd_13 : apd_12.getChildren()) {
                this.a(apd_13, outputStream, string, n + 1, bl);
            }
            if (apd_12.bCt() != null) {
                outputStream.write(apd_12.bCt().trim().getBytes(string));
            }
            if (bl3) {
                outputStream.write(string4.getBytes(string));
            }
            if (bl3 || bl2) {
                outputStream.write("</".getBytes(string));
                outputStream.write(string2.getBytes(string));
                outputStream.write(">".getBytes(string));
                if (bl) {
                    outputStream.write("\r\n".getBytes(string));
                }
            }
        }
    }

    private static void e(apd_1 apd_12) {
        String string = apd_12.getName();
        if (string.equals("#text")) {
            apd_12.fa(apd_12.bCt().replaceAll("[\n\t]", ""));
        }
    }

    private static void a(apd_1 apd_12, OutputStream outputStream, String string) {
        if (apd_12 == null) {
            return;
        }
        for (apd_1 apd_13 : apd_12.bEN()) {
            String string2 = apd_13.getName();
            String string3 = apd_13.bCt();
            outputStream.write(" ".getBytes(string));
            outputStream.write(string2.getBytes(string));
            outputStream.write("=\"".getBytes(string));
            outputStream.write(string3 != null ? BH.aX(string3).getBytes(string) : "".getBytes());
            outputStream.write("\"".getBytes(string));
        }
    }

    public aqs_2 bGS() {
        return new aqs_2();
    }

    public void a(aqs_2 aqs_22, String string) {
        this.a(aqs_22, string, true);
    }

    public void a(aqs_2 aqs_22, String string, boolean bl) {
        if (aqs_22 == null) {
            return;
        }
        aqt_2 aqt_22 = aqs_22.bGT();
        aqs_22.bxF();
        try {
            aqr_2.a(this.cRo, "UTF-8");
            this.cRo.write(string.getBytes("UTF-8"));
            if (aqt_22 != null) {
                this.a(aqt_22, this.cRo, "UTF-8", 0, bl);
            }
            this.cRo.close();
            this.cRo = null;
        }
        catch (Exception exception) {
            aqs_22.eB("Exception : " + exception.getMessage());
            cRl.error((Object)"Exception during writeWithHeader", (Throwable)exception);
            return;
        }
        aqs_22.bxG();
    }

    @Override
    public /* synthetic */ apb_1 bxD() {
        return this.bGS();
    }
}

