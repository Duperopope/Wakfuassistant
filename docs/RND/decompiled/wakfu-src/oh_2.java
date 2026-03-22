/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractParser
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.ExtensionRegistryLite
 */
import com.google.protobuf.AbstractParser;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;

/*
 * Renamed from oh
 */
class oh_2
extends AbstractParser<og_2> {
    oh_2() {
    }

    public og_2 iR(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new og_2(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.iR(codedInputStream, extensionRegistryLite);
    }
}

