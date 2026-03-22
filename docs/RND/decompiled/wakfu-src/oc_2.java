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
 * Renamed from oc
 */
class oc_2
extends AbstractParser<ob_2> {
    oc_2() {
    }

    public ob_2 iO(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new ob_2(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.iO(codedInputStream, extensionRegistryLite);
    }
}

