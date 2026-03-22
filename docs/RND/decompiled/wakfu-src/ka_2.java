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
 * Renamed from kA
 */
public final class ka_2
extends GeneratedMessageV3
implements kd_2 {
    private static final long FI = 0L;
    public static final int FJ = 1;
    List<kx_2> FK;
    private byte Y = (byte)-1;
    private static final ka_2 FL = new ka_2();
    @Deprecated
    public static final Parser<ka_2> FM = new kb_2();

    ka_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private ka_2() {
        this.FK = Collections.emptyList();
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new ka_2();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    ka_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                            this.FK = new ArrayList<kx_2>();
                            bl |= true;
                        }
                        this.FK.add((kx_2)codedInputStream.readMessage(kx_2.FH, extensionRegistryLite));
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
                this.FK = Collections.unmodifiableList(this.FK);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor abX() {
        return kw_2.FA;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return kw_2.FB.ensureFieldAccessorsInitialized(ka_2.class, kc_2.class);
    }

    @Override
    public List<kx_2> abY() {
        return this.FK;
    }

    @Override
    public List<? extends ke_2> abZ() {
        return this.FK;
    }

    @Override
    public int aca() {
        return this.FK.size();
    }

    @Override
    public kx_2 gG(int n) {
        return this.FK.get(n);
    }

    @Override
    public ke_2 gH(int n) {
        return this.FK.get(n);
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
        for (int i = 0; i < this.FK.size(); ++i) {
            codedOutputStream.writeMessage(1, (MessageLite)this.FK.get(i));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        for (int i = 0; i < this.FK.size(); ++i) {
            n += CodedOutputStream.computeMessageSize((int)1, (MessageLite)((MessageLite)this.FK.get(i)));
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof ka_2)) {
            return super.equals(object);
        }
        ka_2 ka_22 = (ka_2)object;
        if (!this.abY().equals(ka_22.abY())) {
            return false;
        }
        return this.unknownFields.equals((Object)ka_22.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + ka_2.abX().hashCode();
        if (this.aca() > 0) {
            n = 37 * n + 1;
            n = 53 * n + this.abY().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static ka_2 bE(ByteBuffer byteBuffer) {
        return (ka_2)FM.parseFrom(byteBuffer);
    }

    public static ka_2 bA(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ka_2)FM.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static ka_2 cJ(ByteString byteString) {
        return (ka_2)FM.parseFrom(byteString);
    }

    public static ka_2 bA(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (ka_2)FM.parseFrom(byteString, extensionRegistryLite);
    }

    public static ka_2 bB(byte[] byArray) {
        return (ka_2)FM.parseFrom(byArray);
    }

    public static ka_2 bA(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (ka_2)FM.parseFrom(byArray, extensionRegistryLite);
    }

    public static ka_2 ea(InputStream inputStream) {
        return (ka_2)GeneratedMessageV3.parseWithIOException(FM, (InputStream)inputStream);
    }

    public static ka_2 ea(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ka_2)GeneratedMessageV3.parseWithIOException(FM, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ka_2 eb(InputStream inputStream) {
        return (ka_2)GeneratedMessageV3.parseDelimitedWithIOException(FM, (InputStream)inputStream);
    }

    public static ka_2 eb(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ka_2)GeneratedMessageV3.parseDelimitedWithIOException(FM, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ka_2 bA(CodedInputStream codedInputStream) {
        return (ka_2)GeneratedMessageV3.parseWithIOException(FM, (CodedInputStream)codedInputStream);
    }

    public static ka_2 gA(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ka_2)GeneratedMessageV3.parseWithIOException(FM, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public kc_2 acb() {
        return ka_2.acc();
    }

    public static kc_2 acc() {
        return FL.acd();
    }

    public static kc_2 a(ka_2 ka_22) {
        return FL.acd().c(ka_22);
    }

    public kc_2 acd() {
        return this == FL ? new kc_2() : new kc_2().c(this);
    }

    protected kc_2 bA(GeneratedMessageV3.BuilderParent builderParent) {
        kc_2 kc_22 = new kc_2(builderParent);
        return kc_22;
    }

    public static ka_2 ace() {
        return FL;
    }

    public static Parser<ka_2> z() {
        return FM;
    }

    public Parser<ka_2> getParserForType() {
        return FM;
    }

    public ka_2 acf() {
        return FL;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.bA(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.acd();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.acb();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.acd();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.acb();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.acf();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.acf();
    }

    static /* synthetic */ boolean fa() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean oV() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(ka_2 ka_22) {
        return ka_22.unknownFields;
    }
}

