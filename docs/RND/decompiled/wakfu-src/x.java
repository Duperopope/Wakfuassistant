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

public final class x
extends GeneratedMessageV3
implements b_0 {
    private static final long aw = 0L;
    int ax = 0;
    Object ay;
    public static final int az = 1;
    volatile Object R;
    public static final int aA = 2;
    int aB;
    public static final int aC = 3;
    public static final int aD = 4;
    private byte Y = (byte)-1;
    private static final x aE = new x();
    static final Parser<x> aF = new y_0();

    x(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private x() {
        this.R = "";
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new x();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    x(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl = false;
            block14: while (!bl) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl = true;
                        continue block14;
                    }
                    case 10: {
                        String string = codedInputStream.readStringRequireUtf8();
                        this.R = string;
                        continue block14;
                    }
                    case 16: {
                        this.aB = codedInputStream.readInt32();
                        continue block14;
                    }
                    case 26: {
                        String string = codedInputStream.readStringRequireUtf8();
                        this.ax = 3;
                        this.ay = string;
                        continue block14;
                    }
                    case 34: {
                        String string = codedInputStream.readStringRequireUtf8();
                        this.ax = 4;
                        this.ay = string;
                        continue block14;
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

    public static final Descriptors.Descriptor aS() {
        return g_0.E;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return g_0.F.ensureFieldAccessorsInitialized(x.class, z_0.class);
    }

    @Override
    public a_0 aT() {
        return a_0.h(this.ax);
    }

    @Override
    public String n() {
        Object object = this.R;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        this.R = string;
        return string;
    }

    @Override
    public ByteString o() {
        Object object = this.R;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.R = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    @Override
    public int aU() {
        return this.aB;
    }

    @Override
    public boolean aV() {
        return this.ax == 3;
    }

    @Override
    public String aW() {
        Object object = "";
        if (this.ax == 3) {
            object = this.ay;
        }
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        if (this.ax == 3) {
            this.ay = string;
        }
        return string;
    }

    @Override
    public ByteString aX() {
        Object object = "";
        if (this.ax == 3) {
            object = this.ay;
        }
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            if (this.ax == 3) {
                this.ay = byteString;
            }
            return byteString;
        }
        return (ByteString)object;
    }

    @Override
    public boolean aY() {
        return this.ax == 4;
    }

    @Override
    public String aZ() {
        Object object = "";
        if (this.ax == 4) {
            object = this.ay;
        }
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        if (this.ax == 4) {
            this.ay = string;
        }
        return string;
    }

    @Override
    public ByteString ba() {
        Object object = "";
        if (this.ax == 4) {
            object = this.ay;
        }
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            if (this.ax == 4) {
                this.ay = byteString;
            }
            return byteString;
        }
        return (ByteString)object;
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
        if (!GeneratedMessageV3.isStringEmpty((Object)this.R)) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)1, (Object)this.R);
        }
        if (this.aB != 0) {
            codedOutputStream.writeInt32(2, this.aB);
        }
        if (this.ax == 3) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)3, (Object)this.ay);
        }
        if (this.ax == 4) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)4, (Object)this.ay);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if (!GeneratedMessageV3.isStringEmpty((Object)this.R)) {
            n += GeneratedMessageV3.computeStringSize((int)1, (Object)this.R);
        }
        if (this.aB != 0) {
            n += CodedOutputStream.computeInt32Size((int)2, (int)this.aB);
        }
        if (this.ax == 3) {
            n += GeneratedMessageV3.computeStringSize((int)3, (Object)this.ay);
        }
        if (this.ax == 4) {
            n += GeneratedMessageV3.computeStringSize((int)4, (Object)this.ay);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof x)) {
            return super.equals(object);
        }
        x x2 = (x)object;
        if (!this.n().equals(x2.n())) {
            return false;
        }
        if (this.aU() != x2.aU()) {
            return false;
        }
        if (!this.aT().equals((Object)x2.aT())) {
            return false;
        }
        switch (this.ax) {
            case 3: {
                if (this.aW().equals(x2.aW())) break;
                return false;
            }
            case 4: {
                if (this.aZ().equals(x2.aZ())) break;
                return false;
            }
        }
        return this.unknownFields.equals((Object)x2.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + x.aS().hashCode();
        n = 37 * n + 1;
        n = 53 * n + this.n().hashCode();
        n = 37 * n + 2;
        n = 53 * n + this.aU();
        switch (this.ax) {
            case 3: {
                n = 37 * n + 3;
                n = 53 * n + this.aW().hashCode();
                break;
            }
            case 4: {
                n = 37 * n + 4;
                n = 53 * n + this.aZ().hashCode();
                break;
            }
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static x e(ByteBuffer byteBuffer) {
        return (x)aF.parseFrom(byteBuffer);
    }

    public static x e(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (x)aF.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static x o(ByteString byteString) {
        return (x)aF.parseFrom(byteString);
    }

    public static x e(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (x)aF.parseFrom(byteString, extensionRegistryLite);
    }

    public static x e(byte[] byArray) {
        return (x)aF.parseFrom(byArray);
    }

    public static x e(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (x)aF.parseFrom(byArray, extensionRegistryLite);
    }

    public static x i(InputStream inputStream) {
        return (x)GeneratedMessageV3.parseWithIOException(aF, (InputStream)inputStream);
    }

    public static x i(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (x)GeneratedMessageV3.parseWithIOException(aF, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static x j(InputStream inputStream) {
        return (x)GeneratedMessageV3.parseDelimitedWithIOException(aF, (InputStream)inputStream);
    }

    public static x j(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (x)GeneratedMessageV3.parseDelimitedWithIOException(aF, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static x e(CodedInputStream codedInputStream) {
        return (x)GeneratedMessageV3.parseWithIOException(aF, (CodedInputStream)codedInputStream);
    }

    public static x m(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (x)GeneratedMessageV3.parseWithIOException(aF, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public z_0 bb() {
        return x.bc();
    }

    public static z_0 bc() {
        return aE.bd();
    }

    public static z_0 a(x x2) {
        return aE.bd().c(x2);
    }

    public z_0 bd() {
        return this == aE ? new z_0() : new z_0().c(this);
    }

    protected z_0 e(GeneratedMessageV3.BuilderParent builderParent) {
        z_0 z_02 = new z_0(builderParent);
        return z_02;
    }

    public static x be() {
        return aE;
    }

    public static Parser<x> z() {
        return aF;
    }

    public Parser<x> getParserForType() {
        return aF;
    }

    public x bf() {
        return aE;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.e(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.bd();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.bb();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.bd();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.bb();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.bf();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.bf();
    }

    static /* synthetic */ boolean bg() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(x x2) {
        return x2.unknownFields;
    }

    static /* synthetic */ void p(ByteString byteString) {
        x.checkByteStringIsUtf8((ByteString)byteString);
    }

    static /* synthetic */ void q(ByteString byteString) {
        x.checkByteStringIsUtf8((ByteString)byteString);
    }

    static /* synthetic */ void r(ByteString byteString) {
        x.checkByteStringIsUtf8((ByteString)byteString);
    }
}

