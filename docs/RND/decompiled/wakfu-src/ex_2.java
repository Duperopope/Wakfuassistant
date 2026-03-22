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
 * Renamed from ex
 */
class ex_2
extends AbstractParser<ew_2> {
    ex_2() {
    }

    public ew_2 cF(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new ew_2(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.cF(codedInputStream, extensionRegistryLite);
    }
}

