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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class bp
extends GeneratedMessageV3
implements bs {
    private static final long gJ = 0L;
    public static final int gK = 1;
    List<be> ak;
    private byte Y = (byte)-1;
    private static final bp gL = new bp();
    static final Parser<bp> gM = new bq();

    bp(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private bp() {
        this.ak = Collections.emptyList();
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new bp();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    bp(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block11: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block11;
                    }
                    case 10: {
                        if (!(bl & true)) {
                            this.ak = new ArrayList<be>();
                            bl |= true;
                        }
                        this.ak.add((be)codedInputStream.readMessage(be.z(), extensionRegistryLite));
                        continue block11;
                    }
                }
                if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n)) continue;
                bl2 = true;
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
            if (bl & true) {
                this.ak = Collections.unmodifiableList(this.ak);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor iz() {
        return aE.fA;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return aE.fB.ensureFieldAccessorsInitialized(bp.class, br.class);
    }

    @Override
    public List<be> ai() {
        return this.ak;
    }

    @Override
    public List<? extends bt> aj() {
        return this.ak;
    }

    @Override
    public int ak() {
        return this.ak.size();
    }

    @Override
    public be L(int n) {
        return this.ak.get(n);
    }

    @Override
    public bt M(int n) {
        return this.ak.get(n);
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
        for (int i = 0; i < this.ak.size(); ++i) {
            codedOutputStream.writeMessage(1, (MessageLite)this.ak.get(i));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        for (int i = 0; i < this.ak.size(); ++i) {
            n += CodedOutputStream.computeMessageSize((int)1, (MessageLite)((MessageLite)this.ak.get(i)));
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof bp)) {
            return super.equals(object);
        }
        bp bp2 = (bp)object;
        if (!this.ai().equals(bp2.ai())) {
            return false;
        }
        return this.unknownFields.equals((Object)bp2.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + bp.iz().hashCode();
        if (this.ak() > 0) {
            n = 37 * n + 1;
            n = 53 * n + this.ai().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static bp z(ByteBuffer byteBuffer) {
        return (bp)gM.parseFrom(byteBuffer);
    }

    public static bp z(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (bp)gM.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static bp ab(ByteString byteString) {
        return (bp)gM.parseFrom(byteString);
    }

    public static bp z(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (bp)gM.parseFrom(byteString, extensionRegistryLite);
    }

    public static bp z(byte[] byArray) {
        return (bp)gM.parseFrom(byArray);
    }

    public static bp z(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (bp)gM.parseFrom(byArray, extensionRegistryLite);
    }

    public static bp Y(InputStream inputStream) {
        return (bp)GeneratedMessageV3.parseWithIOException(gM, (InputStream)inputStream);
    }

    public static bp Y(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (bp)GeneratedMessageV3.parseWithIOException(gM, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static bp Z(InputStream inputStream) {
        return (bp)GeneratedMessageV3.parseDelimitedWithIOException(gM, (InputStream)inputStream);
    }

    public static bp Z(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (bp)GeneratedMessageV3.parseDelimitedWithIOException(gM, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static bp z(CodedInputStream codedInputStream) {
        return (bp)GeneratedMessageV3.parseWithIOException(gM, (CodedInputStream)codedInputStream);
    }

    public static bp ax(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (bp)GeneratedMessageV3.parseWithIOException(gM, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public br iA() {
        return bp.iB();
    }

    public static br iB() {
        return gL.iC();
    }

    public static br a(bp bp2) {
        return gL.iC().c(bp2);
    }

    public br iC() {
        return this == gL ? new br() : new br().c(this);
    }

    protected br z(GeneratedMessageV3.BuilderParent builderParent) {
        br br2 = new br(builderParent);
        return br2;
    }

    public static bp iD() {
        return gL;
    }

    public static Parser<bp> z() {
        return gM;
    }

    public Parser<bp> getParserForType() {
        return gM;
    }

    public bp iE() {
        return gL;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.z(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.iC();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.iA();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.iC();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.iA();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.iE();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.iE();
    }

    static /* synthetic */ boolean iF() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean iG() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(bp bp2) {
        return bp2.unknownFields;
    }
}
