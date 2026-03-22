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
 * Renamed from hz
 */
class hz_1
extends AbstractParser<hy_1> {
    hz_1() {
    }

    public hy_1 eu(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new hy_1(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.eu(codedInputStream, extensionRegistryLite);
    }
}

