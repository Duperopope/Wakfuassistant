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
 * Renamed from bl
 */
public final class bl_1
extends GeneratedMessageV3
implements bo_1 {
    private static final long gF = 0L;
    public static final int gG = 1;
    List<bh_1> ak;
    private byte Y = (byte)-1;
    private static final bl_1 gH = new bl_1();
    static final Parser<bl_1> gI = new bm_2();

    bl_1(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private bl_1() {
        this.ak = Collections.emptyList();
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new bl_1();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    bl_1(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                            this.ak = new ArrayList<bh_1>();
                            bl |= true;
                        }
                        this.ak.add((bh_1)codedInputStream.readMessage(bh_1.z(), extensionRegistryLite));
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

    public static final Descriptors.Descriptor ik() {
        return ae_1.fC;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ae_1.fD.ensureFieldAccessorsInitialized(bl_1.class, bn_2.class);
    }

    @Override
    public List<bh_1> ai() {
        return this.ak;
    }

    @Override
    public List<? extends bk_1> aj() {
        return this.ak;
    }

    @Override
    public int ak() {
        return this.ak.size();
    }

    @Override
    public bh_1 G(int n) {
        return this.ak.get(n);
    }

    @Override
    public bk_1 H(int n) {
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
        if (!(object instanceof bl_1)) {
            return super.equals(object);
        }
        bl_1 bl_12 = (bl_1)object;
        if (!this.ai().equals(bl_12.ai())) {
            return false;
        }
        return this.unknownFields.equals((Object)bl_12.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + bl_1.ik().hashCode();
        if (this.ak() > 0) {
            n = 37 * n + 1;
            n = 53 * n + this.ai().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static bl_1 y(ByteBuffer byteBuffer) {
        return (bl_1)gI.parseFrom(byteBuffer);
    }

    public static bl_1 y(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (bl_1)gI.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static bl_1 aa(ByteString byteString) {
        return (bl_1)gI.parseFrom(byteString);
    }

    public static bl_1 y(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (bl_1)gI.parseFrom(byteString, extensionRegistryLite);
    }

    public static bl_1 y(byte[] byArray) {
        return (bl_1)gI.parseFrom(byArray);
    }

    public static bl_1 y(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (bl_1)gI.parseFrom(byArray, extensionRegistryLite);
    }

    public static bl_1 W(InputStream inputStream) {
        return (bl_1)GeneratedMessageV3.parseWithIOException(gI, (InputStream)inputStream);
    }

    public static bl_1 W(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (bl_1)GeneratedMessageV3.parseWithIOException(gI, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static bl_1 X(InputStream inputStream) {
        return (bl_1)GeneratedMessageV3.parseDelimitedWithIOException(gI, (InputStream)inputStream);
    }

    public static bl_1 X(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (bl_1)GeneratedMessageV3.parseDelimitedWithIOException(gI, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static bl_1 y(CodedInputStream codedInputStream) {
        return (bl_1)GeneratedMessageV3.parseWithIOException(gI, (CodedInputStream)codedInputStream);
    }

    public static bl_1 au(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (bl_1)GeneratedMessageV3.parseWithIOException(gI, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public bn_2 il() {
        return bl_1.im();
    }

    public static bn_2 im() {
        return gH.in();
    }

    public static bn_2 a(bl_1 bl_12) {
        return gH.in().c(bl_12);
    }

    public bn_2 in() {
        return this == gH ? new bn_2() : new bn_2().c(this);
    }

    protected bn_2 y(GeneratedMessageV3.BuilderParent builderParent) {
        bn_2 bn_22 = new bn_2(builderParent);
        return bn_22;
    }

    public static bl_1 io() {
        return gH;
    }

    public static Parser<bl_1> z() {
        return gI;
    }

    public Parser<bl_1> getParserForType() {
        return gI;
    }

    public bl_1 ip() {
        return gH;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.y(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.in();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.il();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.in();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.il();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.ip();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.ip();
    }

    static /* synthetic */ boolean iq() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean ir() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(bl_1 bl_12) {
        return bl_12.unknownFields;
    }
}

