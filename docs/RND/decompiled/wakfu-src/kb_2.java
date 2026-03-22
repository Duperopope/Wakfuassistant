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
 * Renamed from kB
 */
class kb_2
extends AbstractParser<ka_2> {
    kb_2() {
    }

    public ka_2 gB(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new ka_2(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.gB(codedInputStream, extensionRegistryLite);
    }
}

