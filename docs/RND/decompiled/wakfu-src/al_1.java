/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.CodedOutputStream
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.GeneratedMessageV3$BuilderParent
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 *  com.google.protobuf.GeneratedMessageV3$UnusedPrivateParameter
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.Message
 *  com.google.protobuf.Message$Builder
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLite$Builder
 *  com.google.protobuf.Parser
 *  com.google.protobuf.UninitializedMessageException
 *  com.google.protobuf.UnknownFieldSet
 *  com.google.protobuf.UnknownFieldSet$Builder
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/*
 * Renamed from al
 */
public final class al_1
extends GeneratedMessageV3
implements ad_2 {
    private static final long dt = 0L;
    int du = 0;
    Object V;
    public static final int dv = 1;
    public static final int dw = 2;
    public static final int dx = 3;
    private byte Y = (byte)-1;
    private static final al_1 dy = new al_1();
    static final Parser<al_1> dz = new am_2();

    al_1(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private al_1() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new al_1();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    al_1(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl = false;
            block13: while (!bl) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl = true;
                        continue block13;
                    }
                    case 10: {
                        GeneratedMessageV3.Builder builder2 = null;
                        if (this.du == 1) {
                            builder2 = ((at_1)this.V).eX();
                        }
                        this.V = codedInputStream.readMessage(at_1.z(), extensionRegistryLite);
                        if (builder2 != null) {
                            builder2.e((at_1)this.V);
                            this.V = builder2.fe();
                        }
                        this.du = 1;
                        continue block13;
                    }
                    case 18: {
                        GeneratedMessageV3.Builder builder2 = null;
                        if (this.du == 2) {
                            builder2 = ((ax_1)this.V).fp();
                        }
                        this.V = codedInputStream.readMessage(ax_1.z(), extensionRegistryLite);
                        if (builder2 != null) {
                            builder2.e((ax_1)this.V);
                            this.V = builder2.fv();
                        }
                        this.du = 2;
                        continue block13;
                    }
                    case 26: {
                        GeneratedMessageV3.Builder builder2 = null;
                        if (this.du == 3) {
                            builder2 = ((ap_2)this.V).eG();
                        }
                        this.V = codedInputStream.readMessage(ap_2.z(), extensionRegistryLite);
                        if (builder2 != null) {
                            builder2.e((ap_2)this.V);
                            this.V = builder2.eM();
                        }
                        this.du = 3;
                        continue block13;
                    }
                }
                if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n)) continue;
                bl = true;
            }
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw invalidProtocolBufferException.setUnfinishedMessage((MessageLite)this);
        }
        catch (UninitializedMessageException uninitializedMessageException) {
            throw uninitializedMessageException.asInvalidProtocolBufferException().setUnfinishedMessage((MessageLite)this);
        }
        catch (IOException iOException) {
            throw new InvalidProtocolBufferException(iOException).setUnfinishedMessage((MessageLite)this);
        }
        finally {
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor dV() {
        return ak_1.dl;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ak_1.dm.ensureFieldAccessorsInitialized(al_1.class, an_2.class);
    }

    @Override
    public ao_1 dW() {
        return ao_1.v(this.du);
    }

    @Override
    public boolean dX() {
        return this.du == 1;
    }

    @Override
    public at_1 dY() {
        if (this.du == 1) {
            return (at_1)this.V;
        }
        return at_1.eY();
    }

    @Override
    public aw_2 dZ() {
        if (this.du == 1) {
            return (at_1)this.V;
        }
        return at_1.eY();
    }

    @Override
    public boolean ea() {
        return this.du == 2;
    }

    @Override
    public ax_1 eb() {
        if (this.du == 2) {
            return (ax_1)this.V;
        }
        return ax_1.fq();
    }

    @Override
    public ac_1 ec() {
        if (this.du == 2) {
            return (ax_1)this.V;
        }
        return ax_1.fq();
    }

    @Override
    public boolean ed() {
        return this.du == 3;
    }

    @Override
    public ap_2 ee() {
        if (this.du == 3) {
            return (ap_2)this.V;
        }
        return ap_2.eH();
    }

    @Override
    public as_2 ef() {
        if (this.du == 3) {
            return (ap_2)this.V;
        }
        return ap_2.eH();
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if (this.du == 1) {
            codedOutputStream.writeMessage(1, (MessageLite)((at_1)this.V));
        }
        if (this.du == 2) {
            codedOutputStream.writeMessage(2, (MessageLite)((ax_1)this.V));
        }
        if (this.du == 3) {
            codedOutputStream.writeMessage(3, (MessageLite)((ap_2)this.V));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if (this.du == 1) {
            n += CodedOutputStream.computeMessageSize((int)1, (MessageLite)((at_1)this.V));
        }
        if (this.du == 2) {
            n += CodedOutputStream.computeMessageSize((int)2, (MessageLite)((ax_1)this.V));
        }
        if (this.du == 3) {
            n += CodedOutputStream.computeMessageSize((int)3, (MessageLite)((ap_2)this.V));
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof al_1)) {
            return super.equals(object);
        }
        al_1 al_12 = (al_1)object;
        if (!this.dW().equals((Object)al_12.dW())) {
            return false;
        }
        switch (this.du) {
            case 1: {
                if (this.dY().equals(al_12.dY())) break;
                return false;
            }
            case 2: {
                if (this.eb().equals(al_12.eb())) break;
                return false;
            }
            case 3: {
                if (this.ee().equals(al_12.ee())) break;
                return false;
            }
        }
        return this.unknownFields.equals((Object)al_12.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + al_1.dV().hashCode();
        switch (this.du) {
            case 1: {
                n = 37 * n + 1;
                n = 53 * n + this.dY().hashCode();
                break;
            }
            case 2: {
                n = 37 * n + 2;
                n = 53 * n + this.eb().hashCode();
                break;
            }
            case 3: {
                n = 37 * n + 3;
                n = 53 * n + this.ee().hashCode();
                break;
            }
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static al_1 m(ByteBuffer byteBuffer) {
        return (al_1)dz.parseFrom(byteBuffer);
    }

    public static al_1 m(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (al_1)dz.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static al_1 F(ByteString byteString) {
        return (al_1)dz.parseFrom(byteString);
    }

    public static al_1 m(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (al_1)dz.parseFrom(byteString, extensionRegistryLite);
    }

    public static al_1 m(byte[] byArray) {
        return (al_1)dz.parseFrom(byArray);
    }

    public static al_1 m(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (al_1)dz.parseFrom(byArray, extensionRegistryLite);
    }

    public static al_1 y(InputStream inputStream) {
        return (al_1)GeneratedMessageV3.parseWithIOException(dz, (InputStream)inputStream);
    }

    public static al_1 y(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (al_1)GeneratedMessageV3.parseWithIOException(dz, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static al_1 z(InputStream inputStream) {
        return (al_1)GeneratedMessageV3.parseDelimitedWithIOException(dz, (InputStream)inputStream);
    }

    public static al_1 z(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (al_1)GeneratedMessageV3.parseDelimitedWithIOException(dz, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static al_1 m(CodedInputStream codedInputStream) {
        return (al_1)GeneratedMessageV3.parseWithIOException(dz, (CodedInputStream)codedInputStream);
    }

    public static al_1 K(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (al_1)GeneratedMessageV3.parseWithIOException(dz, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public an_2 eg() {
        return al_1.eh();
    }

    public static an_2 eh() {
        return dy.ei();
    }

    public static an_2 a(al_1 al_12) {
        return dy.ei().c(al_12);
    }

    public an_2 ei() {
        return this == dy ? new an_2() : new an_2().c(this);
    }

    protected an_2 m(GeneratedMessageV3.BuilderParent builderParent) {
        an_2 an_22 = new an_2(builderParent);
        return an_22;
    }

    public static al_1 ej() {
        return dy;
    }

    public static Parser<al_1> z() {
        return dz;
    }

    public Parser<al_1> getParserForType() {
        return dz;
    }

    public al_1 ek() {
        return dy;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.m(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.ei();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.eg();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.ei();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.eg();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.ek();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.ek();
    }

    static /* synthetic */ boolean el() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(al_1 al_12) {
        return al_12.unknownFields;
    }
}

