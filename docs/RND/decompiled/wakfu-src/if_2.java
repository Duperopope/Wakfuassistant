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
 * Renamed from iF
 */
class if_2
extends AbstractParser<ie_2> {
    if_2() {
    }

    public ie_2 fh(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new ie_2(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.fh(codedInputStream, extensionRegistryLite);
    }
}

