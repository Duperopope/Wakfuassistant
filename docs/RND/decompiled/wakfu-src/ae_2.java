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
 * Renamed from ae
 */
class ae_2
extends AbstractParser<ad_1> {
    ae_2() {
    }

    public ad_1 I(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new ad_1(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.I(codedInputStream, extensionRegistryLite);
    }
}

