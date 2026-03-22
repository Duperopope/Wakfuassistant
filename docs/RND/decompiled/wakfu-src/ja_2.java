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
 * Renamed from ja
 */
class ja_2
extends AbstractParser<iz_2> {
    ja_2() {
    }

    public iz_2 fw(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new iz_2(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.fw(codedInputStream, extensionRegistryLite);
    }
}

