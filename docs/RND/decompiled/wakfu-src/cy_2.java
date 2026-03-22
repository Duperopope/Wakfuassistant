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
 * Renamed from cy
 */
class cy_2
extends AbstractParser<cx_2> {
    cy_2() {
    }

    public cx_2 br(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new cx_2(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.br(codedInputStream, extensionRegistryLite);
    }
}

