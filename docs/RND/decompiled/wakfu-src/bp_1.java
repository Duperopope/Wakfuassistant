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

/*
 * Renamed from bp
 */
public final class bp_1
extends GeneratedMessageV3
implements bs_2 {
    private static final long gJ = 0L;
    public static final int gK = 1;
    List<be_2> ak;
    private byte Y = (byte)-1;
    private static final bp_1 gL = new bp_1();
    static final Parser<bp_1> gM = new bq_1();

    bp_1(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private bp_1() {
        this.ak = Collections.emptyList();
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new bp_1();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    bp_1(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                            this.ak = new ArrayList<be_2>();
                            bl |= true;
                        }
                        this.ak.add((be_2)codedInputStream.readMessage(be_2.z(), extensionRegistryLite));
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
        return ae_1.fA;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ae_1.fB.ensureFieldAccessorsInitialized(bp_1.class, br_2.class);
    }

    @Override
    public List<be_2> ai() {
        return this.ak;
    }

    @Override
    public List<? extends bt_2> aj() {
        return this.ak;
    }

    @Override
    public int ak() {
        return this.ak.size();
    }

    @Override
    public be_2 L(int n) {
        return this.ak.get(n);
    }

    @Override
    public bt_2 M(int n) {
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
        if (!(object instanceof bp_1)) {
            return super.equals(object);
        }
        bp_1 bp_12 = (bp_1)object;
        if (!this.ai().equals(bp_12.ai())) {
            return false;
        }
        return this.unknownFields.equals((Object)bp_12.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + bp_1.iz().hashCode();
        if (this.ak() > 0) {
            n = 37 * n + 1;
            n = 53 * n + this.ai().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static bp_1 z(ByteBuffer byteBuffer) {
        return (bp_1)gM.parseFrom(byteBuffer);
    }

    public static bp_1 z(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (bp_1)gM.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static bp_1 ab(ByteString byteString) {
        return (bp_1)gM.parseFrom(byteString);
    }

    public static bp_1 z(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (bp_1)gM.parseFrom(byteString, extensionRegistryLite);
    }

    public static bp_1 z(byte[] byArray) {
        return (bp_1)gM.parseFrom(byArray);
    }

    public static bp_1 z(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (bp_1)gM.parseFrom(byArray, extensionRegistryLite);
    }

    public static bp_1 Y(InputStream inputStream) {
        return (bp_1)GeneratedMessageV3.parseWithIOException(gM, (InputStream)inputStream);
    }

    public static bp_1 Y(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (bp_1)GeneratedMessageV3.parseWithIOException(gM, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static bp_1 Z(InputStream inputStream) {
        return (bp_1)GeneratedMessageV3.parseDelimitedWithIOException(gM, (InputStream)inputStream);
    }

    public static bp_1 Z(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (bp_1)GeneratedMessageV3.parseDelimitedWithIOException(gM, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static bp_1 z(CodedInputStream codedInputStream) {
        return (bp_1)GeneratedMessageV3.parseWithIOException(gM, (CodedInputStream)codedInputStream);
    }

    public static bp_1 ax(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (bp_1)GeneratedMessageV3.parseWithIOException(gM, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public br_2 iA() {
        return bp_1.iB();
    }

    public static br_2 iB() {
        return gL.iC();
    }

    public static br_2 a(bp_1 bp_12) {
        return gL.iC().c(bp_12);
    }

    public br_2 iC() {
        return this == gL ? new br_2() : new br_2().c(this);
    }

    protected br_2 z(GeneratedMessageV3.BuilderParent builderParent) {
        br_2 br_22 = new br_2(builderParent);
        return br_22;
    }

    public static bp_1 iD() {
        return gL;
    }

    public static Parser<bp_1> z() {
        return gM;
    }

    public Parser<bp_1> getParserForType() {
        return gM;
    }

    public bp_1 iE() {
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

    static /* synthetic */ UnknownFieldSet b(bp_1 bp_12) {
        return bp_12.unknownFields;
    }
}

