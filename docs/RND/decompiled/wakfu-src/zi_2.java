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
 * Renamed from zi
 */
class zi_2
extends AbstractParser<zh_2> {
    zi_2() {
    }

    public zh_2 jp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new zh_2(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.jp(codedInputStream, extensionRegistryLite);
    }
}

